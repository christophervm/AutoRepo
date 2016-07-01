/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import daoImpl.ClienteDaoImpl;
import daoImpl.EmpleadoDaoImpl;
import daoImpl.UsuarioDaoImpl;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import model.Cliente;
import model.Empleado;
import model.Usuario;

/**
 *
 * @author alumno
 */
@WebService(serviceName = "ServicioSes")
public class ServicioSes {
UsuarioDaoImpl usdao = new UsuarioDaoImpl();
EmpleadoDaoImpl emdao = new EmpleadoDaoImpl();
ClienteDaoImpl clidao = new ClienteDaoImpl();
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }


    
    @WebMethod(operationName = "ValidaSes")
    public Empleado ValidaSes(@WebParam(name = "usuario") String usuario, @WebParam(name = "passwd") String passwd) {
 
        
     Usuario us =  usdao.buscarXnusr(usuario);
   Empleado   emp = emdao.buscarXusr(us.getNomusr());
        if (emp !=null) {
               return emp;
        }
   
       return null;
     
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ValidarSesClie")
    public Cliente ValidarSesClie(@WebParam(name = "usuario") String usuario, @WebParam(name = "passwd") String passwd) {
       Usuario us =  usdao.buscarXnusr(usuario);
        Cliente cl = clidao.buscarXusr(us.getNomusr());
        return cl;
        
    }
}
