/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import daoImpl.AlquilerDaoImpl;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author alumno
 */
@WebService(serviceName = "ServicioEntrega")
public class ServicioEntrega {
AlquilerDaoImpl aldao = new AlquilerDaoImpl();
    
    
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "EntrAuto")
    public String EntrAuto(@WebParam(name = "placa") String placa, @WebParam(name = "cliente") String cliente) {
        String res  = aldao.Entregar(placa, Integer.parseInt(cliente));
 
        return res;
    }
    
    
}
