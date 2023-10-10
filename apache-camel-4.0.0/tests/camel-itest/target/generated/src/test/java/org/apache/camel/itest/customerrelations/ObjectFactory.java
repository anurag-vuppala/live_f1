
package org.apache.camel.itest.customerrelations;

import javax.xml.namespace.QName;
import jakarta.annotation.Generated;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.apache.camel.itest.customerrelations package. 
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
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2023-09-27T14:01:29+01:00")
public class ObjectFactory {

    private final static QName _Customer_QNAME = new QName("http://camel.apache.org/itest/customerrelations", "customer");
    private final static QName _GetCustomerResponse_QNAME = new QName("http://camel.apache.org/itest/customerrelations", "getCustomerResponse");
    private final static QName _GetCustomer_QNAME = new QName("http://camel.apache.org/itest/customerrelations", "getCustomer");
    private final static QName _BusinessLogicException_QNAME = new QName("http://camel.apache.org/itest/customerrelations", "BusinessLogicException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.apache.camel.itest.customerrelations
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link GetCustomerResponse }
     * 
     */
    public GetCustomerResponse createGetCustomerResponse() {
        return new GetCustomerResponse();
    }

    /**
     * Create an instance of {@link GetCustomerRequest }
     * 
     */
    public GetCustomerRequest createGetCustomerRequest() {
        return new GetCustomerRequest();
    }

    /**
     * Create an instance of {@link BusinessLogicException }
     * 
     */
    public BusinessLogicException createBusinessLogicException() {
        return new BusinessLogicException();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}
     */
    @XmlElementDecl(namespace = "http://camel.apache.org/itest/customerrelations", name = "customer")
    public JAXBElement<Customer> createCustomer(Customer value) {
        return new JAXBElement<Customer>(_Customer_QNAME, Customer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCustomerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://camel.apache.org/itest/customerrelations", name = "getCustomerResponse")
    public JAXBElement<GetCustomerResponse> createGetCustomerResponse(GetCustomerResponse value) {
        return new JAXBElement<GetCustomerResponse>(_GetCustomerResponse_QNAME, GetCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCustomerRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://camel.apache.org/itest/customerrelations", name = "getCustomer")
    public JAXBElement<GetCustomerRequest> createGetCustomer(GetCustomerRequest value) {
        return new JAXBElement<GetCustomerRequest>(_GetCustomer_QNAME, GetCustomerRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessLogicException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BusinessLogicException }{@code >}
     */
    @XmlElementDecl(namespace = "http://camel.apache.org/itest/customerrelations", name = "BusinessLogicException")
    public JAXBElement<BusinessLogicException> createBusinessLogicException(BusinessLogicException value) {
        return new JAXBElement<BusinessLogicException>(_BusinessLogicException_QNAME, BusinessLogicException.class, null, value);
    }

}
