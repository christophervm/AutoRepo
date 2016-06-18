/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Reserva;

/**
 *
 * @author Administrador
 */
public interface ReservaDAO {
      public String agregar(Reserva res);
      public Reserva ReservaXCliente(int cliente);
      public List<Reserva> ReservasList(int cliente);
      public List<Reserva> ReservaEmp();
}
