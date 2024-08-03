package com.ejemplo.carmenuy.model;

public class Localidad {
    private int id;
    private String nombre;
    private double latitud;
    private double longitud;
    private String descripcion;

    public Localidad() {
    }

    public Localidad(String nombre, double latitud, double longitud, String descripcion) {
        this.nombre = nombre;
        this.latitud = latitud;
        this.longitud = longitud;
        this.descripcion = descripcion;
    }

    public int getIdL() {
        return id;
    }

    public void setIdL(int id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public double getLatitud() {
        return latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
}
