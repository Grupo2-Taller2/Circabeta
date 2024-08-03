package com.ejemplo.carmenuy.ui.rc;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author 
 */
public class ImagePaneUtil {
    
    public static void setPanelBackgroundImage(JPanel panel, String imagePath) {
        // Obtener la URL del recurso de la imagen
        java.net.URL imgURL = panel.getClass().getResource(imagePath);
        if (imgURL != null) {
            Image image = new ImageIcon(imgURL).getImage();
            
            // Crear un JPanel que sobrescribe el método paintComponent
            JPanel imagePanel = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    if (image != null) {
                        g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
                    }
                }
            };
            
            // Establecer el mismo layout que el panel original
            imagePanel.setLayout(panel.getLayout());
            
            // Remover todos los componentes del panel original y agregar el nuevo panel con la imagen
            panel.removeAll();
            panel.add(imagePanel);
            panel.revalidate();
            panel.repaint();
        } else {
            System.err.println("No se pudo encontrar la imagen en la ruta especificada: " + imagePath);
        }
    }
}
