//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.07.11 at 04:33:43 PM EEST 
//


package com.ing.ideal.connector.binding;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;

import org.w3._2000._09.xmldsig.SignatureType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="createDateTimestamp" type="{http://www.idealdesk.com/ideal/messages/mer-acq/3.3.1}iDEAL.dateTime"/>
 *         &lt;element name="Issuer">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="issuerID" type="{http://www.idealdesk.com/ideal/messages/mer-acq/3.3.1}Issuer.issuerID"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Merchant">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="merchantID" type="{http://www.idealdesk.com/ideal/messages/mer-acq/3.3.1}Merchant.merchantID"/>
 *                   &lt;element name="subID" type="{http://www.idealdesk.com/ideal/messages/mer-acq/3.3.1}Merchant.subID"/>
 *                   &lt;element name="merchantReturnURL" type="{http://www.idealdesk.com/ideal/messages/mer-acq/3.3.1}iDEAL.url"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Transaction">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="purchaseID" type="{http://www.idealdesk.com/ideal/messages/mer-acq/3.3.1}Transaction.purchaseID"/>
 *                   &lt;element name="amount" type="{http://www.idealdesk.com/ideal/messages/mer-acq/3.3.1}Transaction.amount"/>
 *                   &lt;element name="currency" type="{http://www.idealdesk.com/ideal/messages/mer-acq/3.3.1}Transaction.currency"/>
 *                   &lt;element name="expirationPeriod" type="{http://www.idealdesk.com/ideal/messages/mer-acq/3.3.1}Transaction.expirationPeriod" minOccurs="0"/>
 *                   &lt;element name="language" type="{http://www.idealdesk.com/ideal/messages/mer-acq/3.3.1}Transaction.language"/>
 *                   &lt;element name="description" type="{http://www.idealdesk.com/ideal/messages/mer-acq/3.3.1}Transaction.description"/>
 *                   &lt;element name="entranceCode" type="{http://www.idealdesk.com/ideal/messages/mer-acq/3.3.1}Transaction.entranceCode"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.idealdesk.com/ideal/messages/mer-acq/3.3.1}MessageAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "createDateTimestamp",
    "issuer",
    "merchant",
    "transaction",
    "signature"
})
@XmlRootElement(name = "AcquirerTrxReq")
public class AcquirerTrxReq {

    @XmlElement(required = true)
    protected XMLGregorianCalendar createDateTimestamp;
    @XmlElement(name = "Issuer", required = true)
    protected AcquirerTrxReq.Issuer issuer;
    @XmlElement(name = "Merchant", required = true)
    protected AcquirerTrxReq.Merchant merchant;
    @XmlElement(name = "Transaction", required = true)
    protected AcquirerTrxReq.Transaction transaction;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Gets the value of the createDateTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDateTimestamp() {
        return createDateTimestamp;
    }

    /**
     * Sets the value of the createDateTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDateTimestamp(XMLGregorianCalendar value) {
        this.createDateTimestamp = value;
    }

    /**
     * Gets the value of the issuer property.
     * 
     * @return
     *     possible object is
     *     {@link AcquirerTrxReq.Issuer }
     *     
     */
    public AcquirerTrxReq.Issuer getIssuer() {
        return issuer;
    }

    /**
     * Sets the value of the issuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcquirerTrxReq.Issuer }
     *     
     */
    public void setIssuer(AcquirerTrxReq.Issuer value) {
        this.issuer = value;
    }

    /**
     * Gets the value of the merchant property.
     * 
     * @return
     *     possible object is
     *     {@link AcquirerTrxReq.Merchant }
     *     
     */
    public AcquirerTrxReq.Merchant getMerchant() {
        return merchant;
    }

    /**
     * Sets the value of the merchant property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcquirerTrxReq.Merchant }
     *     
     */
    public void setMerchant(AcquirerTrxReq.Merchant value) {
        this.merchant = value;
    }

    /**
     * Gets the value of the transaction property.
     * 
     * @return
     *     possible object is
     *     {@link AcquirerTrxReq.Transaction }
     *     
     */
    public AcquirerTrxReq.Transaction getTransaction() {
        return transaction;
    }

