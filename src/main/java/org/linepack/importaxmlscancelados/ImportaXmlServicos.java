/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.linepack.importaxmlscancelados;

import org.linepack.importaxmlscancelados.schema.CompNfse;
import org.linepack.importaxmlservicos.Conexao.ConexaoManager;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author Giovana
 */
public class ImportaXmlServicos {

    private static Connection connection;
    private static List<Integer> itens = new ArrayList<>();
    private static List<Double> valores = new ArrayList<>();
    private static List<String> descricoes = new ArrayList<>();
    private static Integer sequenceNota = 0;
    private static Double valorSaldoPis = -1.0;
    private static Double valorSaldoCofins = -1.0;
    private static Double valorSaldoIr = -1.00;

    public static void main(String[] args) throws JAXBException, SQLException {

        File file = new File("C:\\Users\\Giovana\\Desktop\\Importar\\3361.xml");
        JAXBContext context = JAXBContext.newInstance(CompNfse.class);
        Unmarshaller u = context.createUnmarshaller();
        CompNfse nota = (CompNfse) u.unmarshal(file);

        connection = getConncetion();

        Integer codigoTomador = getCodigoTomador(nota);
        java.sql.Date dataEmissao = getDataEmissao(nota);
        Double valorNota = getValorBrutoNota(nota);
        getSequenceNota();

        insereMestre(nota, codigoTomador, dataEmissao, valorNota);
        parseDescricaoServicos(nota);

        insereItem(nota);

        System.out.println(nota);
        connection.commit();

    }

    private static void insereMestre(CompNfse nota, Integer codigoTomador,
            java.sql.Date dataEmissao, Double valorBrutoNota) throws SQLException {

        String insert = "insert into ftmesnfs ("
                + "cd_fil,"
                + "nr_nfisc,"
                + "sr_nfisc,"
                + "tp_especie,"
                + "cd_pessoa,"
                + "cd_tp_Pessoa,"
                + "cd_natoper,"
                + "sr_natoper,"
                + "tp_nfisc,"
                + "st_canc,"
                + "dt_emissao,"
                + "dt_saida,"
                + "tp_frete,"
                + "vl_nota,"
                + "nm_usuinc,"
                + "dt_usuinc,"
                + "st_nota_elet,"
                + "dt_vencimento,"
                + "nr_nfisc_prefeitura,"
                + "nr_rps,"
                + "st_abatimento,"
                + "st_contingencia)"
                + "values(?,"
                + "?,"
                + "?,"
                + "?,"
                + "?,"
                + "?,"
                + "?,"
                + "?,"
                + "?,"
                + "?,"
                + "?,"
                + "?,"
                + "?,"
                + "?,"
                + "?,"
                + "?,"
                + "?,"
                + "?,"
                + "?,"
                + "?,"
                + "?,"
                + "?)";

        PreparedStatement stmt = connection.prepareStatement(insert);
        stmt.setInt(1, 1);
        stmt.setInt(2, sequenceNota);
        stmt.setString(3, "A");
        stmt.setString(4, "1");
        stmt.setInt(5, codigoTomador);
        stmt.setInt(6, 3);
        stmt.setInt(7, 5933);
        stmt.setInt(8, 1);
        stmt.setString(9, "NI");
        stmt.setString(10, "S");
        stmt.setDate(11, dataEmissao);
        stmt.setDate(12, dataEmissao);
        stmt.setString(13, "A");
        stmt.setDouble(14, valorBrutoNota);
        stmt.setString(15, "ILITO");
        stmt.setDate(16, dataEmissao);
        stmt.setString(17, "C");
        stmt.setDate(18, dataEmissao);
        stmt.setInt(19, nota.getNfse().getInfNfse().getNumero());
        stmt.setInt(20, nota.getNfse().getInfNfse().getDeclaracaoPrestacaoServico().getInfDeclaracaoPrestacaoServico().getRps().getIdentificacaoRps().getNumero());
        stmt.setInt(21, 0);
        stmt.setString(22, "N");

        stmt.executeUpdate();

    }

    private static Double getValorBrutoNota(CompNfse nota) {

        return nota.getNfse().getInfNfse().getDeclaracaoPrestacaoServico().getInfDeclaracaoPrestacaoServico()
                .getServico().getValores().getValorServicos()
                + nota.getNfse().getInfNfse().getDeclaracaoPrestacaoServico().getInfDeclaracaoPrestacaoServico()
                .getServico().getValores().getValorPis()
                + nota.getNfse().getInfNfse().getDeclaracaoPrestacaoServico().getInfDeclaracaoPrestacaoServico()
                .getServico().getValores().getValorCofins()
                + nota.getNfse().getInfNfse().getDeclaracaoPrestacaoServico().getInfDeclaracaoPrestacaoServico()
                .getServico().getValores().getValorIr();

    }

    private static java.sql.Date getDataEmissao(CompNfse nota) {

        XMLGregorianCalendar xMLGregorianCalendar = nota.getNfse().getInfNfse().getDataEmissao();
        java.util.Date dataUtil = xMLGregorianCalendar.toGregorianCalendar().getTime();

        java.sql.Date dataSql = new java.sql.Date(dataUtil.getTime());

        return dataSql;
    }

