
package ch.hslu.edu.enapp.webshop.erp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Item_Filter complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Item_Filter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Field" type="{urn:microsoft-dynamics-schemas/page/item}Item_Fields"/&gt;
 *         &lt;element name="Criteria" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Item_Filter", propOrder = {
    "field",
    "criteria"
})
public class ItemFilter {

    @XmlElement(name = "Field", required = true)
    @XmlSchemaType(name = "string")
    protected ItemFields field;
    @XmlElement(name = "Criteria", required = true)
    protected String criteria;

    /**
     * Ruft den Wert der field-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ItemFields }
     *     
     */
    public ItemFields getField() {
        return field;
    }

    /**
     * Legt den Wert der field-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFields }
     *     
     */
    public void setField(ItemFields value) {
        this.field = value;
    }

    /**
     * Ruft den Wert der criteria-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCriteria() {
        return criteria;
    }

    /**
     * Legt den Wert der criteria-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCriteria(String value) {
        this.criteria = value;
    }

}
