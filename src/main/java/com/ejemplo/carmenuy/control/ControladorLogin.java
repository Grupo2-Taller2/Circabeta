package com.ejemplo.carmenuy.control;

import com.ejemplo.carmenuy.model.ModeloUsuario;
import com.ejemplo.carmenuy.model.UsuarioLogin;
import com.ejemplo.carmenuy.service.UsuarioService;
import com.ejemplo.carmenuy.ui.rc.RegistroCuenta;
import com.ejemplo.carmenuy.ui.rc.VLogin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.ejemplo.carmenuy.ui.rc.VBienvenida;
import com.ejemplo.carmenuy.ui.rc.VJuego2;
import java.util.List;
 

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
    private UsuarioService usuarioService;
    private RegistroCuenta registroCuenta;

    // constructor privado (evita usar el operador new)
    private ControladorLogin() {
        modeloUsuario = new ModeloUsuario(); // cargar los usuarios de la BD
        usuarioService = new UsuarioService();
    }

    // Singleton: cuando se crea el controlador, crean también las ventanas
    public static ControladorLogin obtenerInstancia() {
        if (instancia == null) { // si el controlador no existe lo crea
            instancia = new ControladorLogin(); // se instancia a si mismo
            crearVentanas(); // crea las ventanas con las que se va a comunicar
        }
        return instancia; // si el controlador ya existe lo retorna
    }

    // creación de las dependencias del controlador: las ventanas con las que interactúa
    private static void crearVentanas() {
        instancia.vistaLogin = VLogin.obtenerInstancia();
        instancia.vistaLogin.setVisible(true);
        instancia.vBienvenida = VBienvenida.obtenerInstancia();
        instancia.vBienvenida.setVisible(false);
        instancia.vJuego = VJuego2.obtenerInstancia();
        instancia.vJuego.setVisible(false);
        instancia.registroCuenta = RegistroCuenta.obtenerInstancia();
        instancia.registroCuenta.setVisible(false);
       
      // instancia.VentanaRegistro1 = setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) { // manejamos todos los eventos de ventana

        // Ventana LOGIN
        if (e.getSource() == vistaLogin.getjBtnIngresar()) { // si el evento fue generado por el botón getjBtnIngresar

            String nombreUsuario = vistaLogin.getTxtUser().getText();
            String pass = vistaLogin.getTxtPass().getText();
            UsuarioLogin usuario = new UsuarioLogin(nombreUsuario, pass);

            if (!verificarCredenciales(usuario)) {
                vistaLogin.mostrarMensaje("Nombre de usuario o contraseña incorrectos");
            } 

        }

        // Ventana BIENVENIDA
        if (e.getSource() == vBienvenida.getjBtn1IniciarJuego()) {
            vJuego.setEnabled(true);
            vJuego.setVisible(true);
            vBienvenida.dispose();
        }
        
        if (e.getSource() == vistaLogin.getjButReg()) {
            registroCuenta.setEnabled(true);
            registroCuenta.setVisible(true);
            vistaLogin.setVisible(false);            
        }
        
        if (e.getSource() == registroCuenta.getjBtnAceptar()) {
            String nombre = registroCuenta.getjTextNombre().getText();
            String apellido = registroCuenta.getjTextApellido().getText();
            char[] pass = registroCuenta.getjPasswordContraseña().getPassword();
            char[] repPass = registroCuenta.getjPasswordRepetirContra().getPassword();
            String ps = new String(pass);
            String repps = new String(repPass);
            if (ps.equals(repps)){
                UsuarioService usuarioSer = new UsuarioService();
                usuarioSer.insertarUsuario(nombre, apellido, ps, "junior", 0, "A");
                vistaLogin.setEnabled(true);
                vistaLogin.setVisible(true);
                registroCuenta.dispose(); 
            }else{
                registroCuenta.mostrarMensaje("Las contraseñas no coinciden");
            }
                       
        }

        // Ventana JUEGO
//        if (e.getSource() == )
    }

    // PASAR EL SERVICE
    private boolean verificarCredenciales(UsuarioLogin credenciales) {

        List<UsuarioLogin> listaUsuarios = usuarioService.obtenerUsuariosParaLogin();

        for (UsuarioLogin usuario : listaUsuarios) {

            if (usuario.getNombreUsuario().equals(credenciales.getNombreUsuario()) 
                    && usuario.getPass().equals(credenciales.getPass())) {

                vistaLogin.dispose(); // Cierra la ventana de login
                vBienvenida = VBienvenida.obtenerInstancia(); // Abre la ventana del juego
                vBienvenida.setEnabled(true); // habilitamos la ventana para acceder a sus elementos
                vBienvenida.setVisible(true); // la mostramos al usuario
                return true;

            }
        }
        return false;
    }

}
