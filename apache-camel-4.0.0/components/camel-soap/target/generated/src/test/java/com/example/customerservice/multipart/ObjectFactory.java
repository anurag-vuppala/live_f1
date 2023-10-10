
package com.example.customerservice.multipart;

import javax.xml.namespace.QName;
import jakarta.annotation.Generated;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.customerservice.multipart package. 
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

    private final static QName _GetCustomersByName_QNAME = new QName("http://multipart.customerservice.example.com/", "getCustomersByName");
    private final static QName _GetCustomersByNameResponse_QNAME = new QName("http://multipart.customerservice.example.com/", "getCustomersByNameResponse");
    private final static QName _NoSuchCustomer_QNAME = new QName("http://multipart.customerservice.example.com/", "NoSuchCustomer");
    private final static QName _GetAllCustomers_QNAME = new QName("http://multipart.customerservice.example.com/", "getAllCustomers");
    private final static QName _GetAllCustomersResponse_QNAME = new QName("http://multipart.customerservice.example.com/", "getAllCustomersResponse");
    private final static QName _SaveCustomer_QNAME = new QName("http://multipart.customerservice.example.com/", "saveCustomer");
    private final static QName _SaveCustomerToo_QNAME = new QName("http://multipart.customerservice.example.com/", "saveCustomerToo");
    private final static QName _Company_QNAME = new QName("http://multipart.customerservice.example.com/", "company");
    private final static QName _CompanyType_QNAME = new QName("http://multipart.customerservice.example.com/", "companyType");
    private final static QName _Product_QNAME = new QName("http://multipart.customerservice.example.com/", "product");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.customerservice.multipart
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
     * Create an instance of {@link SaveCustomer }
     * 
     */
    public SaveCustomer createSaveCustomer() {
        return new SaveCustomer();
    }

    /**
     * Create an instance of {@link Company }
     * 
     */
    public Company createCompany() {
        return new Company();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
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
    @XmlElementDecl(namespace = "http://multipart.customerservice.example.com/", name = "getCustomersByName")
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
    @XmlElementDecl(namespace = "http://multipart.customerservice.example.com/", name = "getCustomersByNameResponse")
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
    @XmlElementDecl(namespace = "http://multipart.customerservice.example.com/", name = "NoSuchCustomer")
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
    @XmlElementDecl(namespace = "http://multipart.customerservice.example.com/", name = "getAllCustomers")
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
    @XmlElementDecl(namespace = "http://multipart.customerservice.example.com/", name = "getAllCustomersResponse")
    public JAXBElement<GetAllCustomersResponse> createGetAllCustomersResponse(GetAllCustomersResponse value) {
        return new JAXBElement<GetAllCustomersResponse>(_GetAllCustomersResponse_QNAME, GetAllCustomersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveCustomer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SaveCustomer }{@code >}
     */
    @XmlElementDecl(namespace = "http://multipart.customerservice.example.com/", name = "saveCustomer")
    public JAXBElement<SaveCustomer> createSaveCustomer(SaveCustomer value) {
        return new JAXBElement<SaveCustomer>(_SaveCustomer_QNAME, SaveCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveCustomer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SaveCustomer }{@code >}
     */
    @XmlElementDecl(namespace = "http://multipart.customerservice.example.com/", name = "saveCustomerToo")
    public JAXBElement<SaveCustomer> createSaveCustomerToo(SaveCustomer value) {
        return new JAXBElement<SaveCustomer>(_SaveCustomerToo_QNAME, SaveCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Company }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Company }{@code >}
     */
    @XmlElementDecl(namespace = "http://multipart.customerservice.example.com/", name = "company")
    public JAXBElement<Company> createCompany(Company value) {
        return new JAXBElement<Company>(_Company_QNAME, Company.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompanyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CompanyType }{@code >}
     */
    @XmlElementDecl(namespace = "http://multipart.customerservice.example.com/", name = "companyType")
    public JAXBElement<CompanyType> createCompanyType(CompanyType value) {
        return new JAXBElement<CompanyType>(_CompanyType_QNAME, CompanyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Product }{@code >}
     */
    @XmlElementDecl(namespace = "http://multipart.customerservice.example.com/", name = "product")
    public JAXBElement<Product> createProduct(Product value) {
        return new JAXBElement<Product>(_Product_QNAME, Product.class, null, value);
    }

}
