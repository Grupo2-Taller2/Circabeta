package com.ejemplo.carmenuy.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import com.ejemplo.carmenuy.database.ConexionSQLite;
import java.io.InputStreamReader;

public class SQLiteService {

    private static SQLiteService instancia;

    private SQLiteService() {
    }

    // Singleton
    public static SQLiteService obtenerInstancia() {
        if (instancia == null) {
            instancia = new SQLiteService();
        }
        return instancia;
    }

    public void crearBaseDeDatos(String rutaDelArchivo) throws SQLException {

        // se crea una conexión y un lector de archivos para intentar ejecutar las consultas
        // si no puede realizar las consultas, entonces ambos recursos se cierran (try with resources - intentar con recursos)
        // el try with resources se encarga de cerrar los recursos al finalizarse la ejecucin del metodo
        try (Connection conexion = ConexionSQLite.conectar(); 
                BufferedReader lector = new BufferedReader(new InputStreamReader(getClass().getClassLoader().getResourceAsStream(rutaDelArchivo)))) {

            String linea; // almacena cada línea que va leyendo el lector
            StringBuilder sql = new StringBuilder(); // almacena una consulta SQL completa

            while ((linea = lector.readLine()) != null) { // mientras existan líneas en el archivo
                sql.append(linea); // se agrega la línea a la consulta

                if (linea.trim().endsWith(";")) { // si la línea actual termina en ; (es el fin de la consulta)

                    try (Statement sentencia = conexion.createStatement()) { // se crea una sentencia y se intenta ejecutar
                        sentencia.execute(sql.toString());

                    } catch (SQLException e) { // si la ejecución falla se muestra el error
                        System.out.println("Error ejecutando la consulta SQL: " + e.getMessage());
                    }
                    sql = new StringBuilder(); // se vacía el String sql para cargar una nueva consulta en la próxima iteración
                }
            }
        } catch (IOException | SQLException e) { // si no logra conectarse con la base de datos, muestra el error
            System.out.println("Error: " + e.getMessage());
        }
    }
}
