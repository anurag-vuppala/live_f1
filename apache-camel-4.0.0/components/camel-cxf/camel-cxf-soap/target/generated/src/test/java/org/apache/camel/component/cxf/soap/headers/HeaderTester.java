package org.apache.camel.component.cxf.soap.headers;

import jakarta.annotation.Generated;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 4.0.2
 * 2023-09-20T21:17:51.827+01:00
 * Generated source version: 4.0.2
 *
 */
@WebService(targetNamespace = "http://apache.org/camel/component/cxf/soap/headers", name = "headerTester")
@XmlSeeAlso({ObjectFactory.class})
@Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-20T21:17:51.827+01:00", comments = "Apache CXF 4.0.2")
public interface HeaderTester {

    @WebMethod
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-20T21:17:51.827+01:00")
    public void outHeader(

        @WebParam(partName = "me", name = "outHeader", targetNamespace = "http://apache.org/camel/component/cxf/soap/headers")
        OutHeader me,
        @WebParam(partName = "the_response", mode = WebParam.Mode.OUT, name = "outHeaderResponse", targetNamespace = "http://apache.org/camel/component/cxf/soap/headers")
        jakarta.xml.ws.Holder<OutHeaderResponse> theResponse,
        @WebParam(partName = "header_info", mode = WebParam.Mode.OUT, name = "SOAPHeaderInfo", targetNamespace = "http://apache.org/camel/component/cxf/soap/headers", header = true)
        jakarta.xml.ws.Holder<SOAPHeaderData> headerInfo
    );

    @WebMethod
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "inoutHeaderResponse", targetNamespace = "http://apache.org/camel/component/cxf/soap/headers", partName = "the_response")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-20T21:17:51.827+01:00")
    public InoutHeaderResponse inoutHeader(

        @WebParam(partName = "me", name = "inoutHeader", targetNamespace = "http://apache.org/camel/component/cxf/soap/headers")
        InoutHeader me,
        @WebParam(partName = "header_info", mode = WebParam.Mode.INOUT, name = "SOAPHeaderInfo", targetNamespace = "http://apache.org/camel/component/cxf/soap/headers", header = true)
        jakarta.xml.ws.Holder<SOAPHeaderData> headerInfo
    );

    @WebMethod
    @RequestWrapper(localName = "outOutOfBandHeader", targetNamespace = "http://apache.org/camel/component/cxf/soap/headers", className = "org.apache.camel.component.cxf.soap.headers.OutOutOfBandHeader")
    @ResponseWrapper(localName = "outOutOfBandHeaderResponse", targetNamespace = "http://apache.org/camel/component/cxf/soap/headers", className = "org.apache.camel.component.cxf.soap.headers.OutOutOfBandHeaderResponse")
    @WebResult(name = "responseType", targetNamespace = "")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-20T21:17:51.827+01:00")
    public org.apache.camel.component.cxf.soap.headers.Me outOutOfBandHeader(

        @WebParam(name = "requestType", targetNamespace = "")
        org.apache.camel.component.cxf.soap.headers.Me requestType
    );

    @WebMethod
    @RequestWrapper(localName = "inoutOutOfBandHeader", targetNamespace = "http://apache.org/camel/component/cxf/soap/headers", className = "org.apache.camel.component.cxf.soap.headers.InoutOutOfBandHeader")
    @ResponseWrapper(localName = "inoutOutOfBandHeaderResponse", targetNamespace = "http://apache.org/camel/component/cxf/soap/headers", className = "org.apache.camel.component.cxf.soap.headers.InoutOutOfBandHeaderResponse")
    @WebResult(name = "responseType", targetNamespace = "")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-20T21:17:51.827+01:00")
    public org.apache.camel.component.cxf.soap.headers.Me inoutOutOfBandHeader(

        @WebParam(name = "requestType", targetNamespace = "")
        org.apache.camel.component.cxf.soap.headers.Me requestType
    );

    @WebMethod
    @RequestWrapper(localName = "inOutOfBandHeader", targetNamespace = "http://apache.org/camel/component/cxf/soap/headers", className = "org.apache.camel.component.cxf.soap.headers.InOutOfBandHeader")
    @ResponseWrapper(localName = "inOutOfBandHeaderResponse", targetNamespace = "http://apache.org/camel/component/cxf/soap/headers", className = "org.apache.camel.component.cxf.soap.headers.InOutOfBandHeaderResponse")
    @WebResult(name = "responseType", targetNamespace = "")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-20T21:17:51.827+01:00")
    public org.apache.camel.component.cxf.soap.headers.Me inOutOfBandHeader(

        @WebParam(name = "requestType", targetNamespace = "")
        org.apache.camel.component.cxf.soap.headers.Me requestType
    );

    @WebMethod
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "inHeaderResponse", targetNamespace = "http://apache.org/camel/component/cxf/soap/headers", partName = "the_response")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-20T21:17:51.827+01:00")
    public InHeaderResponse inHeader(

        @WebParam(partName = "me", name = "inHeader", targetNamespace = "http://apache.org/camel/component/cxf/soap/headers")
        InHeader me,
        @WebParam(partName = "header_info", name = "SOAPHeaderInfo", targetNamespace = "http://apache.org/camel/component/cxf/soap/headers", header = true)
        SOAPHeaderData headerInfo
    );
}