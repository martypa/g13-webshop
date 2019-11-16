
package ch.hslu.edu.enapp.webshop.erp;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="filter" type="{urn:microsoft-dynamics-schemas/page/item}Item_Filter" maxOccurs="unbounded"/&gt;
 *         &lt;element name="bookmarkKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="setSize" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "filter",
    "bookmarkKey",
    "setSize"
})
@XmlRootElement(name = "ReadMultiple")
public class ReadMultiple {

    @XmlElement(required = true)
    protected List<ItemFilter> filter;
    protected String bookmarkKey;
    protected int setSize;

    /**
     * Gets the value of the filter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemFilter }
     * 
     * 
     */
    public List<ItemFilter> getFilter() {
        if (filter == null) {
            filter = new ArrayList<ItemFilter>();
        }
        return this.filter;
    }

    /**
     * Ruft den Wert der bookmarkKey-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookmarkKey() {
        return bookmarkKey;
    }

    /**
     * Legt den Wert der bookmarkKey-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookmarkKey(String value) {
        this.bookmarkKey = value;
    }

    /**
     * Ruft den Wert der setSize-Eigenschaft ab.
     * 
     */
    public int getSetSize() {
        return setSize;
    }

    /**
     * Legt den Wert der setSize-Eigenschaft fest.
     * 
     */
    public void setSetSize(int value) {
        this.setSize = value;
    }

}
