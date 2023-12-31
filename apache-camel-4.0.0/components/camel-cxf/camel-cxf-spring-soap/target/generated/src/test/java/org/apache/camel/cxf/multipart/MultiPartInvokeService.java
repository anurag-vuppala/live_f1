package org.apache.camel.cxf.multipart;

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
 * 2023-09-20T21:17:56.701+01:00
 * Generated source version: 4.0.2
 *
 */
@WebServiceClient(name = "MultiPartInvokeService",
                  wsdlLocation = "file:/Users/anuragvuppala/anurag-projects/live_f1/apache-camel-4.0.0/components/camel-cxf/camel-cxf-spring-soap/src/test/resources/MultiPartTest.wsdl",
                  targetNamespace = "http://camel.apache.org/cxf/multipart")
@Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-20T21:17:56.701+01:00", comments = "Apache CXF 4.0.2")
public class MultiPartInvokeService extends Service {

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-20T21:17:56.701+01:00")
    public final static URL WSDL_LOCATION;

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-20T21:17:56.701+01:00")
    public final static QName SERVICE = new QName("http://camel.apache.org/cxf/multipart", "MultiPartInvokeService");
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-20T21:17:56.701+01:00")
    public final static QName MultiPartInvokePort = new QName("http://camel.apache.org/cxf/multipart", "MultiPartInvokePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/anuragvuppala/anurag-projects/live_f1/apache-camel-4.0.0/components/camel-cxf/camel-cxf-spring-soap/src/test/resources/MultiPartTest.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(MultiPartInvokeService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/Users/anuragvuppala/anurag-projects/live_f1/apache-camel-4.0.0/components/camel-cxf/camel-cxf-spring-soap/src/test/resources/MultiPartTest.wsdl");
        }
        WSDL_LOCATION = url;
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-20T21:17:56.701+01:00")
    public MultiPartInvokeService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-20T21:17:56.701+01:00")
    public MultiPartInvokeService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-20T21:17:56.701+01:00")
    public MultiPartInvokeService() {
        super(WSDL_LOCATION, SERVICE);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-20T21:17:56.701+01:00")
    public MultiPartInvokeService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-20T21:17:56.701+01:00")
    public MultiPartInvokeService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-20T21:17:56.701+01:00")
    public MultiPartInvokeService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns MultiPartInvoke
     */
    @WebEndpoint(name = "MultiPartInvokePort")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-20T21:17:56.701+01:00")
    public MultiPartInvoke getMultiPartInvokePort() {
        return super.getPort(MultiPartInvokePort, MultiPartInvoke.class);
    }

    /**
     *
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MultiPartInvoke
     */
    @WebEndpoint(name = "MultiPartInvokePort")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-20T21:17:56.701+01:00")
    public MultiPartInvoke getMultiPartInvokePort(WebServiceFeature... features) {
        return super.getPort(MultiPartInvokePort, MultiPartInvoke.class, features);
    }

}
