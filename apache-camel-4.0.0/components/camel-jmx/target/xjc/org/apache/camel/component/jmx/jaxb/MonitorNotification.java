
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
 *         &lt;element name="derivedGauge" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="observedAttribute" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="observedObject" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="trigger" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "derivedGauge",
    "observedAttribute",
    "observedObject",
    "trigger"
})
@XmlRootElement(name = "MonitorNotification")
public class MonitorNotification
    extends NotificationEventType
{

    @XmlElement(required = true)
    protected String derivedGauge;
    @XmlElement(required = true)
    protected String observedAttribute;
    @XmlElement(required = true)
    protected String observedObject;
    @XmlElement(required = true)
    protected String trigger;

    /**
     * Gets the value of the derivedGauge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDerivedGauge() {
        return derivedGauge;
    }

    /**
     * Sets the value of the derivedGauge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDerivedGauge(String value) {
        this.derivedGauge = value;
    }

    /**
     * Gets the value of the observedAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservedAttribute() {
        return observedAttribute;
    }

    /**
     * Sets the value of the observedAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservedAttribute(String value) {
        this.observedAttribute = value;
    }

    /**
     * Gets the value of the observedObject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservedObject() {
        return observedObject;
    }

    /**
     * Sets the value of the observedObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservedObject(String value) {
        this.observedObject = value;
    }

    /**
     * Gets the value of the trigger property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrigger() {
        return trigger;
    }

    /**
     * Sets the value of the trigger property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrigger(String value) {
        this.trigger = value;
    }

    public MonitorNotification withDerivedGauge(String value) {
        setDerivedGauge(value);
        return this;
    }

    public MonitorNotification withObservedAttribute(String value) {
        setObservedAttribute(value);
        return this;
    }

    public MonitorNotification withObservedObject(String value) {
        setObservedObject(value);
        return this;
    }

    public MonitorNotification withTrigger(String value) {
        setTrigger(value);
        return this;
    }

    @Override
    public MonitorNotification withSource(String value) {
        setSource(value);
        return this;
    }

    @Override
    public MonitorNotification withMessage(String value) {
        setMessage(value);
        return this;
    }

    @Override
    public MonitorNotification withSequence(long value) {
        setSequence(value);
        return this;
    }

    @Override
    public MonitorNotification withTimestamp(long value) {
        setTimestamp(value);
        return this;
    }

    @Override
    public MonitorNotification withDateTime(XMLGregorianCalendar value) {
        setDateTime(value);
        return this;
    }

    @Override
    public MonitorNotification withType(String value) {
        setType(value);
        return this;
    }

    @Override
    public MonitorNotification withUserData(String value) {
        setUserData(value);
        return this;
    }

}
