//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2015.03.07 �s 11:12:30 AM BRT 
// 
package org.linepack.importaxmlscancelados.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Classe Java de anonymous complex type.
 *
 * <p>
 * O seguinte fragmento do esquema especifica o conte�do esperado contido dentro
 * desta classe.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Nfse">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="InfNfse">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="CodigoVerificacao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="DataEmissao" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                             &lt;element name="ValoresNfse">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="BaseCalculo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                                       &lt;element name="Aliquota" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="ValorIss" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="ValorLiquidoNfse" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="PrestadorServico">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="IdentificacaoPrestador">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="CpfCnpj">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="Cnpj" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="InscricaoMunicipal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="RazaoSocial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="NomeFantasia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Endereco">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Endereco" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                 &lt;element name="Complemento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="Bairro" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="CodigoMunicipio" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                 &lt;element name="Uf" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="Cep" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Contato">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Telefone" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                 &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="OrgaoGerador">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CodigoMunicipio" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="Uf" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="DeclaracaoPrestacaoServico">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="InfDeclaracaoPrestacaoServico">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Rps">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="IdentificacaoRps">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                                     &lt;element name="Serie" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                                     &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="DataEmissao" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                                           &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="Competencia" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                                 &lt;element name="Servico">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="Valores">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="ValorServicos" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                                                                     &lt;element name="ValorDeducoes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                                     &lt;element name="ValorPis" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                                                                     &lt;element name="ValorCofins" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                                                                     &lt;element name="ValorInss" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                                     &lt;element name="ValorIr" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                                                                     &lt;element name="ValorCsll" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                                     &lt;element name="OutrasRetencoes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                                     &lt;element name="ValorIss" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                                     &lt;element name="Aliquota" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                                     &lt;element name="DescontoIncondicionado" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                                     &lt;element name="DescontoCondicionado" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="IssRetido" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                           &lt;element name="ItemListaServico" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                           &lt;element name="CodigoCnae" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                           &lt;element name="CodigoTributacaoMunicipio" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                           &lt;element name="Discriminacao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="CodigoMunicipio" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                           &lt;element name="CodigoPais" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                           &lt;element name="ExigibilidadeISS" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                           &lt;element name="MunicipioIncidencia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="Prestador">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="CpfCnpj">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="Cnpj" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="InscricaoMunicipal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="Tomador">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="IdentificacaoTomador">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="CpfCnpj">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="Cnpj" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                                             &lt;/sequence>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="RazaoSocial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="Endereco">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="Endereco" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                     &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                                     &lt;element name="Complemento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                     &lt;element name="Bairro" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                     &lt;element name="CodigoMunicipio" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                                     &lt;element name="Uf" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                     &lt;element name="Cep" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="Contato">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="Telefone" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                                     &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="OptanteSimplesNacional" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                 &lt;element name="IncentivoFiscal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="versao" type="{http://www.w3.org/2001/XMLSchema}double" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="NfseCancelamento">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Confirmacao">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Pedido">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="InfPedidoCancelamento">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="IdentificacaoNfse">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                           &lt;element name="CpfCnpj">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="Cnpj" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="InscricaoMunicipal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                           &lt;element name="CodigoMunicipio" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="CodigoCancelamento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="DataHora" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="versao" type="{http://www.w3.org/2001/XMLSchema}double" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nfse",
    "nfseCancelamento"
})
@XmlRootElement(name = "CompNfse")
public class CompNfse {

    @XmlElement(name = "Nfse", required = true)
    protected CompNfse.Nfse nfse;
    @XmlElement(name = "NfseCancelamento", required = true)
    protected CompNfse.NfseCancelamento nfseCancelamento;

    /**
     * Obt�m o valor da propriedade nfse.
     *
     * @return possible object is {@link CompNfse.Nfse }
     *
     */
    public CompNfse.Nfse getNfse() {
        return nfse;
    }

    /**
     * Define o valor da propriedade nfse.
     *
     * @param value allowed object is {@link CompNfse.Nfse }
     *
     */
    public void setNfse(CompNfse.Nfse value) {
        this.nfse = value;
    }

    /**
     * Obt�m o valor da propriedade nfseCancelamento.
     *
     * @return possible object is {@link CompNfse.NfseCancelamento }
     *
     */
    public CompNfse.NfseCancelamento getNfseCancelamento() {
        return nfseCancelamento;
    }

    /**
     * Define o valor da propriedade nfseCancelamento.
     *
     * @param value allowed object is {@link CompNfse.NfseCancelamento }
     *
     */
    public void setNfseCancelamento(CompNfse.NfseCancelamento value) {
        this.nfseCancelamento = value;
    }

    /**
     * <p>
     * Classe Java de anonymous complex type.
     *
     * <p>
     * O seguinte fragmento do esquema especifica o conte�do esperado contido
     * dentro desta classe.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="InfNfse">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="CodigoVerificacao" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="DataEmissao" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                   &lt;element name="ValoresNfse">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="BaseCalculo" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *                             &lt;element name="Aliquota" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="ValorIss" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="ValorLiquidoNfse" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PrestadorServico">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="IdentificacaoPrestador">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="CpfCnpj">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="Cnpj" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="InscricaoMunicipal" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="RazaoSocial" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="NomeFantasia" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Endereco">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Endereco" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                       &lt;element name="Complemento" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="Bairro" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="CodigoMunicipio" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                       &lt;element name="Uf" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="Cep" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Contato">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Telefone" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                       &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="OrgaoGerador">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="CodigoMunicipio" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="Uf" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="DeclaracaoPrestacaoServico">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="InfDeclaracaoPrestacaoServico">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Rps">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="IdentificacaoRps">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                                           &lt;element name="Serie" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                                           &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="DataEmissao" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                                                 &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="Competencia" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                                       &lt;element name="Servico">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="Valores">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="ValorServicos" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *                                                           &lt;element name="ValorDeducoes" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                                           &lt;element name="ValorPis" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *                                                           &lt;element name="ValorCofins" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *                                                           &lt;element name="ValorInss" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                                           &lt;element name="ValorIr" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *                                                           &lt;element name="ValorCsll" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                                           &lt;element name="OutrasRetencoes" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                                           &lt;element name="ValorIss" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                                           &lt;element name="Aliquota" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                                           &lt;element name="DescontoIncondicionado" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                                           &lt;element name="DescontoCondicionado" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="IssRetido" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                                 &lt;element name="ItemListaServico" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                                 &lt;element name="CodigoCnae" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                                 &lt;element name="CodigoTributacaoMunicipio" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                                 &lt;element name="Discriminacao" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="CodigoMunicipio" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                                 &lt;element name="CodigoPais" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                                 &lt;element name="ExigibilidadeISS" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                                 &lt;element name="MunicipioIncidencia" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="Prestador">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="CpfCnpj">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="Cnpj" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="InscricaoMunicipal" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="Tomador">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="IdentificacaoTomador">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="CpfCnpj">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="Cnpj" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                                                   &lt;/sequence>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="RazaoSocial" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="Endereco">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="Endereco" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                           &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                                           &lt;element name="Complemento" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                           &lt;element name="Bairro" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                           &lt;element name="CodigoMunicipio" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                                           &lt;element name="Uf" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                           &lt;element name="Cep" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="Contato">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="Telefone" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                                           &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="OptanteSimplesNacional" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                       &lt;element name="IncentivoFiscal" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="versao" type="{http://www.w3.org/2001/XMLSchema}double" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "infNfse"
    })
    public static class Nfse {

        @XmlElement(name = "InfNfse", required = true)
        protected CompNfse.Nfse.InfNfse infNfse;
        @XmlAttribute(name = "versao")
        protected Double versao;

        /**
         * Obt�m o valor da propriedade infNfse.
         *
         * @return possible object is {@link CompNfse.Nfse.InfNfse }
         *
         */
        public CompNfse.Nfse.InfNfse getInfNfse() {
            return infNfse;
        }

        /**
         * Define o valor da propriedade infNfse.
         *
         * @param value allowed object is {@link CompNfse.Nfse.InfNfse }
         *
         */
        public void setInfNfse(CompNfse.Nfse.InfNfse value) {
            this.infNfse = value;
        }

        /**
         * Obt�m o valor da propriedade versao.
         *
         * @return possible object is {@link Double }
         *
         */
        public Double getVersao() {
            return versao;
        }

        /**
         * Define o valor da propriedade versao.
         *
         * @param value allowed object is {@link Double }
         *
         */
        public void setVersao(Double value) {
            this.versao = value;
        }

        /**
         * <p>
         * Classe Java de anonymous complex type.
         *
         * <p>
         * O seguinte fragmento do esquema especifica o conte�do esperado
         * contido dentro desta classe.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="CodigoVerificacao" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="DataEmissao" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *         &lt;element name="ValoresNfse">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="BaseCalculo" type="{http://www.w3.org/2001/XMLSchema}double"/>
         *                   &lt;element name="Aliquota" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="ValorIss" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="ValorLiquidoNfse" type="{http://www.w3.org/2001/XMLSchema}double"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="PrestadorServico">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="IdentificacaoPrestador">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="CpfCnpj">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="Cnpj" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="InscricaoMunicipal" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="RazaoSocial" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="NomeFantasia" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Endereco">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Endereco" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                             &lt;element name="Complemento" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="Bairro" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="CodigoMunicipio" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                             &lt;element name="Uf" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="Cep" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Contato">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Telefone" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                             &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="OrgaoGerador">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="CodigoMunicipio" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="Uf" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="DeclaracaoPrestacaoServico">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="InfDeclaracaoPrestacaoServico">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Rps">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="IdentificacaoRps">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                                                 &lt;element name="Serie" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                                                 &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="DataEmissao" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                                       &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="Competencia" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                             &lt;element name="Servico">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="Valores">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="ValorServicos" type="{http://www.w3.org/2001/XMLSchema}double"/>
         *                                                 &lt;element name="ValorDeducoes" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                                                 &lt;element name="ValorPis" type="{http://www.w3.org/2001/XMLSchema}double"/>
         *                                                 &lt;element name="ValorCofins" type="{http://www.w3.org/2001/XMLSchema}double"/>
         *                                                 &lt;element name="ValorInss" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                                                 &lt;element name="ValorIr" type="{http://www.w3.org/2001/XMLSchema}double"/>
         *                                                 &lt;element name="ValorCsll" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                                                 &lt;element name="OutrasRetencoes" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                                                 &lt;element name="ValorIss" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                                                 &lt;element name="Aliquota" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                                                 &lt;element name="DescontoIncondicionado" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                                                 &lt;element name="DescontoCondicionado" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="IssRetido" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                                       &lt;element name="ItemListaServico" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                                       &lt;element name="CodigoCnae" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                                       &lt;element name="CodigoTributacaoMunicipio" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                                       &lt;element name="Discriminacao" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="CodigoMunicipio" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                                       &lt;element name="CodigoPais" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                                       &lt;element name="ExigibilidadeISS" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                                       &lt;element name="MunicipioIncidencia" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="Prestador">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="CpfCnpj">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="Cnpj" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="InscricaoMunicipal" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="Tomador">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="IdentificacaoTomador">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="CpfCnpj">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="Cnpj" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                                                         &lt;/sequence>
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="RazaoSocial" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="Endereco">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="Endereco" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                 &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                                                 &lt;element name="Complemento" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                 &lt;element name="Bairro" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                 &lt;element name="CodigoMunicipio" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                                                 &lt;element name="Uf" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                 &lt;element name="Cep" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="Contato">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="Telefone" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                                                 &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="OptanteSimplesNacional" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                             &lt;element name="IncentivoFiscal" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "numero",
            "codigoVerificacao",
            "dataEmissao",
            "valoresNfse",
            "prestadorServico",
            "orgaoGerador",
            "declaracaoPrestacaoServico"
        })
        public static class InfNfse {

            @XmlElement(name = "Numero")
            protected int numero;
            @XmlElement(name = "CodigoVerificacao", required = true)
            protected String codigoVerificacao;
            @XmlElement(name = "DataEmissao", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar dataEmissao;
            @XmlElement(name = "ValoresNfse", required = true)
            protected CompNfse.Nfse.InfNfse.ValoresNfse valoresNfse;
            @XmlElement(name = "PrestadorServico", required = true)
            protected CompNfse.Nfse.InfNfse.PrestadorServico prestadorServico;
            @XmlElement(name = "OrgaoGerador", required = true)
            protected CompNfse.Nfse.InfNfse.OrgaoGerador orgaoGerador;
            @XmlElement(name = "DeclaracaoPrestacaoServico", required = true)
            protected CompNfse.Nfse.InfNfse.DeclaracaoPrestacaoServico declaracaoPrestacaoServico;

            /**
             * Obt�m o valor da propriedade numero.
             *
             */
            public int getNumero() {
                return numero;
            }

