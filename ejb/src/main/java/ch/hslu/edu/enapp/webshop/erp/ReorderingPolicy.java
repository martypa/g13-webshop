
package ch.hslu.edu.enapp.webshop.erp;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Reordering_Policy.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="Reordering_Policy"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_blank_"/&gt;
 *     &lt;enumeration value="Fixed_Reorder_Qty"/&gt;
 *     &lt;enumeration value="Maximum_Qty"/&gt;
 *     &lt;enumeration value="Order"/&gt;
 *     &lt;enumeration value="Lot_for_Lot"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Reordering_Policy")
@XmlEnum
public enum ReorderingPolicy {

    @XmlEnumValue("_blank_")
    BLANK("_blank_"),
    @XmlEnumValue("Fixed_Reorder_Qty")
    FIXED_REORDER_QTY("Fixed_Reorder_Qty"),
    @XmlEnumValue("Maximum_Qty")
    MAXIMUM_QTY("Maximum_Qty"),
    @XmlEnumValue("Order")
    ORDER("Order"),
    @XmlEnumValue("Lot_for_Lot")
    LOT_FOR_LOT("Lot_for_Lot");
    private final String value;

    ReorderingPolicy(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReorderingPolicy fromValue(String v) {
        for (ReorderingPolicy c: ReorderingPolicy.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
