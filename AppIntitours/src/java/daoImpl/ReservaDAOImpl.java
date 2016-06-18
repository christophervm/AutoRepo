/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoImpl;

import dao.ReservaDAO;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Auto;
import model.Cliente;
import model.Reserva;
import model.Usuario;
import util.BDConexion;

/**
 *
 * @author Administrador
 */
public class ReservaDAOImpl implements ReservaDAO{
Connection cn = BDConexion.getConexion();
ClienteDaoImpl clidao = new ClienteDaoImpl();
AutoDaoImpl audao = new AutoDaoImpl();
    @Override
    public String agregar(Reserva rese) {
         String res = "";
        try {
            //LLAMAR AL PROCEDIMIENTO ALMACENADO
            String sql  ="{call sp_RegReserva(?,?,?)}";
            CallableStatement cs = cn.prepareCall(sql);
           cs.setString(1,rese.getPlaca().getPlaca());
            cs.setDate(2,rese.getFechares());
           cs.setInt(3,rese.getClie().getCodigo());
            cs.executeUpdate();
            res = "RESERVA REALIZADA CORRECTAMENTE";
            
        } catch (Exception e) {
            res =e.toString();
        }
        return res;
        
    }

    @Override
    public Reserva ReservaXCliente(int cliente) {
     
             Reserva res = null;
        try {
            String sql = "SELECT * FROM TBReserva WHERE CodCliente = ?";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setInt(1, cliente);
            
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                int cod = rs.getInt(1);
                Date fechares = rs.getDate(2);
                Date fechalim = rs.getDate(3);
                int codc = rs.getInt(4);
                String Placa = rs.getString(5);
                
                Cliente client = clidao.buscarXcodigo(codc);
                Auto aut = audao.buscarXPlaca(Placa);
               res = new Reserva(cod,fechares,fechalim,client,aut);
            }
            
            
        } catch (Exception e) {
            
        }
        return res;  
        
    }

    @Override
    public List<Reserva> ReservasList(int cliente) {
     
    List<Reserva> lstDistrito = new ArrayList<Reserva>();
        try {
            PreparedStatement ps = cn.prepareStatement("select * from TBReserva where CodCliente = ?");
                     ps.setInt(1, cliente);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            int cod = rs.getInt(1);
                Date fechares = rs.getDate(2);
                Date fechalim = rs.getDate(3);
                int codc = rs.getInt(4);
                String Placa = rs.getString(5);
                
                Cliente client = clidao.buscarXcodigo(codc);
                Auto aut = audao.buscarXPlaca(Placa);
              Reserva res = new Reserva(cod,fechares,fechalim,client,aut);
            lstDistrito.add(res);
            
            
            
            }                                   
        } catch (Exception e) {
        }
        
    return lstDistrito;      
    }

    @Override
    public List<Reserva> ReservaEmp() {
    List<Reserva> lstDistrito = new ArrayList<Reserva>();
         Reserva res = null;
        try {
            String sql = "SELECT * FROM TBReserva";
            PreparedStatement pstm = cn.prepareStatement(sql);
            
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                int cod = rs.getInt(1);
                Date fechares = rs.getDate(2);
                Date fechalim = rs.getDate(3);
                int codc = rs.getInt(4);
                String Placa = rs.getString(5);
                
            Cliente client = clidao.buscarXcodigo(codc);
                Auto aut = audao.buscarXPlaca(Placa);
              Reserva rest = new Reserva(cod,fechares,fechalim,client,aut);
            lstDistrito.add(rest);
            }
            
            
        } catch (Exception e) {
            
        }
        return lstDistrito;      
        
        
        
    }
    
}
