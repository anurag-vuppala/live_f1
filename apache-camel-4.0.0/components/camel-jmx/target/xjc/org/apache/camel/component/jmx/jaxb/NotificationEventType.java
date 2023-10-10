
package org.apache.camel.component.jmx.jaxb;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *                 Base type that includes all of the elements for a 
 *                 javax.management.Notification
 *             
 * 
 * <p>Java class for notificationEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="notificationEventType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sequence" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="dateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="userData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "notificationEventType", propOrder = {
    "source",
    "message",
    "sequence",
    "timestamp",
    "dateTime",
    "type",
    "userData"
})
@XmlSeeAlso({
    TimerNotification.class,
    RelationNotification.class,
    MonitorNotification.class,
    MBeanServerNotification.class,
    JMXConnectionNotification.class,
    AttributeChangeNotification.class
})
public class NotificationEventType {

    @XmlElement(required = true)
    protected String source;
    @XmlElement(required = true)
    protected String message;
    protected long sequence;
    protected long timestamp;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTime;
    @XmlElement(required = true)
    protected String type;
    protected String userData;

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     */
    public long getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     */
    public void setSequence(long value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     */
    public long getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     */
    public void setTimestamp(long value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTime(XMLGregorianCalendar value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the userData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserData() {
        return userData;
    }

    /**
     * Sets the value of the userData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserData(String value) {
        this.userData = value;
    }

    public NotificationEventType withSource(String value) {
        setSource(value);
        return this;
    }

    public NotificationEventType withMessage(String value) {
        setMessage(value);
        return this;
    }

    public NotificationEventType withSequence(long value) {
        setSequence(value);
        return this;
    }

    public NotificationEventType withTimestamp(long value) {
        setTimestamp(value);
        return this;
    }

    public NotificationEventType withDateTime(XMLGregorianCalendar value) {
        setDateTime(value);
        return this;
    }

    public NotificationEventType withType(String value) {
        setType(value);
        return this;
    }

    public NotificationEventType withUserData(String value) {
        setUserData(value);
        return this;
    }

}
