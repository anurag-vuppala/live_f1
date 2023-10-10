
package org.apache.camel.component.jmx.jaxb;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:org.apache.camel.component:jmx}notificationEventType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="attributeName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="attributeType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="newValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="oldValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "attributeName",
    "attributeType",
    "newValue",
    "oldValue"
})
@XmlRootElement(name = "AttributeChangeNotification")
public class AttributeChangeNotification
    extends NotificationEventType
{

    @XmlElement(required = true)
    protected String attributeName;
    @XmlElement(required = true)
    protected String attributeType;
    @XmlElement(required = true, nillable = true)
    protected String newValue;
    @XmlElement(required = true, nillable = true)
    protected String oldValue;

    /**
     * Gets the value of the attributeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeName() {
        return attributeName;
    }

    /**
     * Sets the value of the attributeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeName(String value) {
        this.attributeName = value;
    }

    /**
     * Gets the value of the attributeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeType() {
        return attributeType;
    }

    /**
     * Sets the value of the attributeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeType(String value) {
        this.attributeType = value;
    }

    /**
     * Gets the value of the newValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewValue() {
        return newValue;
    }

    /**
     * Sets the value of the newValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewValue(String value) {
        this.newValue = value;
    }

    /**
     * Gets the value of the oldValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldValue() {
        return oldValue;
    }

    /**
     * Sets the value of the oldValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldValue(String value) {
        this.oldValue = value;
    }

    public AttributeChangeNotification withAttributeName(String value) {
        setAttributeName(value);
        return this;
    }

    public AttributeChangeNotification withAttributeType(String value) {
        setAttributeType(value);
        return this;
    }

    public AttributeChangeNotification withNewValue(String value) {
        setNewValue(value);
        return this;
    }

    public AttributeChangeNotification withOldValue(String value) {
        setOldValue(value);
        return this;
    }

    @Override
    public AttributeChangeNotification withSource(String value) {
        setSource(value);
        return this;
    }

    @Override
    public AttributeChangeNotification withMessage(String value) {
        setMessage(value);
        return this;
    }

    @Override
    public AttributeChangeNotification withSequence(long value) {
        setSequence(value);
        return this;
    }

    @Override
    public AttributeChangeNotification withTimestamp(long value) {
        setTimestamp(value);
        return this;
    }

    @Override
    public AttributeChangeNotification withDateTime(XMLGregorianCalendar value) {
        setDateTime(value);
        return this;
    }

    @Override
    public AttributeChangeNotification withType(String value) {
        setType(value);
        return this;
    }

    @Override
    public AttributeChangeNotification withUserData(String value) {
        setUserData(value);
        return this;
    }

}
