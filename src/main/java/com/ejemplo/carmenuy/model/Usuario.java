package com.ejemplo.carmenuy.model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 32681391
 */
public class Usuario {

    private int id;
    private String nombre;
    private String apellido;
    private String nombreUsuario;
    private String contrasena;
    private String rango;
    private int captura;
    private String progreso;

    public Usuario(int id, String nombre, String apellido, String nombreUsuario, String contrasena, String rango, int captura, String progreso) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.rango = rango;
        this.captura = captura;
        this.progreso = progreso;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getRango() {
        return rango;
    }

    public int getCaptura() {
        return captura;
    }

    public String getProgreso() {
        return progreso;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public void setCaptura(int captura) {
        this.captura = captura;
    }

    public void setProgreso(String progreso) {
        this.progreso = progreso;
    }

}
