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
public class Tienda extends javax.swing.JFrame {

    reproductor musica = new reproductor();
    usuario user;
    Menu menu;

    /**
     * Creates new form Tienda
     */
    public Tienda(usuario u, Menu m) {
        
        initComponents();
        fondotienda fon = new fondotienda();
        this.add(fon, BorderLayout.CENTER);
        this.pack();
        user = u;
        menu = m;
        nick.setText(user.getNick());
        fichas.setText(String.valueOf(user.getFichas()));
        actualizador();
        setLocationRelativeTo(null);

        
        
    }
    
    public void actualizador(){
        try {
            musica.AbrirFichero("src\\ruleta\\dineros.mp3");
        } catch (Exception ex) {
            Logger.getLogger(Tienda.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            musica.Play();
        } catch (Exception ex) {
            Logger.getLogger(Tienda.class.getName()).log(Level.SEVERE, null, ex);
        }
        user.escribeuser();
        if(user.tieneAvatar(3)){
            F1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ruleta/avatarvendido.png")));
            bf1.setEnabled(false);
        }
        if(user.tieneAvatar(4)){
            F2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ruleta/avatarvendido.png")));
            bf2.setEnabled(false);
        }
        if(user.tieneAvatar(5)){
            F3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ruleta/avatarvendido.png")));
            bf3.setEnabled(false);
        }
        if(user.tieneAvatar(6)){
            F4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ruleta/avatarvendido.png")));
            bf4.setEnabled(false);
        }
        if(user.tieneAvatar(7)){
            F5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ruleta/avatarvendido.png")));
            bf5.setEnabled(false);
        }
        if(user.tieneAvatar(10)){
            M1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ruleta/avatarvendido.png")));
            bm1.setEnabled(false);
        }
        if(user.tieneAvatar(8)){
            M2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ruleta/avatarvendido.png")));
            bm2.setEnabled(false);
        }
        if(user.tieneAvatar(12)){
            M3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ruleta/avatarvendido.png")));
            bm3.setEnabled(false);
        }
        if(user.tieneAvatar(11)){
            M4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ruleta/avatarvendido.png")));
            bm4.setEnabled(false);
        }
        if(user.tieneAvatar(9)){
            M5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ruleta/avatarvendido.png")));
            bm5.setEnabled(false);
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

        F4 = new javax.swing.JLabel();
        bf4 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nick = new javax.swing.JLabel();
        M4 = new javax.swing.JLabel();
        F5 = new javax.swing.JLabel();
        bm4 = new javax.swing.JButton();
        bf5 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        M5 = new javax.swing.JLabel();
        fichas = new javax.swing.JLabel();
        bm5 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        M1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        F1 = new javax.swing.JLabel();
        bf1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        F2 = new javax.swing.JLabel();
        bf2 = new javax.swing.JButton();
        bm1 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        M2 = new javax.swing.JLabel();
        bm2 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        M3 = new javax.swing.JLabel();
        bm3 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        F3 = new javax.swing.JLabel();
        bf3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
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

        F4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ruleta/avatarF5.png"))); // NOI18N

        bf4.setBackground(new java.awt.Color(51, 255, 51));
        bf4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        bf4.setText("COMPRAR");
        bf4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bf4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bf4ActionPerformed(evt);
            }
        });

        jLabel13.setText("Joven Moderna - 300 Fichas");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ruleta/user-icon.png"))); // NOI18N

        nick.setText("user");

        M4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ruleta/avatarM4.png"))); // NOI18N

        F5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ruleta/avatarF6.png"))); // NOI18N

