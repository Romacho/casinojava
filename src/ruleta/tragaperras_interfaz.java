/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruleta;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import static jdk.nashorn.internal.objects.NativeDebug.getClass;

/**
 *
 * @author Romacho
 */
public class tragaperras_interfaz extends javax.swing.JDialog {
    JFigura jfa = new JFigura();
    JFigura jfb = new JFigura();
    JFigura jfc = new JFigura();
    usuario user;
    Menu menu;
    boolean press=false;

    /**
     * Creates new form tragaperras_interfaz
     */
    public tragaperras_interfaz(usuario u, Menu m) {
        super(new javax.swing.JFrame(), true);
        initComponents();
        setTitle("<BETA> Tragaperras Romacho ver 2.2");
        setLocationRelativeTo(null);
        panel1.add(jfa);
        panel2.add(jfb);
        panel3.add(jfc);
        user = u;
        menu = m;
        nick.setText(user.getNick());
        fichas.setText(String.valueOf(user.getFichas()));
        fondotragaperras fon = new fondotragaperras();
        this.add(fon, BorderLayout.CENTER);
        this.pack();
        repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        panel2 = new javax.swing.JPanel();
        panel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nick = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fichas = new javax.swing.JLabel();
        premio = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        palanca = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        apuesta = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        multi1 = new javax.swing.JLabel();
        multi2 = new javax.swing.JLabel();
        multi3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusCycleRoot(false);
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ruleta/user-icon.png"))); // NOI18N

        nick.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nick.setForeground(new java.awt.Color(255, 255, 102));
        nick.setText("user");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ruleta/coin-icon.png"))); // NOI18N

        fichas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        fichas.setForeground(new java.awt.Color(255, 255, 102));
        fichas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        fichas.setText("Numero");

        premio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        premio.setForeground(new java.awt.Color(255, 255, 102));
        premio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        premio.setText("0");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 102));
        jLabel6.setText("Premio:");

        palanca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ruleta/PALANCARRIBA.png"))); // NOI18N
        palanca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        palanca.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/ruleta/palancapabajo.png"))); // NOI18N
        palanca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                palancaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 102));
        jLabel7.setText("Apuesta:");

        apuesta.setModel(new SpinnerNumberModel(0, 0, null, 1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ruleta/tragatitulo.png"))); // NOI18N

        multi1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ruleta/multidos.png"))); // NOI18N
        multi1.setEnabled(false);

        multi2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ruleta/multitres.png"))); // NOI18N
        multi2.setEnabled(false);

        multi3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ruleta/multicuatro.png"))); // NOI18N
        multi3.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(multi1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(multi2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(multi3)
                            .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(palanca, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(nick))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(fichas))
                                .addComponent(jLabel7)
                                .addComponent(apuesta))
                            .addComponent(jLabel6)))
                    .addComponent(premio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(palanca, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(nick))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fichas)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(apuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(multi1)
                    .addComponent(multi2)
                    .addComponent(multi3)
                    .addComponent(premio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void palancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_palancaActionPerformed
        
        if(Integer.parseInt(apuesta.getValue().toString())<=user.getFichas() && user.getFichas()>0 && Integer.parseInt(apuesta.getValue().toString())>0){
             try {
            // TODO add your handling code here:
            multi1.setEnabled(false);
            multi2.setEnabled(false);
            multi3.setEnabled(false);
            user.setFichas(user.getFichas()-Integer.parseInt(apuesta.getValue().toString()));
            fichas.setText(String.valueOf(user.getFichas()));
            apuesta.setEnabled(false);
            Image img = ImageIO.read(getClass().getResource("palancapabajo.png"));
            palanca.setIcon(new ImageIcon(img));
            palanca.setEnabled(false);
            tragaperras_giro pwA = new tragaperras_giro(jfa);
            pwA.execute();

            tragaperras_giro pwB = new tragaperras_giro(jfb);
            pwB.execute();

            tragaperras_giro pwC = new tragaperras_giro(jfc);
            pwC.execute();

            tragaperras_resultado trg = new tragaperras_resultado(pwA,pwB,pwC, palanca, multi1,multi2,multi3,apuesta, user, fichas,premio);
            trg.execute();             
            
            
           
        } catch (IOException ex) {
            Logger.getLogger(tragaperras_interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
            
        }else if(user.getFichas()==0 || Integer.parseInt(apuesta.getValue().toString())==0){
            premio.setText("¡FICHAS INSUFICIENTES!");
        }
    }//GEN-LAST:event_palancaActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
        nick.setText(user.getNick());
        fichas.setText(String.valueOf(user.getFichas()));
    }//GEN-LAST:event_formWindowGainedFocus


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner apuesta;
    private javax.swing.JLabel fichas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel multi1;
    private javax.swing.JLabel multi2;
    private javax.swing.JLabel multi3;
    private javax.swing.JLabel nick;
    private javax.swing.JButton palanca;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel3;
    private javax.swing.JLabel premio;
    // End of variables declaration//GEN-END:variables
}
