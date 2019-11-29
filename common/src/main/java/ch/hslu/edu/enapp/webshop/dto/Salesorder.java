
package ch.hslu.edu.enapp.webshop.dto;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="studentName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="postFinancePayId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dynNAVCustomerNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dynNAVSalesOrderNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="purchaseTotalCost" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="purchaseItemCount" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="purchaseId" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="purchaseDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="correlationId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lastUpdate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
    "studentName",
    "postFinancePayId",
    "dynNAVCustomerNo",
    "dynNAVSalesOrderNo",
    "purchaseTotalCost",
    "status",
    "purchaseItemCount",
    "purchaseId",
    "purchaseDateTime",
    "correlationId",
    "lastUpdate"
})
@XmlRootElement(name = "salesorder")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-29T01:54:31+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class Salesorder {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-29T01:54:31+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String studentName;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-29T01:54:31+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected int postFinancePayId;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-29T01:54:31+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String dynNAVCustomerNo;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-29T01:54:31+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String dynNAVSalesOrderNo;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-29T01:54:31+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected float purchaseTotalCost;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-29T01:54:31+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected byte status;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-29T01:54:31+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected byte purchaseItemCount;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-29T01:54:31+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected short purchaseId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-29T01:54:31+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected XMLGregorianCalendar purchaseDateTime;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-29T01:54:31+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String correlationId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-29T01:54:31+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected XMLGregorianCalendar lastUpdate;

    /**
     * Ruft den Wert der studentName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-29T01:54:31+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getStudentName() {
        return studentName;
    }

    /**
     * Legt den Wert der studentName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-29T01:54:31+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setStudentName(String value) {
        this.studentName = value;
    }

    /**
     * Ruft den Wert der postFinancePayId-Eigenschaft ab.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-29T01:54:31+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public int getPostFinancePayId() {
        return postFinancePayId;
    }

    /**
     * Legt den Wert der postFinancePayId-Eigenschaft fest.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-29T01:54:31+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPostFinancePayId(int value) {
        this.postFinancePayId = value;
    }

    /**
     * Ruft den Wert der dynNAVCustomerNo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-29T01:54:31+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getDynNAVCustomerNo() {
        return dynNAVCustomerNo;
    }

    /**
     * Legt den Wert der dynNAVCustomerNo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-29T01:54:31+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDynNAVCustomerNo(String value) {
        this.dynNAVCustomerNo = value;
    }

    /**
     * Ruft den Wert der dynNAVSalesOrderNo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-29T01:54:31+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getDynNAVSalesOrderNo() {
        return dynNAVSalesOrderNo;
    }

    /**
     * Legt den Wert der dynNAVSalesOrderNo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-29T01:54:31+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDynNAVSalesOrderNo(String value) {
        this.dynNAVSalesOrderNo = value;
    }

    /**
     * Ruft den Wert der purchaseTotalCost-Eigenschaft ab.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-29T01:54:31+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public float getPurchaseTotalCost() {
        return purchaseTotalCost;
    }

    /**
     * Legt den Wert der purchaseTotalCost-Eigenschaft fest.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-29T01:54:31+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPurchaseTotalCost(float value) {
        this.purchaseTotalCost = value;
    }

    /**
     * Ruft den Wert der status-Eigenschaft ab.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-29T01:54:31+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public byte getStatus() {
        return status;
    }

    /**
     * Legt den Wert der status-Eigenschaft fest.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-29T01:54:31+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setStatus(byte value) {
        this.status = value;
    }

    /**
     * Ruft den Wert der purchaseItemCount-Eigenschaft ab.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-29T01:54:31+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public byte getPurchaseItemCount() {
        return purchaseItemCount;
    }

    /**
     * Legt den Wert der purchaseItemCount-Eigenschaft fest.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-29T01:54:31+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPurchaseItemCount(byte value) {
        this.purchaseItemCount = value;
    }

    /**
     * Ruft den Wert der purchaseId-Eigenschaft ab.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-29T01:54:31+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public short getPurchaseId() {
        return purchaseId;
    }

    /**
     * Legt den Wert der purchaseId-Eigenschaft fest.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-29T01:54:31+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPurchaseId(short value) {
        this.purchaseId = value;
    }

    /**
     * Ruft den Wert der purchaseDateTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-29T01:54:31+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public XMLGregorianCalendar getPurchaseDateTime() {
        return purchaseDateTime;
    }

    /**
     * Legt den Wert der purchaseDateTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-29T01:54:31+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPurchaseDateTime(XMLGregorianCalendar value) {
        this.purchaseDateTime = value;
    }

    /**
     * Ruft den Wert der correlationId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-29T01:54:31+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getCorrelationId() {
        return correlationId;
    }

    /**
     * Legt den Wert der correlationId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-29T01:54:31+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCorrelationId(String value) {
        this.correlationId = value;
    }

    /**
     * Ruft den Wert der lastUpdate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-29T01:54:31+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public XMLGregorianCalendar getLastUpdate() {
        return lastUpdate;
    }

    /**
     * Legt den Wert der lastUpdate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-29T01:54:31+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setLastUpdate(XMLGregorianCalendar value) {
        this.lastUpdate = value;
    }

}
