/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoImpl;

import dao.AlquilerDAO;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Alquiler;
import model.Auto;
import model.Cliente;
import model.Reserva;
import util.BDConexion;

/**
 *
 * @author Administrador
 */
public class AlquilerDaoImpl implements AlquilerDAO{
Connection cn =BDConexion.getConexion();
ClienteDaoImpl clidao = new ClienteDaoImpl();
    AutoDaoImpl audao = new AutoDaoImpl();
    @Override
    public List<Alquiler> ListaAlquiler() {
      List<Alquiler> lstDistrito = new ArrayList<Alquiler>();
         Reserva res = null;
        try {
            String sql = "SELECT * FROM TBAlquiler";
            PreparedStatement pstm = cn.prepareStatement(sql);
            
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                int cod = rs.getInt(1);
                Date fechaini = rs.getDate(2);
                Date fechaent = rs.getDate(3);
                int codc = rs.getInt(4);
                String Placa = rs.getString(5);
                 Cliente client = clidao.buscarXcodigo(codc);
                Auto aut = audao.buscarXPlaca(Placa);
                
              Alquiler al = new Alquiler(cod,fechaini,fechaent,client,aut);

            lstDistrito.add(al);
            }
            
            
        } catch (Exception e) {
            
        }
        return lstDistrito;        
        
        
    }

    @Override
    public String Entregar(String placa,int codigo) {
 
       String res = "";
        try {
            //LLAMAR AL PROCEDIMIENTO ALMACENADO
            String sql  ="{call sp_RegiEntrega(?,?)}";
            CallableStatement cs = cn.prepareCall(sql);
           cs.setString(1,placa);
           cs.setInt(2,codigo);
            cs.executeUpdate();
            res = "ENTREGA REALIZADA CORRECTAMENTE";
            
        } catch (Exception e) {
            res =e.toString();
        }
        return res;   
        
        
        
        
    }

    @Override
    public List<Alquiler> ListaAlquilerNoEnt() {
    
        List<Alquiler> lstDistrito = new ArrayList<Alquiler>();
         Reserva res = null;
        try {
            String sql = "SELECT * FROM TBAlquiler where FechaEntrega=null";
            PreparedStatement pstm = cn.prepareStatement(sql);
            
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                int cod = rs.getInt(1);
                Date fechaini = rs.getDate(2);
                Date fechaent = rs.getDate(3);
                int codc = rs.getInt(4);
                String Placa = rs.getString(5);
                 Cliente client = clidao.buscarXcodigo(codc);
                Auto aut = audao.buscarXPlaca(Placa);
                
              Alquiler al = new Alquiler(cod,fechaini,fechaent,client,aut);

            lstDistrito.add(al);
            }
            
            
        } catch (Exception e) {
            
        }
        return lstDistrito;        
        
    }

    @Override
    public String agregar(Alquiler res) {   
               String rest = "";
        try {
            //LLAMAR AL PROCEDIMIENTO ALMACENADO
            String sql  ="{call sp_RegiAlquiler(?,?)}";
            CallableStatement ps = cn.prepareCall(sql);
            ps.setInt(1,res.getClie().getCodigo());
            ps.setString(2,res.getPlaca().getPlaca());
            ps.executeUpdate();
            rest = "ALQUILER REALIZADO CORRECTAMENTE";
            
        } catch (Exception e) {
            rest =e.toString();
        }
        return rest;
        
        
    }
    
}
