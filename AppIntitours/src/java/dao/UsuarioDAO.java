/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Empleado;
import model.Usuario;

/**
 *
 * @author Administrador
 */
public interface UsuarioDAO {
    public Usuario buscarXnusr(String nom);
    public Usuario validar (String usr,String pass);
    public String agregar(Usuario us);
  
}