    /**
     * Sets the value of the transaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcquirerTrxReq.Transaction }
     *     
     */
    public void setTransaction(AcquirerTrxReq.Transaction value) {
        this.transaction = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="issuerID" type="{http://www.idealdesk.com/ideal/messages/mer-acq/3.3.1}Issuer.issuerID"/>
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
        "issuerID"
    })
    public static class Issuer {

        @XmlElement(required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String issuerID;

        /**
         * Gets the value of the issuerID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIssuerID() {
            return issuerID;
        }

        /**
         * Sets the value of the issuerID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIssuerID(String value) {
            this.issuerID = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="merchantID" type="{http://www.idealdesk.com/ideal/messages/mer-acq/3.3.1}Merchant.merchantID"/>
     *         &lt;element name="subID" type="{http://www.idealdesk.com/ideal/messages/mer-acq/3.3.1}Merchant.subID"/>
     *         &lt;element name="merchantReturnURL" type="{http://www.idealdesk.com/ideal/messages/mer-acq/3.3.1}iDEAL.url"/>
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
        "merchantID",
        "subID",
        "merchantReturnURL"
    })
    public static class Merchant {

        @XmlElement(required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String merchantID;
        protected int subID;
        @XmlElement(required = true)
        protected String merchantReturnURL;

        /**
         * Gets the value of the merchantID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMerchantID() {
            return merchantID;
        }

        /**
         * Sets the value of the merchantID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMerchantID(String value) {
            this.merchantID = value;
        }

        /**
         * Gets the value of the subID property.
         * 
         */
        public int getSubID() {
            return subID;
        }

        /**
         * Sets the value of the subID property.
         * 
         */
        public void setSubID(int value) {
            this.subID = value;
        }

        /**
         * Gets the value of the merchantReturnURL property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMerchantReturnURL() {
            return merchantReturnURL;
        }

        /**
         * Sets the value of the merchantReturnURL property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMerchantReturnURL(String value) {
            this.merchantReturnURL = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="purchaseID" type="{http://www.idealdesk.com/ideal/messages/mer-acq/3.3.1}Transaction.purchaseID"/>
     *         &lt;element name="amount" type="{http://www.idealdesk.com/ideal/messages/mer-acq/3.3.1}Transaction.amount"/>
     *         &lt;element name="currency" type="{http://www.idealdesk.com/ideal/messages/mer-acq/3.3.1}Transaction.currency"/>
     *         &lt;element name="expirationPeriod" type="{http://www.idealdesk.com/ideal/messages/mer-acq/3.3.1}Transaction.expirationPeriod" minOccurs="0"/>
     *         &lt;element name="language" type="{http://www.idealdesk.com/ideal/messages/mer-acq/3.3.1}Transaction.language"/>
     *         &lt;element name="description" type="{http://www.idealdesk.com/ideal/messages/mer-acq/3.3.1}Transaction.description"/>
     *         &lt;element name="entranceCode" type="{http://www.idealdesk.com/ideal/messages/mer-acq/3.3.1}Transaction.entranceCode"/>
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
        "purchaseID",
        "amount",
        "currency",
        "expirationPeriod",
        "language",
        "description",
        "entranceCode"
    })
    public static class Transaction {

        @XmlElement(required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String purchaseID;
        @XmlElement(required = true)
        protected BigDecimal amount;
        @XmlElement(required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String currency;
        protected Duration expirationPeriod;
        @XmlElement(required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String language;
        @XmlElement(required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String description;
        @XmlElement(required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String entranceCode;

        /**
         * Gets the value of the purchaseID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPurchaseID() {
            return purchaseID;
        }

        /**
         * Sets the value of the purchaseID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPurchaseID(String value) {
            this.purchaseID = value;
        }

        /**
         * Gets the value of the amount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAmount() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAmount(BigDecimal value) {
            this.amount = value;
        }

        /**
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrency() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrency(String value) {
            this.currency = value;
        }

        /**
         * Gets the value of the expirationPeriod property.
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getExpirationPeriod() {
            return expirationPeriod;
        }

        /**
         * Sets the value of the expirationPeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setExpirationPeriod(Duration value) {
            this.expirationPeriod = value;
        }

        /**
         * Gets the value of the language property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLanguage() {
            return language;
        }

        /**
         * Sets the value of the language property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLanguage(String value) {
            this.language = value;
        }

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
        }

        /**
         * Gets the value of the entranceCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEntranceCode() {
            return entranceCode;
        }

        /**
         * Sets the value of the entranceCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEntranceCode(String value) {
            this.entranceCode = value;
        }

    }

}
