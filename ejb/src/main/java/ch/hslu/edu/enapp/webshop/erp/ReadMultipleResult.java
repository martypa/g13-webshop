
package ch.hslu.edu.enapp.webshop.erp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReadMultiple_Result" type="{urn:microsoft-dynamics-schemas/page/item}Item_List" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "readMultipleResult"
})
@XmlRootElement(name = "ReadMultiple_Result")
public class ReadMultipleResult {

    @XmlElement(name = "ReadMultiple_Result")
    protected ItemList readMultipleResult;

    /**
     * Ruft den Wert der readMultipleResult-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ItemList }
     *     
     */
    public ItemList getReadMultipleResult() {
        return readMultipleResult;
    }

    /**
     * Legt den Wert der readMultipleResult-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemList }
     *     
     */
    public void setReadMultipleResult(ItemList value) {
        this.readMultipleResult = value;
    }

}
