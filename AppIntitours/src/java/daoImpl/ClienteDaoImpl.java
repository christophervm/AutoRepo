/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoImpl;

import dao.ClienteDAO;
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
import model.Usuario;
import util.BDConexion;


/**
 *
 * @author Administrador
 */
public class ClienteDaoImpl implements ClienteDAO{
Connection cn =BDConexion.getConexion();
UsuarioDaoImpl usrdao = new UsuarioDaoImpl();
    @Override
    public Cliente buscarXcodigo(int codigo) {
       
            Cliente cli = null;
        try {
            String sql = "SELECT * FROM TBCliente WHERE CodCliente = ?";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setInt(1, codigo);
            
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                int cod = rs.getInt(1);
                String nombre = rs.getString(2);
                String apell = rs.getString(3);
                String dni = rs.getString(4);
                String bre = rs.getString(5);
                String carn=rs.getString(6);
                String usr = rs.getString(7);
               
                
             Usuario usra = usrdao.buscarXnusr(usr);
                
                cli = new Cliente(cod,nombre,apell,dni,bre,carn,usra);
            }
            
            
        } catch (Exception e) {
            
        }
        return cli;  
        
        
        
    }

    @Override
    public Cliente buscarXusr(String nomb) {
          Cliente cli = null;
        try {
            String sql = "SELECT * FROM TBCliente WHERE CodUsuario = ?";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, nomb);
            
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                int cod = rs.getInt(1);
                String nombre = rs.getString(2);
                String apell = rs.getString(3);
                String dni = rs.getString(4);
                String bre = rs.getString(5);
                String carn=rs.getString(6);
                String usr = rs.getString(7);
               
                
             Usuario usra = usrdao.buscarXnusr(usr);
                
                cli = new Cliente(cod,nombre,apell,dni,bre,carn,usra);
            }
            
            
        } catch (Exception e) {
            
        }
        return cli;  
        
        
    }

    @Override
    public String agregar(Cliente cl) {
  String res = "";
        try {
            String sql = "insert into TBCliente values(?,?,?,?,?,?)";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1,cl.getNombre());
            ps.setString(2, cl.getApellidos());
            ps.setString(3,cl.getDni());
            ps.setString(4,cl.getBrevet());
            ps.setString(5,cl.getCarnetEx());
            ps.setString(6, cl.getUsuario().getNomusr());
            
            
            ps.executeUpdate();
            res = "Exito";
            
        } catch (Exception e) {
            res = "Error " + e;
        }

        return res;
        
        
        
    }

    @Override
    public List<Cliente> ListaCliente() {
      List<Cliente> lstDistrito = new ArrayList<Cliente>();
         Cliente cli = null;
        try {
            String sql = "SELECT * FROM TBCliente";
            PreparedStatement pstm = cn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                int cod = rs.getInt(1);
               String nombre = rs.getString(2);
                String apell = rs.getString(3);
               String dni = rs.getString(4);
               String brev = rs.getString(5);
               String carnt = rs.getString(6);
               
                
         cli = new Cliente(cod,nombre,apell,dni,brev,carnt,null);
               
            lstDistrito.add(cli);
            }
            
            
        } catch (Exception e) {
            
        }
        return lstDistrito;        
        
        
      
        
    }
    
}
