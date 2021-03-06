
package org.example.transstandardcredittosrm;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import java.net.URL;
import java.util.logging.Logger;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "TransStandardCreditToSRM", targetNamespace = "http://www.example.org/TransStandardCreditToSRM/", wsdlLocation = "classpath:/wsdl/TransStandardCreditToSRM.wsdl")
public class TransStandardCreditToSRM_Service
    extends Service
{

    private final static URL TRANSSTANDARDCREDITTOSRM_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(org.example.transstandardcredittosrm.TransStandardCreditToSRM_Service.class.getName());

    static {
        URL url = null;
        try {
            url = TransStandardCreditToSRM_Service.class.getResource("/wsdl/TransStandardCreditToSRM.wsdl");
        } catch (Exception e) {
            logger.warning("Failed to create URL for the wsdl Location: 'classpath:/wsdl/TransStandardCreditToSRM.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        TRANSSTANDARDCREDITTOSRM_WSDL_LOCATION = url;
    }

    public TransStandardCreditToSRM_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TransStandardCreditToSRM_Service() {
        super(TRANSSTANDARDCREDITTOSRM_WSDL_LOCATION, new QName("http://www.example.org/TransStandardCreditToSRM/", "TransStandardCreditToSRM"));
    }

    /**
     * 
     * @return
     *     returns TransStandardCreditToSRM
     */
    @WebEndpoint(name = "TransStandardCreditToSRMSOAP")
    public TransStandardCreditToSRM getTransStandardCreditToSRMSOAP() {
        return super.getPort(new QName("http://www.example.org/TransStandardCreditToSRM/", "TransStandardCreditToSRMSOAP"), TransStandardCreditToSRM.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TransStandardCreditToSRM
     */
    @WebEndpoint(name = "TransStandardCreditToSRMSOAP")
    public TransStandardCreditToSRM getTransStandardCreditToSRMSOAP(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.example.org/TransStandardCreditToSRM/", "TransStandardCreditToSRMSOAP"), TransStandardCreditToSRM.class, features);
    }

}