        bm4.setBackground(new java.awt.Color(51, 255, 51));
        bm4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        bm4.setText("COMPRAR");
        bm4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bm4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bm4ActionPerformed(evt);
            }
        });

        bf5.setBackground(new java.awt.Color(51, 255, 51));
        bf5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        bf5.setText("COMPRAR");
        bf5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bf5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bf5ActionPerformed(evt);
            }
        });

        jLabel16.setText("Joven Moderno - 300 Fichas");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ruleta/coin-icon.png"))); // NOI18N

        M5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ruleta/avatarM2.png"))); // NOI18N

        fichas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        fichas.setText("fichas");

        bm5.setBackground(new java.awt.Color(51, 255, 51));
        bm5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        bm5.setText("COMPRAR");
        bm5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bm5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bm5ActionPerformed(evt);
            }
        });

        jLabel18.setText("Chico Estudiante - 100 Fichas");

        M1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ruleta/avatarM3.png"))); // NOI18N

        jLabel5.setText("Chica Estudiante - 100 Fichas");

        F1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ruleta/avatarF1.png"))); // NOI18N

        bf1.setBackground(new java.awt.Color(51, 255, 51));
        bf1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        bf1.setText("COMPRAR");
        bf1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bf1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Jugadora - 200 Fichas");

        F2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ruleta/avatarF3.png"))); // NOI18N

        bf2.setBackground(new java.awt.Color(51, 255, 51));
        bf2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        bf2.setText("COMPRAR");
        bf2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bf2ActionPerformed(evt);
            }
        });

        bm1.setBackground(new java.awt.Color(51, 255, 51));
        bm1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        bm1.setText("COMPRAR");
        bm1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bm1ActionPerformed(evt);
            }
        });

        jLabel20.setText("Jugador - 200 Fichas");

        M2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ruleta/avatarM1.png"))); // NOI18N

        bm2.setBackground(new java.awt.Color(51, 255, 51));
        bm2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        bm2.setText("COMPRAR");
        bm2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bm2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bm2ActionPerformed(evt);
            }
        });

        jLabel22.setText("Señor Extraño - 200 Fichas");

        M3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ruleta/avatarM5.png"))); // NOI18N

        bm3.setBackground(new java.awt.Color(51, 255, 51));
        bm3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        bm3.setText("COMPRAR");
        bm3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bm3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bm3ActionPerformed(evt);
            }
        });

        jLabel24.setText("Peinado Afro - 250 Fichas");

        jLabel9.setText("Colegiala - 200 Fichas");

        F3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ruleta/avatarF4.png"))); // NOI18N

        bf3.setBackground(new java.awt.Color(51, 255, 51));
        bf3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        bf3.setText("COMPRAR");
        bf3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bf3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bf3ActionPerformed(evt);
            }
        });

        jLabel11.setText("Moño alto - 250 Fichas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(bf1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(F1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(bf2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(F2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(bf3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(F3, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(bf4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(F4, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(bf5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(F5, javax.swing.GroupLayout.Alignment.LEADING))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(bm1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(M1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(bm2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(M2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(bm3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(M3, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel24)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(bm4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(M4, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(bm5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(M5, javax.swing.GroupLayout.Alignment.LEADING)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nick, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fichas, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(F4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bf4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(nick)
                                .addComponent(fichas))
                            .addComponent(jLabel1)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(F1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bf1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(F2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bf2))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(F3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bf3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(F5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bf5)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(M3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bm3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(M1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bm1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(M2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bm2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(M4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bm4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(M5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bm5)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
        nick.setText(user.getNick());
        fichas.setText(String.valueOf(user.getFichas()));
        actualizador();
    }//GEN-LAST:event_formWindowGainedFocus

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        menu.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void bf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bf1ActionPerformed
        // TODO add your handling code here:
        if(user.getFichas()>=100){
            user.setFichas(user.getFichas()-100);
            fichas.setText(String.valueOf(user.getFichas()));
            user.compraAvatar("Chica Estudiante",3);
            actualizador();
        }
    }//GEN-LAST:event_bf1ActionPerformed

    private void bf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bf2ActionPerformed
        // TODO add your handling code here:
        if(user.getFichas()>=200){
            user.setFichas(user.getFichas()-200);
            fichas.setText(String.valueOf(user.getFichas()));
            user.compraAvatar("Jugadora",4);
            actualizador();
        }
    }//GEN-LAST:event_bf2ActionPerformed

    private void bf3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bf3ActionPerformed
        // TODO add your handling code here:
        if(user.getFichas()>=200){
            user.setFichas(user.getFichas()-200);
            fichas.setText(String.valueOf(user.getFichas()));
            user.compraAvatar("Colegiala",5);
            actualizador();
        }
    }//GEN-LAST:event_bf3ActionPerformed

    private void bf4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bf4ActionPerformed
        // TODO add your handling code here:
        if(user.getFichas()>=250){
            user.setFichas(user.getFichas()-250);
            fichas.setText(String.valueOf(user.getFichas()));
            user.compraAvatar("Moño Alto",6);
            actualizador();
        }
    }//GEN-LAST:event_bf4ActionPerformed

    private void bf5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bf5ActionPerformed
        // TODO add your handling code here:
        if(user.getFichas()>=300){
            user.setFichas(user.getFichas()-300);
            fichas.setText(String.valueOf(user.getFichas()));
            user.compraAvatar("Joven Moderna",7);
            actualizador();
        }
    }//GEN-LAST:event_bf5ActionPerformed

    private void bm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bm1ActionPerformed
        // TODO add your handling code here:
        if(user.getFichas()>=100){
            user.setFichas(user.getFichas()-100);
            fichas.setText(String.valueOf(user.getFichas()));
            user.compraAvatar("Chico Estudiante",10);
            actualizador();
        }
    }//GEN-LAST:event_bm1ActionPerformed

    private void bm2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bm2ActionPerformed
        // TODO add your handling code here:
        if(user.getFichas()>=200){
            user.setFichas(user.getFichas()-200);
            fichas.setText(String.valueOf(user.getFichas()));
            user.compraAvatar("Jugador",8);
            actualizador();
        }
    }//GEN-LAST:event_bm2ActionPerformed

    private void bm3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bm3ActionPerformed
        // TODO add your handling code here:
        if(user.getFichas()>=200){
            user.setFichas(user.getFichas()-200);
            fichas.setText(String.valueOf(user.getFichas()));
            user.compraAvatar("Señor Extraño",12);
            actualizador();
        }
    }//GEN-LAST:event_bm3ActionPerformed

    private void bm4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bm4ActionPerformed
        // TODO add your handling code here:
        if(user.getFichas()>=250){
            user.setFichas(user.getFichas()-250);
            fichas.setText(String.valueOf(user.getFichas()));
            user.compraAvatar("Peinado Afro",11);
            actualizador();
        }
    }//GEN-LAST:event_bm4ActionPerformed

    private void bm5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bm5ActionPerformed
        // TODO add your handling code here:
        if(user.getFichas()>=300){
            user.setFichas(user.getFichas()-300);
            fichas.setText(String.valueOf(user.getFichas()));
            user.compraAvatar("Joven Moderno",9);
            actualizador();
        }
    }//GEN-LAST:event_bm5ActionPerformed

  
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel F1;
    private javax.swing.JLabel F2;
    private javax.swing.JLabel F3;
    private javax.swing.JLabel F4;
    private javax.swing.JLabel F5;
    private javax.swing.JLabel M1;
    private javax.swing.JLabel M2;
    private javax.swing.JLabel M3;
    private javax.swing.JLabel M4;
    private javax.swing.JLabel M5;
    private javax.swing.JButton bf1;
    private javax.swing.JButton bf2;
    private javax.swing.JButton bf3;
    private javax.swing.JButton bf4;
    private javax.swing.JButton bf5;
    private javax.swing.JButton bm1;
    private javax.swing.JButton bm2;
    private javax.swing.JButton bm3;
    private javax.swing.JButton bm4;
    private javax.swing.JButton bm5;
    private javax.swing.JLabel fichas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel nick;
    // End of variables declaration//GEN-END:variables
}
