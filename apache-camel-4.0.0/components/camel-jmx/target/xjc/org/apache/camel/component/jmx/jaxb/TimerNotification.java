
package org.apache.camel.component.jmx.jaxb;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="notificationId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "notificationId"
})
@XmlRootElement(name = "TimerNotification")
public class TimerNotification
    extends NotificationEventType
{

    protected int notificationId;

    /**
     * Gets the value of the notificationId property.
     * 
     */
    public int getNotificationId() {
        return notificationId;
    }

    /**
     * Sets the value of the notificationId property.
     * 
     */
    public void setNotificationId(int value) {
        this.notificationId = value;
    }

    public TimerNotification withNotificationId(int value) {
        setNotificationId(value);
        return this;
    }

    @Override
    public TimerNotification withSource(String value) {
        setSource(value);
        return this;
    }

    @Override
    public TimerNotification withMessage(String value) {
        setMessage(value);
        return this;
    }

    @Override
    public TimerNotification withSequence(long value) {
        setSequence(value);
        return this;
    }

    @Override
    public TimerNotification withTimestamp(long value) {
        setTimestamp(value);
        return this;
    }

    @Override
    public TimerNotification withDateTime(XMLGregorianCalendar value) {
        setDateTime(value);
        return this;
    }

    @Override
    public TimerNotification withType(String value) {
        setType(value);
        return this;
    }

    @Override
    public TimerNotification withUserData(String value) {
        setUserData(value);
        return this;
    }

}
