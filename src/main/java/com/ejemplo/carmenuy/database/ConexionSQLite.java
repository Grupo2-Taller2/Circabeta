package com.ejemplo.carmenuy.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionSQLite {
    
    // ruta dónde se crea la base de datos (raíz del proyecto)
    // se indica la base de datos a la que queremos conectarnos (RC_DB.db)
    private static final String URL = "jdbc:sqlite:RC_DB.db";

    // método de conexión
    public static Connection conectar() {
        
        Connection conexion = null; // se crea un objeto para realizar la conexión
        try {
            conexion = DriverManager.getConnection(URL); // se conecta con la ruta especificada (si no existe, la crea)
            System.out.println("Se ha establecido la conexión con la Base de Datos.");
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return conexion;
    }
}
