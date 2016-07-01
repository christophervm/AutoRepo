/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoImpl;

import dao.MarcaDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Marca;
import util.BDConexion;

/**
 *
 * @author Administrador
 */
public class MarcaDaoImpl implements MarcaDAO{
Connection cn =BDConexion.getConexion();
    @Override
    public Marca buscarXcodigo(int codigo) {
      Marca mar = null;
        try {
            String sql = "SELECT * FROM TBMarca WHERE CodMarca = ?";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setInt(1, codigo);
            
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                int codmodelo = rs.getInt(1);
                String desc = rs.getString(2);
             
                
                mar = new Marca(codmodelo,desc);
            }
            
            
        } catch (Exception e) {
            
        }
        return mar;  
        
    }
    
}
