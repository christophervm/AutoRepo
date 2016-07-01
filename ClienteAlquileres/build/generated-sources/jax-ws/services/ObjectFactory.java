
package services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the services package. 
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
public class ObjectFactory {

    private final static QName _RegistroReservaResponse_QNAME = new QName("http://services/", "RegistroReservaResponse");
    private final static QName _RegistroReserva_QNAME = new QName("http://services/", "RegistroReserva");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RegistroReserva }
     * 
     */
    public RegistroReserva createRegistroReserva() {
        return new RegistroReserva();
    }

    /**
     * Create an instance of {@link RegistroReservaResponse }
     * 
     */
    public RegistroReservaResponse createRegistroReservaResponse() {
        return new RegistroReservaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistroReservaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "RegistroReservaResponse")
    public JAXBElement<RegistroReservaResponse> createRegistroReservaResponse(RegistroReservaResponse value) {
        return new JAXBElement<RegistroReservaResponse>(_RegistroReservaResponse_QNAME, RegistroReservaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistroReserva }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "RegistroReserva")
    public JAXBElement<RegistroReserva> createRegistroReserva(RegistroReserva value) {
        return new JAXBElement<RegistroReserva>(_RegistroReserva_QNAME, RegistroReserva.class, null, value);
    }

}
