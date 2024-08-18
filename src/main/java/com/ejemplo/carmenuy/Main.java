package com.ejemplo.carmenuy;

import com.ejemplo.carmenuy.service.SQLiteService;
import com.ejemplo.carmenuy.service.UsuarioService;
import com.ejemplo.carmenuy.ui.rc.VLogin;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        // crea un servicio que creara la BD y las tablas si no existen 
        SQLiteService service = SQLiteService.obtenerInstancia();
        
        /// BORRAR!!! insertando usuarios
        UsuarioService usuarioService = new UsuarioService();
        usuarioService.insertarUsuario("pepe", "argento", "123", "junior", 0, "A");
        
        // intenta ejecutar las consultas y si no puede muestra el error 
        try {
            service.crearBaseDeDatos("db/crear_tablas.sql");
        } catch (SQLException e) {
            System.out.println("ERROR: No se pudo conectar con la base de datos :: " + e);
        }
        
        // crea la primer ventana del programa 
        
        VLogin.obtenerInstancia();

    }
}
