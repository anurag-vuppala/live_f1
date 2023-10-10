
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
 *         &lt;element name="MBeanName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "mBeanName"
})
@XmlRootElement(name = "MBeanServerNotification")
public class MBeanServerNotification
    extends NotificationEventType
{

    @XmlElement(name = "MBeanName", required = true)
    protected String mBeanName;

    /**
     * Gets the value of the mBeanName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMBeanName() {
        return mBeanName;
    }

    /**
     * Sets the value of the mBeanName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMBeanName(String value) {
        this.mBeanName = value;
    }

    public MBeanServerNotification withMBeanName(String value) {
        setMBeanName(value);
        return this;
    }

    @Override
    public MBeanServerNotification withSource(String value) {
        setSource(value);
        return this;
    }

    @Override
    public MBeanServerNotification withMessage(String value) {
        setMessage(value);
        return this;
    }

    @Override
    public MBeanServerNotification withSequence(long value) {
        setSequence(value);
        return this;
    }

    @Override
    public MBeanServerNotification withTimestamp(long value) {
        setTimestamp(value);
        return this;
    }

    @Override
    public MBeanServerNotification withDateTime(XMLGregorianCalendar value) {
        setDateTime(value);
        return this;
    }

    @Override
    public MBeanServerNotification withType(String value) {
        setType(value);
        return this;
    }

    @Override
    public MBeanServerNotification withUserData(String value) {
        setUserData(value);
        return this;
    }

}
