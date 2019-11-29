
package ch.hslu.edu.enapp.webshop.dto;

import javax.annotation.Generated;
import javax.xml.bind.annotation.*;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="orderID" type="{http://www.w3.org/2001/XMLSchema}short" />
 *       &lt;attribute name="PAYID" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="NCSTATUS" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="NCERROR" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="ACCEPTANCE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="STATUS" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="IPCTY" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="CCCTY" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ECI" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="CVCCheck" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AAVCheck" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="VC" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="amount" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PM" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BRAND" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="NCERRORPLUS" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
@XmlRootElement(name = "ncresponse")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-28T04:14:27+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class PostFinanceResponse {

    @XmlValue
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-28T04:14:27+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String value;
    @XmlAttribute(name = "orderID")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-28T04:14:27+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Short orderID;
    @XmlAttribute(name = "PAYID")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-28T04:14:27+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Long payid;
    @XmlAttribute(name = "NCSTATUS")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-28T04:14:27+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Byte ncstatus;
    @XmlAttribute(name = "NCERROR")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-28T04:14:27+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Byte ncerror;
    @XmlAttribute(name = "ACCEPTANCE")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-28T04:14:27+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String acceptance;
    @XmlAttribute(name = "STATUS")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-28T04:14:27+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Byte status;
    @XmlAttribute(name = "IPCTY")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-28T04:14:27+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Byte ipcty;
    @XmlAttribute(name = "CCCTY")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-28T04:14:27+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String cccty;
    @XmlAttribute(name = "ECI")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-28T04:14:27+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Byte eci;
    @XmlAttribute(name = "CVCCheck")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-28T04:14:27+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String cvcCheck;
    @XmlAttribute(name = "AAVCheck")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-28T04:14:27+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String aavCheck;
    @XmlAttribute(name = "VC")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-28T04:14:27+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String vc;
    @XmlAttribute(name = "amount")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-28T04:14:27+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Byte amount;
    @XmlAttribute(name = "currency")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-28T04:14:27+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String currency;
    @XmlAttribute(name = "PM")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-28T04:14:27+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String pm;
    @XmlAttribute(name = "BRAND")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-28T04:14:27+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String brand;
    @XmlAttribute(name = "NCERRORPLUS")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-28T04:14:27+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String ncerrorplus;

    /**
     * Ruft den Wert der value-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-28T04:14:27+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getValue() {
        return value;
    }

    /**
     * Legt den Wert der value-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-28T04:14:27+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Ruft den Wert der orderID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-28T04:14:27+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Short getOrderID() {
        return orderID;
    }

    /**
     * Legt den Wert der orderID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-28T04:14:27+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setOrderID(Short value) {
        this.orderID = value;
    }

    /**
     * Ruft den Wert der payid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-28T04:14:27+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Long getPAYID() {
        return payid;
    }

    /**
     * Legt den Wert der payid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-28T04:14:27+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPAYID(Long value) {
        this.payid = value;
    }

    /**
     * Ruft den Wert der ncstatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-28T04:14:27+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Byte getNCSTATUS() {
        return ncstatus;
    }

    /**
     * Legt den Wert der ncstatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-28T04:14:27+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setNCSTATUS(Byte value) {
        this.ncstatus = value;
    }

    /**
     * Ruft den Wert der ncerror-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-28T04:14:27+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Byte getNCERROR() {
        return ncerror;
    }

    /**
     * Legt den Wert der ncerror-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-28T04:14:27+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setNCERROR(Byte value) {
        this.ncerror = value;
    }

    /**
     * Ruft den Wert der acceptance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-28T04:14:27+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getACCEPTANCE() {
        return acceptance;
    }

    /**
     * Legt den Wert der acceptance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-28T04:14:27+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setACCEPTANCE(String value) {
        this.acceptance = value;
    }

    /**
     * Ruft den Wert der status-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-28T04:14:27+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Byte getSTATUS() {
        return status;
    }

    /**
     * Legt den Wert der status-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-28T04:14:27+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setSTATUS(Byte value) {
        this.status = value;
    }

    /**
     * Ruft den Wert der ipcty-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-28T04:14:27+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Byte getIPCTY() {
        return ipcty;
    }

    /**
     * Legt den Wert der ipcty-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-28T04:14:27+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setIPCTY(Byte value) {
        this.ipcty = value;
    }

    /**
     * Ruft den Wert der cccty-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-28T04:14:27+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getCCCTY() {
        return cccty;
    }

    /**
     * Legt den Wert der cccty-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-28T04:14:27+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCCCTY(String value) {
        this.cccty = value;
    }

    /**
     * Ruft den Wert der eci-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-28T04:14:27+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Byte getECI() {
        return eci;
    }

    /**
     * Legt den Wert der eci-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-28T04:14:27+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setECI(Byte value) {
        this.eci = value;
    }

    /**
     * Ruft den Wert der cvcCheck-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-28T04:14:27+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getCVCCheck() {
        return cvcCheck;
    }

    /**
     * Legt den Wert der cvcCheck-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-28T04:14:27+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCVCCheck(String value) {
        this.cvcCheck = value;
    }

    /**
     * Ruft den Wert der aavCheck-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-28T04:14:27+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getAAVCheck() {
        return aavCheck;
    }

    /**
     * Legt den Wert der aavCheck-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-28T04:14:27+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setAAVCheck(String value) {
        this.aavCheck = value;
    }

    /**
     * Ruft den Wert der vc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-28T04:14:27+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getVC() {
        return vc;
    }

    /**
     * Legt den Wert der vc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-28T04:14:27+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setVC(String value) {
        this.vc = value;
    }

    /**
     * Ruft den Wert der amount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-28T04:14:27+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Byte getAmount() {
        return amount;
    }

    /**
     * Legt den Wert der amount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-28T04:14:27+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setAmount(Byte value) {
        this.amount = value;
    }

    /**
     * Ruft den Wert der currency-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-28T04:14:27+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getCurrency() {
        return currency;
    }

    /**
     * Legt den Wert der currency-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-28T04:14:27+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Ruft den Wert der pm-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-28T04:14:27+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getPM() {
        return pm;
    }

    /**
     * Legt den Wert der pm-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-28T04:14:27+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPM(String value) {
        this.pm = value;
    }

    /**
     * Ruft den Wert der brand-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-28T04:14:27+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getBRAND() {
        return brand;
    }

    /**
     * Legt den Wert der brand-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-28T04:14:27+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setBRAND(String value) {
        this.brand = value;
    }

    /**
     * Ruft den Wert der ncerrorplus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-28T04:14:27+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getNCERRORPLUS() {
        return ncerrorplus;
    }

    /**
     * Legt den Wert der ncerrorplus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-28T04:14:27+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setNCERRORPLUS(String value) {
        this.ncerrorplus = value;
    }

}
