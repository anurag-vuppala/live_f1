package org.apache.camel.wsdl_first;

import jakarta.annotation.Generated;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 4.0.2
 * 2023-09-20T21:17:46.903+01:00
 * Generated source version: 4.0.2
 *
 */
@WebService(targetNamespace = "http://camel.apache.org/wsdl-first", name = "PersonMultiPartPortType")
@XmlSeeAlso({org.apache.camel.wsdl_first.types.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-20T21:17:46.903+01:00", comments = "Apache CXF 4.0.2")
public interface PersonMultiPartPortType {

    @WebMethod(operationName = "GetPersonMultiPartOperation")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-20T21:17:46.903+01:00")
    public void getPersonMultiPartOperation(

        @WebParam(partName = "nameIn", name = "StringInputElem", targetNamespace = "http://camel.apache.org/wsdl-first/types")
        java.lang.String nameIn,
        @WebParam(partName = "ssnIn", name = "IntegerInputElem", targetNamespace = "http://camel.apache.org/wsdl-first/types")
        int ssnIn,
        @WebParam(partName = "nameOut", mode = WebParam.Mode.OUT, name = "StringOutputElem", targetNamespace = "http://camel.apache.org/wsdl-first/types")
        jakarta.xml.ws.Holder<java.lang.String> nameOut,
        @WebParam(partName = "ssnOut", mode = WebParam.Mode.OUT, name = "IntegerOutputElem", targetNamespace = "http://camel.apache.org/wsdl-first/types")
        jakarta.xml.ws.Holder<java.lang.Integer> ssnOut
    );
}
