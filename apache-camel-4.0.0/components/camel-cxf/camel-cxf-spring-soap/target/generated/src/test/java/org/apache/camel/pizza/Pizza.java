package org.apache.camel.pizza;

import jakarta.annotation.Generated;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 4.0.2
 * 2023-09-20T21:17:57.078+01:00
 * Generated source version: 4.0.2
 *
 */
@WebService(targetNamespace = "http://camel.apache.org/pizza", name = "Pizza")
@XmlSeeAlso({org.apache.camel.pizza.types.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-20T21:17:57.078+01:00", comments = "Apache CXF 4.0.2")
public interface Pizza {

    @WebMethod(operationName = "OrderPizza")
    @WebResult(name = "OrderResponse", targetNamespace = "http://camel.apache.org/pizza/types", partName = "body")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-20T21:17:57.078+01:00")
    public org.apache.camel.pizza.types.OrderPizzaResponseType orderPizza(

        @WebParam(partName = "body", name = "OrderRequest", targetNamespace = "http://camel.apache.org/pizza/types")
        org.apache.camel.pizza.types.OrderPizzaType body,
        @WebParam(partName = "callerID", name = "CallerIDHeader", targetNamespace = "http://camel.apache.org/pizza/types", header = true)
        org.apache.camel.pizza.types.CallerIDHeaderType callerID
    );
}
