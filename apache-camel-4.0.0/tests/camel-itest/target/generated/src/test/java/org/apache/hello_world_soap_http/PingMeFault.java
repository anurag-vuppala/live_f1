
package org.apache.hello_world_soap_http;

import jakarta.annotation.Generated;
import jakarta.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 4.0.2
 * 2023-09-27T14:01:29.122+01:00
 * Generated source version: 4.0.2
 */

@WebFault(name = "faultDetail", targetNamespace = "http://apache.org/hello_world_soap_http/types")
@Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-27T14:01:29.122+01:00", comments = "Apache CXF 4.0.2")
public class PingMeFault extends Exception {
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-27T14:01:29.122+01:00")
    public static final long serialVersionUID = 1L;

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-27T14:01:29.122+01:00")
    private org.apache.hello_world_soap_http.types.FaultDetail faultInfo;

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-27T14:01:29.122+01:00")
    public PingMeFault() {
        super();
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-27T14:01:29.122+01:00")
    public PingMeFault(String message) {
        super(message);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-27T14:01:29.122+01:00")
    public PingMeFault(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-27T14:01:29.122+01:00")
    public PingMeFault(String message, org.apache.hello_world_soap_http.types.FaultDetail faultDetail) {
        super(message);
        this.faultInfo = faultDetail;
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-27T14:01:29.122+01:00")
    public PingMeFault(String message, org.apache.hello_world_soap_http.types.FaultDetail faultDetail, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = faultDetail;
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-27T14:01:29.122+01:00")
    public org.apache.hello_world_soap_http.types.FaultDetail getFaultInfo() {
        return this.faultInfo;
    }
}
