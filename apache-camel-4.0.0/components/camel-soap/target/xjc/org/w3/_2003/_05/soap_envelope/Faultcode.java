//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.09.22 at 11:51:08 AM BST 
//


package org.w3._2003._05.soap_envelope;

import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for faultcode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="faultcode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Value" type="{http://www.w3.org/2003/05/soap-envelope}faultcodeEnum"/&gt;
 *         &lt;element name="Subcode" type="{http://www.w3.org/2003/05/soap-envelope}subcode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "faultcode", propOrder = {
    "value",
    "subcode"
})
public class Faultcode {

    @XmlElement(name = "Value", required = true)
    protected QName value;
    @XmlElement(name = "Subcode")
    protected Subcode subcode;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setValue(QName value) {
        this.value = value;
    }

    /**
     * Gets the value of the subcode property.
     * 
     * @return
     *     possible object is
     *     {@link Subcode }
     *     
     */
    public Subcode getSubcode() {
        return subcode;
    }

    /**
     * Sets the value of the subcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Subcode }
     *     
     */
    public void setSubcode(Subcode value) {
        this.subcode = value;
    }

    public Faultcode withValue(QName value) {
        setValue(value);
        return this;
    }

    public Faultcode withSubcode(Subcode value) {
        setSubcode(value);
        return this;
    }

}
