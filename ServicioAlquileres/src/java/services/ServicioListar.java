/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import daoImpl.AlquilerDaoImpl;
import daoImpl.AutoDaoImpl;
import daoImpl.ClienteDaoImpl;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import model.Alquiler;
import model.Auto;
import model.Cliente;

/**
 *
 * @author alumno
 */
@WebService(serviceName = "ServicioListar")
public class ServicioListar {
AutoDaoImpl audao = new AutoDaoImpl();
ClienteDaoImpl clidao = new ClienteDaoImpl();
AlquilerDaoImpl aldao = new AlquilerDaoImpl();
    /**
     * This is a sample web service operation
     */

    @WebMethod(operationName = "operation")
    public List<Auto> operation() {
      
        List<Auto> listaAuto = new ArrayList<Auto>();
       listaAuto =  audao.listardisponibles();
        
        return listaAuto;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ListarCliente")
    public List<Cliente> ListarCliente() {
  List<Cliente> listaCliente = new ArrayList<Cliente>();
  listaCliente = clidao.ListaCliente();
        return listaCliente;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ListarAlquiNoEnt")
    public List<Alquiler> ListarAlquiNoEnt() {
        List<Alquiler> listaAlquiler = new ArrayList<Alquiler>();
        listaAlquiler = aldao.ListaAlquilerNoEnt();
        
        return listaAlquiler;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ListarAlqNoEntxPlaca")
    public Alquiler ListarAlqNoEntxPlaca(@WebParam(name = "placa") String placa) {
      
          Alquiler alq = aldao.ListaAlquilerNoEntxPlaca(placa);
          
        return alq;
    }
    
    
}