/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author 32681391
 */
package com.ejemplo.carmenuy.model;

import java.util.ArrayList;
import java.util.List;

public class MapaDeUruguay {

    private List<Localidad> localidades;

    public MapaDeUruguay() {
        localidades = new ArrayList<>();
        // Agregar puntos de interés
        localidades.add(new Localidad("Montevideo", -34.9011, -56.1645, "Capital de Uruguay"));
        localidades.add(new Localidad("Punta del Este", -34.9614, -54.9511, "Famoso destino turístico"));
        // Agrega más puntos según sea necesario
    }

    public List<Localidad> getLocalidades() {
        return localidades;
    }
}
