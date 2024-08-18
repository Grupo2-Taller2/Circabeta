package com.ejemplo.carmenuy.model;
// clase DTO con los cambios necesarios para loguearse (usuario y pass)
public class UsuarioLogin {

    private String nombreUsuario;
    private String pass;

    public UsuarioLogin(String nombreUsuario, String pass) {
        this.nombreUsuario = nombreUsuario;
        this.pass = pass;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
}
