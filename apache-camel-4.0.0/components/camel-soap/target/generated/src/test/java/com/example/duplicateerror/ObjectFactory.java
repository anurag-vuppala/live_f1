
package com.example.duplicateerror;

import javax.xml.namespace.QName;
import jakarta.annotation.Generated;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.duplicateerror package. 
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
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2023-09-22T11:51:11+01:00")
public class ObjectFactory {

    private final static QName _ThrowErrorA_QNAME = new QName("http://www.example.com/duplicateerror", "throwErrorA");
    private final static QName _ThrowErrorAResponse_QNAME = new QName("http://www.example.com/duplicateerror", "throwErrorAResponse");
    private final static QName _ThrowErrorB_QNAME = new QName("http://www.example.com/duplicateerror", "throwErrorB");
    private final static QName _ThrowErrorBResponse_QNAME = new QName("http://www.example.com/duplicateerror", "throwErrorBResponse");
    private final static QName _SoapException_QNAME = new QName("http://www.example.com/duplicateerror", "soapException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.duplicateerror
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ThrowErrorA }
     * 
     */
    public ThrowErrorA createThrowErrorA() {
        return new ThrowErrorA();
    }

    /**
     * Create an instance of {@link ThrowErrorAResponse }
     * 
     */
    public ThrowErrorAResponse createThrowErrorAResponse() {
        return new ThrowErrorAResponse();
    }

    /**
     * Create an instance of {@link ThrowErrorB }
     * 
     */
    public ThrowErrorB createThrowErrorB() {
        return new ThrowErrorB();
    }

    /**
     * Create an instance of {@link ThrowErrorBResponse }
     * 
     */
    public ThrowErrorBResponse createThrowErrorBResponse() {
        return new ThrowErrorBResponse();
    }

    /**
     * Create an instance of {@link SoapException }
     * 
     */
    public SoapException createSoapException() {
        return new SoapException();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThrowErrorA }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ThrowErrorA }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.example.com/duplicateerror", name = "throwErrorA")
    public JAXBElement<ThrowErrorA> createThrowErrorA(ThrowErrorA value) {
        return new JAXBElement<ThrowErrorA>(_ThrowErrorA_QNAME, ThrowErrorA.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThrowErrorAResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ThrowErrorAResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.example.com/duplicateerror", name = "throwErrorAResponse")
    public JAXBElement<ThrowErrorAResponse> createThrowErrorAResponse(ThrowErrorAResponse value) {
        return new JAXBElement<ThrowErrorAResponse>(_ThrowErrorAResponse_QNAME, ThrowErrorAResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThrowErrorB }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ThrowErrorB }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.example.com/duplicateerror", name = "throwErrorB")
    public JAXBElement<ThrowErrorB> createThrowErrorB(ThrowErrorB value) {
        return new JAXBElement<ThrowErrorB>(_ThrowErrorB_QNAME, ThrowErrorB.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThrowErrorBResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ThrowErrorBResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.example.com/duplicateerror", name = "throwErrorBResponse")
    public JAXBElement<ThrowErrorBResponse> createThrowErrorBResponse(ThrowErrorBResponse value) {
        return new JAXBElement<ThrowErrorBResponse>(_ThrowErrorBResponse_QNAME, ThrowErrorBResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoapException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoapException }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.example.com/duplicateerror", name = "soapException")
    public JAXBElement<SoapException> createSoapException(SoapException value) {
        return new JAXBElement<SoapException>(_SoapException_QNAME, SoapException.class, null, value);
    }

}
