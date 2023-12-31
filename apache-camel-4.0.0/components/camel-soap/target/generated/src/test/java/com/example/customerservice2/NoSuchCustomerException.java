
package com.example.customerservice2;

import jakarta.annotation.Generated;
import jakarta.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 4.0.2
 * 2023-09-22T11:51:11.292+01:00
 * Generated source version: 4.0.2
 */

@WebFault(name = "NoSuchCustomer", targetNamespace = "http://customerservice2.example.com/")
@Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-22T11:51:11.292+01:00", comments = "Apache CXF 4.0.2")
public class NoSuchCustomerException extends Exception {
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-22T11:51:11.292+01:00")
    public static final long serialVersionUID = 1L;

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-22T11:51:11.292+01:00")
    private com.example.customerservice2.NoSuchCustomer faultInfo;

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-22T11:51:11.292+01:00")
    public NoSuchCustomerException() {
        super();
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-22T11:51:11.292+01:00")
    public NoSuchCustomerException(String message) {
        super(message);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-22T11:51:11.292+01:00")
    public NoSuchCustomerException(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-22T11:51:11.292+01:00")
    public NoSuchCustomerException(String message, com.example.customerservice2.NoSuchCustomer noSuchCustomer) {
        super(message);
        this.faultInfo = noSuchCustomer;
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-22T11:51:11.292+01:00")
    public NoSuchCustomerException(String message, com.example.customerservice2.NoSuchCustomer noSuchCustomer, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = noSuchCustomer;
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-22T11:51:11.292+01:00")
    public com.example.customerservice2.NoSuchCustomer getFaultInfo() {
        return this.faultInfo;
    }
}
