/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoImpl;

import dao.AutoDAO;
import java.sql.CallableStatement;
import java.util.ArrayList;
import java.util.List;
import model.Auto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Modelo;
import util.BDConexion;

/**
 *
 * @author Administrador
 */
public class AutoDaoImpl implements AutoDAO{
Connection cn =BDConexion.getConexion();
    ModeloDaoImpl modao = new ModeloDaoImpl();
    
    @Override
    public List<Auto> listardisponibles() {
      List<Auto> lstDepas= new ArrayList<Auto>();
        try {
            String sql = "SELECT * FROM TBAuto WHERE Estado = 'DISPONIBLE'";
            PreparedStatement pstm = cn.prepareStatement(sql);
            
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                String placa = rs.getString(1);
                int modelo = rs.getInt(2);
                String nombre = rs.getString(3);
                double precio = rs.getDouble(4);
                String estado = rs.getString(5);
                
                Modelo mod = modao.buscarXcod(modelo);
                Auto au = new Auto (placa,mod,nombre,precio,estado);
               lstDepas.add(au);
            }
            
            
        } catch (Exception e) {
            
        }
        return lstDepas;
    }

    @Override
    public Auto buscarXPlaca(String placa) {
       Auto au = null;
        try {
            String sql = "SELECT * FROM TBAuto WHERE Placa = ?";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, placa);
            
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                String plac = rs.getString(1);
                int mod= rs.getInt(2);
                String nombre = rs.getString(3);
                double precio = rs.getDouble(4);
                String estado = rs.getString(5);
             
                  Modelo mode = modao.buscarXcod(mod);
                au = new Auto (placa,mode,nombre,precio,estado);
            }
            
            
        } catch (Exception e) {
            
        }
        return au;  
        
        
    }


    
    
}
