
package com.example.customerservice;

import javax.xml.namespace.QName;
import jakarta.annotation.Generated;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.customerservice package. 
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

    private final static QName _GetCustomersByName_QNAME = new QName("http://customerservice.example.com/", "getCustomersByName");
    private final static QName _GetCustomersByNameResponse_QNAME = new QName("http://customerservice.example.com/", "getCustomersByNameResponse");
    private final static QName _NoSuchCustomer_QNAME = new QName("http://customerservice.example.com/", "NoSuchCustomer");
    private final static QName _GetAllCustomers_QNAME = new QName("http://customerservice.example.com/", "getAllCustomers");
    private final static QName _GetAllCustomersResponse_QNAME = new QName("http://customerservice.example.com/", "getAllCustomersResponse");
    private final static QName _GetAllAmericanCustomers_QNAME = new QName("http://customerservice.example.com/", "getAllAmericanCustomers");
    private final static QName _GetAllAmericanCustomersResponse_QNAME = new QName("http://customerservice.example.com/", "getAllAmericanCustomersResponse");
    private final static QName _SaveCustomer_QNAME = new QName("http://customerservice.example.com/", "saveCustomer");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.customerservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCustomersByName }
     * 
     */
    public GetCustomersByName createGetCustomersByName() {
        return new GetCustomersByName();
    }

    /**
     * Create an instance of {@link GetCustomersByNameResponse }
     * 
     */
    public GetCustomersByNameResponse createGetCustomersByNameResponse() {
        return new GetCustomersByNameResponse();
    }

    /**
     * Create an instance of {@link NoSuchCustomer }
     * 
     */
    public NoSuchCustomer createNoSuchCustomer() {
        return new NoSuchCustomer();
    }

    /**
     * Create an instance of {@link GetAllCustomersResponse }
     * 
     */
    public GetAllCustomersResponse createGetAllCustomersResponse() {
        return new GetAllCustomersResponse();
    }

    /**
     * Create an instance of {@link GetAllAmericanCustomersResponse }
     * 
     */
    public GetAllAmericanCustomersResponse createGetAllAmericanCustomersResponse() {
        return new GetAllAmericanCustomersResponse();
    }

    /**
     * Create an instance of {@link SaveCustomer }
     * 
     */
    public SaveCustomer createSaveCustomer() {
        return new SaveCustomer();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomersByName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCustomersByName }{@code >}
     */
    @XmlElementDecl(namespace = "http://customerservice.example.com/", name = "getCustomersByName")
    public JAXBElement<GetCustomersByName> createGetCustomersByName(GetCustomersByName value) {
        return new JAXBElement<GetCustomersByName>(_GetCustomersByName_QNAME, GetCustomersByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomersByNameResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCustomersByNameResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://customerservice.example.com/", name = "getCustomersByNameResponse")
    public JAXBElement<GetCustomersByNameResponse> createGetCustomersByNameResponse(GetCustomersByNameResponse value) {
        return new JAXBElement<GetCustomersByNameResponse>(_GetCustomersByNameResponse_QNAME, GetCustomersByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoSuchCustomer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NoSuchCustomer }{@code >}
     */
    @XmlElementDecl(namespace = "http://customerservice.example.com/", name = "NoSuchCustomer")
    public JAXBElement<NoSuchCustomer> createNoSuchCustomer(NoSuchCustomer value) {
        return new JAXBElement<NoSuchCustomer>(_NoSuchCustomer_QNAME, NoSuchCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://customerservice.example.com/", name = "getAllCustomers")
    public JAXBElement<Object> createGetAllCustomers(Object value) {
        return new JAXBElement<Object>(_GetAllCustomers_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCustomersResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllCustomersResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://customerservice.example.com/", name = "getAllCustomersResponse")
    public JAXBElement<GetAllCustomersResponse> createGetAllCustomersResponse(GetAllCustomersResponse value) {
        return new JAXBElement<GetAllCustomersResponse>(_GetAllCustomersResponse_QNAME, GetAllCustomersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://customerservice.example.com/", name = "getAllAmericanCustomers")
    public JAXBElement<Object> createGetAllAmericanCustomers(Object value) {
        return new JAXBElement<Object>(_GetAllAmericanCustomers_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllAmericanCustomersResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllAmericanCustomersResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://customerservice.example.com/", name = "getAllAmericanCustomersResponse")
    public JAXBElement<GetAllAmericanCustomersResponse> createGetAllAmericanCustomersResponse(GetAllAmericanCustomersResponse value) {
        return new JAXBElement<GetAllAmericanCustomersResponse>(_GetAllAmericanCustomersResponse_QNAME, GetAllAmericanCustomersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveCustomer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SaveCustomer }{@code >}
     */
    @XmlElementDecl(namespace = "http://customerservice.example.com/", name = "saveCustomer")
    public JAXBElement<SaveCustomer> createSaveCustomer(SaveCustomer value) {
        return new JAXBElement<SaveCustomer>(_SaveCustomer_QNAME, SaveCustomer.class, null, value);
    }

}
