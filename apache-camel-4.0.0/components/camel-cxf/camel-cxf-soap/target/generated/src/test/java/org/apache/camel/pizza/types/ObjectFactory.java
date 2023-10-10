
package org.apache.camel.pizza.types;

import javax.xml.namespace.QName;
import jakarta.annotation.Generated;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.apache.camel.pizza.types package. 
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
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2023-09-20T21:17:51+01:00")
public class ObjectFactory {

    private final static QName _CallerIDHeader_QNAME = new QName("http://camel.apache.org/pizza/types", "CallerIDHeader");
    private final static QName _OrderRequest_QNAME = new QName("http://camel.apache.org/pizza/types", "OrderRequest");
    private final static QName _OrderResponse_QNAME = new QName("http://camel.apache.org/pizza/types", "OrderResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.apache.camel.pizza.types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CallerIDHeaderType }
     * 
     */
    public CallerIDHeaderType createCallerIDHeaderType() {
        return new CallerIDHeaderType();
    }

    /**
     * Create an instance of {@link OrderPizzaType }
     * 
     */
    public OrderPizzaType createOrderPizzaType() {
        return new OrderPizzaType();
    }

    /**
     * Create an instance of {@link OrderPizzaResponseType }
     * 
     */
    public OrderPizzaResponseType createOrderPizzaResponseType() {
        return new OrderPizzaResponseType();
    }

    /**
     * Create an instance of {@link ToppingsListType }
     * 
     */
    public ToppingsListType createToppingsListType() {
        return new ToppingsListType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallerIDHeaderType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CallerIDHeaderType }{@code >}
     */
    @XmlElementDecl(namespace = "http://camel.apache.org/pizza/types", name = "CallerIDHeader")
    public JAXBElement<CallerIDHeaderType> createCallerIDHeader(CallerIDHeaderType value) {
        return new JAXBElement<CallerIDHeaderType>(_CallerIDHeader_QNAME, CallerIDHeaderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderPizzaType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OrderPizzaType }{@code >}
     */
    @XmlElementDecl(namespace = "http://camel.apache.org/pizza/types", name = "OrderRequest")
    public JAXBElement<OrderPizzaType> createOrderRequest(OrderPizzaType value) {
        return new JAXBElement<OrderPizzaType>(_OrderRequest_QNAME, OrderPizzaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderPizzaResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OrderPizzaResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://camel.apache.org/pizza/types", name = "OrderResponse")
    public JAXBElement<OrderPizzaResponseType> createOrderResponse(OrderPizzaResponseType value) {
        return new JAXBElement<OrderPizzaResponseType>(_OrderResponse_QNAME, OrderPizzaResponseType.class, null, value);
    }

}
