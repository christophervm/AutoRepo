/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class BDConexion {
     public static Connection getConexion(){
        Connection cn= null;
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;DataBaseName=BDIntiTours;user=sa;password=123;");
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "ERROR AL CONECTAR","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        return cn;
    }
}
