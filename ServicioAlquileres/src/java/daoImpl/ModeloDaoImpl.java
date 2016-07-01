/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoImpl;

import dao.ModeloDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Marca;
import model.Modelo;
import util.BDConexion;

/**
 *
 * @author Administrador
 */
public class ModeloDaoImpl implements ModeloDAO{
Connection cn =BDConexion.getConexion();
MarcaDaoImpl mardao = new MarcaDaoImpl();
    @Override
    public Modelo buscarXcod(int cod) {
        Modelo mod = null;
        try {
            String sql = "SELECT * FROM TBModelo WHERE CodModelo = ?";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setInt(1, cod);
            
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                int cmodelo = rs.getInt(1);
                int cmarca = rs.getInt(2);
                String desc = rs.getString(3);
           
                Marca mar = mardao.buscarXcodigo(cmarca);
                mod = new Modelo(cmodelo,mar,desc);
            }
            
            
        } catch (Exception e) {
            
        }
        return mod; 
    
        
    }
    
}
