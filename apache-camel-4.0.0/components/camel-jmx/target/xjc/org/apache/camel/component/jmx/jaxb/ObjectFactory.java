
package org.apache.camel.component.jmx.jaxb;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.apache.camel.component.jmx.jaxb package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _NotificationEvent_QNAME = new QName("urn:org.apache.camel.component:jmx", "NotificationEvent");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.apache.camel.component.jmx.jaxb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NotificationEventType }
     * 
     */
    public NotificationEventType createNotificationEventType() {
        return new NotificationEventType();
    }

    /**
     * Create an instance of {@link AttributeChangeNotification }
     * 
     */
    public AttributeChangeNotification createAttributeChangeNotification() {
        return new AttributeChangeNotification();
    }

    /**
     * Create an instance of {@link JMXConnectionNotification }
     * 
     */
    public JMXConnectionNotification createJMXConnectionNotification() {
        return new JMXConnectionNotification();
    }

    /**
     * Create an instance of {@link MBeanServerNotification }
     * 
     */
    public MBeanServerNotification createMBeanServerNotification() {
        return new MBeanServerNotification();
    }

    /**
     * Create an instance of {@link MonitorNotification }
     * 
     */
    public MonitorNotification createMonitorNotification() {
        return new MonitorNotification();
    }

    /**
     * Create an instance of {@link RelationNotification }
     * 
     */
    public RelationNotification createRelationNotification() {
        return new RelationNotification();
    }

    /**
     * Create an instance of {@link ObjectNamesType }
     * 
     */
    public ObjectNamesType createObjectNamesType() {
        return new ObjectNamesType();
    }

    /**
     * Create an instance of {@link TimerNotification }
     * 
     */
    public TimerNotification createTimerNotification() {
        return new TimerNotification();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificationEventType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NotificationEventType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:org.apache.camel.component:jmx", name = "NotificationEvent")
    public JAXBElement<NotificationEventType> createNotificationEvent(NotificationEventType value) {
        return new JAXBElement<NotificationEventType>(_NotificationEvent_QNAME, NotificationEventType.class, null, value);
    }

}
