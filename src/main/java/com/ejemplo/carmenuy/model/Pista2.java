package com.ejemplo.carmenuy.model;

public class Pista2 {
    private int id;
    private int localidad;
    private String numero;
    private String descripcion;
    private boolean esCorrecta;

    public Pista2(int id, int localidadId, String numero, String descripcion, boolean esCorrecta) {
        this.id = id;
        this.localidad = localidadId;
        this.numero = numero;
        this.descripcion = descripcion;
        this.esCorrecta = esCorrecta;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLocalidad() {
        return localidad;
    }

    public void setLocalidad(int localidad) {
        this.localidad = localidad;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean esCorrecta() {
        return esCorrecta;
    }

    public void setEsCorrecta(boolean esCorrecta) {
        this.esCorrecta = esCorrecta;
    }
}
