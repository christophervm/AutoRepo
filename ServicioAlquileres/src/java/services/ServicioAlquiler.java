/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import daoImpl.AlquilerDaoImpl;
import daoImpl.AutoDaoImpl;
import daoImpl.ClienteDaoImpl;
import daoImpl.UsuarioDaoImpl;
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
@WebService(serviceName = "ServicioAlquiler")
public class ServicioAlquiler {
AlquilerDaoImpl aldao = new AlquilerDaoImpl();
 ClienteDaoImpl clidao = new ClienteDaoImpl();
    AutoDaoImpl audao = new AutoDaoImpl();
            UsuarioDaoImpl usdao = new UsuarioDaoImpl();
    /**
     * Web service operation
     */
    @WebMethod(operationName = "RegistrarAlquiler")
    public String RegistrarAlquiler(@WebParam(name = "codcli") int codcli, @WebParam(name = "placa") String placa) {

     Cliente clien = clidao.buscarXcodigo(codcli);
               Auto au = audao.buscarXPlaca(placa);
               
               Alquiler alq = new Alquiler(0,null,null,clien,au);
               String ag = aldao.agregar(alq);
        
        
        return ag;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "BuscarCliente")
    public Cliente BuscarCliente(@WebParam(name = "nomusr") String nomusr) {
       
        Cliente cl = clidao.buscarXusr(nomusr);
        
        return cl;
    }
}
