package com.ejemplo.carmenuy.database;

import com.ejemplo.carmenuy.Main;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 * Clase para inicializar y conectar a la base de datos de Carmen Sandiego.
 */
public class DatabaseInitialization {
    private static final Logger logger = Logger.getLogger(DatabaseInitialization.class.getName());
    //private static final String URL = "jdbc:sqlite:C:\\carmen_sandiego.db";
    
    // se obtiene la ruta absoluta del proyecto y luego se le concatena la ruta al archivo
    String projectPath = Paths.get("").toAbsolutePath().toString();
    String dbPath = "C:/Users/20268919/Documents/Beta/Circabeta/base_prueba.db"; // OK
    String sqlPath = "C:/Users/20268919/Documents/Beta/Circabeta/src/main/resources/crear_tablas.sql";
    
    public DatabaseInitialization(){
        
    }
    /**
     * Establece la conexión con la base de datos.
     * @return una conexión a la base de datos.
     */
    public Connection getConnection() {
        try {
            // Cargar el driver de SQLite, si es necesario
            Class.forName("org.sqlite.JDBC");
            Connection connection = DriverManager.getConnection("jdbc:sqlite:" + dbPath);
            logger.log(Level.INFO, "Conexión establecida con la base de datos.");
            return connection;
        } catch (ClassNotFoundException e) {
            // el LOGGER es una herramienta para hacer tracking en el server
            // este programa no tienen server
            logger.log(Level.SEVERE, "No se encontró el driver de SQLite", e);
            throw new RuntimeException("Error al cargar el driver de SQLite", e);
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Error al conectar con la base de datos", e);
            throw new RuntimeException("Error al conectar con la base de datos", e);
        }
    }

    public Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
        // este mtodo hay que moverlo a un service
    public void ejecutarSqlScript() {
        
        try {
            // Cargar el archivo SQL desde resources
            InputStream inputStream = Main.class.getClassLoader().getResourceAsStream("crear_tablas.sql");
            if (inputStream == null) {
                throw new IllegalArgumentException("Archivo SQL no encontrado: " /*+ filePath*/);
            }

            // Leer el archivo SQL
            String sql = new BufferedReader(new InputStreamReader(inputStream)) // inputStream es URL 
                    .lines().collect(Collectors.joining("\n"));

            // Crear una conexin para ejecutar el SQL
            Connection connection = getConnection();
            // crear una sentencia
            Statement statement = connection.createStatement();
            // ejecutar la sentencia
            statement.execute(sql);

            System.out.println("Script SQL ejecutado exitosamente.");

        } catch (Exception e) {
            System.out.println("ERROR: no se pudo ejecutar el script :: " + e);
        }
    }

    /**
     * Método principal para verificar la conexión.
     */
//    public static void main(String[] args) {
//        Connection conn = getConnection();
//        if (conn != null) {
//            try {
//                conn.close();
//                logger.log(Level.INFO, "Conexión cerrada exitosamente.");
//            } catch (SQLException e) {
//                logger.log(Level.SEVERE, "Error al cerrar la conexión", e);
//            }
//        }
//    }
}
