package com.ejemplo.carmenuy.service;

import com.ejemplo.carmenuy.dao.PistaDAO;
import com.ejemplo.carmenuy.model.Pista;
import com.ejemplo.carmenuy.model.Localidad;
import com.ejemplo.carmenuy.model.Secuaz;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JuegoService {
    private static final Logger LOGGER = Logger.getLogger(JuegoService.class.getName());
    private final PistaDAO pistaDAO;
    private Localidad localidadActual;
    private Secuaz secuazActual;

    public JuegoService(PistaDAO pistaDAO) {
        this.pistaDAO = pistaDAO;
        // Inicializar secuazActual con un secuaz de prueba o uno aleatorio al inicio del juego
        this.secuazActual = new Secuaz("Secuaz de prueba", "Descripción del secuaz", 5);
    }

    public List<Pista> obtenerTresPistasAlAzar(Localidad localidad) {
        try {
            List<Pista> pistas = pistaDAO.obtenerPistasPorLocalidad(localidad.getNombre());
            Collections.shuffle(pistas);
            return pistas.subList(0, Math.min(3, pistas.size()));
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error al obtener pistas", e);
        }
        return Collections.emptyList();
    }

    public void manejarSeleccionPista(Pista pistaSeleccionada) {
        if (pistaSeleccionada.esCorrecta()) {
            hablar("¡Correcto! La pista es correcta.");
            // Lógica para avanzar en el juego
            avanzarLocalidad();
        } else {
            hablar("Lo siento, la pista es incorrecta.");
            // Lógica para manejar una pista incorrecta
        }
    }

    private void hablar(String mensaje) {
        // Implementación para hablar el mensaje
        System.out.println(mensaje);
    }

    public Localidad obtenerLocalidadActual() {
        // Retornar la localidad actual del detective
        return this.localidadActual;
    }

    public void setLocalidadActual(Localidad localidad) {
        this.localidadActual = localidad;
    }

    public String obtenerSecuazActual() {
        // Retornar la información del secuaz actual
        return secuazActual.getNombre() + ": " + secuazActual.getDescripcion();
    }

    private void avanzarLocalidad() {
        // Lógica para avanzar a la siguiente localidad
        // Aquí puedes actualizar la localidadActual y el secuazActual según sea necesario
        // Por ejemplo, seleccionar una nueva localidad y un nuevo secuaz
        Localidad nuevaLocalidad = obtenerNuevaLocalidad();
        setLocalidadActual(nuevaLocalidad);
        if (secuazActual.isCapturado()) {
            secuazActual = obtenerNuevoSecuaz();
        }
    }

    private Localidad obtenerNuevaLocalidad() {
        // Implementar la lógica para obtener una nueva localidad basada en la pista correcta
        // Esto puede incluir seleccionar una localidad aleatoria o basada en alguna lógica específica
        return new Localidad("Nueva Localidad", "Descripción de la nueva localidad", 0.0, 0.0);
    }

    private Secuaz obtenerNuevoSecuaz() {
        // Implementar la lógica para obtener un nuevo secuaz aleatorio
        return new Secuaz("Nuevo Secuaz", "Descripción del nuevo secuaz", 5);
    }
}
