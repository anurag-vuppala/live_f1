
package org.apache.camel.non_wrapper;

import jakarta.annotation.Generated;
import jakarta.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 4.0.2
 * 2023-09-20T21:17:51.696+01:00
 * Generated source version: 4.0.2
 */

@WebFault(name = "UnknownPersonFault", targetNamespace = "http://camel.apache.org/non-wrapper/types")
@Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-20T21:17:51.696+01:00", comments = "Apache CXF 4.0.2")
public class UnknownPersonFault extends Exception {
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-20T21:17:51.696+01:00")
    public static final long serialVersionUID = 1L;

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-20T21:17:51.696+01:00")
    private org.apache.camel.non_wrapper.types.UnknownPersonFault faultInfo;

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-20T21:17:51.696+01:00")
    public UnknownPersonFault() {
        super();
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-20T21:17:51.696+01:00")
    public UnknownPersonFault(String message) {
        super(message);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-20T21:17:51.696+01:00")
    public UnknownPersonFault(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-20T21:17:51.696+01:00")
    public UnknownPersonFault(String message, org.apache.camel.non_wrapper.types.UnknownPersonFault unknownPersonFault) {
        super(message);
        this.faultInfo = unknownPersonFault;
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-20T21:17:51.696+01:00")
    public UnknownPersonFault(String message, org.apache.camel.non_wrapper.types.UnknownPersonFault unknownPersonFault, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = unknownPersonFault;
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-20T21:17:51.696+01:00")
    public org.apache.camel.non_wrapper.types.UnknownPersonFault getFaultInfo() {
        return this.faultInfo;
    }
}