            /**
             * Define o valor da propriedade numero.
             *
             */
            public void setNumero(int value) {
                this.numero = value;
            }

            /**
             * Obt�m o valor da propriedade codigoVerificacao.
             *
             * @return possible object is {@link String }
             *
             */
            public String getCodigoVerificacao() {
                return codigoVerificacao;
            }

            /**
             * Define o valor da propriedade codigoVerificacao.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setCodigoVerificacao(String value) {
                this.codigoVerificacao = value;
            }

            /**
             * Obt�m o valor da propriedade dataEmissao.
             *
             * @return possible object is {@link XMLGregorianCalendar }
             *
             */
            public XMLGregorianCalendar getDataEmissao() {
                return dataEmissao;
            }

            /**
             * Define o valor da propriedade dataEmissao.
             *
             * @param value allowed object is {@link XMLGregorianCalendar }
             *
             */
            public void setDataEmissao(XMLGregorianCalendar value) {
                this.dataEmissao = value;
            }

            /**
             * Obt�m o valor da propriedade valoresNfse.
             *
             * @return possible object is
             *     {@link CompNfse.Nfse.InfNfse.ValoresNfse }
             *
             */
            public CompNfse.Nfse.InfNfse.ValoresNfse getValoresNfse() {
                return valoresNfse;
            }

            /**
             * Define o valor da propriedade valoresNfse.
             *
             * @param value allowed object is
             *     {@link CompNfse.Nfse.InfNfse.ValoresNfse }
             *
             */
            public void setValoresNfse(CompNfse.Nfse.InfNfse.ValoresNfse value) {
                this.valoresNfse = value;
            }

            /**
             * Obt�m o valor da propriedade prestadorServico.
             *
             * @return possible object is
             *     {@link CompNfse.Nfse.InfNfse.PrestadorServico }
             *
             */
            public CompNfse.Nfse.InfNfse.PrestadorServico getPrestadorServico() {
                return prestadorServico;
            }

            /**
             * Define o valor da propriedade prestadorServico.
             *
             * @param value allowed object is
             *     {@link CompNfse.Nfse.InfNfse.PrestadorServico }
             *
             */
            public void setPrestadorServico(CompNfse.Nfse.InfNfse.PrestadorServico value) {
                this.prestadorServico = value;
            }

            /**
             * Obt�m o valor da propriedade orgaoGerador.
             *
             * @return possible object is
             *     {@link CompNfse.Nfse.InfNfse.OrgaoGerador }
             *
             */
            public CompNfse.Nfse.InfNfse.OrgaoGerador getOrgaoGerador() {
                return orgaoGerador;
            }

            /**
             * Define o valor da propriedade orgaoGerador.
             *
             * @param value allowed object is
             *     {@link CompNfse.Nfse.InfNfse.OrgaoGerador }
             *
             */
            public void setOrgaoGerador(CompNfse.Nfse.InfNfse.OrgaoGerador value) {
                this.orgaoGerador = value;
            }

            /**
             * Obt�m o valor da propriedade declaracaoPrestacaoServico.
             *
             * @return possible object is
             *     {@link CompNfse.Nfse.InfNfse.DeclaracaoPrestacaoServico }
             *
             */
            public CompNfse.Nfse.InfNfse.DeclaracaoPrestacaoServico getDeclaracaoPrestacaoServico() {
                return declaracaoPrestacaoServico;
            }

            /**
             * Define o valor da propriedade declaracaoPrestacaoServico.
             *
             * @param value allowed object is
             *     {@link CompNfse.Nfse.InfNfse.DeclaracaoPrestacaoServico }
             *
             */
            public void setDeclaracaoPrestacaoServico(CompNfse.Nfse.InfNfse.DeclaracaoPrestacaoServico value) {
                this.declaracaoPrestacaoServico = value;
            }

            /**
             * <p>
             * Classe Java de anonymous complex type.
             *
             * <p>
             * O seguinte fragmento do esquema especifica o conte�do esperado
             * contido dentro desta classe.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="InfDeclaracaoPrestacaoServico">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Rps">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="IdentificacaoRps">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                                       &lt;element name="Serie" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                                       &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                                     &lt;/sequence>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="DataEmissao" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *                             &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="Competencia" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *                   &lt;element name="Servico">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="Valores">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="ValorServicos" type="{http://www.w3.org/2001/XMLSchema}double"/>
             *                                       &lt;element name="ValorDeducoes" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                                       &lt;element name="ValorPis" type="{http://www.w3.org/2001/XMLSchema}double"/>
             *                                       &lt;element name="ValorCofins" type="{http://www.w3.org/2001/XMLSchema}double"/>
             *                                       &lt;element name="ValorInss" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                                       &lt;element name="ValorIr" type="{http://www.w3.org/2001/XMLSchema}double"/>
             *                                       &lt;element name="ValorCsll" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                                       &lt;element name="OutrasRetencoes" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                                       &lt;element name="ValorIss" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                                       &lt;element name="Aliquota" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                                       &lt;element name="DescontoIncondicionado" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                                       &lt;element name="DescontoCondicionado" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                                     &lt;/sequence>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="IssRetido" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                             &lt;element name="ItemListaServico" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                             &lt;element name="CodigoCnae" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                             &lt;element name="CodigoTributacaoMunicipio" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                             &lt;element name="Discriminacao" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="CodigoMunicipio" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                             &lt;element name="CodigoPais" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                             &lt;element name="ExigibilidadeISS" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                             &lt;element name="MunicipioIncidencia" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="Prestador">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="CpfCnpj">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="Cnpj" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                                     &lt;/sequence>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="InscricaoMunicipal" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="Tomador">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="IdentificacaoTomador">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="CpfCnpj">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="Cnpj" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                                               &lt;/sequence>
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                     &lt;/sequence>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="RazaoSocial" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="Endereco">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="Endereco" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                       &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                                       &lt;element name="Complemento" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                       &lt;element name="Bairro" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                       &lt;element name="CodigoMunicipio" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                                       &lt;element name="Uf" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                       &lt;element name="Cep" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                                     &lt;/sequence>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="Contato">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="Telefone" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                                       &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                     &lt;/sequence>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="OptanteSimplesNacional" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                   &lt;element name="IncentivoFiscal" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "infDeclaracaoPrestacaoServico"
            })
            public static class DeclaracaoPrestacaoServico {

                @XmlElement(name = "InfDeclaracaoPrestacaoServico", required = true)
                protected CompNfse.Nfse.InfNfse.DeclaracaoPrestacaoServico.InfDeclaracaoPrestacaoServico infDeclaracaoPrestacaoServico;

                /**
                 * Obt�m o valor da propriedade infDeclaracaoPrestacaoServico.
                 *
                 * @return possible object is
                 *     {@link CompNfse.Nfse.InfNfse.DeclaracaoPrestacaoServico.InfDeclaracaoPrestacaoServico }
                 *
                 */
                public CompNfse.Nfse.InfNfse.DeclaracaoPrestacaoServico.InfDeclaracaoPrestacaoServico getInfDeclaracaoPrestacaoServico() {
                    return infDeclaracaoPrestacaoServico;
                }

                /**
                 * Define o valor da propriedade infDeclaracaoPrestacaoServico.
                 *
                 * @param value allowed object is
                 *     {@link CompNfse.Nfse.InfNfse.DeclaracaoPrestacaoServico.InfDeclaracaoPrestacaoServico }
                 *
                 */
                public void setInfDeclaracaoPrestacaoServico(CompNfse.Nfse.InfNfse.DeclaracaoPrestacaoServico.InfDeclaracaoPrestacaoServico value) {
                    this.infDeclaracaoPrestacaoServico = value;
                }

                /**
                 * <p>
                 * Classe Java de anonymous complex type.
                 *
                 * <p>
                 * O seguinte fragmento do esquema especifica o conte�do
                 * esperado contido dentro desta classe.
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="Rps">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="IdentificacaoRps">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *                             &lt;element name="Serie" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *                             &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *                           &lt;/sequence>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="DataEmissao" type="{http://www.w3.org/2001/XMLSchema}date"/>
                 *                   &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="Competencia" type="{http://www.w3.org/2001/XMLSchema}date"/>
                 *         &lt;element name="Servico">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="Valores">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="ValorServicos" type="{http://www.w3.org/2001/XMLSchema}double"/>
                 *                             &lt;element name="ValorDeducoes" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *                             &lt;element name="ValorPis" type="{http://www.w3.org/2001/XMLSchema}double"/>
                 *                             &lt;element name="ValorCofins" type="{http://www.w3.org/2001/XMLSchema}double"/>
                 *                             &lt;element name="ValorInss" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *                             &lt;element name="ValorIr" type="{http://www.w3.org/2001/XMLSchema}double"/>
                 *                             &lt;element name="ValorCsll" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *                             &lt;element name="OutrasRetencoes" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *                             &lt;element name="ValorIss" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *                             &lt;element name="Aliquota" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *                             &lt;element name="DescontoIncondicionado" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *                             &lt;element name="DescontoCondicionado" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *                           &lt;/sequence>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="IssRetido" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *                   &lt;element name="ItemListaServico" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *                   &lt;element name="CodigoCnae" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *                   &lt;element name="CodigoTributacaoMunicipio" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *                   &lt;element name="Discriminacao" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="CodigoMunicipio" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *                   &lt;element name="CodigoPais" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *                   &lt;element name="ExigibilidadeISS" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *                   &lt;element name="MunicipioIncidencia" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="Prestador">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="CpfCnpj">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="Cnpj" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *                           &lt;/sequence>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="InscricaoMunicipal" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="Tomador">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="IdentificacaoTomador">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="CpfCnpj">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="Cnpj" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *                                     &lt;/sequence>
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                           &lt;/sequence>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="RazaoSocial" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="Endereco">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="Endereco" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                             &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *                             &lt;element name="Complemento" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                             &lt;element name="Bairro" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                             &lt;element name="CodigoMunicipio" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *                             &lt;element name="Uf" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                             &lt;element name="Cep" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *                           &lt;/sequence>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="Contato">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="Telefone" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *                             &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                           &lt;/sequence>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="OptanteSimplesNacional" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *         &lt;element name="IncentivoFiscal" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "rps",
                    "competencia",
                    "servico",
                    "prestador",
                    "tomador",
                    "optanteSimplesNacional",
                    "incentivoFiscal"
                })
                public static class InfDeclaracaoPrestacaoServico {

                    @XmlElement(name = "Rps", required = true)
                    protected CompNfse.Nfse.InfNfse.DeclaracaoPrestacaoServico.InfDeclaracaoPrestacaoServico.Rps rps;
                    @XmlElement(name = "Competencia", required = true)
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar competencia;
                    @XmlElement(name = "Servico", required = true)
                    protected CompNfse.Nfse.InfNfse.DeclaracaoPrestacaoServico.InfDeclaracaoPrestacaoServico.Servico servico;
                    @XmlElement(name = "Prestador", required = true)
                    protected CompNfse.Nfse.InfNfse.DeclaracaoPrestacaoServico.InfDeclaracaoPrestacaoServico.Prestador prestador;
                    @XmlElement(name = "Tomador", required = true)
                    protected CompNfse.Nfse.InfNfse.DeclaracaoPrestacaoServico.InfDeclaracaoPrestacaoServico.Tomador tomador;
                    @XmlElement(name = "OptanteSimplesNacional")
                    protected int optanteSimplesNacional;
                    @XmlElement(name = "IncentivoFiscal")
                    protected int incentivoFiscal;

                    /**
                     * Obt�m o valor da propriedade rps.
                     *
                     * @return possible object is
                     *     {@link CompNfse.Nfse.InfNfse.DeclaracaoPrestacaoServico.InfDeclaracaoPrestacaoServico.Rps }
                     *
                     */
                    public CompNfse.Nfse.InfNfse.DeclaracaoPrestacaoServico.InfDeclaracaoPrestacaoServico.Rps getRps() {
                        return rps;
                    }

