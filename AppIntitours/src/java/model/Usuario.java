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
public class Usuario {
    private String nomusr;
    private String passwd;

    public Usuario() {
    }

    public Usuario(String nomusr, String passwd) {
        this.nomusr = nomusr;
        this.passwd = passwd;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getNomusr() {
        return nomusr;
    }

    public void setNomusr(String nomusr) {
        this.nomusr = nomusr;
    }
    
}
