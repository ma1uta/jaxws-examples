
package org.sav.jaxws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "OrgsynchService", targetNamespace = "http://localhost:8080/jaxws/services/OrgsynchPortType", wsdlLocation = "file:///home/tolya/dev/jaxws/wsdl/OrgsynchService.wsdl")
public class OrgsynchService
    extends Service
{

    private final static URL ORGSYNCHSERVICE_WSDL_LOCATION;
    private final static WebServiceException ORGSYNCHSERVICE_EXCEPTION;
    private final static QName ORGSYNCHSERVICE_QNAME = new QName("http://localhost:8080/jaxws/services/OrgsynchPortType", "OrgsynchService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:///home/tolya/dev/jaxws/wsdl/OrgsynchService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ORGSYNCHSERVICE_WSDL_LOCATION = url;
        ORGSYNCHSERVICE_EXCEPTION = e;
    }

    public OrgsynchService() {
        super(__getWsdlLocation(), ORGSYNCHSERVICE_QNAME);
    }

    public OrgsynchService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ORGSYNCHSERVICE_QNAME, features);
    }

    public OrgsynchService(URL wsdlLocation) {
        super(wsdlLocation, ORGSYNCHSERVICE_QNAME);
    }

    public OrgsynchService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ORGSYNCHSERVICE_QNAME, features);
    }

    public OrgsynchService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public OrgsynchService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns OrgsynchPortType
     */
    @WebEndpoint(name = "HTTP_Port")
    public OrgsynchPortType getHTTPPort() {
        return super.getPort(new QName("http://localhost:8080/jaxws/services/OrgsynchPortType", "HTTP_Port"), OrgsynchPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns OrgsynchPortType
     */
    @WebEndpoint(name = "HTTP_Port")
    public OrgsynchPortType getHTTPPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://localhost:8080/jaxws/services/OrgsynchPortType", "HTTP_Port"), OrgsynchPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ORGSYNCHSERVICE_EXCEPTION!= null) {
            throw ORGSYNCHSERVICE_EXCEPTION;
        }
        return ORGSYNCHSERVICE_WSDL_LOCATION;
    }

}