                    /**
                     * Define o valor da propriedade rps.
                     *
                     * @param value allowed object is
                     *     {@link CompNfse.Nfse.InfNfse.DeclaracaoPrestacaoServico.InfDeclaracaoPrestacaoServico.Rps }
                     *
                     */
                    public void setRps(CompNfse.Nfse.InfNfse.DeclaracaoPrestacaoServico.InfDeclaracaoPrestacaoServico.Rps value) {
                        this.rps = value;
                    }

                    /**
                     * Obt�m o valor da propriedade competencia.
                     *
                     * @return possible object is {@link XMLGregorianCalendar }
                     *
                     */
                    public XMLGregorianCalendar getCompetencia() {
                        return competencia;
                    }

                    /**
                     * Define o valor da propriedade competencia.
                     *
                     * @param value allowed object is
                     *     {@link XMLGregorianCalendar }
                     *
                     */
                    public void setCompetencia(XMLGregorianCalendar value) {
                        this.competencia = value;
                    }

                    /**
                     * Obt�m o valor da propriedade servico.
                     *
                     * @return possible object is
                     *     {@link CompNfse.Nfse.InfNfse.DeclaracaoPrestacaoServico.InfDeclaracaoPrestacaoServico.Servico }
                     *
                     */
                    public CompNfse.Nfse.InfNfse.DeclaracaoPrestacaoServico.InfDeclaracaoPrestacaoServico.Servico getServico() {
                        return servico;
                    }

                    /**
                     * Define o valor da propriedade servico.
                     *
                     * @param value allowed object is
                     *     {@link CompNfse.Nfse.InfNfse.DeclaracaoPrestacaoServico.InfDeclaracaoPrestacaoServico.Servico }
                     *
                     */
                    public void setServico(CompNfse.Nfse.InfNfse.DeclaracaoPrestacaoServico.InfDeclaracaoPrestacaoServico.Servico value) {
                        this.servico = value;
                    }

                    /**
                     * Obt�m o valor da propriedade prestador.
                     *
                     * @return possible object is
                     *     {@link CompNfse.Nfse.InfNfse.DeclaracaoPrestacaoServico.InfDeclaracaoPrestacaoServico.Prestador }
                     *
                     */
                    public CompNfse.Nfse.InfNfse.DeclaracaoPrestacaoServico.InfDeclaracaoPrestacaoServico.Prestador getPrestador() {
                        return prestador;
                    }

                    /**
                     * Define o valor da propriedade prestador.
                     *
                     * @param value allowed object is
                     *     {@link CompNfse.Nfse.InfNfse.DeclaracaoPrestacaoServico.InfDeclaracaoPrestacaoServico.Prestador }
                     *
                     */
                    public void setPrestador(CompNfse.Nfse.InfNfse.DeclaracaoPrestacaoServico.InfDeclaracaoPrestacaoServico.Prestador value) {
                        this.prestador = value;
                    }

                    /**
                     * Obt�m o valor da propriedade tomador.
                     *
                     * @return possible object is
                     *     {@link CompNfse.Nfse.InfNfse.DeclaracaoPrestacaoServico.InfDeclaracaoPrestacaoServico.Tomador }
                     *
                     */
                    public CompNfse.Nfse.InfNfse.DeclaracaoPrestacaoServico.InfDeclaracaoPrestacaoServico.Tomador getTomador() {
                        return tomador;
                    }

                    /**
                     * Define o valor da propriedade tomador.
                     *
                     * @param value allowed object is
                     *     {@link CompNfse.Nfse.InfNfse.DeclaracaoPrestacaoServico.InfDeclaracaoPrestacaoServico.Tomador }
                     *
                     */
                    public void setTomador(CompNfse.Nfse.InfNfse.DeclaracaoPrestacaoServico.InfDeclaracaoPrestacaoServico.Tomador value) {
                        this.tomador = value;
                    }

                    /**
                     * Obt�m o valor da propriedade optanteSimplesNacional.
                     *
                     */
                    public int getOptanteSimplesNacional() {
                        return optanteSimplesNacional;
                    }

                    /**
                     * Define o valor da propriedade optanteSimplesNacional.
                     *
                     */
                    public void setOptanteSimplesNacional(int value) {
                        this.optanteSimplesNacional = value;
                    }

                    /**
                     * Obt�m o valor da propriedade incentivoFiscal.
                     *
                     */
                    public int getIncentivoFiscal() {
                        return incentivoFiscal;
                    }

                    /**
                     * Define o valor da propriedade incentivoFiscal.
                     *
                     */
                    public void setIncentivoFiscal(int value) {
                        this.incentivoFiscal = value;
                    }

                    /**
                     * <p>
                     * Classe Java de anonymous complex type.
                     *
                     * <p>
                     * O seguinte fragmento do esquema especifica o conte�do
                     * esperado contido dentro desta classe.
                     *
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="CpfCnpj">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="Cnpj" type="{http://www.w3.org/2001/XMLSchema}int"/>
                     *                 &lt;/sequence>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="InscricaoMunicipal" type="{http://www.w3.org/2001/XMLSchema}int"/>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     *
                     *
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "cpfCnpj",
                        "inscricaoMunicipal"
                    })
                    public static class Prestador {

                        @XmlElement(name = "CpfCnpj", required = true)
                        protected CompNfse.Nfse.InfNfse.DeclaracaoPrestacaoServico.InfDeclaracaoPrestacaoServico.Prestador.CpfCnpj cpfCnpj;
                        @XmlElement(name = "InscricaoMunicipal")
                        protected int inscricaoMunicipal;

                        /**
                         * Obt�m o valor da propriedade cpfCnpj.
                         *
                         * @return possible object is
                         *     {@link CompNfse.Nfse.InfNfse.DeclaracaoPrestacaoServico.InfDeclaracaoPrestacaoServico.Prestador.CpfCnpj }
                         *
                         */
                        public CompNfse.Nfse.InfNfse.DeclaracaoPrestacaoServico.InfDeclaracaoPrestacaoServico.Prestador.CpfCnpj getCpfCnpj() {
                            return cpfCnpj;
                        }

                        /**
                         * Define o valor da propriedade cpfCnpj.
                         *
                         * @param value allowed object is
                         *     {@link CompNfse.Nfse.InfNfse.DeclaracaoPrestacaoServico.InfDeclaracaoPrestacaoServico.Prestador.CpfCnpj }
                         *
                         */
                        public void setCpfCnpj(CompNfse.Nfse.InfNfse.DeclaracaoPrestacaoServico.InfDeclaracaoPrestacaoServico.Prestador.CpfCnpj value) {
                            this.cpfCnpj = value;
                        }

                        /**
                         * Obt�m o valor da propriedade inscricaoMunicipal.
                         *
                         */
                        public int getInscricaoMunicipal() {
                            return inscricaoMunicipal;
                        }

                        /**
                         * Define o valor da propriedade inscricaoMunicipal.
                         *
                         */
                        public void setInscricaoMunicipal(int value) {
                            this.inscricaoMunicipal = value;
                        }

                        /**
                         * <p>
                         * Classe Java de anonymous complex type.
                         *
                         * <p>
                         * O seguinte fragmento do esquema especifica o conte�do
                         * esperado contido dentro desta classe.
                         *
                         * <pre>
                         * &lt;complexType>
                         *   &lt;complexContent>
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *       &lt;sequence>
                         *         &lt;element name="Cnpj" type="{http://www.w3.org/2001/XMLSchema}int"/>
                         *       &lt;/sequence>
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         *
                         *
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "cnpj"
                        })
                        public static class CpfCnpj {

                            @XmlElement(name = "Cnpj")
                            protected int cnpj;

                            /**
                             * Obt�m o valor da propriedade cnpj.
                             *
                             */
                            public int getCnpj() {
                                return cnpj;
                            }

