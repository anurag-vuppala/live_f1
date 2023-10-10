
package org.apache.camel.cxf.mtom_feature.types;

import javax.xml.namespace.QName;
import jakarta.annotation.Generated;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.apache.camel.cxf.mtom_feature.types package. 
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

    private final static QName _Detail_QNAME = new QName("http://apache.org/camel/cxf/mtom_feature/types", "Detail");
    private final static QName _DetailResponse_QNAME = new QName("http://apache.org/camel/cxf/mtom_feature/types", "DetailResponse");
    private final static QName _Data_QNAME = new QName("http://apache.org/camel/cxf/mtom_feature/types", "data");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.apache.camel.cxf.mtom_feature.types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DetailType }
     * 
     */
    public DetailType createDetailType() {
        return new DetailType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetailType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DetailType }{@code >}
     */
    @XmlElementDecl(namespace = "http://apache.org/camel/cxf/mtom_feature/types", name = "Detail")
    public JAXBElement<DetailType> createDetail(DetailType value) {
        return new JAXBElement<DetailType>(_Detail_QNAME, DetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetailType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DetailType }{@code >}
     */
    @XmlElementDecl(namespace = "http://apache.org/camel/cxf/mtom_feature/types", name = "DetailResponse")
    public JAXBElement<DetailType> createDetailResponse(DetailType value) {
        return new JAXBElement<DetailType>(_DetailResponse_QNAME, DetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://apache.org/camel/cxf/mtom_feature/types", name = "data")
    public JAXBElement<byte[]> createData(byte[] value) {
        return new JAXBElement<byte[]>(_Data_QNAME, byte[].class, null, ((byte[]) value));
    }

}
