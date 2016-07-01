/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author Administrador
 */
public class Alquiler {
      private int codigo;
    private Date fechares;
    private Date fechalim;
    private Cliente clie;
    private Auto placa;

    public Alquiler(int codigo, Date fechares, Date fechalim, Cliente clie, Auto placa) {
        this.codigo = codigo;
        this.fechares = fechares;
        this.fechalim = fechalim;
        this.clie = clie;
        this.placa = placa;
    }

    public Alquiler() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getFechares() {
        return fechares;
    }

    public void setFechares(Date fechares) {
        this.fechares = fechares;
    }

    public Date getFechalim() {
        return fechalim;
    }

    public void setFechalim(Date fechalim) {
        this.fechalim = fechalim;
    }

    public Cliente getClie() {
        return clie;
    }

    public void setClie(Cliente clie) {
        this.clie = clie;
    }

    public Auto getPlaca() {
        return placa;
    }

    public void setPlaca(Auto placa) {
        this.placa = placa;
    }
    
    
}
