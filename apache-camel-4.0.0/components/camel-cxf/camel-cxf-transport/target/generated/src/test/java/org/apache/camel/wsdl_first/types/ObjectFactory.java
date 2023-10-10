
package org.apache.camel.wsdl_first.types;

import javax.xml.namespace.QName;
import jakarta.annotation.Generated;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.apache.camel.wsdl_first.types package. 
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
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2023-09-20T21:17:46+01:00")
public class ObjectFactory {

    private final static QName _StringInputElem_QNAME = new QName("http://camel.apache.org/wsdl-first/types", "StringInputElem");
    private final static QName _IntegerInputElem_QNAME = new QName("http://camel.apache.org/wsdl-first/types", "IntegerInputElem");
    private final static QName _StringOutputElem_QNAME = new QName("http://camel.apache.org/wsdl-first/types", "StringOutputElem");
    private final static QName _IntegerOutputElem_QNAME = new QName("http://camel.apache.org/wsdl-first/types", "IntegerOutputElem");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.apache.camel.wsdl_first.types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPerson }
     * 
     */
    public GetPerson createGetPerson() {
        return new GetPerson();
    }

    /**
     * Create an instance of {@link GetPersonResponse }
     * 
     */
    public GetPersonResponse createGetPersonResponse() {
        return new GetPersonResponse();
    }

    /**
     * Create an instance of {@link UnknownPersonFault }
     * 
     */
    public UnknownPersonFault createUnknownPersonFault() {
        return new UnknownPersonFault();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://camel.apache.org/wsdl-first/types", name = "StringInputElem")
    public JAXBElement<String> createStringInputElem(String value) {
        return new JAXBElement<String>(_StringInputElem_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://camel.apache.org/wsdl-first/types", name = "IntegerInputElem")
    public JAXBElement<Integer> createIntegerInputElem(Integer value) {
        return new JAXBElement<Integer>(_IntegerInputElem_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://camel.apache.org/wsdl-first/types", name = "StringOutputElem")
    public JAXBElement<String> createStringOutputElem(String value) {
        return new JAXBElement<String>(_StringOutputElem_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://camel.apache.org/wsdl-first/types", name = "IntegerOutputElem")
    public JAXBElement<Integer> createIntegerOutputElem(Integer value) {
        return new JAXBElement<Integer>(_IntegerOutputElem_QNAME, Integer.class, null, value);
    }

}
