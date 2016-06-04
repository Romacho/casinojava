/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruleta;

import java.awt.BorderLayout;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Romacho
 */
public class panelusuer extends javax.swing.JFrame {

    usuario usu;
    avatar ava;
    int contador = 0;
    Menu menu;
    reproductor musica;

    /**
     * Creates new form panelusuer
     */
    public panelusuer(usuario u, Menu m, reproductor rep) {
        initComponents();
        setLocationRelativeTo(null);
        fondouser fon = new fondouser();
        this.add(fon, BorderLayout.CENTER);
        this.pack();
        usu = u;
        menu = m;
        nick.setText(usu.getNick());
        musica = rep;
        
        switch (usu.getSeleccion().getCodigo()) {
                    case 1:
                        avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ruleta/avatar1.jpg")));

                        break;
                    case 2:
                        avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ruleta/avatarF2.png")));

                        break;
                    case 3:
                        avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ruleta/avatarF1.png")));
                        break;
                    case 4:
                        avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ruleta/avatarF3.png")));
                        break;
                    case 5:
                        avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ruleta/avatarF4.png")));
                        break;
                    case 6:
                        avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ruleta/avatarF5.png")));
                        break;
                    case 7:
                        avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ruleta/avatarF6.png")));
                        break;
                    case 8:
                        avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ruleta/avatarM1.png")));
                        break;
                    case 9:
                        avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ruleta/avatarM2.png")));
                        break;
                    case 10:
                        avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ruleta/avatarM3.png")));
                        break;
                    case 11:
                        avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ruleta/avatarM4.png")));
                        break;
                    case 12:
                        avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ruleta/avatarM5.png")));
                        break;
                    default:
                        avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ruleta/avatar1.jpg")));

                        break;
                };
        
        fichas.setText(String.valueOf(usu.getFichas()));
        for (int i = 0; i < usu.getAvatar().size(); i++) {

            ava = (avatar) usu.getAvatar().elementAt(i);
            cajavatares.addItem(ava.getNombre());

        }
        
    }

    private void cambiavatar() {
        for (int i = 0; i < usu.getAvatar().size(); i++) {
            ava = (avatar) usu.getAvatar().elementAt(i);
            if (ava.getNombre().equalsIgnoreCase((String) cajavatares.getSelectedItem())) {
                usu.setSeleccion(ava);
                switch (ava.getCodigo()) {
                    case 1:
                        avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ruleta/avatar1.jpg")));
                        break;
                    case 2:
                        avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ruleta/avatarF2.png")));
                        break;
                    case 3:
                        avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ruleta/avatarF1.png")));
                        break;
                    case 4:
                        avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ruleta/avatarF3.png")));
                        break;
                    case 5:
                        avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ruleta/avatarF4.png")));
                        break;
                    case 6:
                        avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ruleta/avatarF5.png")));
                        break;
                    case 7:
                        avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ruleta/avatarF6.png")));
                        break;
                    case 8:
                        avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ruleta/avatarM1.png")));
                        break;
                    case 9:
                        avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ruleta/avatarM2.png")));
                        break;
                    case 10:
                        avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ruleta/avatarM3.png")));
                        break;
                    case 11:
                        avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ruleta/avatarM4.png")));
                        break;
                    case 12:
                        avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ruleta/avatarM5.png")));
                        break;
                    default:
                        avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ruleta/avatar1.jpg")));
                        break;
                };
            }

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        avatar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nick = new javax.swing.JLabel();
        fichas = new javax.swing.JLabel();
        cajavatares = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        silencio = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Panel de usuario");
        setResizable(false);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                formFocusLost(evt);
            }
        });
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ruleta/avatar1.jpg"))); // NOI18N
        avatar.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nick:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Total de Fichas:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Avatares:");

        nick.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nick.setForeground(new java.awt.Color(255, 255, 153));
        nick.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nick.setText("nick");

        fichas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        fichas.setForeground(new java.awt.Color(255, 255, 153));
        fichas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        fichas.setText("fichas");

        cajavatares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajavataresActionPerformed(evt);
            }
        });
        cajavatares.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cajavataresPropertyChange(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ruleta/coin-icon.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ruleta/coiniconpress.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cambiar avatar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        silencio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ruleta/silenciar.png"))); // NOI18N
        silencio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silencioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(avatar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cajavatares, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 2, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fichas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(26, 26, 26)
                                .addComponent(nick, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(silencio)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(nick))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(fichas))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cajavatares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addGap(19, 19, 19)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(silencio)))
                        .addContainerGap())
                    .addComponent(avatar)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        contador++;
        if (contador %5 == 0) {
            usu.setFichas(usu.getFichas() + 1);
            fichas.setText(String.valueOf(usu.getFichas()));
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void formFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusLost
        // TODO add your handling code here:

    }//GEN-LAST:event_formFocusLost

    private void cajavataresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajavataresActionPerformed
        // TODO add your handling code here:
        

    }//GEN-LAST:event_cajavataresActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
        nick.setText(usu.getNick());
        fichas.setText(String.valueOf(usu.getFichas()));
    }//GEN-LAST:event_formFocusGained

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
        nick.setText(usu.getNick());
        fichas.setText(String.valueOf(usu.getFichas()));
    }//GEN-LAST:event_formWindowGainedFocus

    private void cajavataresPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cajavataresPropertyChange
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cajavataresPropertyChange

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        cambiavatar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        menu.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void silencioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silencioActionPerformed
        // TODO add your handling code here:
        if(!silencio.isSelected()){
            try {
                musica.Play();
            } catch (Exception ex) {
                Logger.getLogger(Log.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            try {
                musica.Stop();
            } catch (Exception ex) {
                Logger.getLogger(Log.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_silencioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel avatar;
    private javax.swing.JComboBox<String> cajavatares;
    private javax.swing.JLabel fichas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel nick;
    private javax.swing.JToggleButton silencio;
    // End of variables declaration//GEN-END:variables
}
