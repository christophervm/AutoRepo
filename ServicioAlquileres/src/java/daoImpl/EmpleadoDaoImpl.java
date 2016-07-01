/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoImpl;

import dao.EmpleadoDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Cliente;
import model.Empleado;
import model.Usuario;
import util.BDConexion;

/**
 *
 * @author Administrador
 */
public class EmpleadoDaoImpl implements EmpleadoDAO{
Connection cn =BDConexion.getConexion();
UsuarioDaoImpl usrdao = new UsuarioDaoImpl();
    @Override
    public Empleado buscarXusr(String nomb) {
        Empleado emp = null;
        try {
            String sql = "SELECT * FROM TBEmpleado WHERE CodUsuario = ?";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, nomb);
            
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                String cod = rs.getString(1);
                String nombre = rs.getString(2);
                String apell = rs.getString(3);
                String dni = rs.getString(4);
                double suel = rs.getDouble(5);
                String usr = rs.getString(6);
               
                
             Usuario usra = usrdao.buscarXnusr(usr);
                
                emp = new Empleado(cod,nombre,apell,dni,suel,usra);
            }
            
            
        } catch (Exception e) {
            
        }
        return emp;  
        
        
    }
    
}
