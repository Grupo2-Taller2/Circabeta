package com.ejemplo.carmenuy;

import com.ejemplo.carmenuy.ui.VentanaJuego;
import com.ejemplo.carmenuy.service.JuegoService;
import com.ejemplo.carmenuy.dao.PistaDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                Connection connection = DriverManager.getConnection("jdbc:sqlite:database.db");
                PistaDAO pistaDAO = new PistaDAO(connection);
                JuegoService juegoService = new JuegoService(pistaDAO);
                VentanaJuego ventana = new VentanaJuego(juegoService);
                ventana.setVisible(true);
            } catch (SQLException e) {
                LOGGER.log(Level.SEVERE, "Error al iniciar el juego", e);
            }
        });
    }
}
