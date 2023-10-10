
package org.apache.camel.order;

import javax.xml.namespace.QName;
import jakarta.annotation.Generated;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.apache.camel.order package. 
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
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2023-09-20T21:17:56+01:00")
public class ObjectFactory {

    private final static QName _PartName_QNAME = new QName("http://camel.apache.org/order", "partName");
    private final static QName _Amount_QNAME = new QName("http://camel.apache.org/order", "amount");
    private final static QName _CustomerName_QNAME = new QName("http://camel.apache.org/order", "customerName");
    private final static QName _ResultCode_QNAME = new QName("http://camel.apache.org/order", "resultCode");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.apache.camel.order
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://camel.apache.org/order", name = "partName")
    public JAXBElement<String> createPartName(String value) {
        return new JAXBElement<String>(_PartName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://camel.apache.org/order", name = "amount")
    public JAXBElement<Integer> createAmount(Integer value) {
        return new JAXBElement<Integer>(_Amount_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://camel.apache.org/order", name = "customerName")
    public JAXBElement<String> createCustomerName(String value) {
        return new JAXBElement<String>(_CustomerName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://camel.apache.org/order", name = "resultCode")
    public JAXBElement<String> createResultCode(String value) {
        return new JAXBElement<String>(_ResultCode_QNAME, String.class, null, value);
    }

}
