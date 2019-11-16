
package ch.hslu.edu.enapp.webshop.erp;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Costing_Method.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="Costing_Method"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FIFO"/&gt;
 *     &lt;enumeration value="LIFO"/&gt;
 *     &lt;enumeration value="Specific"/&gt;
 *     &lt;enumeration value="Average"/&gt;
 *     &lt;enumeration value="Standard"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Costing_Method")
@XmlEnum
public enum CostingMethod {

    FIFO("FIFO"),
    LIFO("LIFO"),
    @XmlEnumValue("Specific")
    SPECIFIC("Specific"),
    @XmlEnumValue("Average")
    AVERAGE("Average"),
    @XmlEnumValue("Standard")
    STANDARD("Standard");
    private final String value;

    CostingMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CostingMethod fromValue(String v) {
        for (CostingMethod c: CostingMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
