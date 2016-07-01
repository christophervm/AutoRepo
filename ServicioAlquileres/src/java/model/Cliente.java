/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Administrador
 */
public class Cliente {
    
    private int codigo;
    private String nombre;
    private String apellidos;
    private String dni;
    private String brevet;
    private String carnetEx;
    private Usuario usuario;

    public Cliente() {
    }

    public Cliente(int codigo, String nombre, String apellidos, String dni, String brevet, String carnetEx, Usuario usuario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.brevet = brevet;
        this.carnetEx = carnetEx;
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getBrevet() {
        return brevet;
    }

    public void setBrevet(String brevet) {
        this.brevet = brevet;
    }

    public String getCarnetEx() {
        return carnetEx;
    }

    public void setCarnetEx(String carnetEx) {
        this.carnetEx = carnetEx;
    }
    
    
}
