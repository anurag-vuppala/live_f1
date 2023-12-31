package com.example.customerservice2;

import java.net.MalformedURLException;
import java.net.URL;
import jakarta.annotation.Generated;
import javax.xml.namespace.QName;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceFeature;
import jakarta.xml.ws.Service;

/**
 * This class was generated by Apache CXF 4.0.2
 * 2023-09-22T11:51:11.302+01:00
 * Generated source version: 4.0.2
 *
 */
@WebServiceClient(name = "CustomerServiceService",
                  wsdlLocation = "file:/Users/anuragvuppala/anurag-projects/live_f1/apache-camel-4.0.0/components/camel-soap/src/test/resources/org/apache/camel/dataformat/soap/CustomerService2.wsdl",
                  targetNamespace = "http://customerservice2.example.com/")
@Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-22T11:51:11.302+01:00", comments = "Apache CXF 4.0.2")
public class CustomerServiceService extends Service {

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-22T11:51:11.302+01:00")
    public final static URL WSDL_LOCATION;

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-22T11:51:11.302+01:00")
    public final static QName SERVICE = new QName("http://customerservice2.example.com/", "CustomerServiceService");
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-22T11:51:11.302+01:00")
    public final static QName CustomerServicePort = new QName("http://customerservice2.example.com/", "CustomerServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/anuragvuppala/anurag-projects/live_f1/apache-camel-4.0.0/components/camel-soap/src/test/resources/org/apache/camel/dataformat/soap/CustomerService2.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(CustomerServiceService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/Users/anuragvuppala/anurag-projects/live_f1/apache-camel-4.0.0/components/camel-soap/src/test/resources/org/apache/camel/dataformat/soap/CustomerService2.wsdl");
        }
        WSDL_LOCATION = url;
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-22T11:51:11.302+01:00")
    public CustomerServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-22T11:51:11.302+01:00")
    public CustomerServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-22T11:51:11.302+01:00")
    public CustomerServiceService() {
        super(WSDL_LOCATION, SERVICE);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-22T11:51:11.302+01:00")
    public CustomerServiceService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-22T11:51:11.302+01:00")
    public CustomerServiceService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-22T11:51:11.302+01:00")
    public CustomerServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns CustomerService
     */
    @WebEndpoint(name = "CustomerServicePort")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-22T11:51:11.302+01:00")
    public CustomerService getCustomerServicePort() {
        return super.getPort(CustomerServicePort, CustomerService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CustomerService
     */
    @WebEndpoint(name = "CustomerServicePort")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-22T11:51:11.302+01:00")
    public CustomerService getCustomerServicePort(WebServiceFeature... features) {
        return super.getPort(CustomerServicePort, CustomerService.class, features);
    }

}
