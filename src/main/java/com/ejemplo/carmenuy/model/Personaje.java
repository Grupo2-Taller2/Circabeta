/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.carmenuy.model;

public class Personaje {
    private String nombre;
    private String tipo;// Secuaz, Detective o Carmen Sandiego
    private Ubicacion ubicacionActual;
    private String habilidad;//especialidad del personaje 

    public Personaje(String nombre, String tipo, Ubicacion ubicacionActual, String habilidad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.ubicacionActual = ubicacionActual;
        this.habilidad = habilidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public Ubicacion getUbicacionActual() {
        return ubicacionActual;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setUbicacionActual(Ubicacion ubicacionActual) {
        this.ubicacionActual = ubicacionActual;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }
   
  
}
