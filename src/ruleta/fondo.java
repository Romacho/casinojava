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
 * 
 * @see ruleta.Log
 */
public class fondo extends javax.swing.JPanel {

    /**
     * Constructor de la clase
     * 
     * Clase que contiene el fondo de la ventana principal de Loggin
     */
    public fondo() {
        initComponents();
        this.setSize(492,348);
        Icon imgBoton = new ImageIcon(getClass().getResource("fondocasino3.jpg"));
        btnIngresar.setIcon(imgBoton);
        btnIngresar.setVisible(false);
    }
    
    
    
    public void paintComponent(Graphics g){
        Dimension tam = getSize();
        ImageIcon imagenFondo = new ImageIcon(getClass().getResource("fondocasino3.jpg"));
        g.drawImage(imagenFondo.getImage(),0,0, tam.width, tam.height, null);
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

        btnIngresar = new javax.swing.JButton();

        btnIngresar.setText("jButton1");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(btnIngresar)
                .addContainerGap(201, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(btnIngresar)
                .addContainerGap(196, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIngresarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    // End of variables declaration//GEN-END:variables
}
