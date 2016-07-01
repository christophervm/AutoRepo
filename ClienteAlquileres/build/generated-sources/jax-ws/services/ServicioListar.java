
package services;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-2b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ServicioListar", targetNamespace = "http://services/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServicioListar {


    /**
     * 
     * @return
     *     returns java.util.List<services.Cliente>
     */
    @WebMethod(operationName = "ListarCliente")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ListarCliente", targetNamespace = "http://services/", className = "services.ListarCliente")
    @ResponseWrapper(localName = "ListarClienteResponse", targetNamespace = "http://services/", className = "services.ListarClienteResponse")
    @Action(input = "http://services/ServicioListar/ListarClienteRequest", output = "http://services/ServicioListar/ListarClienteResponse")
    public List<Cliente> listarCliente();

    /**
     * 
     * @return
     *     returns java.util.List<services.Auto>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "operation", targetNamespace = "http://services/", className = "services.Operation")
    @ResponseWrapper(localName = "operationResponse", targetNamespace = "http://services/", className = "services.OperationResponse")
    @Action(input = "http://services/ServicioListar/operationRequest", output = "http://services/ServicioListar/operationResponse")
    public List<Auto> operation();

    /**
     * 
     * @return
     *     returns java.util.List<services.Alquiler>
     */
    @WebMethod(operationName = "ListarAlquiNoEnt")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ListarAlquiNoEnt", targetNamespace = "http://services/", className = "services.ListarAlquiNoEnt")
    @ResponseWrapper(localName = "ListarAlquiNoEntResponse", targetNamespace = "http://services/", className = "services.ListarAlquiNoEntResponse")
    @Action(input = "http://services/ServicioListar/ListarAlquiNoEntRequest", output = "http://services/ServicioListar/ListarAlquiNoEntResponse")
    public List<Alquiler> listarAlquiNoEnt();

    /**
     * 
     * @param placa
     * @return
     *     returns services.Alquiler
     */
    @WebMethod(operationName = "ListarAlqNoEntxPlaca")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ListarAlqNoEntxPlaca", targetNamespace = "http://services/", className = "services.ListarAlqNoEntxPlaca")
    @ResponseWrapper(localName = "ListarAlqNoEntxPlacaResponse", targetNamespace = "http://services/", className = "services.ListarAlqNoEntxPlacaResponse")
    @Action(input = "http://services/ServicioListar/ListarAlqNoEntxPlacaRequest", output = "http://services/ServicioListar/ListarAlqNoEntxPlacaResponse")
    public Alquiler listarAlqNoEntxPlaca(
        @WebParam(name = "placa", targetNamespace = "")
        String placa);

    /**
     * 
     * @param placa
     * @return
     *     returns services.Auto
     */
    @WebMethod(operationName = "ListarAutoxPlaca")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ListarAutoxPlaca", targetNamespace = "http://services/", className = "services.ListarAutoxPlaca")
    @ResponseWrapper(localName = "ListarAutoxPlacaResponse", targetNamespace = "http://services/", className = "services.ListarAutoxPlacaResponse")
    @Action(input = "http://services/ServicioListar/ListarAutoxPlacaRequest", output = "http://services/ServicioListar/ListarAutoxPlacaResponse")
    public Auto listarAutoxPlaca(
        @WebParam(name = "placa", targetNamespace = "")
        String placa);

}
