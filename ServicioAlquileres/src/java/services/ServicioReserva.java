/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import daoImpl.AutoDaoImpl;
import daoImpl.ClienteDaoImpl;
import daoImpl.ReservaDAOImpl;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import model.Auto;
import model.Cliente;
import model.Reserva;
import java.sql.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author alumno
 */
@WebService(serviceName = "ServicioReserva")
public class ServicioReserva {

   ReservaDAOImpl resdao = new ReservaDAOImpl();
    ClienteDaoImpl clida = new ClienteDaoImpl();
    AutoDaoImpl audao = new AutoDaoImpl();
    /**
     * Web service operation
     */


   
 
   

    /**
     * Web service operation
     */
    @WebMethod(operationName = "RegistroReserva")
    public String RegistroReserva(@WebParam(name = "placa") String placa, @WebParam(name = "fechar") String fechar, @WebParam(name = "codcl") int codcl) {
   String rest  = "";
        try {
                        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
 java.util.Date fecha = f.parse(fechar);
 java.sql.Date fechasql= (java.sql.Date) new Date(fecha.getTime()); 
 Cliente clie = clida.buscarXcodigo(codcl);
 Auto au = audao.buscarXPlaca(placa);
        Reserva res = new Reserva(0,fechasql,fechasql,clie,au);
     
  return rest = resdao.agregar(res);

 
        } catch (Exception e) {
           
        }
        
       return rest;
     

    }
    
    
}
