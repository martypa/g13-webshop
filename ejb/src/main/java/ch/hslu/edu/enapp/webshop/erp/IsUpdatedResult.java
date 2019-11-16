
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
 *         &lt;element name="IsUpdated_Result" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "isUpdatedResult"
})
@XmlRootElement(name = "IsUpdated_Result")
public class IsUpdatedResult {

    @XmlElement(name = "IsUpdated_Result")
    protected boolean isUpdatedResult;

    /**
     * Ruft den Wert der isUpdatedResult-Eigenschaft ab.
     * 
     */
    public boolean isIsUpdatedResult() {
        return isUpdatedResult;
    }

    /**
     * Legt den Wert der isUpdatedResult-Eigenschaft fest.
     * 
     */
    public void setIsUpdatedResult(boolean value) {
        this.isUpdatedResult = value;
    }

}