    private static Integer getCodigoTomador(CompNfse nota) throws SQLException {

        Integer codigoTomador = null;
        String query = "select cd_Pessoa"
                + "       from gepessoa"
                + "      where nr_cgc_cpf = " + nota.getNfse().getInfNfse().getDeclaracaoPrestacaoServico().
                getInfDeclaracaoPrestacaoServico().getTomador().getIdentificacaoTomador().getCpfCnpj().getCnpj();

        Statement stmt;
        stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {
            codigoTomador = rs.getInt("cd_pessoa");
        }
        return codigoTomador;
    }

    private static Connection getConncetion() throws SQLException {
        ConexaoManager manager = new ConexaoManager("oracle:thin",
                "host",
                1521,
                "ssid",
                "user",
                "pwd");

        return manager.getConnection();
    }

    private static void getSequenceNota() throws SQLException {

        String query = "select sq_ftmesnfs.nextval sequencia from dual";

        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {
            sequenceNota = rs.getInt("SEQUENCIA");
        }
    }

    private static void parseDescricaoServicos(CompNfse nota) throws SQLException {

        String descricaoServicos = nota.getNfse().getInfNfse().getDeclaracaoPrestacaoServico()
                .getInfDeclaracaoPrestacaoServico().getServico().getDiscriminacao();

        StringBuilder sb = new StringBuilder();
        Integer finalDaStringValor = -1;
        Integer iterator = -1;

        for (int i = 0; i < descricaoServicos.length(); i++) {

            iterator++;

            if (sb.toString().contains("Vencimento")) {
                sb.delete(0, sb.length());
                break;
            }

            if (descricaoServicos.charAt(i) == '$') {
                sb.delete(iterator - 4, iterator);
                itens.add(getCodidoItem(sb.toString()));
                descricoes.add(sb.toString());
                sb.delete(0, sb.length());
                iterator = -1;

            } else if (descricaoServicos.charAt(i) == ',') {
                finalDaStringValor = iterator + 3;
                sb.append(descricaoServicos.charAt(i));

            } else if (iterator == finalDaStringValor) {

                String stringValor = null;
                stringValor = sb.toString();

                stringValor = stringValor.replaceAll("\\.", "");
                stringValor = stringValor.replaceAll(",", "\\.");
                stringValor = stringValor.replaceAll(" ", "");

                valores.add(Double.parseDouble(stringValor));
                sb.delete(0, sb.length());
                finalDaStringValor = -1;
                iterator = -1;
            } else {
                sb.append(descricaoServicos.charAt(i));
            }
        }

    }

    private static Integer getCodidoItem(String descricaoItem) throws SQLException {

        Integer codigoItem = null;
        String query = "select cd_item"
                + "       from esitemes"
                + "      where fun_tira_acento(ds_item) like '%" + descricaoItem + "%'";

        Statement stmt;
        stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {
            codigoItem = rs.getInt("CD_ITEM");
        }

        return codigoItem;
    }

    private static void insereItem(CompNfse nota) throws SQLException {

        for (int i = 0; i < itens.size(); i++) {

            String insert = "insert into ftitenfs("
                    + "cd_fil,"
                    + "nr_nfisc,"
                    + "sr_Nfisc,"
                    + "tp_Especie,"
                    + "sq_item,"
                    + "cd_item,"
                    + "qt_item,"
                    + "vl_item,"
                    + "cd_unimed,"
                    + "nm_usuinc,"
                    + "dt_Usuinc,"
                    + "cd_natoper,"
                    + "sr_natoper,"
                    + "cd_item_municipio,"
                    + "ds_item)"
                    + "values("
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?"
                    + ")";

            PreparedStatement stmt = connection.prepareStatement(insert);

            stmt.setInt(1, 1);
            stmt.setInt(2, sequenceNota);
            stmt.setString(3, "A");
            stmt.setString(4, "1");
            stmt.setInt(5, i + 1);
            stmt.setInt(6, itens.get(i));
            stmt.setInt(7, 1);
            stmt.setDouble(8, valores.get(i));
            stmt.setString(9, "UN");
            stmt.setString(10, "ILITO");
            stmt.setDate(11, new java.sql.Date(new java.util.Date().getTime()));
            stmt.setInt(12, 5933);
            stmt.setInt(13, 1);
            stmt.setString(14, "0701");
            stmt.setString(15, descricoes.get(i));

            stmt.executeUpdate();

            calculaTributacao(nota, i + 1, valores.get(i));
        }

    }