                            /**
                             * Define o valor da propriedade cnpj.
                             *
                             */
                            public void setCnpj(int value) {
                                this.cnpj = value;
                            }

                        }

                    }

                    /**
                     * <p>
                     * Classe Java de anonymous complex type.
                     *
                     * <p>
                     * O seguinte fragmento do esquema especifica o conte�do
                     * esperado contido dentro desta classe.
                     *
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="IdentificacaoRps">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}int"/>
                     *                   &lt;element name="Serie" type="{http://www.w3.org/2001/XMLSchema}int"/>
                     *                   &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}int"/>
                     *                 &lt;/sequence>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="DataEmissao" type="{http://www.w3.org/2001/XMLSchema}date"/>
                     *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int"/>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     *
                     *
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "identificacaoRps",
                        "dataEmissao",
                        "status"
                    })
                    public static class Rps {

                        @XmlElement(name = "IdentificacaoRps", required = true)
                        protected CompNfse.Nfse.InfNfse.DeclaracaoPrestacaoServico.InfDeclaracaoPrestacaoServico.Rps.IdentificacaoRps identificacaoRps;
                        @XmlElement(name = "DataEmissao", required = true)
                        @XmlSchemaType(name = "date")
                        protected XMLGregorianCalendar dataEmissao;
                        @XmlElement(name = "Status")
                        protected int status;

                        /**
                         * Obt�m o valor da propriedade identificacaoRps.
                         *
                         * @return possible object is
                         *     {@link CompNfse.Nfse.InfNfse.DeclaracaoPrestacaoServico.InfDeclaracaoPrestacaoServico.Rps.IdentificacaoRps }
                         *
                         */
                        public CompNfse.Nfse.InfNfse.DeclaracaoPrestacaoServico.InfDeclaracaoPrestacaoServico.Rps.IdentificacaoRps getIdentificacaoRps() {
                            return identificacaoRps;
                        }

                        /**
                         * Define o valor da propriedade identificacaoRps.
                         *
                         * @param value allowed object is
                         *     {@link CompNfse.Nfse.InfNfse.DeclaracaoPrestacaoServico.InfDeclaracaoPrestacaoServico.Rps.IdentificacaoRps }
                         *
                         */
                        public void setIdentificacaoRps(CompNfse.Nfse.InfNfse.DeclaracaoPrestacaoServico.InfDeclaracaoPrestacaoServico.Rps.IdentificacaoRps value) {
                            this.identificacaoRps = value;
                        }

                        /**
                         * Obt�m o valor da propriedade dataEmissao.
                         *
                         * @return possible object is
                         *     {@link XMLGregorianCalendar }
                         *
                         */
                        public XMLGregorianCalendar getDataEmissao() {
                            return dataEmissao;
                        }

                        /**
                         * Define o valor da propriedade dataEmissao.
                         *
                         * @param value allowed object is
                         *     {@link XMLGregorianCalendar }
                         *
                         */
                        public void setDataEmissao(XMLGregorianCalendar value) {
                            this.dataEmissao = value;
                        }

                        /**
                         * Obt�m o valor da propriedade status.
                         *
                         */
                        public int getStatus() {
                            return status;
                        }

                        /**
                         * Define o valor da propriedade status.
                         *
                         */
                        public void setStatus(int value) {
                            this.status = value;
                        }

                        /**
                         * <p>
                         * Classe Java de anonymous complex type.
                         *
                         * <p>
                         * O seguinte fragmento do esquema especifica o conte�do
                         * esperado contido dentro desta classe.
                         *
                         * <pre>
                         * &lt;complexType>
                         *   &lt;complexContent>
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *       &lt;sequence>
                         *         &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}int"/>
                         *         &lt;element name="Serie" type="{http://www.w3.org/2001/XMLSchema}int"/>
                         *         &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}int"/>
                         *       &lt;/sequence>
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         *
                         *
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "numero",
                            "serie",
                            "tipo"
                        })
                        public static class IdentificacaoRps {

                            @XmlElement(name = "Numero")
                            protected int numero;
                            @XmlElement(name = "Serie")
                            protected int serie;
                            @XmlElement(name = "Tipo")
                            protected int tipo;

                            /**
                             * Obt�m o valor da propriedade numero.
                             *
                             */
                            public int getNumero() {
                                return numero;
                            }

                            /**
                             * Define o valor da propriedade numero.
                             *
                             */
                            public void setNumero(int value) {
                                this.numero = value;
                            }

                            /**
                             * Obt�m o valor da propriedade serie.
                             *
                             */
                            public int getSerie() {
                                return serie;
                            }

                            /**
                             * Define o valor da propriedade serie.
                             *
                             */
                            public void setSerie(int value) {
                                this.serie = value;
                            }

                            /**
                             * Obt�m o valor da propriedade tipo.
                             *
                             */
                            public int getTipo() {
                                return tipo;
                            }

                            /**
                             * Define o valor da propriedade tipo.
                             *
                             */
                            public void setTipo(int value) {
                                this.tipo = value;
                            }

                        }

                    }

                    /**
                     * <p>
                     * Classe Java de anonymous complex type.
                     *
                     * <p>
                     * O seguinte fragmento do esquema especifica o conte�do
                     * esperado contido dentro desta classe.
                     *
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="Valores">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="ValorServicos" type="{http://www.w3.org/2001/XMLSchema}double"/>
                     *                   &lt;element name="ValorDeducoes" type="{http://www.w3.org/2001/XMLSchema}int"/>
                     *                   &lt;element name="ValorPis" type="{http://www.w3.org/2001/XMLSchema}double"/>
                     *                   &lt;element name="ValorCofins" type="{http://www.w3.org/2001/XMLSchema}double"/>
                     *                   &lt;element name="ValorInss" type="{http://www.w3.org/2001/XMLSchema}int"/>
                     *                   &lt;element name="ValorIr" type="{http://www.w3.org/2001/XMLSchema}double"/>
                     *                   &lt;element name="ValorCsll" type="{http://www.w3.org/2001/XMLSchema}int"/>
                     *                   &lt;element name="OutrasRetencoes" type="{http://www.w3.org/2001/XMLSchema}int"/>
                     *                   &lt;element name="ValorIss" type="{http://www.w3.org/2001/XMLSchema}int"/>
                     *                   &lt;element name="Aliquota" type="{http://www.w3.org/2001/XMLSchema}int"/>
                     *                   &lt;element name="DescontoIncondicionado" type="{http://www.w3.org/2001/XMLSchema}int"/>
                     *                   &lt;element name="DescontoCondicionado" type="{http://www.w3.org/2001/XMLSchema}int"/>
                     *                 &lt;/sequence>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="IssRetido" type="{http://www.w3.org/2001/XMLSchema}int"/>
                     *         &lt;element name="ItemListaServico" type="{http://www.w3.org/2001/XMLSchema}int"/>
                     *         &lt;element name="CodigoCnae" type="{http://www.w3.org/2001/XMLSchema}int"/>
                     *         &lt;element name="CodigoTributacaoMunicipio" type="{http://www.w3.org/2001/XMLSchema}int"/>
                     *         &lt;element name="Discriminacao" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="CodigoMunicipio" type="{http://www.w3.org/2001/XMLSchema}int"/>
                     *         &lt;element name="CodigoPais" type="{http://www.w3.org/2001/XMLSchema}int"/>
                     *         &lt;element name="ExigibilidadeISS" type="{http://www.w3.org/2001/XMLSchema}int"/>
                     *         &lt;element name="MunicipioIncidencia" type="{http://www.w3.org/2001/XMLSchema}int"/>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     *
                     *
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "valores",
                        "issRetido",
                        "itemListaServico",
                        "codigoCnae",
                        "codigoTributacaoMunicipio",
                        "discriminacao",
                        "codigoMunicipio",
                        "codigoPais",
                        "exigibilidadeISS",
                        "municipioIncidencia"
                    })
                    public static class Servico {

                        @XmlElement(name = "Valores", required = true)
                        protected CompNfse.Nfse.InfNfse.DeclaracaoPrestacaoServico.InfDeclaracaoPrestacaoServico.Servico.Valores valores;
                        @XmlElement(name = "IssRetido")
                        protected int issRetido;
                        @XmlElement(name = "ItemListaServico")
                        protected int itemListaServico;
                        @XmlElement(name = "CodigoCnae")
                        protected int codigoCnae;
                        @XmlElement(name = "CodigoTributacaoMunicipio")
                        protected int codigoTributacaoMunicipio;
                        @XmlElement(name = "Discriminacao", required = true)
                        protected String discriminacao;
                        @XmlElement(name = "CodigoMunicipio")
                        protected int codigoMunicipio;
                        @XmlElement(name = "CodigoPais")
                        protected int codigoPais;
                        @XmlElement(name = "ExigibilidadeISS")
                        protected int exigibilidadeISS;
                        @XmlElement(name = "MunicipioIncidencia")
                        protected int municipioIncidencia;

                        /**
                         * Obt�m o valor da propriedade valores.
                         *
                         * @return possible object is
                         *     {@link CompNfse.Nfse.InfNfse.DeclaracaoPrestacaoServico.InfDeclaracaoPrestacaoServico.Servico.Valores }
                         *
                         */
                        public CompNfse.Nfse.InfNfse.DeclaracaoPrestacaoServico.InfDeclaracaoPrestacaoServico.Servico.Valores getValores() {
                            return valores;
                        }

                        /**
                         * Define o valor da propriedade valores.
                         *
                         * @param value allowed object is
                         *     {@link CompNfse.Nfse.InfNfse.DeclaracaoPrestacaoServico.InfDeclaracaoPrestacaoServico.Servico.Valores }
                         *
                         */
                        public void setValores(CompNfse.Nfse.InfNfse.DeclaracaoPrestacaoServico.InfDeclaracaoPrestacaoServico.Servico.Valores value) {
                            this.valores = value;
                        }

                        /**
                         * Obt�m o valor da propriedade issRetido.
                         *
                         */
                        public int getIssRetido() {
                            return issRetido;
                        }

                        /**
                         * Define o valor da propriedade issRetido.
                         *
                         */
                        public void setIssRetido(int value) {
                            this.issRetido = value;
                        }

                        /**
                         * Obt�m o valor da propriedade itemListaServico.
                         *
                         */
                        public int getItemListaServico() {
                            return itemListaServico;
                        }

                        /**
                         * Define o valor da propriedade itemListaServico.
                         *
                         */
                        public void setItemListaServico(int value) {
                            this.itemListaServico = value;
                        }

                        /**
                         * Obt�m o valor da propriedade codigoCnae.
                         *
                         */
                        public int getCodigoCnae() {
                            return codigoCnae;
                        }

                        /**
                         * Define o valor da propriedade codigoCnae.
                         *
                         */
                        public void setCodigoCnae(int value) {
                            this.codigoCnae = value;
                        }

                        /**
                         * Obt�m o valor da propriedade
                         * codigoTributacaoMunicipio.
                         *
                         */
                        public int getCodigoTributacaoMunicipio() {
                            return codigoTributacaoMunicipio;
                        }

                        /**
                         * Define o valor da propriedade
                         * codigoTributacaoMunicipio.
                         *
                         */
                        public void setCodigoTributacaoMunicipio(int value) {
                            this.codigoTributacaoMunicipio = value;
                        }

                        /**
                         * Obt�m o valor da propriedade discriminacao.
                         *
                         * @return possible object is {@link String }
                         *
                         */
                        public String getDiscriminacao() {
                            return discriminacao;
                        }

                        /**
                         * Define o valor da propriedade discriminacao.
                         *
                         * @param value allowed object is {@link String }
                         *
                         */
                        public void setDiscriminacao(String value) {
                            this.discriminacao = value;
                        }

                        /**
                         * Obt�m o valor da propriedade codigoMunicipio.
                         *
                         */
                        public int getCodigoMunicipio() {
                            return codigoMunicipio;
                        }

                        /**
                         * Define o valor da propriedade codigoMunicipio.
                         *
                         */
                        public void setCodigoMunicipio(int value) {
                            this.codigoMunicipio = value;
                        }

                        /**
                         * Obt�m o valor da propriedade codigoPais.
                         *
                         */
                        public int getCodigoPais() {
                            return codigoPais;
                        }

                        /**
                         * Define o valor da propriedade codigoPais.
                         *
                         */
                        public void setCodigoPais(int value) {
                            this.codigoPais = value;
                        }

                        /**
                         * Obt�m o valor da propriedade exigibilidadeISS.
                         *
                         */
                        public int getExigibilidadeISS() {
                            return exigibilidadeISS;
                        }

                        /**
                         * Define o valor da propriedade exigibilidadeISS.
                         *
                         */
                        public void setExigibilidadeISS(int value) {
                            this.exigibilidadeISS = value;
                        }

                        /**
                         * Obt�m o valor da propriedade municipioIncidencia.
                         *
                         */
                        public int getMunicipioIncidencia() {
                            return municipioIncidencia;
                        }

                        /**
                         * Define o valor da propriedade municipioIncidencia.
                         *
                         */
                        public void setMunicipioIncidencia(int value) {
                            this.municipioIncidencia = value;
                        }

                        /**
                         * <p>
                         * Classe Java de anonymous complex type.
                         *
                         * <p>
                         * O seguinte fragmento do esquema especifica o conte�do
                         * esperado contido dentro desta classe.
                         *
                         * <pre>
                         * &lt;complexType>
                         *   &lt;complexContent>
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *       &lt;sequence>
                         *         &lt;element name="ValorServicos" type="{http://www.w3.org/2001/XMLSchema}double"/>
                         *         &lt;element name="ValorDeducoes" type="{http://www.w3.org/2001/XMLSchema}int"/>
                         *         &lt;element name="ValorPis" type="{http://www.w3.org/2001/XMLSchema}double"/>
                         *         &lt;element name="ValorCofins" type="{http://www.w3.org/2001/XMLSchema}double"/>
                         *         &lt;element name="ValorInss" type="{http://www.w3.org/2001/XMLSchema}int"/>
                         *         &lt;element name="ValorIr" type="{http://www.w3.org/2001/XMLSchema}double"/>
                         *         &lt;element name="ValorCsll" type="{http://www.w3.org/2001/XMLSchema}int"/>
                         *         &lt;element name="OutrasRetencoes" type="{http://www.w3.org/2001/XMLSchema}int"/>
                         *         &lt;element name="ValorIss" type="{http://www.w3.org/2001/XMLSchema}int"/>
                         *         &lt;element name="Aliquota" type="{http://www.w3.org/2001/XMLSchema}int"/>
                         *         &lt;element name="DescontoIncondicionado" type="{http://www.w3.org/2001/XMLSchema}int"/>
                         *         &lt;element name="DescontoCondicionado" type="{http://www.w3.org/2001/XMLSchema}int"/>
                         *       &lt;/sequence>
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         *
                         *
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "valorServicos",
                            "valorDeducoes",
                            "valorPis",
                            "valorCofins",
                            "valorInss",
                            "valorIr",
                            "valorCsll",
                            "outrasRetencoes",
                            "valorIss",
                            "aliquota",
                            "descontoIncondicionado",
                            "descontoCondicionado"
                        })
                        public static class Valores {

                            @XmlElement(name = "ValorServicos")
                            protected double valorServicos;
                            @XmlElement(name = "ValorDeducoes")
                            protected int valorDeducoes;
                            @XmlElement(name = "ValorPis")
                            protected double valorPis;
                            @XmlElement(name = "ValorCofins")
                            protected double valorCofins;
                            @XmlElement(name = "ValorInss")
                            protected int valorInss;
                            @XmlElement(name = "ValorIr")
                            protected double valorIr;
                            @XmlElement(name = "ValorCsll")
                            protected int valorCsll;
                            @XmlElement(name = "OutrasRetencoes")
                            protected int outrasRetencoes;
                            @XmlElement(name = "ValorIss")
                            protected int valorIss;
                            @XmlElement(name = "Aliquota")
                            protected int aliquota;
                            @XmlElement(name = "DescontoIncondicionado")
                            protected int descontoIncondicionado;
                            @XmlElement(name = "DescontoCondicionado")
                            protected int descontoCondicionado;

                            /**
                             * Obt�m o valor da propriedade valorServicos.
                             *
                             */
                            public double getValorServicos() {
                                return valorServicos;
                            }

                            /**
                             * Define o valor da propriedade valorServicos.
                             *
                             */
                            public void setValorServicos(double value) {
                                this.valorServicos = value;
                            }

                            /**
                             * Obt�m o valor da propriedade valorDeducoes.
                             *
                             */
                            public int getValorDeducoes() {
                                return valorDeducoes;
                            }

                            /**
                             * Define o valor da propriedade valorDeducoes.
                             *
                             */
                            public void setValorDeducoes(int value) {
                                this.valorDeducoes = value;
                            }

                            /**
                             * Obt�m o valor da propriedade valorPis.
                             *
                             */
                            public double getValorPis() {
                                return valorPis;
                            }

                            /**
                             * Define o valor da propriedade valorPis.
                             *
                             */
                            public void setValorPis(double value) {
                                this.valorPis = value;
                            }

                            /**
                             * Obt�m o valor da propriedade valorCofins.
                             *
                             */
                            public double getValorCofins() {
                                return valorCofins;
                            }

                            /**
                             * Define o valor da propriedade valorCofins.
                             *
                             */
                            public void setValorCofins(double value) {
                                this.valorCofins = value;
                            }

                            /**
                             * Obt�m o valor da propriedade valorInss.
                             *
                             */
                            public int getValorInss() {
                                return valorInss;
                            }

                            /**
                             * Define o valor da propriedade valorInss.
                             *
                             */
                            public void setValorInss(int value) {
                                this.valorInss = value;
                            }

                            /**
                             * Obt�m o valor da propriedade valorIr.
                             *
                             */
                            public double getValorIr() {
                                return valorIr;
                            }

                            /**
                             * Define o valor da propriedade valorIr.
                             *
                             */
                            public void setValorIr(double value) {
                                this.valorIr = value;
                            }

                            /**
                             * Obt�m o valor da propriedade valorCsll.
                             *
                             */
                            public int getValorCsll() {
                                return valorCsll;
                            }

                            /**
                             * Define o valor da propriedade valorCsll.
                             *
                             */
                            public void setValorCsll(int value) {
                                this.valorCsll = value;
                            }

                            /**
                             * Obt�m o valor da propriedade outrasRetencoes.
                             *
                             */
                            public int getOutrasRetencoes() {
                                return outrasRetencoes;
                            }

                            /**
                             * Define o valor da propriedade outrasRetencoes.
                             *
                             */
                            public void setOutrasRetencoes(int value) {
                                this.outrasRetencoes = value;
                            }

                            /**
                             * Obt�m o valor da propriedade valorIss.
                             *
                             */
                            public int getValorIss() {
                                return valorIss;
                            }

                            /**
                             * Define o valor da propriedade valorIss.
                             *
                             */
                            public void setValorIss(int value) {
                                this.valorIss = value;
                            }

                            /**
                             * Obt�m o valor da propriedade aliquota.
                             *
                             */
                            public int getAliquota() {
                                return aliquota;
                            }

                            /**
                             * Define o valor da propriedade aliquota.
                             *
                             */
                            public void setAliquota(int value) {
                                this.aliquota = value;
                            }

                            /**
                             * Obt�m o valor da propriedade
                             * descontoIncondicionado.
                             *
                             */
                            public int getDescontoIncondicionado() {
                                return descontoIncondicionado;
                            }

                            /**
                             * Define o valor da propriedade
                             * descontoIncondicionado.
                             *
                             */
                            public void setDescontoIncondicionado(int value) {
                                this.descontoIncondicionado = value;
                            }

                            /**
                             * Obt�m o valor da propriedade
                             * descontoCondicionado.
                             *
                             */
                            public int getDescontoCondicionado() {
                                return descontoCondicionado;
                            }

                            /**
                             * Define o valor da propriedade
                             * descontoCondicionado.
                             *
                             */
                            public void setDescontoCondicionado(int value) {
                                this.descontoCondicionado = value;
                            }

                        }

                    }

                    /**
                     * <p>
                     * Classe Java de anonymous complex type.
                     *
                     * <p>
                     * O seguinte fragmento do esquema especifica o conte�do
                     * esperado contido dentro desta classe.
                     *
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="IdentificacaoTomador">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="CpfCnpj">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="Cnpj" type="{http://www.w3.org/2001/XMLSchema}int"/>
                     *                           &lt;/sequence>
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                 &lt;/sequence>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="RazaoSocial" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="Endereco">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="Endereco" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                   &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}int"/>
                     *                   &lt;element name="Complemento" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                   &lt;element name="Bairro" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                   &lt;element name="CodigoMunicipio" type="{http://www.w3.org/2001/XMLSchema}int"/>
                     *                   &lt;element name="Uf" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                   &lt;element name="Cep" type="{http://www.w3.org/2001/XMLSchema}int"/>
                     *                 &lt;/sequence>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="Contato">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="Telefone" type="{http://www.w3.org/2001/XMLSchema}int"/>
                     *                   &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                 &lt;/sequence>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     *
                     *
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "identificacaoTomador",
                        "razaoSocial",
                        "endereco",
                        "contato"
                    })
                    public static class Tomador {

                        @XmlElement(name = "IdentificacaoTomador", required = true)
                        protected CompNfse.Nfse.InfNfse.DeclaracaoPrestacaoServico.InfDeclaracaoPrestacaoServico.Tomador.IdentificacaoTomador identificacaoTomador;
                        @XmlElement(name = "RazaoSocial", required = true)
                        protected String razaoSocial;
                        @XmlElement(name = "Endereco", required = true)
                        protected CompNfse.Nfse.InfNfse.DeclaracaoPrestacaoServico.InfDeclaracaoPrestacaoServico.Tomador.Endereco endereco;
                        @XmlElement(name = "Contato", required = true)
                        protected CompNfse.Nfse.InfNfse.DeclaracaoPrestacaoServico.InfDeclaracaoPrestacaoServico.Tomador.Contato contato;

                        /**
                         * Obt�m o valor da propriedade identificacaoTomador.
                         *
                         * @return possible object is
                         *     {@link CompNfse.Nfse.InfNfse.DeclaracaoPrestacaoServico.InfDeclaracaoPrestacaoServico.Tomador.IdentificacaoTomador }
                         *
                         */
                        public CompNfse.Nfse.InfNfse.DeclaracaoPrestacaoServico.InfDeclaracaoPrestacaoServico.Tomador.IdentificacaoTomador getIdentificacaoTomador() {
                            return identificacaoTomador;
                        }

                        /**
                         * Define o valor da propriedade identificacaoTomador.
                         *
                         * @param value allowed object is
                         *     {@link CompNfse.Nfse.InfNfse.DeclaracaoPrestacaoServico.InfDeclaracaoPrestacaoServico.Tomador.IdentificacaoTomador }
                         *
                         */
                        public void setIdentificacaoTomador(CompNfse.Nfse.InfNfse.DeclaracaoPrestacaoServico.InfDeclaracaoPrestacaoServico.Tomador.IdentificacaoTomador value) {
                            this.identificacaoTomador = value;
                        }

                        /**
                         * Obt�m o valor da propriedade razaoSocial.
                         *
                         * @return possible object is {@link String }
                         *
                         */
                        public String getRazaoSocial() {
                            return razaoSocial;
                        }

                        /**
                         * Define o valor da propriedade razaoSocial.
                         *
                         * @param value allowed object is {@link String }
                         *
                         */
                        public void setRazaoSocial(String value) {
                            this.razaoSocial = value;
                        }

                        /**
                         * Obt�m o valor da propriedade endereco.
                         *
                         * @return possible object is
                         *     {@link CompNfse.Nfse.InfNfse.DeclaracaoPrestacaoServico.InfDeclaracaoPrestacaoServico.Tomador.Endereco }
                         *
                         */
                        public CompNfse.Nfse.InfNfse.DeclaracaoPrestacaoServico.InfDeclaracaoPrestacaoServico.Tomador.Endereco getEndereco() {
                            return endereco;
                        }

                        /**
                         * Define o valor da propriedade endereco.
                         *
                         * @param value allowed object is
                         *     {@link CompNfse.Nfse.InfNfse.DeclaracaoPrestacaoServico.InfDeclaracaoPrestacaoServico.Tomador.Endereco }
                         *
                         */
                        public void setEndereco(CompNfse.Nfse.InfNfse.DeclaracaoPrestacaoServico.InfDeclaracaoPrestacaoServico.Tomador.Endereco value) {
                            this.endereco = value;
                        }

                        /**
                         * Obt�m o valor da propriedade contato.
                         *
                         * @return possible object is
                         *     {@link CompNfse.Nfse.InfNfse.DeclaracaoPrestacaoServico.InfDeclaracaoPrestacaoServico.Tomador.Contato }
                         *
                         */
                        public CompNfse.Nfse.InfNfse.DeclaracaoPrestacaoServico.InfDeclaracaoPrestacaoServico.Tomador.Contato getContato() {
                            return contato;
                        }

                        /**
                         * Define o valor da propriedade contato.
                         *
                         * @param value allowed object is
                         *     {@link CompNfse.Nfse.InfNfse.DeclaracaoPrestacaoServico.InfDeclaracaoPrestacaoServico.Tomador.Contato }
                         *
                         */
                        public void setContato(CompNfse.Nfse.InfNfse.DeclaracaoPrestacaoServico.InfDeclaracaoPrestacaoServico.Tomador.Contato value) {
                            this.contato = value;
                        }

                        /**
                         * <p>
                         * Classe Java de anonymous complex type.
                         *
                         * <p>
                         * O seguinte fragmento do esquema especifica o conte�do
                         * esperado contido dentro desta classe.
                         *
                         * <pre>
                         * &lt;complexType>
                         *   &lt;complexContent>
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *       &lt;sequence>
                         *         &lt;element name="Telefone" type="{http://www.w3.org/2001/XMLSchema}int"/>
                         *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *       &lt;/sequence>
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         *
                         *
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "telefone",
                            "email"
                        })
                        public static class Contato {

                            @XmlElement(name = "Telefone")
                            protected int telefone;
                            @XmlElement(name = "Email", required = true)
                            protected String email;

                            /**
                             * Obt�m o valor da propriedade telefone.
                             *
                             */
                            public int getTelefone() {
                                return telefone;
                            }

                            /**
                             * Define o valor da propriedade telefone.
                             *
                             */
                            public void setTelefone(int value) {
                                this.telefone = value;
                            }

                            /**
                             * Obt�m o valor da propriedade email.
                             *
                             * @return possible object is {@link String }
                             *
                             */
                            public String getEmail() {
                                return email;
                            }

                            /**
                             * Define o valor da propriedade email.
                             *
                             * @param value allowed object is {@link String }
                             *
                             */
                            public void setEmail(String value) {
                                this.email = value;
                            }

                        }

                        /**
                         * <p>
                         * Classe Java de anonymous complex type.
                         *
                         * <p>
                         * O seguinte fragmento do esquema especifica o conte�do
                         * esperado contido dentro desta classe.
                         *
                         * <pre>
                         * &lt;complexType>
                         *   &lt;complexContent>
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *       &lt;sequence>
                         *         &lt;element name="Endereco" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *         &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}int"/>
                         *         &lt;element name="Complemento" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *         &lt;element name="Bairro" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *         &lt;element name="CodigoMunicipio" type="{http://www.w3.org/2001/XMLSchema}int"/>
                         *         &lt;element name="Uf" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *         &lt;element name="Cep" type="{http://www.w3.org/2001/XMLSchema}int"/>
                         *       &lt;/sequence>
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         *
                         *
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "endereco",
                            "numero",
                            "complemento",
                            "bairro",
                            "codigoMunicipio",
                            "uf",
                            "cep"
                        })
                        public static class Endereco {

                            @XmlElement(name = "Endereco", required = true)
                            protected String endereco;
                            @XmlElement(name = "Numero")
                            protected int numero;
                            @XmlElement(name = "Complemento", required = true)
                            protected String complemento;
                            @XmlElement(name = "Bairro", required = true)
                            protected String bairro;
                            @XmlElement(name = "CodigoMunicipio")
                            protected int codigoMunicipio;
                            @XmlElement(name = "Uf", required = true)
                            protected String uf;
                            @XmlElement(name = "Cep")
                            protected int cep;

                            /**
                             * Obt�m o valor da propriedade endereco.
                             *
                             * @return possible object is {@link String }
                             *
                             */
                            public String getEndereco() {
                                return endereco;
                            }

                            /**
                             * Define o valor da propriedade endereco.
                             *
                             * @param value allowed object is {@link String }
                             *
                             */
                            public void setEndereco(String value) {
                                this.endereco = value;
                            }

                            /**
                             * Obt�m o valor da propriedade numero.
                             *
                             */
                            public int getNumero() {
                                return numero;
                            }

                            /**
                             * Define o valor da propriedade numero.
                             *
                             */
                            public void setNumero(int value) {
                                this.numero = value;
                            }

                            /**
                             * Obt�m o valor da propriedade complemento.
                             *
                             * @return possible object is {@link String }
                             *
                             */
                            public String getComplemento() {
                                return complemento;
                            }

                            /**
                             * Define o valor da propriedade complemento.
                             *
                             * @param value allowed object is {@link String }
                             *
                             */
                            public void setComplemento(String value) {
                                this.complemento = value;
                            }

                            /**
                             * Obt�m o valor da propriedade bairro.
                             *
                             * @return possible object is {@link String }
                             *
                             */
                            public String getBairro() {
                                return bairro;
                            }

                            /**
                             * Define o valor da propriedade bairro.
                             *
                             * @param value allowed object is {@link String }
                             *
                             */
                            public void setBairro(String value) {
                                this.bairro = value;
                            }

                            /**
                             * Obt�m o valor da propriedade codigoMunicipio.
                             *
                             */
                            public int getCodigoMunicipio() {
                                return codigoMunicipio;
                            }

                            /**
                             * Define o valor da propriedade codigoMunicipio.
                             *
                             */
                            public void setCodigoMunicipio(int value) {
                                this.codigoMunicipio = value;
                            }

                            /**
                             * Obt�m o valor da propriedade uf.
                             *
                             * @return possible object is {@link String }
                             *
                             */
                            public String getUf() {
                                return uf;
                            }

                            /**
                             * Define o valor da propriedade uf.
                             *
                             * @param value allowed object is {@link String }
                             *
                             */
                            public void setUf(String value) {
                                this.uf = value;
                            }

                            /**
                             * Obt�m o valor da propriedade cep.
                             *
                             */
                            public int getCep() {
                                return cep;
                            }

                            /**
                             * Define o valor da propriedade cep.
                             *
                             */
                            public void setCep(int value) {
                                this.cep = value;
                            }

                        }

                        /**
                         * <p>
                         * Classe Java de anonymous complex type.
                         *
                         * <p>
                         * O seguinte fragmento do esquema especifica o conte�do
                         * esperado contido dentro desta classe.
                         *
                         * <pre>
                         * &lt;complexType>
                         *   &lt;complexContent>
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *       &lt;sequence>
                         *         &lt;element name="CpfCnpj">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="Cnpj" type="{http://www.w3.org/2001/XMLSchema}int"/>
                         *                 &lt;/sequence>
                         *               &lt;/restriction>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *       &lt;/sequence>
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         *
                         *
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "cpfCnpj"
                        })
                        public static class IdentificacaoTomador {

                            @XmlElement(name = "CpfCnpj", required = true)
                            protected CompNfse.Nfse.InfNfse.DeclaracaoPrestacaoServico.InfDeclaracaoPrestacaoServico.Tomador.IdentificacaoTomador.CpfCnpj cpfCnpj;

                            /**
                             * Obt�m o valor da propriedade cpfCnpj.
                             *
                             * @return possible object is
                             *     {@link CompNfse.Nfse.InfNfse.DeclaracaoPrestacaoServico.InfDeclaracaoPrestacaoServico.Tomador.IdentificacaoTomador.CpfCnpj }
                             *
                             */
                            public CompNfse.Nfse.InfNfse.DeclaracaoPrestacaoServico.InfDeclaracaoPrestacaoServico.Tomador.IdentificacaoTomador.CpfCnpj getCpfCnpj() {
                                return cpfCnpj;
                            }

                            /**
                             * Define o valor da propriedade cpfCnpj.
                             *
                             * @param value allowed object is
                             *     {@link CompNfse.Nfse.InfNfse.DeclaracaoPrestacaoServico.InfDeclaracaoPrestacaoServico.Tomador.IdentificacaoTomador.CpfCnpj }
                             *
                             */
                            public void setCpfCnpj(CompNfse.Nfse.InfNfse.DeclaracaoPrestacaoServico.InfDeclaracaoPrestacaoServico.Tomador.IdentificacaoTomador.CpfCnpj value) {
                                this.cpfCnpj = value;
                            }

                            /**
                             * <p>
                             * Classe Java de anonymous complex type.
                             *
                             * <p>
                             * O seguinte fragmento do esquema especifica o
                             * conte�do esperado contido dentro desta classe.
                             *
                             * <pre>
                             * &lt;complexType>
                             *   &lt;complexContent>
                             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *       &lt;sequence>
                             *         &lt;element name="Cnpj" type="{http://www.w3.org/2001/XMLSchema}int"/>
                             *       &lt;/sequence>
                             *     &lt;/restriction>
                             *   &lt;/complexContent>
                             * &lt;/complexType>
                             * </pre>
                             *
                             *
                             */
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "cnpj"
                            })
                            public static class CpfCnpj {

                                @XmlElement(name = "Cnpj")
                                protected String cnpj;

                                /**
                                 * Obt�m o valor da propriedade cnpj.
                                 *
                                 */
                                public String getCnpj() {
                                    return cnpj;
                                }

                                /**
                                 * Define o valor da propriedade cnpj.
                                 *
                                 */
                                public void setCnpj(String value) {
                                    this.cnpj = value;
                                }

                            }

                        }

                    }

                }

            }

            /**
             * <p>
             * Classe Java de anonymous complex type.
             *
             * <p>
             * O seguinte fragmento do esquema especifica o conte�do esperado
             * contido dentro desta classe.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="CodigoMunicipio" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="Uf" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "codigoMunicipio",
                "uf"
            })
            public static class OrgaoGerador {

                @XmlElement(name = "CodigoMunicipio")
                protected int codigoMunicipio;
                @XmlElement(name = "Uf", required = true)
                protected String uf;

                /**
                 * Obt�m o valor da propriedade codigoMunicipio.
                 *
                 */
                public int getCodigoMunicipio() {
                    return codigoMunicipio;
                }

                /**
                 * Define o valor da propriedade codigoMunicipio.
                 *
                 */
                public void setCodigoMunicipio(int value) {
                    this.codigoMunicipio = value;
                }

                /**
                 * Obt�m o valor da propriedade uf.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getUf() {
                    return uf;
                }

                /**
                 * Define o valor da propriedade uf.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setUf(String value) {
                    this.uf = value;
                }

            }

            /**
             * <p>
             * Classe Java de anonymous complex type.
             *
             * <p>
             * O seguinte fragmento do esquema especifica o conte�do esperado
             * contido dentro desta classe.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="IdentificacaoPrestador">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="CpfCnpj">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="Cnpj" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="InscricaoMunicipal" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="RazaoSocial" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="NomeFantasia" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Endereco">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Endereco" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                   &lt;element name="Complemento" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="Bairro" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="CodigoMunicipio" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                   &lt;element name="Uf" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="Cep" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Contato">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Telefone" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                   &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "identificacaoPrestador",
                "razaoSocial",
                "nomeFantasia",
                "endereco",
                "contato"
            })
            public static class PrestadorServico {

                @XmlElement(name = "IdentificacaoPrestador", required = true)
                protected CompNfse.Nfse.InfNfse.PrestadorServico.IdentificacaoPrestador identificacaoPrestador;
                @XmlElement(name = "RazaoSocial", required = true)
                protected String razaoSocial;
                @XmlElement(name = "NomeFantasia", required = true)
                protected String nomeFantasia;
                @XmlElement(name = "Endereco", required = true)
                protected CompNfse.Nfse.InfNfse.PrestadorServico.Endereco endereco;
                @XmlElement(name = "Contato", required = true)
                protected CompNfse.Nfse.InfNfse.PrestadorServico.Contato contato;

                /**
                 * Obt�m o valor da propriedade identificacaoPrestador.
                 *
                 * @return possible object is
                 *     {@link CompNfse.Nfse.InfNfse.PrestadorServico.IdentificacaoPrestador }
                 *
                 */
                public CompNfse.Nfse.InfNfse.PrestadorServico.IdentificacaoPrestador getIdentificacaoPrestador() {
                    return identificacaoPrestador;
                }

                /**
                 * Define o valor da propriedade identificacaoPrestador.
                 *
                 * @param value allowed object is
                 *     {@link CompNfse.Nfse.InfNfse.PrestadorServico.IdentificacaoPrestador }
                 *
                 */
                public void setIdentificacaoPrestador(CompNfse.Nfse.InfNfse.PrestadorServico.IdentificacaoPrestador value) {
                    this.identificacaoPrestador = value;
                }

                /**
                 * Obt�m o valor da propriedade razaoSocial.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getRazaoSocial() {
                    return razaoSocial;
                }

                /**
                 * Define o valor da propriedade razaoSocial.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setRazaoSocial(String value) {
                    this.razaoSocial = value;
                }

                /**
                 * Obt�m o valor da propriedade nomeFantasia.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getNomeFantasia() {
                    return nomeFantasia;
                }

                /**
                 * Define o valor da propriedade nomeFantasia.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setNomeFantasia(String value) {
                    this.nomeFantasia = value;
                }

                /**
                 * Obt�m o valor da propriedade endereco.
                 *
                 * @return possible object is
                 *     {@link CompNfse.Nfse.InfNfse.PrestadorServico.Endereco }
                 *
                 */
                public CompNfse.Nfse.InfNfse.PrestadorServico.Endereco getEndereco() {
                    return endereco;
                }

                /**
                 * Define o valor da propriedade endereco.
                 *
                 * @param value allowed object is
                 *     {@link CompNfse.Nfse.InfNfse.PrestadorServico.Endereco }
                 *
                 */
                public void setEndereco(CompNfse.Nfse.InfNfse.PrestadorServico.Endereco value) {
                    this.endereco = value;
                }

                /**
                 * Obt�m o valor da propriedade contato.
                 *
                 * @return possible object is
                 *     {@link CompNfse.Nfse.InfNfse.PrestadorServico.Contato }
                 *
                 */
                public CompNfse.Nfse.InfNfse.PrestadorServico.Contato getContato() {
                    return contato;
                }

                /**
                 * Define o valor da propriedade contato.
                 *
                 * @param value allowed object is
                 *     {@link CompNfse.Nfse.InfNfse.PrestadorServico.Contato }
                 *
                 */
                public void setContato(CompNfse.Nfse.InfNfse.PrestadorServico.Contato value) {
                    this.contato = value;
                }

                /**
                 * <p>
                 * Classe Java de anonymous complex type.
                 *
                 * <p>
                 * O seguinte fragmento do esquema especifica o conte�do
                 * esperado contido dentro desta classe.
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="Telefone" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "telefone",
                    "email"
                })
                public static class Contato {

                    @XmlElement(name = "Telefone")
                    protected int telefone;
                    @XmlElement(name = "Email", required = true)
                    protected String email;

                    /**
                     * Obt�m o valor da propriedade telefone.
                     *
                     */
                    public int getTelefone() {
                        return telefone;
                    }

                    /**
                     * Define o valor da propriedade telefone.
                     *
                     */
                    public void setTelefone(int value) {
                        this.telefone = value;
                    }

                    /**
                     * Obt�m o valor da propriedade email.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getEmail() {
                        return email;
                    }

                    /**
                     * Define o valor da propriedade email.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setEmail(String value) {
                        this.email = value;
                    }

                }

                /**
                 * <p>
                 * Classe Java de anonymous complex type.
                 *
                 * <p>
                 * O seguinte fragmento do esquema especifica o conte�do
                 * esperado contido dentro desta classe.
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="Endereco" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *         &lt;element name="Complemento" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="Bairro" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="CodigoMunicipio" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *         &lt;element name="Uf" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="Cep" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "endereco",
                    "numero",
                    "complemento",
                    "bairro",
                    "codigoMunicipio",
                    "uf",
                    "cep"
                })
                public static class Endereco {

                    @XmlElement(name = "Endereco", required = true)
                    protected String endereco;
                    @XmlElement(name = "Numero")
                    protected int numero;
                    @XmlElement(name = "Complemento", required = true)
                    protected String complemento;
                    @XmlElement(name = "Bairro", required = true)
                    protected String bairro;
                    @XmlElement(name = "CodigoMunicipio")
                    protected int codigoMunicipio;
                    @XmlElement(name = "Uf", required = true)
                    protected String uf;
                    @XmlElement(name = "Cep")
                    protected int cep;

                    /**
                     * Obt�m o valor da propriedade endereco.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getEndereco() {
                        return endereco;
                    }

                    /**
                     * Define o valor da propriedade endereco.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setEndereco(String value) {
                        this.endereco = value;
                    }

                    /**
                     * Obt�m o valor da propriedade numero.
                     *
                     */
                    public int getNumero() {
                        return numero;
                    }

                    /**
                     * Define o valor da propriedade numero.
                     *
                     */
                    public void setNumero(int value) {
                        this.numero = value;
                    }

                    /**
                     * Obt�m o valor da propriedade complemento.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getComplemento() {
                        return complemento;
                    }

                    /**
                     * Define o valor da propriedade complemento.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setComplemento(String value) {
                        this.complemento = value;
                    }

                    /**
                     * Obt�m o valor da propriedade bairro.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getBairro() {
                        return bairro;
                    }

                    /**
                     * Define o valor da propriedade bairro.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setBairro(String value) {
                        this.bairro = value;
                    }

                    /**
                     * Obt�m o valor da propriedade codigoMunicipio.
                     *
                     */
                    public int getCodigoMunicipio() {
                        return codigoMunicipio;
                    }

                    /**
                     * Define o valor da propriedade codigoMunicipio.
                     *
                     */
                    public void setCodigoMunicipio(int value) {
                        this.codigoMunicipio = value;
                    }

                    /**
                     * Obt�m o valor da propriedade uf.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getUf() {
                        return uf;
                    }

                    /**
                     * Define o valor da propriedade uf.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setUf(String value) {
                        this.uf = value;
                    }

                    /**
                     * Obt�m o valor da propriedade cep.
                     *
                     */
                    public int getCep() {
                        return cep;
                    }

                    /**
                     * Define o valor da propriedade cep.
                     *
                     */
                    public void setCep(int value) {
                        this.cep = value;
                    }

                }

                /**
                 * <p>
                 * Classe Java de anonymous complex type.
                 *
                 * <p>
                 * O seguinte fragmento do esquema especifica o conte�do
                 * esperado contido dentro desta classe.
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="CpfCnpj">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="Cnpj" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="InscricaoMunicipal" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "cpfCnpj",
                    "inscricaoMunicipal"
                })
                public static class IdentificacaoPrestador {

                    @XmlElement(name = "CpfCnpj", required = true)
                    protected CompNfse.Nfse.InfNfse.PrestadorServico.IdentificacaoPrestador.CpfCnpj cpfCnpj;
                    @XmlElement(name = "InscricaoMunicipal")
                    protected int inscricaoMunicipal;

                    /**
                     * Obt�m o valor da propriedade cpfCnpj.
                     *
                     * @return possible object is
                     *     {@link CompNfse.Nfse.InfNfse.PrestadorServico.IdentificacaoPrestador.CpfCnpj }
                     *
                     */
                    public CompNfse.Nfse.InfNfse.PrestadorServico.IdentificacaoPrestador.CpfCnpj getCpfCnpj() {
                        return cpfCnpj;
                    }

                    /**
                     * Define o valor da propriedade cpfCnpj.
                     *
                     * @param value allowed object is
                     *     {@link CompNfse.Nfse.InfNfse.PrestadorServico.IdentificacaoPrestador.CpfCnpj }
                     *
                     */
                    public void setCpfCnpj(CompNfse.Nfse.InfNfse.PrestadorServico.IdentificacaoPrestador.CpfCnpj value) {
                        this.cpfCnpj = value;
                    }

                    /**
                     * Obt�m o valor da propriedade inscricaoMunicipal.
                     *
                     */
                    public int getInscricaoMunicipal() {
                        return inscricaoMunicipal;
                    }

                    /**
                     * Define o valor da propriedade inscricaoMunicipal.
                     *
                     */
                    public void setInscricaoMunicipal(int value) {
                        this.inscricaoMunicipal = value;
                    }

                    /**
                     * <p>
                     * Classe Java de anonymous complex type.
                     *
                     * <p>
                     * O seguinte fragmento do esquema especifica o conte�do
                     * esperado contido dentro desta classe.
                     *
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="Cnpj" type="{http://www.w3.org/2001/XMLSchema}int"/>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     *
                     *
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "cnpj"
                    })
                    public static class CpfCnpj {

                        @XmlElement(name = "Cnpj")
                        protected int cnpj;

                        /**
                         * Obt�m o valor da propriedade cnpj.
                         *
                         */
                        public int getCnpj() {
                            return cnpj;
                        }

                        /**
                         * Define o valor da propriedade cnpj.
                         *
                         */
                        public void setCnpj(int value) {
                            this.cnpj = value;
                        }

                    }

                }

            }

            /**
             * <p>
             * Classe Java de anonymous complex type.
             *
             * <p>
             * O seguinte fragmento do esquema especifica o conte�do esperado
             * contido dentro desta classe.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="BaseCalculo" type="{http://www.w3.org/2001/XMLSchema}double"/>
             *         &lt;element name="Aliquota" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="ValorIss" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="ValorLiquidoNfse" type="{http://www.w3.org/2001/XMLSchema}double"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "baseCalculo",
                "aliquota",
                "valorIss",
                "valorLiquidoNfse"
            })
            public static class ValoresNfse {

                @XmlElement(name = "BaseCalculo")
                protected double baseCalculo;
                @XmlElement(name = "Aliquota")
                protected int aliquota;
                @XmlElement(name = "ValorIss")
                protected int valorIss;
                @XmlElement(name = "ValorLiquidoNfse")
                protected double valorLiquidoNfse;

                /**
                 * Obt�m o valor da propriedade baseCalculo.
                 *
                 */
                public double getBaseCalculo() {
                    return baseCalculo;
                }

                /**
                 * Define o valor da propriedade baseCalculo.
                 *
                 */
                public void setBaseCalculo(double value) {
                    this.baseCalculo = value;
                }

                /**
                 * Obt�m o valor da propriedade aliquota.
                 *
                 */
                public int getAliquota() {
                    return aliquota;
                }

                /**
                 * Define o valor da propriedade aliquota.
                 *
                 */
                public void setAliquota(int value) {
                    this.aliquota = value;
                }

                /**
                 * Obt�m o valor da propriedade valorIss.
                 *
                 */
                public int getValorIss() {
                    return valorIss;
                }

                /**
                 * Define o valor da propriedade valorIss.
                 *
                 */
                public void setValorIss(int value) {
                    this.valorIss = value;
                }

                /**
                 * Obt�m o valor da propriedade valorLiquidoNfse.
                 *
                 */
                public double getValorLiquidoNfse() {
                    return valorLiquidoNfse;
                }

                /**
                 * Define o valor da propriedade valorLiquidoNfse.
                 *
                 */
                public void setValorLiquidoNfse(double value) {
                    this.valorLiquidoNfse = value;
                }

            }

        }

    }

    /**
     * <p>
     * Classe Java de anonymous complex type.
     *
     * <p>
     * O seguinte fragmento do esquema especifica o conte�do esperado contido
     * dentro desta classe.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Confirmacao">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Pedido">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="InfPedidoCancelamento">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="IdentificacaoNfse">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                                 &lt;element name="CpfCnpj">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="Cnpj" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="InscricaoMunicipal" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                                 &lt;element name="CodigoMunicipio" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="CodigoCancelamento" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="DataHora" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="versao" type="{http://www.w3.org/2001/XMLSchema}double" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "confirmacao"
    })
    public static class NfseCancelamento {

        @XmlElement(name = "Confirmacao", required = true)
        protected CompNfse.NfseCancelamento.Confirmacao confirmacao;
        @XmlAttribute(name = "versao")
        protected Double versao;

        /**
         * Obt�m o valor da propriedade confirmacao.
         *
         * @return possible object is
         *     {@link CompNfse.NfseCancelamento.Confirmacao }
         *
         */
        public CompNfse.NfseCancelamento.Confirmacao getConfirmacao() {
            return confirmacao;
        }

        /**
         * Define o valor da propriedade confirmacao.
         *
         * @param value allowed object is
         *     {@link CompNfse.NfseCancelamento.Confirmacao }
         *
         */
        public void setConfirmacao(CompNfse.NfseCancelamento.Confirmacao value) {
            this.confirmacao = value;
        }

        /**
         * Obt�m o valor da propriedade versao.
         *
         * @return possible object is {@link Double }
         *
         */
        public Double getVersao() {
            return versao;
        }

        /**
         * Define o valor da propriedade versao.
         *
         * @param value allowed object is {@link Double }
         *
         */
        public void setVersao(Double value) {
            this.versao = value;
        }

        /**
         * <p>
         * Classe Java de anonymous complex type.
         *
         * <p>
         * O seguinte fragmento do esquema especifica o conte�do esperado
         * contido dentro desta classe.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Pedido">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="InfPedidoCancelamento">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="IdentificacaoNfse">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                                       &lt;element name="CpfCnpj">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="Cnpj" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="InscricaoMunicipal" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                                       &lt;element name="CodigoMunicipio" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="CodigoCancelamento" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="DataHora" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "pedido",
            "dataHora"
        })
        public static class Confirmacao {

            @XmlElement(name = "Pedido", required = true)
            protected CompNfse.NfseCancelamento.Confirmacao.Pedido pedido;
            @XmlElement(name = "DataHora", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar dataHora;

            /**
             * Obt�m o valor da propriedade pedido.
             *
             * @return possible object is
             *     {@link CompNfse.NfseCancelamento.Confirmacao.Pedido }
             *
             */
            public CompNfse.NfseCancelamento.Confirmacao.Pedido getPedido() {
                return pedido;
            }

            /**
             * Define o valor da propriedade pedido.
             *
             * @param value allowed object is
             *     {@link CompNfse.NfseCancelamento.Confirmacao.Pedido }
             *
             */
            public void setPedido(CompNfse.NfseCancelamento.Confirmacao.Pedido value) {
                this.pedido = value;
            }

            /**
             * Obt�m o valor da propriedade dataHora.
             *
             * @return possible object is {@link XMLGregorianCalendar }
             *
             */
            public XMLGregorianCalendar getDataHora() {
                return dataHora;
            }

            /**
             * Define o valor da propriedade dataHora.
             *
             * @param value allowed object is {@link XMLGregorianCalendar }
             *
             */
            public void setDataHora(XMLGregorianCalendar value) {
                this.dataHora = value;
            }

            /**
             * <p>
             * Classe Java de anonymous complex type.
             *
             * <p>
             * O seguinte fragmento do esquema especifica o conte�do esperado
             * contido dentro desta classe.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="InfPedidoCancelamento">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="IdentificacaoNfse">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                             &lt;element name="CpfCnpj">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="Cnpj" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                                     &lt;/sequence>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="InscricaoMunicipal" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                             &lt;element name="CodigoMunicipio" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="CodigoCancelamento" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "infPedidoCancelamento"
            })
            public static class Pedido {

                @XmlElement(name = "InfPedidoCancelamento", required = true)
                protected CompNfse.NfseCancelamento.Confirmacao.Pedido.InfPedidoCancelamento infPedidoCancelamento;

                /**
                 * Obt�m o valor da propriedade infPedidoCancelamento.
                 *
                 * @return possible object is
                 *     {@link CompNfse.NfseCancelamento.Confirmacao.Pedido.InfPedidoCancelamento }
                 *
                 */
                public CompNfse.NfseCancelamento.Confirmacao.Pedido.InfPedidoCancelamento getInfPedidoCancelamento() {
                    return infPedidoCancelamento;
                }

                /**
                 * Define o valor da propriedade infPedidoCancelamento.
                 *
                 * @param value allowed object is
                 *     {@link CompNfse.NfseCancelamento.Confirmacao.Pedido.InfPedidoCancelamento }
                 *
                 */
                public void setInfPedidoCancelamento(CompNfse.NfseCancelamento.Confirmacao.Pedido.InfPedidoCancelamento value) {
                    this.infPedidoCancelamento = value;
                }

                /**
                 * <p>
                 * Classe Java de anonymous complex type.
                 *
                 * <p>
                 * O seguinte fragmento do esquema especifica o conte�do
                 * esperado contido dentro desta classe.
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="IdentificacaoNfse">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *                   &lt;element name="CpfCnpj">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="Cnpj" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *                           &lt;/sequence>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="InscricaoMunicipal" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *                   &lt;element name="CodigoMunicipio" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="CodigoCancelamento" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "identificacaoNfse",
                    "codigoCancelamento"
                })
                public static class InfPedidoCancelamento {

                    @XmlElement(name = "IdentificacaoNfse", required = true)
                    protected CompNfse.NfseCancelamento.Confirmacao.Pedido.InfPedidoCancelamento.IdentificacaoNfse identificacaoNfse;
                    @XmlElement(name = "CodigoCancelamento")
                    protected int codigoCancelamento;

                    /**
                     * Obt�m o valor da propriedade identificacaoNfse.
                     *
                     * @return possible object is
                     *     {@link CompNfse.NfseCancelamento.Confirmacao.Pedido.InfPedidoCancelamento.IdentificacaoNfse }
                     *
                     */
                    public CompNfse.NfseCancelamento.Confirmacao.Pedido.InfPedidoCancelamento.IdentificacaoNfse getIdentificacaoNfse() {
                        return identificacaoNfse;
                    }

                    /**
                     * Define o valor da propriedade identificacaoNfse.
                     *
                     * @param value allowed object is
                     *     {@link CompNfse.NfseCancelamento.Confirmacao.Pedido.InfPedidoCancelamento.IdentificacaoNfse }
                     *
                     */
                    public void setIdentificacaoNfse(CompNfse.NfseCancelamento.Confirmacao.Pedido.InfPedidoCancelamento.IdentificacaoNfse value) {
                        this.identificacaoNfse = value;
                    }

                    /**
                     * Obt�m o valor da propriedade codigoCancelamento.
                     *
                     */
                    public int getCodigoCancelamento() {
                        return codigoCancelamento;
                    }

                    /**
                     * Define o valor da propriedade codigoCancelamento.
                     *
                     */
                    public void setCodigoCancelamento(int value) {
                        this.codigoCancelamento = value;
                    }

                    /**
                     * <p>
                     * Classe Java de anonymous complex type.
                     *
                     * <p>
                     * O seguinte fragmento do esquema especifica o conte�do
                     * esperado contido dentro desta classe.
                     *
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}int"/>
                     *         &lt;element name="CpfCnpj">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="Cnpj" type="{http://www.w3.org/2001/XMLSchema}int"/>
                     *                 &lt;/sequence>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="InscricaoMunicipal" type="{http://www.w3.org/2001/XMLSchema}int"/>
                     *         &lt;element name="CodigoMunicipio" type="{http://www.w3.org/2001/XMLSchema}int"/>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     *
                     *
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "numero",
                        "cpfCnpj",
                        "inscricaoMunicipal",
                        "codigoMunicipio"
                    })
                    public static class IdentificacaoNfse {

                        @XmlElement(name = "Numero")
                        protected int numero;
                        @XmlElement(name = "CpfCnpj", required = true)
                        protected CompNfse.NfseCancelamento.Confirmacao.Pedido.InfPedidoCancelamento.IdentificacaoNfse.CpfCnpj cpfCnpj;
                        @XmlElement(name = "InscricaoMunicipal")
                        protected int inscricaoMunicipal;
                        @XmlElement(name = "CodigoMunicipio")
                        protected int codigoMunicipio;

                        /**
                         * Obt�m o valor da propriedade numero.
                         *
                         */
                        public int getNumero() {
                            return numero;
                        }

                        /**
                         * Define o valor da propriedade numero.
                         *
                         */
                        public void setNumero(int value) {
                            this.numero = value;
                        }

                        /**
                         * Obt�m o valor da propriedade cpfCnpj.
                         *
                         * @return possible object is
                         *     {@link CompNfse.NfseCancelamento.Confirmacao.Pedido.InfPedidoCancelamento.IdentificacaoNfse.CpfCnpj }
                         *
                         */
                        public CompNfse.NfseCancelamento.Confirmacao.Pedido.InfPedidoCancelamento.IdentificacaoNfse.CpfCnpj getCpfCnpj() {
                            return cpfCnpj;
                        }

                        /**
                         * Define o valor da propriedade cpfCnpj.
                         *
                         * @param value allowed object is
                         *     {@link CompNfse.NfseCancelamento.Confirmacao.Pedido.InfPedidoCancelamento.IdentificacaoNfse.CpfCnpj }
                         *
                         */
                        public void setCpfCnpj(CompNfse.NfseCancelamento.Confirmacao.Pedido.InfPedidoCancelamento.IdentificacaoNfse.CpfCnpj value) {
                            this.cpfCnpj = value;
                        }

                        /**
                         * Obt�m o valor da propriedade inscricaoMunicipal.
                         *
                         */
                        public int getInscricaoMunicipal() {
                            return inscricaoMunicipal;
                        }

                        /**
                         * Define o valor da propriedade inscricaoMunicipal.
                         *
                         */
                        public void setInscricaoMunicipal(int value) {
                            this.inscricaoMunicipal = value;
                        }

                        /**
                         * Obt�m o valor da propriedade codigoMunicipio.
                         *
                         */
                        public int getCodigoMunicipio() {
                            return codigoMunicipio;
                        }

                        /**
                         * Define o valor da propriedade codigoMunicipio.
                         *
                         */
                        public void setCodigoMunicipio(int value) {
                            this.codigoMunicipio = value;
                        }

                        /**
                         * <p>
                         * Classe Java de anonymous complex type.
                         *
                         * <p>
                         * O seguinte fragmento do esquema especifica o conte�do
                         * esperado contido dentro desta classe.
                         *
                         * <pre>
                         * &lt;complexType>
                         *   &lt;complexContent>
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *       &lt;sequence>
                         *         &lt;element name="Cnpj" type="{http://www.w3.org/2001/XMLSchema}int"/>
                         *       &lt;/sequence>
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         *
                         *
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "cnpj"
                        })
                        public static class CpfCnpj {

                            @XmlElement(name = "Cnpj")
                            protected int cnpj;

                            /**
                             * Obt�m o valor da propriedade cnpj.
                             *
                             */
                            public int getCnpj() {
                                return cnpj;
                            }

                            /**
                             * Define o valor da propriedade cnpj.
                             *
                             */
                            public void setCnpj(int value) {
                                this.cnpj = value;
                            }

                        }

                    }

                }

            }

        }

    }

}
