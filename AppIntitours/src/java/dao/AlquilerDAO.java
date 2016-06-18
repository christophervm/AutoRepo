/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Alquiler;

/**
 *
 * @author Administrador
 */
public interface AlquilerDAO {
    public List<Alquiler> ListaAlquiler();
    public String Entregar(String placa,int codigo);
    public List<Alquiler> ListaAlquilerNoEnt();
    public String agregar(Alquiler res);
}
