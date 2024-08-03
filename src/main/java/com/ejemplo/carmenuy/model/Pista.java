package com.ejemplo.carmenuy.model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Pista {
    private int id;
    private String localidad;
    private String numero;
    private String descripcion;
    private  int esCorrecta;
    private int idL;

    public Pista(int id, String localidad, String numero, String descripcion, int esCorrecta, int idL) {
        this.id = id;
        this.localidad = localidad;
        this.numero = numero;
        this.descripcion = descripcion;
        this.esCorrecta = esCorrecta;
        this.idL = idL;
    }

    public int getId() {
        return id;
    }

    public String getLocalidad() {
        return localidad;
    }

    public String getNumero() {
        return numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getEsCorrecta() {
        return esCorrecta;
    }

    public int getIdL() {
        return idL;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setEsCorrecta(int esCorrecta) {
        this.esCorrecta = esCorrecta;
    }

    public void setIdL(int idL) {
        this.idL = idL;
    }
    

}
    
  