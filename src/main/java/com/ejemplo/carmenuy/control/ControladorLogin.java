package com.ejemplo.carmenuy.control;

import com.ejemplo.carmenuy.database.DatabaseInitialization;
import com.ejemplo.carmenuy.model.ModeloUsuario;
import com.ejemplo.carmenuy.model.Usuario;
import com.ejemplo.carmenuy.ui.rc.VLogin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.ejemplo.carmenuy.ui.rc.VBienvenida;
import com.ejemplo.carmenuy.ui.VJuego2;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Paths;
import java.sql.Statement;
import java.util.stream.Collectors;

/**
 *
 * @author 32681391
 */
public class ControladorLogin implements ActionListener { // para poder escuchar los eventos

    // declaración de dependencias
    private static ControladorLogin instancia; // autoreferencia (singleton)
    private ModeloUsuario modeloUsuario;
    private VLogin vistaLogin;
    private VBienvenida vBienvenida;
    private VJuego2 vJuego;
    DatabaseInitialization connection; // el controlador tiene una instancia de la conexion (la unica de todo el oprograma)

    // constructor privado (evita usar el operador new)
    private ControladorLogin() {
        modeloUsuario = new ModeloUsuario(); // cargar los usuarios de la BD
        connection = new DatabaseInitialization(); // crea una conexion
        connection.getConnection(); // ejecuta la conexion
        // se obtiene la ruta absoluta del proyecto y luego se le concatena la ruta al archivo
        String projectPath = Paths.get("").toAbsolutePath().toString();
        String dbPath = projectPath + "\\src\\main\\resources\\db\\crear_tablas.sql";
        //String dbPath = projectPath + "\\db\\crear_tablas.sql";

        connection.ejecutarSqlScript();
       
    }
    

    // Singleton: cuando se crea el controlador, crea una ventana
    public static ControladorLogin obtenerInstancia() {
        if (instancia == null) { // si el controlador no existe lo crea
            instancia = new ControladorLogin(); // se instancia a si mismo
            instancia.vistaLogin = VLogin.obtenerInstancia(); // instancia la ventana que va a escuchar (dependencia)
            instancia.vistaLogin.setVisible(true);
            instancia.vBienvenida = VBienvenida.obtenerInstancia();
            instancia.vBienvenida.dispose();
            instancia.vJuego = VJuego2.obtenerInstancia();
            instancia.vJuego.dispose();
        }
        return instancia; // si el controlador ya existe lo retorna
    }

    @Override
    public void actionPerformed(ActionEvent e) { // manejamos todos los eventos de ventana

        // Ventana LOGIN
        if (e.getSource() == vistaLogin.getjBtnIngresar()) { // si el evento fue generado por el botón getjBtnIngresar

            // ### BORRAR datos de prueba ###
            Usuario usuarioPrueba = new Usuario(1, "Pepe", "Lopez", "superPepe", "123", "Novato", 1, "Nivel 1");
            modeloUsuario.getListaUsuarios().add(usuarioPrueba);
            
            
            verificarCredenciales();
        }

        // Ventana BIENVENIDA
        if (e.getSource() == vBienvenida.getjBtn1IniciarJuego()){
            vJuego.setEnabled(true);
//            vJuego.getContentPane().removeAll();
//            //vJuego.add(new MapaPanel());
//            vJuego.add(new MapaPanel2());
//            vJuego.revalidate();
//            vJuego.repaint();
            vJuego.setVisible(true);
            vBienvenida.dispose();
        }
        
        // Ventana JUEGO
//        if (e.getSource() == )

    }

    // al presionar el botón ingresar 
    private void verificarCredenciales() {

        String nombreUsuario = vistaLogin.getjTextFUsuario().getText();
        String contrasena = new String(vistaLogin.getjPrdFContraseña().getPassword());

        if (modeloUsuario.verificarCredenciales(nombreUsuario, contrasena)) {
            vistaLogin.dispose(); // Cierra la ventana de login
            vBienvenida = VBienvenida.obtenerInstancia(); // Abre la ventana del juego
            vBienvenida.setEnabled(true); // habilitamos la ventana para acceder a sus elementos
            vBienvenida.setVisible(true); // la mostramos al usuario
        } else {
            vistaLogin.mostrarMensaje("Nombre de usuario o contraseña incorrectos");
        }
    }
    
    // este mtodo hay que moverlo a un service
    public void ejecutarSqlScript(String filePath) {
        try {
            // Cargar el archivo SQL desde resources
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream(filePath);
            if (inputStream == null) {
                throw new IllegalArgumentException("Archivo SQL no encontrado: " + filePath);
            }

            // Leer el archivo SQL
            String sql = new BufferedReader(new InputStreamReader(inputStream)) // inputStream es URL 
                    .lines().collect(Collectors.joining("\n"));

            // Crear una declaración para ejecutar el SQL
            Statement statement = connection.createStatement();
            
            // Ejecutar el SQL
            statement.execute(sql);
            System.out.println("Script SQL ejecutado exitosamente.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
