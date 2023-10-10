
package org.apache.camel.pizza.types;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderPizzaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderPizzaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Toppings" type="{http://camel.apache.org/pizza/types}ToppingsListType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderPizzaType", propOrder = {
    "toppings"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2023-09-20T21:17:57+01:00")
public class OrderPizzaType {

    @XmlElement(name = "Toppings", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2023-09-20T21:17:57+01:00")
    protected ToppingsListType toppings;

    /**
     * Gets the value of the toppings property.
     * 
     * @return
     *     possible object is
     *     {@link ToppingsListType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2023-09-20T21:17:57+01:00")
    public ToppingsListType getToppings() {
        return toppings;
    }

    /**
     * Sets the value of the toppings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ToppingsListType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2023-09-20T21:17:57+01:00")
    public void setToppings(ToppingsListType value) {
        this.toppings = value;
    }

}
