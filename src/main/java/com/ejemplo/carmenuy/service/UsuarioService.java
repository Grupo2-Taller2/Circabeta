package com.ejemplo.carmenuy.service;

import com.ejemplo.carmenuy.database.ConexionSQLite;
import com.ejemplo.carmenuy.model.UsuarioLogin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class UsuarioService {
    
        // método para insertar un usuario
    public void insertarUsuario(String nombre, String apellido, String contrasena, String rango, int capturas, String progreso) {
        
        String sql = "INSERT INTO usuarios(nombre, apellido, contrasena, rango, capturas, progreso) VALUES(?, ?, ?, ?, ?, ?)";

        // PreparedStatement: crea la consulta en base a parmetros. Evita inyeccion SQL (controla la correcta forma de los datos)
        try (Connection conexion = ConexionSQLite.conectar(); 
                PreparedStatement sentencia = conexion.prepareStatement(sql)) {
            
            // asignar los valores a VALUES
            sentencia.setString(1, nombre);
            sentencia.setString(2, apellido);
            sentencia.setString(3, contrasena);
            sentencia.setString(4, rango);
            sentencia.setInt(5, capturas);
            sentencia.setString(6, progreso);
            
            sentencia.executeUpdate();
            
            System.out.println("Usuario insertado exitosamente.");
            
        } catch (SQLException e) {
            System.out.println("Error insertando usuario: " + e.getMessage());
        }
    }
    
       // método para obtener todos los usuarios
    public List<UsuarioLogin> obtenerUsuariosParaLogin() {
        
        List<UsuarioLogin> usuarios = new ArrayList<>(); // lista de usuarios que retorna el metodo
        String sql = "SELECT nombre, contrasena FROM usuarios"; // consulta

        try (Connection conexion = ConexionSQLite.conectar();
             PreparedStatement sentencia = conexion.prepareStatement(sql);
             ResultSet respuesta = sentencia.executeQuery()) {
            
            while (respuesta.next()) {
                String nombreUsuario = respuesta.getString("nombre");
                String pass = respuesta.getString("contrasena");
                
                UsuarioLogin usuario = new UsuarioLogin(nombreUsuario, pass);
                usuarios.add(usuario); // agregamos el usuario recuperado de la base a la lista
            }
            
        } catch (SQLException e) {
            System.out.println("Error fetching users: " + e.getMessage());
        }

        return usuarios; // retornamos los ususarios
    }
    
//    private static final Logger LOGGER = Logger.getLogger(UsuarioService.class.getName());
//    private final UsuarioDAO usuarioDAO;
//
//    public UsuarioService(Connection conexion) {
//        this.usuarioDAO = new UsuarioDAO(conexion);
//    }
//
//    public void registrarUsuario(Usuario usuario) throws SQLException {
//        if (usuarioDAO.obtenerUsuarioPorNombre(usuario.getNombre()) == null) {
//            usuarioDAO.insertarUsuario(usuario);
//            LOGGER.info("Usuario registrado: " + usuario.getNombre());
//        } else {
//            LOGGER.warning("El usuario ya existe: " + usuario.getNombre());
//        }
//    }
//
//    public Usuario obtenerUsuarioPorNombre(String nombre) throws SQLException {
//        return usuarioDAO.obtenerUsuarioPorNombre(nombre);
//    }
//
//    public void actualizarUsuario(Usuario usuario) throws SQLException {
//        usuarioDAO.actualizarUsuario(usuario);
//        LOGGER.info("Usuario actualizado: " + usuario.getNombre());
//    }
//
//    public void eliminarUsuario(int id) throws SQLException {
//        usuarioDAO.eliminarUsuario(id);
//        LOGGER.info("Usuario eliminado con ID: " + id);
//    }
}
