package org.apache.camel.itest.customerrelations;

import jakarta.annotation.Generated;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 4.0.2
 * 2023-09-27T14:01:29.027+01:00
 * Generated source version: 4.0.2
 *
 */
@WebService(targetNamespace = "http://camel.apache.org/itest/customerrelations", name = "CustomerServiceV1")
@XmlSeeAlso({ObjectFactory.class})
@Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-27T14:01:29.027+01:00", comments = "Apache CXF 4.0.2")
public interface CustomerServiceV1 {

    @WebMethod
    @RequestWrapper(localName = "getCustomer", targetNamespace = "http://camel.apache.org/itest/customerrelations", className = "org.apache.camel.itest.customerrelations.GetCustomerRequest")
    @ResponseWrapper(localName = "getCustomerResponse", targetNamespace = "http://camel.apache.org/itest/customerrelations", className = "org.apache.camel.itest.customerrelations.GetCustomerResponse")
    @WebResult(name = "customers", targetNamespace = "")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-27T14:01:29.027+01:00")
    public org.apache.camel.itest.customerrelations.Customer getCustomer(

        @WebParam(name = "customerNummber", targetNamespace = "")
        java.lang.String customerNummber
    ) throws BusinessLogicException_Exception;
}