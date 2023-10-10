
package org.apache.camel.component.cxf.soap.headers;

import javax.xml.namespace.QName;
import jakarta.annotation.Generated;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.apache.camel.component.cxf.soap.headers package. 
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
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2023-09-20T21:17:51+01:00")
public class ObjectFactory {

    private final static QName _SOAPHeaderInfo_QNAME = new QName("http://apache.org/camel/component/cxf/soap/headers", "SOAPHeaderInfo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.apache.camel.component.cxf.soap.headers
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SOAPHeaderData }
     * 
     */
    public SOAPHeaderData createSOAPHeaderData() {
        return new SOAPHeaderData();
    }

    /**
     * Create an instance of {@link InHeader }
     * 
     */
    public InHeader createInHeader() {
        return new InHeader();
    }

    /**
     * Create an instance of {@link InHeaderResponse }
     * 
     */
    public InHeaderResponse createInHeaderResponse() {
        return new InHeaderResponse();
    }

    /**
     * Create an instance of {@link OutHeader }
     * 
     */
    public OutHeader createOutHeader() {
        return new OutHeader();
    }

    /**
     * Create an instance of {@link OutHeaderResponse }
     * 
     */
    public OutHeaderResponse createOutHeaderResponse() {
        return new OutHeaderResponse();
    }

    /**
     * Create an instance of {@link InoutHeader }
     * 
     */
    public InoutHeader createInoutHeader() {
        return new InoutHeader();
    }

    /**
     * Create an instance of {@link InoutHeaderResponse }
     * 
     */
    public InoutHeaderResponse createInoutHeaderResponse() {
        return new InoutHeaderResponse();
    }

    /**
     * Create an instance of {@link InOutOfBandHeader }
     * 
     */
    public InOutOfBandHeader createInOutOfBandHeader() {
        return new InOutOfBandHeader();
    }

    /**
     * Create an instance of {@link Me }
     * 
     */
    public Me createMe() {
        return new Me();
    }

    /**
     * Create an instance of {@link InOutOfBandHeaderResponse }
     * 
     */
    public InOutOfBandHeaderResponse createInOutOfBandHeaderResponse() {
        return new InOutOfBandHeaderResponse();
    }

    /**
     * Create an instance of {@link InoutOutOfBandHeader }
     * 
     */
    public InoutOutOfBandHeader createInoutOutOfBandHeader() {
        return new InoutOutOfBandHeader();
    }

    /**
     * Create an instance of {@link InoutOutOfBandHeaderResponse }
     * 
     */
    public InoutOutOfBandHeaderResponse createInoutOutOfBandHeaderResponse() {
        return new InoutOutOfBandHeaderResponse();
    }

    /**
     * Create an instance of {@link OutOutOfBandHeader }
     * 
     */
    public OutOutOfBandHeader createOutOutOfBandHeader() {
        return new OutOutOfBandHeader();
    }

    /**
     * Create an instance of {@link OutOutOfBandHeaderResponse }
     * 
     */
    public OutOutOfBandHeaderResponse createOutOutOfBandHeaderResponse() {
        return new OutOutOfBandHeaderResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SOAPHeaderData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SOAPHeaderData }{@code >}
     */
    @XmlElementDecl(namespace = "http://apache.org/camel/component/cxf/soap/headers", name = "SOAPHeaderInfo")
    public JAXBElement<SOAPHeaderData> createSOAPHeaderInfo(SOAPHeaderData value) {
        return new JAXBElement<SOAPHeaderData>(_SOAPHeaderInfo_QNAME, SOAPHeaderData.class, null, value);
    }

}
