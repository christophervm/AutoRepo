
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

    private final static QName _ListarAlqNoEntxPlacaResponse_QNAME = new QName("http://services/", "ListarAlqNoEntxPlacaResponse");
    private final static QName _ListarGenAlquileres_QNAME = new QName("http://services/", "ListarGenAlquileres");
    private final static QName _ListarAlqNoEntxPlaca_QNAME = new QName("http://services/", "ListarAlqNoEntxPlaca");
    private final static QName _OperationResponse_QNAME = new QName("http://services/", "operationResponse");
    private final static QName _ListarAutoxPlacaResponse_QNAME = new QName("http://services/", "ListarAutoxPlacaResponse");
    private final static QName _ListaGenReserva_QNAME = new QName("http://services/", "ListaGenReserva");
    private final static QName _ListarAlquiNoEntResponse_QNAME = new QName("http://services/", "ListarAlquiNoEntResponse");
    private final static QName _Operation_QNAME = new QName("http://services/", "operation");
    private final static QName _ListarAutoxPlaca_QNAME = new QName("http://services/", "ListarAutoxPlaca");
    private final static QName _ListarClienteResponse_QNAME = new QName("http://services/", "ListarClienteResponse");
    private final static QName _ListaGenReservaResponse_QNAME = new QName("http://services/", "ListaGenReservaResponse");
    private final static QName _ListarAlquiNoEnt_QNAME = new QName("http://services/", "ListarAlquiNoEnt");
    private final static QName _ListarGenAlquileresResponse_QNAME = new QName("http://services/", "ListarGenAlquileresResponse");
    private final static QName _ListarCliente_QNAME = new QName("http://services/", "ListarCliente");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListarCliente }
     * 
     */
    public ListarCliente createListarCliente() {
        return new ListarCliente();
    }

    /**
     * Create an instance of {@link ListarAlquiNoEnt }
     * 
     */
    public ListarAlquiNoEnt createListarAlquiNoEnt() {
        return new ListarAlquiNoEnt();
    }

    /**
     * Create an instance of {@link ListarGenAlquileresResponse }
     * 
     */
    public ListarGenAlquileresResponse createListarGenAlquileresResponse() {
        return new ListarGenAlquileresResponse();
    }

    /**
     * Create an instance of {@link ListaGenReservaResponse }
     * 
     */
    public ListaGenReservaResponse createListaGenReservaResponse() {
        return new ListaGenReservaResponse();
    }

    /**
     * Create an instance of {@link ListarClienteResponse }
     * 
     */
    public ListarClienteResponse createListarClienteResponse() {
        return new ListarClienteResponse();
    }

    /**
     * Create an instance of {@link Operation }
     * 
     */
    public Operation createOperation() {
        return new Operation();
    }

    /**
     * Create an instance of {@link ListarAutoxPlaca }
     * 
     */
    public ListarAutoxPlaca createListarAutoxPlaca() {
        return new ListarAutoxPlaca();
    }

    /**
     * Create an instance of {@link ListaGenReserva }
     * 
     */
    public ListaGenReserva createListaGenReserva() {
        return new ListaGenReserva();
    }

    /**
     * Create an instance of {@link ListarAlquiNoEntResponse }
     * 
     */
    public ListarAlquiNoEntResponse createListarAlquiNoEntResponse() {
        return new ListarAlquiNoEntResponse();
    }

    /**
     * Create an instance of {@link OperationResponse }
     * 
     */
    public OperationResponse createOperationResponse() {
        return new OperationResponse();
    }

    /**
     * Create an instance of {@link ListarAutoxPlacaResponse }
     * 
     */
    public ListarAutoxPlacaResponse createListarAutoxPlacaResponse() {
        return new ListarAutoxPlacaResponse();
    }

    /**
     * Create an instance of {@link ListarAlqNoEntxPlaca }
     * 
     */
    public ListarAlqNoEntxPlaca createListarAlqNoEntxPlaca() {
        return new ListarAlqNoEntxPlaca();
    }

    /**
     * Create an instance of {@link ListarGenAlquileres }
     * 
     */
    public ListarGenAlquileres createListarGenAlquileres() {
        return new ListarGenAlquileres();
    }

    /**
     * Create an instance of {@link ListarAlqNoEntxPlacaResponse }
     * 
     */
    public ListarAlqNoEntxPlacaResponse createListarAlqNoEntxPlacaResponse() {
        return new ListarAlqNoEntxPlacaResponse();
    }

    /**
     * Create an instance of {@link Usuario }
     * 
     */
    public Usuario createUsuario() {
        return new Usuario();
    }

    /**
     * Create an instance of {@link Marca }
     * 
     */
    public Marca createMarca() {
        return new Marca();
    }

    /**
     * Create an instance of {@link Date }
     * 
     */
    public Date createDate() {
        return new Date();
    }

    /**
     * Create an instance of {@link Cliente }
     * 
     */
    public Cliente createCliente() {
        return new Cliente();
    }

    /**
     * Create an instance of {@link Alquiler }
     * 
     */
    public Alquiler createAlquiler() {
        return new Alquiler();
    }

    /**
     * Create an instance of {@link Auto }
     * 
     */
    public Auto createAuto() {
        return new Auto();
    }

    /**
     * Create an instance of {@link Modelo }
     * 
     */
    public Modelo createModelo() {
        return new Modelo();
    }

    /**
     * Create an instance of {@link Reserva }
     * 
     */
    public Reserva createReserva() {
        return new Reserva();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarAlqNoEntxPlacaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "ListarAlqNoEntxPlacaResponse")
    public JAXBElement<ListarAlqNoEntxPlacaResponse> createListarAlqNoEntxPlacaResponse(ListarAlqNoEntxPlacaResponse value) {
        return new JAXBElement<ListarAlqNoEntxPlacaResponse>(_ListarAlqNoEntxPlacaResponse_QNAME, ListarAlqNoEntxPlacaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarGenAlquileres }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "ListarGenAlquileres")
    public JAXBElement<ListarGenAlquileres> createListarGenAlquileres(ListarGenAlquileres value) {
        return new JAXBElement<ListarGenAlquileres>(_ListarGenAlquileres_QNAME, ListarGenAlquileres.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarAlqNoEntxPlaca }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "ListarAlqNoEntxPlaca")
    public JAXBElement<ListarAlqNoEntxPlaca> createListarAlqNoEntxPlaca(ListarAlqNoEntxPlaca value) {
        return new JAXBElement<ListarAlqNoEntxPlaca>(_ListarAlqNoEntxPlaca_QNAME, ListarAlqNoEntxPlaca.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "operationResponse")
    public JAXBElement<OperationResponse> createOperationResponse(OperationResponse value) {
        return new JAXBElement<OperationResponse>(_OperationResponse_QNAME, OperationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarAutoxPlacaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "ListarAutoxPlacaResponse")
    public JAXBElement<ListarAutoxPlacaResponse> createListarAutoxPlacaResponse(ListarAutoxPlacaResponse value) {
        return new JAXBElement<ListarAutoxPlacaResponse>(_ListarAutoxPlacaResponse_QNAME, ListarAutoxPlacaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaGenReserva }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "ListaGenReserva")
    public JAXBElement<ListaGenReserva> createListaGenReserva(ListaGenReserva value) {
        return new JAXBElement<ListaGenReserva>(_ListaGenReserva_QNAME, ListaGenReserva.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarAlquiNoEntResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "ListarAlquiNoEntResponse")
    public JAXBElement<ListarAlquiNoEntResponse> createListarAlquiNoEntResponse(ListarAlquiNoEntResponse value) {
        return new JAXBElement<ListarAlquiNoEntResponse>(_ListarAlquiNoEntResponse_QNAME, ListarAlquiNoEntResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Operation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "operation")
    public JAXBElement<Operation> createOperation(Operation value) {
        return new JAXBElement<Operation>(_Operation_QNAME, Operation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarAutoxPlaca }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "ListarAutoxPlaca")
    public JAXBElement<ListarAutoxPlaca> createListarAutoxPlaca(ListarAutoxPlaca value) {
        return new JAXBElement<ListarAutoxPlaca>(_ListarAutoxPlaca_QNAME, ListarAutoxPlaca.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarClienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "ListarClienteResponse")
    public JAXBElement<ListarClienteResponse> createListarClienteResponse(ListarClienteResponse value) {
        return new JAXBElement<ListarClienteResponse>(_ListarClienteResponse_QNAME, ListarClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaGenReservaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "ListaGenReservaResponse")
    public JAXBElement<ListaGenReservaResponse> createListaGenReservaResponse(ListaGenReservaResponse value) {
        return new JAXBElement<ListaGenReservaResponse>(_ListaGenReservaResponse_QNAME, ListaGenReservaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarAlquiNoEnt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "ListarAlquiNoEnt")
    public JAXBElement<ListarAlquiNoEnt> createListarAlquiNoEnt(ListarAlquiNoEnt value) {
        return new JAXBElement<ListarAlquiNoEnt>(_ListarAlquiNoEnt_QNAME, ListarAlquiNoEnt.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarGenAlquileresResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "ListarGenAlquileresResponse")
    public JAXBElement<ListarGenAlquileresResponse> createListarGenAlquileresResponse(ListarGenAlquileresResponse value) {
        return new JAXBElement<ListarGenAlquileresResponse>(_ListarGenAlquileresResponse_QNAME, ListarGenAlquileresResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "ListarCliente")
    public JAXBElement<ListarCliente> createListarCliente(ListarCliente value) {
        return new JAXBElement<ListarCliente>(_ListarCliente_QNAME, ListarCliente.class, null, value);
    }

}
