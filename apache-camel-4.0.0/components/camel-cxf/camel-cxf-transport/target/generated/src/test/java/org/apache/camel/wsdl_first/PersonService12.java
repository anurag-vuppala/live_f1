package org.apache.camel.wsdl_first;

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
 * 2023-09-20T21:17:46.936+01:00
 * Generated source version: 4.0.2
 *
 */
@WebServiceClient(name = "PersonService12",
                  wsdlLocation = "file:/Users/anuragvuppala/anurag-projects/live_f1/apache-camel-4.0.0/components/camel-cxf/camel-cxf-transport/src/test/resources/person.wsdl",
                  targetNamespace = "http://camel.apache.org/wsdl-first")
@Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-20T21:17:46.936+01:00", comments = "Apache CXF 4.0.2")
public class PersonService12 extends Service {

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-20T21:17:46.936+01:00")
    public final static URL WSDL_LOCATION;

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-20T21:17:46.936+01:00")
    public final static QName SERVICE = new QName("http://camel.apache.org/wsdl-first", "PersonService12");
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-20T21:17:46.936+01:00")
    public final static QName Soap = new QName("http://camel.apache.org/wsdl-first", "soap");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/anuragvuppala/anurag-projects/live_f1/apache-camel-4.0.0/components/camel-cxf/camel-cxf-transport/src/test/resources/person.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(PersonService12.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/Users/anuragvuppala/anurag-projects/live_f1/apache-camel-4.0.0/components/camel-cxf/camel-cxf-transport/src/test/resources/person.wsdl");
        }
        WSDL_LOCATION = url;
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-20T21:17:46.936+01:00")
    public PersonService12(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-20T21:17:46.936+01:00")
    public PersonService12(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-20T21:17:46.936+01:00")
    public PersonService12() {
        super(WSDL_LOCATION, SERVICE);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-20T21:17:46.936+01:00")
    public PersonService12(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-20T21:17:46.936+01:00")
    public PersonService12(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-20T21:17:46.936+01:00")
    public PersonService12(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns Person
     */
    @WebEndpoint(name = "soap")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-20T21:17:46.936+01:00")
    public Person getSoap() {
        return super.getPort(Soap, Person.class);
    }

    /**
     *
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Person
     */
    @WebEndpoint(name = "soap")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2023-09-20T21:17:46.936+01:00")
    public Person getSoap(WebServiceFeature... features) {
        return super.getPort(Soap, Person.class, features);
    }

}
