
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

    private final static QName _BuscarCliente_QNAME = new QName("http://services/", "BuscarCliente");
    private final static QName _BuscarClienteResponse_QNAME = new QName("http://services/", "BuscarClienteResponse");
    private final static QName _RegistrarAlquiler_QNAME = new QName("http://services/", "RegistrarAlquiler");
    private final static QName _RegistrarAlquilerResponse_QNAME = new QName("http://services/", "RegistrarAlquilerResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RegistrarAlquilerResponse }
     * 
     */
    public RegistrarAlquilerResponse createRegistrarAlquilerResponse() {
        return new RegistrarAlquilerResponse();
    }

    /**
     * Create an instance of {@link RegistrarAlquiler }
     * 
     */
    public RegistrarAlquiler createRegistrarAlquiler() {
        return new RegistrarAlquiler();
    }

    /**
     * Create an instance of {@link BuscarClienteResponse }
     * 
     */
    public BuscarClienteResponse createBuscarClienteResponse() {
        return new BuscarClienteResponse();
    }

    /**
     * Create an instance of {@link BuscarCliente }
     * 
     */
    public BuscarCliente createBuscarCliente() {
        return new BuscarCliente();
    }

    /**
     * Create an instance of {@link Usuario }
     * 
     */
    public Usuario createUsuario() {
        return new Usuario();
    }

    /**
     * Create an instance of {@link Cliente }
     * 
     */
    public Cliente createCliente() {
        return new Cliente();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "BuscarCliente")
    public JAXBElement<BuscarCliente> createBuscarCliente(BuscarCliente value) {
        return new JAXBElement<BuscarCliente>(_BuscarCliente_QNAME, BuscarCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarClienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "BuscarClienteResponse")
    public JAXBElement<BuscarClienteResponse> createBuscarClienteResponse(BuscarClienteResponse value) {
        return new JAXBElement<BuscarClienteResponse>(_BuscarClienteResponse_QNAME, BuscarClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarAlquiler }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "RegistrarAlquiler")
    public JAXBElement<RegistrarAlquiler> createRegistrarAlquiler(RegistrarAlquiler value) {
        return new JAXBElement<RegistrarAlquiler>(_RegistrarAlquiler_QNAME, RegistrarAlquiler.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarAlquilerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "RegistrarAlquilerResponse")
    public JAXBElement<RegistrarAlquilerResponse> createRegistrarAlquilerResponse(RegistrarAlquilerResponse value) {
        return new JAXBElement<RegistrarAlquilerResponse>(_RegistrarAlquilerResponse_QNAME, RegistrarAlquilerResponse.class, null, value);
    }

}
