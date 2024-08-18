package com.ejemplo.carmenuy.ui.rc;

import com.ejemplo.carmenuy.control.ControladorLogin;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author 32681391
 */
public class VLogin extends javax.swing.JFrame {

    private static VLogin instancia; // autoreferencia

    private ControladorLogin controlador;

    private JLabel jLbUsuario1;
    private JTextField txtUser;
    private JLabel jLbContraseña;
    private JPasswordField txtPass;
    private JLabel jLabIrReg;
    private JLabel jLabImagen;
    private JButton jBtnIngresar;
    private JLabel jLabInicioSesion;

    private VLogin() {
        initComponents();
        this.setLocationRelativeTo(null);
        jBtnIngresar.addActionListener(ControladorLogin.obtenerInstancia());
        // asignar oyente al botón. Se assigna el controlador mediante singleton
    }

    // SINGLETON (patrón de diseño)
    public static VLogin obtenerInstancia() {
        if (instancia == null) {
            instancia = new VLogin();
        }
        return instancia;
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLbContraseña = new javax.swing.JLabel();
        jLbUsuario1 = new javax.swing.JLabel();
        jBtnIngresar = new javax.swing.JButton();
        txtUser = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        jLabIrReg = new javax.swing.JLabel();
        jLabImagen = new javax.swing.JLabel();
        jLabInicioSesion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(204, 204, 204));

        jLbContraseña.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLbContraseña.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbContraseña.setText("Contraseña");

        jLbUsuario1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLbUsuario1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbUsuario1.setText("Usuario");
        jLbUsuario1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jBtnIngresar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jBtnIngresar.setText("Ingresar");
        jBtnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIngresarActionPerformed(evt);
            }
        });

        jLabIrReg.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabIrReg.setText("Registrate AQUÍ!");

        jLabInicioSesion.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabInicioSesion.setText("Inicio de Sesión");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLbUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLbContraseña))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUser)
                            .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(122, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabIrReg, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnIngresar)
                        .addGap(30, 30, 30))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
            .addGroup(layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(jLabInicioSesion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabInicioSesion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbUsuario1)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLbContraseña))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabIrReg)
                    .addComponent(jBtnIngresar))
                .addGap(116, 116, 116))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIngresarActionPerformed

    }//GEN-LAST:event_jBtnIngresarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VLogin().setVisible(true);

            }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnIngresar;
    private javax.swing.JLabel jLabImagen;
    private javax.swing.JLabel jLabInicioSesion;
    private javax.swing.JLabel jLabIrReg;
    private javax.swing.JLabel jLbContraseña;
    private javax.swing.JLabel jLbUsuario1;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
   });

    }

    public ControladorLogin getControlador() {
        return controlador;
    }

    public JLabel getjLbUsuario1() {
        return jLbUsuario1;
    }

    public JTextField getjTextFUsuario() {
        return txtUser;
    }

    public JLabel getjLbContraseña() {
        return jLbContraseña;
    }

    public JPasswordField getjPrdFContraseña() {
        return txtPass;
    }

    public JLabel getjLabIrReg() {
        return jLabIrReg;
    }

    public JLabel getjLabImagen() {
        return jLabImagen;
    }

    public JButton getjBtnIngresar() {
        return jBtnIngresar;
    }

    public JLabel getjLabInicioSesion() {
        return jLabInicioSesion;
    }

    public void getmostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }

    public void mostrarMensaje(String msj) {
        JOptionPane.showMessageDialog(null, msj);
    }

    public JTextField getTxtUser() {
        return txtUser;
    }

    public void setTxtUser(JTextField txtUser) {
        this.txtUser = txtUser;
    }

    public JPasswordField getTxtPass() {
        return txtPass;
    }

    public void setTxtPass(JPasswordField txtPass) {
        this.txtPass = txtPass;
    }
    
}
