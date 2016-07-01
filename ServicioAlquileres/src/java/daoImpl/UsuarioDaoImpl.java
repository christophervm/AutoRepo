/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoImpl;

import dao.UsuarioDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Empleado;
import model.Marca;
import model.Usuario;
import util.BDConexion;

/**
 *
 * @author Administrador
 */
public class UsuarioDaoImpl implements UsuarioDAO{
Connection cn =BDConexion.getConexion();

    @Override
    public Usuario buscarXnusr(String nom) {
          Usuario mar = null;
        try {
            String sql = "SELECT * FROM TBUsuario WHERE CodUsuario = ?";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1,nom);
            
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                String nomu = rs.getString(1);
                String passwd = rs.getString(2);
             
                
                mar = new Usuario(nomu,passwd);
            }
            
            
        } catch (Exception e) {
            
        }
        return mar;  
        
       
    }

    @Override
    public Usuario validar(String usr, String pass) {
    Usuario usu = null;
        try {
            String sql = "select * from TBUsuario where CodUsuario = ? and Clave = ?";
            
            PreparedStatement pstm = cn.prepareStatement(sql);  
pstm.setString(1,usr);
pstm.setString(2,pass);
            
            
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
            
                String nombreUsuario = rs.getString(1);
                String clave = rs.getString(2);

                
                usu = new Usuario(nombreUsuario,clave);
            }
            
        } catch (Exception e) {
        }
        return usu;    
        
        
    }

    @Override
    public String agregar(Usuario us) {
      String res = "";
        try {
            String sql = "insert into TBUsuario values(?,?)";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1,us.getNomusr());
            ps.setString(2, us.getPasswd());
            
            ps.executeUpdate();
            res = "Exito";
            
        } catch (Exception e) {
            res = "Error " + e;
        }

        return res;
    
    }
    
}
