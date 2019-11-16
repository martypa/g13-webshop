
package ch.hslu.edu.enapp.webshop.erp;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Manufacturing_Policy.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="Manufacturing_Policy"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Make_to_Stock"/&gt;
 *     &lt;enumeration value="Make_to_Order"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Manufacturing_Policy")
@XmlEnum
public enum ManufacturingPolicy {

    @XmlEnumValue("Make_to_Stock")
    MAKE_TO_STOCK("Make_to_Stock"),
    @XmlEnumValue("Make_to_Order")
    MAKE_TO_ORDER("Make_to_Order");
    private final String value;

    ManufacturingPolicy(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ManufacturingPolicy fromValue(String v) {
        for (ManufacturingPolicy c: ManufacturingPolicy.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
