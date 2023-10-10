
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
 *         &lt;element name="connectionId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "connectionId"
})
@XmlRootElement(name = "JMXConnectionNotification")
public class JMXConnectionNotification
    extends NotificationEventType
{

    @XmlElement(required = true)
    protected String connectionId;

    /**
     * Gets the value of the connectionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionId() {
        return connectionId;
    }

    /**
     * Sets the value of the connectionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionId(String value) {
        this.connectionId = value;
    }

    public JMXConnectionNotification withConnectionId(String value) {
        setConnectionId(value);
        return this;
    }

    @Override
    public JMXConnectionNotification withSource(String value) {
        setSource(value);
        return this;
    }

    @Override
    public JMXConnectionNotification withMessage(String value) {
        setMessage(value);
        return this;
    }

    @Override
    public JMXConnectionNotification withSequence(long value) {
        setSequence(value);
        return this;
    }

    @Override
    public JMXConnectionNotification withTimestamp(long value) {
        setTimestamp(value);
        return this;
    }

    @Override
    public JMXConnectionNotification withDateTime(XMLGregorianCalendar value) {
        setDateTime(value);
        return this;
    }

    @Override
    public JMXConnectionNotification withType(String value) {
        setType(value);
        return this;
    }

    @Override
    public JMXConnectionNotification withUserData(String value) {
        setUserData(value);
        return this;
    }

}