    private static void calculaTributacao(CompNfse nota, Integer sequenciaItem, Double valorItem) throws SQLException {

        //PIS
        Double valorPis = 0.0;

        if (nota.getNfse().getInfNfse().getDeclaracaoPrestacaoServico()
                .getInfDeclaracaoPrestacaoServico().getServico().getValores().getValorPis() > 0
                && valorSaldoPis != 0) {

            if (valorSaldoPis == -1.00) {
                valorSaldoPis = nota.getNfse().getInfNfse().getDeclaracaoPrestacaoServico()
                        .getInfDeclaracaoPrestacaoServico().getServico().getValores().getValorPis();
            }

            if (Math.round(valorItem * 0.0065) != Math.round(nota.getNfse().getInfNfse().getDeclaracaoPrestacaoServico()
                    .getInfDeclaracaoPrestacaoServico().getServico().getValores().getValorPis())) {
                valorPis = (valorItem * 0.0065);
            } else {
                valorPis = nota.getNfse().getInfNfse().getDeclaracaoPrestacaoServico()
                        .getInfDeclaracaoPrestacaoServico().getServico().getValores().getValorPis();
            }
            insereTributacao(sequenciaItem, valorItem, "PIS", 0.65, valorPis, 7, null);
            valorSaldoPis -= valorPis;
        }

        //cofins
        Double valorCofins = 0.0;

        if (nota.getNfse().getInfNfse().getDeclaracaoPrestacaoServico()
                .getInfDeclaracaoPrestacaoServico().getServico().getValores().getValorCofins() > 0
                && valorSaldoCofins != 0) {

            if (valorSaldoCofins == -1.00) {
                valorSaldoCofins = nota.getNfse().getInfNfse().getDeclaracaoPrestacaoServico()
                        .getInfDeclaracaoPrestacaoServico().getServico().getValores().getValorCofins();
            }

            if (Math.round(valorItem * 0.03) != Math.round(nota.getNfse().getInfNfse().getDeclaracaoPrestacaoServico()
                    .getInfDeclaracaoPrestacaoServico().getServico().getValores().getValorCofins())) {
                valorCofins = (valorItem * 0.03);
            } else {
                valorCofins = nota.getNfse().getInfNfse().getDeclaracaoPrestacaoServico()
                        .getInfDeclaracaoPrestacaoServico().getServico().getValores().getValorCofins();
            }
            insereTributacao(sequenciaItem, valorItem, "COFINS", 3.0, valorCofins, null, 8);
            valorSaldoCofins -= valorCofins;
        }

        // IR
        Double valorIr = 0.0;

        if (nota.getNfse().getInfNfse().getDeclaracaoPrestacaoServico()
                .getInfDeclaracaoPrestacaoServico().getServico().getValores().getValorIr() > 0
                && valorSaldoIr != 0) {

            if (valorSaldoIr == -1.00) {
                valorSaldoIr = nota.getNfse().getInfNfse().getDeclaracaoPrestacaoServico()
                        .getInfDeclaracaoPrestacaoServico().getServico().getValores().getValorIr();
            }

            if (Math.round(valorItem * 0.015) != Math.round(nota.getNfse().getInfNfse().getDeclaracaoPrestacaoServico()
                    .getInfDeclaracaoPrestacaoServico().getServico().getValores().getValorIr())) {
                valorIr = (valorItem * 0.015);
            } else {
                valorIr = nota.getNfse().getInfNfse().getDeclaracaoPrestacaoServico()
                        .getInfDeclaracaoPrestacaoServico().getServico().getValores().getValorIr();
            }
            insereTributacao(sequenciaItem, valorItem, "IRRF", 1.5, valorIr, null, null);
            valorSaldoIr -= valorIr;
        }

    }

    private static void insereTributacao(Integer sequenciaItem, Double valorItem, String tributo, Double aliquota,
            Double valorImposto, Integer cstPis, Integer cstCofins) throws SQLException {

        String insert = "insert into fttrinfs("
                + "cd_fil,"
                + "nr_nfisc,"
                + "sr_nfisc,"
                + "tp_especie,"
                + "sq_item,"
                + "cd_tribut,"
                + "vl_base,"
                + "pc_aliquota,"
                + "vl_imposto,"
                + "vl_diferido,"
                + "nm_usuinc,"
                + "dt_usuinc,"
                + "sq_cst_pis,"
                + "sq_cst_cofins"
                + ")"
                + "values("
                + "?,"
                + "?,"
                + "?,"
                + "?,"
                + "?,"
                + "?,"
                + "?,"
                + "?,"
                + "?,"
                + "?,"
                + "?,"
                + "?,"
                + "?,"
                + "?"
                + ")";

        PreparedStatement stmt = connection.prepareStatement(insert);

        stmt.setInt(1, 1);
        stmt.setInt(2, sequenceNota);
        stmt.setString(3, "A");
        stmt.setString(4, "1");
        stmt.setInt(5, sequenciaItem);
        stmt.setString(6, tributo);
        stmt.setDouble(7, valorItem);
        stmt.setDouble(8, aliquota);
        stmt.setDouble(9, valorImposto);
        stmt.setInt(10, 0);
        stmt.setString(11, "ILITO");
        stmt.setDate(12, new java.sql.Date(new java.util.Date().getTime()));
        if (cstPis != null) {
            stmt.setInt(13, cstPis);
        } else {
            stmt.setNull(13, 0);
        }
        if (cstCofins != null) {
            stmt.setInt(14, cstCofins);
        } else {
            stmt.setNull(14, 0);
        }

        stmt.executeUpdate();

    }
}
