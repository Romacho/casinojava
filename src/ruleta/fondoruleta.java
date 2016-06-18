/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruleta;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Romacho 
 * @see ruleta.ruleta_interfaz
 */
public class fondoruleta extends javax.swing.JPanel {

    /**
     * Constructor de la clase
     * 
     * Clase que contiene el fondo de la aplicación de la ruleta
     */
    public fondoruleta() {
        this.setSize(535, 342);
        Icon imgBoton = new ImageIcon(getClass().getResource("fondoruleta.jpg"));

    }

    /**
     * Aplica el fondo dado
     *
     * @param g
     */
    public void paintComponent(Graphics g) {
        Dimension tam = getSize();
        ImageIcon imagenFondo = new ImageIcon(getClass().getResource("fondoruleta.jpg"));
        g.drawImage(imagenFondo.getImage(), 0, 0, tam.width, tam.height, null);
        setOpaque(false);
        super.paintComponent(g);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
