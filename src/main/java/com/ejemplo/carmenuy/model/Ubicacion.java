/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.carmenuy.model;

/**
 *
 * @author 32681391
 */
public class Ubicacion {
   private String nombreU; 
   private String descripcion;
   
    public String getNombreU() {
        return nombreU;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Ubicacion(String nombreU, String descripcion) {
        this.nombreU = nombreU;
        this.descripcion = descripcion;
    }
  
}

