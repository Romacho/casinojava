/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruleta;

import java.awt.BorderLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author Romacho
 *
 * @see ruleta.usuario
 *
 * @see ruleta.Baraja
 *
 *
 * @see ruleta.Mano
 *
 *
 * @see ruleta.reproductor
 *
 * @see ruleta.Baraja
 * @see ruleta.Mano
 * @see ruleta.Carta
 * @see ruleta.JFigura
 *
 */
public class blackjack extends javax.swing.JFrame {

    /**
     * Enteros necesarios para el cálculo de variables durante cada partida
     */
    int i, accion = 0, resultado = 1, resultadobanca = 1;

    /**
     * Booleanos utilizados en los cálculos de las partidas
     */
    boolean primera = true;
    boolean bancarrota = false;
    boolean fin = false;

    usuario user;
    DefaultListModel modelo = new DefaultListModel();
    Baraja baraja = new Baraja();

    Mano manoJugador;
    Mano manoBanca;
    Menu menu;
    reproductor sonido = new reproductor();
    reproductor perdida = new reproductor();

    /**
     * Constructor de la clase
     *
     * Clase principal del juego del BlackJack 21
     *
     * - modelo modelo que contiene las cartas en la mano del usuario
     *
     * - baraja baraja con la que se jugará la partida
     *
     * - manoJugador y manoBanca, contienen las cartas que van robando el
     * jugador y la banca en cada partida
     *
     * - user usuario
     *
     * - sonido reproductor encargado de lanzar los efectos de sonido
     */
    public blackjack(usuario u, Menu m) {

        initComponents();
        user = u;
        setTitle("21 BLACKJACK ROMACHO");
        fichas.setText(String.valueOf(user.getFichas()));
        nick.setText(user.getNick());
        manoJugador = new Mano();
        menu = m;
        setLocationRelativeTo(null);
        fondoblackjack fon = new fondoblackjack();
        this.add(fon, BorderLayout.CENTER);
        this.pack();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nick = new javax.swing.JLabel();
        fichas = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cartasActuales = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        puntos = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        apostar = new javax.swing.JSpinner();
        jugar = new javax.swing.JButton();
        robar = new javax.swing.JButton();
        plantarse = new javax.swing.JButton();
        pregunta = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        mensajes = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        msgia = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ruleta/user-icon.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ruleta/coin-icon.png"))); // NOI18N

        nick.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nick.setForeground(new java.awt.Color(255, 255, 102));
        nick.setText("nick");

        fichas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        fichas.setForeground(new java.awt.Color(255, 255, 102));
        fichas.setText("fichas");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ruleta/iconomanocartas.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 102));
        jLabel6.setText("Tus cartas:");

        cartasActuales.setFocusable(false);
        cartasActuales.setSelectionForeground(new java.awt.Color(51, 153, 255));
        jScrollPane1.setViewportView(cartasActuales);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 102));
        jLabel7.setText("Suma Total:");

        puntos.setBackground(new java.awt.Color(0, 0, 0));
        puntos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        puntos.setForeground(new java.awt.Color(255, 255, 102));
        puntos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        puntos.setText("Puntos");
        puntos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 204), new java.awt.Color(255, 255, 0), new java.awt.Color(153, 153, 0), new java.awt.Color(153, 153, 0)));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 102));
        jLabel9.setText("Apuesta:");

        apostar.setModel(new SpinnerNumberModel(0, 0, null, 1));
        apostar.setEditor(new javax.swing.JSpinner.NumberEditor(apostar, ""));

        jugar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jugar.setText("JUGAR");
        jugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugarActionPerformed(evt);
            }
        });

        robar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ruleta/robaricon.png"))); // NOI18N
        robar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        robar.setEnabled(false);
        robar.setMaximumSize(new java.awt.Dimension(75, 75));
        robar.setMinimumSize(new java.awt.Dimension(75, 75));
        robar.setPreferredSize(new java.awt.Dimension(75, 75));
        robar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                robarActionPerformed(evt);
            }
        });

        plantarse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ruleta/plantarse.png"))); // NOI18N
        plantarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plantarse.setEnabled(false);
        plantarse.setMaximumSize(new java.awt.Dimension(75, 75));
        plantarse.setMinimumSize(new java.awt.Dimension(75, 75));
        plantarse.setPreferredSize(new java.awt.Dimension(75, 75));
        plantarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plantarseActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 255, 51));
        jLabel4.setText("ROBAR CARTA");
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 255, 102), java.awt.Color.green));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("PLANTARSE");
        jLabel8.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 153, 153), new java.awt.Color(153, 0, 0)));

        mensajes.setColumns(20);
        mensajes.setRows(5);
        mensajes.setText("¡Hola!");
        jScrollPane2.setViewportView(mensajes);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ruleta/avatar1.jpg"))); // NOI18N

        msgia.setColumns(20);
        msgia.setRows(5);
        msgia.setText("¡Saludos!");
        jScrollPane3.setViewportView(msgia);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 255, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("TUS JUGADAS");
        jLabel10.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.green));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("RIVAL");
        jLabel11.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.red));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(puntos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(robar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(plantarse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(3, 3, 3))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(apostar, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jugar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fichas)
                                    .addComponent(nick))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(apostar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jugar))
                        .addGap(3, 3, 3)
                        .addComponent(jLabel11)
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(nick))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(fichas))
                        .addGap(145, 145, 145)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(puntos)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(robar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(plantarse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Coge las fichas apostadas, baraja la baraja de cartas y reparte las dos
     * primeras, calcula si alguno de los dos jugadores ha conseguido un
     * BlackJack en la primera mano, de ser así acaba la partida, reparte los
     * premios y resetea.
     *
     * @param evt
     */
    private void jugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugarActionPerformed
        // TODO add your handling code here:
        if (Integer.parseInt(apostar.getValue().toString()) <= user.getFichas()
                && user.getFichas() > 0 && Integer.parseInt(apostar.getValue().toString()) > 0) {
            user.escribeuser();

            try {
                sonido.AbrirFichero("src\\ruleta\\barajar.mp3");
                sonido.Play();
            } catch (Exception ex) {
                Logger.getLogger(blackjack.class.getName()).log(Level.SEVERE, null, ex);
            }

            manoJugador.setApuesta(Integer.parseInt(apostar.getValue().toString()));
            apostar.setEnabled(false);
            jugar.setEnabled(false);
            user.setFichas(user.getFichas() - Integer.parseInt(apostar.getValue().toString()));
            fichas.setText(String.valueOf(user.getFichas()));

            /**
             * Barajamos y repartimos*
             */
            baraja.barajar();

            /**
             * La banca roba sus cartas
             */
            manoBanca = new Mano();
            manoBanca.cogerCarta(baraja.robar());
            manoBanca.cogerCarta(baraja.robar());

            /**
             * En resultado almacenamos lo que ha hecho el jugador. 0 en un
             * principio, -1 si se pasa o pierde y 1 si gana. Pondremos un 2 en
             * caso de blackjack.
             */
            int i, j;

            /**
             * El jugador roba sus cartas
             */
            manoJugador.cogerCarta(baraja.robar());
            modelo.addElement(manoJugador.obtenerCarta(0));
            manoJugador.cogerCarta(baraja.robar());
            modelo.addElement(manoJugador.obtenerCarta(1));
            cartasActuales.setModel(modelo);
            puntos.setText(String.valueOf(manoJugador.getBlackjackValor()));

            /**
             * En caso de que el usuario consiga Blackjack (21 a la primera)
             * gana el doble de la apuesta y se acaba la ronda
             */
            if ((manoJugador.getBlackjackValor() == 21)) {
                msgia.setText(msgia.getText() + "\n" + "La banca tiene "
                        + manoBanca.obtenerCarta(0)
                        + " y " + manoBanca.obtenerCarta(1) + ".");
                mensajes.setText(mensajes.getText() + "\n" + "El jugador " + " tiene "
                        + manoJugador.obtenerCarta(0)
                        + " y " + manoJugador.obtenerCarta(1) + ".");
                mensajes.setText(mensajes.getText() + "\n" + "El jugador " + " tiene Blackjack y gana");
                try {
                    sonido.AbrirFichero("src\\ruleta\\win.mp3");
                    sonido.Play();
                } catch (Exception ex) {
                    Logger.getLogger(blackjack.class.getName()).log(Level.SEVERE, null, ex);
                }

                resultado = 2;
                resultadobanca = 0;
                fin = true;
            }

            /**
             * En caso de que la banca consiga Blackjack (21 a la primera) gana
             * el doble de la apuesta y se acaba la ronda
             */
            if ((manoBanca.getBlackjackValor() == 21)) {
                try {
                    sonido.AbrirFichero("src\\ruleta\\lose.mp3");
                    sonido.Play();
                } catch (Exception ex) {
                    Logger.getLogger(blackjack.class.getName()).log(Level.SEVERE, null, ex);
                }
                msgia.setText(msgia.getText() + "\n" + "La banca tiene "
                        + manoBanca.obtenerCarta(0)
                        + " y " + manoBanca.obtenerCarta(1) + ".");
                mensajes.setText(mensajes.getText() + "\n" + "El jugador " + " tiene "
                        + manoJugador.obtenerCarta(0)
                        + " y " + manoJugador.obtenerCarta(1) + ".");
                msgia.setText(mensajes.getText() + "\n" + "La Banca " + " tiene Blackjack y gana");
                resultado = 0;
                resultadobanca = 2;
                fin = true;

            }
            if (fin == false) {
                /**
                 * Mostramos una de las cartas de la banca
                 */
                msgia.setText(msgia.getText() + "\n" + "La Banca te muestra una carta: " + manoBanca.obtenerCarta(0));

                /**
                 * Preguntamos al usuario qué quiere hacer
                 */
                mensajes.setText(mensajes.getText() + "\n" + "¿Qué quieres hacer?");

                robar.setEnabled(true);
                plantarse.setEnabled(true);
            } else {
                /**
                 * Reseteamos los valores iniciales para la siguiente partida
                 */
                msgia.setText(msgia.getText() + "\n" + "¿Quieres jugar otra partida?");
                user.escribeuser();
                bancarrota = false;
                jugar.setEnabled(true);
                modelo.clear();
                apostar.setEnabled(true);
                manoBanca.soltar();
                manoJugador.soltar();
                fin = false;
            }

        }
    }//GEN-LAST:event_jugarActionPerformed

    /**
     * Roba una nueva carta para la mano del jugador, recalcula la puntuación,
     * acaba la partida y resetea si el usuario se pasa de 21, de no ser así
     * comienza el turno de la Banca, que calcula sus opciones con la
     * información de la que dispone y decide si robar otra carta más o no antes
     * de devolver el turno al jugador.
     *
     * @param evt
     */
    private void robarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_robarActionPerformed
        robar.setEnabled(false);
        plantarse.setEnabled(false);
        try {
            sonido.AbrirFichero("src\\ruleta\\robar.mp3");
            sonido.Play();
        } catch (Exception ex) {
            Logger.getLogger(blackjack.class.getName()).log(Level.SEVERE, null, ex);
        }

        Carta newCarta = baraja.robar();
        manoJugador.cogerCarta(newCarta);

        mensajes.setText(mensajes.getText() + "\n" + "Robas una carta.");
        mensajes.setText(mensajes.getText() + "\n" + "Has robado: " + newCarta);
        modelo.addElement(newCarta);
        mensajes.setText(mensajes.getText() + "\n" + "Tienes "
                + manoJugador.getBlackjackValor() + " puntos");
        puntos.setText(String.valueOf(manoJugador.getBlackjackValor()));
        /**
         * Si nos pasamos acaba la partida y resetea
         */
        if (manoJugador.getBlackjackValor() > 21) {
            try {
                perdida.AbrirFichero("src\\ruleta\\lose.mp3");
                perdida.Play();
            } catch (Exception ex) {
                Logger.getLogger(blackjack.class.getName()).log(Level.SEVERE, null, ex);
            }
            mensajes.setText(mensajes.getText() + "\n" + "El jugador " + " se ha pasado de 21. Ha perdido");
            msgia.setText(msgia.getText() + "\n" + "¡Lo siento!");
            jugar.setEnabled(true);
            robar.setEnabled(false);
            plantarse.setEnabled(false);
            modelo.clear();
            bancarrota = true;

        }

        if (bancarrota == false) {
            msgia.setText(msgia.getText() + "\n" + "Ahora me toca jugar a mí.");
            while (true) {
                float beneficio = 0;
                float beneficio_hip = 0;
                float beneficio_aux = 0;
                float probabilidad = 0;
                /**
                 * Primero comprobamos el beneficio que obtendriamos en la
                 * situacion actual
                 */

                if (manoBanca.getBlackjackValor() >= manoJugador.getBlackjackValor()) {
                    beneficio = beneficio + manoJugador.apuesta;
                }

                /**
                 * Sabiendo las cartas que hay en la mesa calcularemos la
                 * esperanza de sacar cada una de las posibles cartas y en
                 * funcion de eso el beneficio hipotetico que obtendriamos.
                 */
                for (i = 1; i < 14; i++) {
                    Carta aux = new Carta(i, 0);
                    manoBanca.cogerCarta(aux);
                    probabilidad = baraja.vistas[i - 1] / baraja.restantes();
                    if (manoBanca.getBlackjackValor() >= manoJugador.getBlackjackValor()) {
                        beneficio_aux = beneficio_aux + manoJugador.apuesta;
                    }

                    beneficio_hip = beneficio_hip + beneficio_aux * 1;

                    beneficio_aux = 0;
                    manoBanca.dejarCarta(manoBanca.contar() - 1);

                }
                /**
                 * Si el beneficio hipotetico es mayor que el actual robamos
                 * carta
                 */
                if (beneficio_hip > beneficio
                        && (manoBanca.getBlackjackValor() < 13
                        || manoBanca.getBlackjackValor() < manoJugador.getBlackjackValor())) {
                    msgia.setText(msgia.getText() + "\n" + "Creo que tengo posibilidades de ganar");
                    Carta otraCarta = baraja.robar();
                    msgia.setText(msgia.getText() + "\n" + "La banca roba " + otraCarta);
                    manoBanca.cogerCarta(otraCarta);
                    if (manoBanca.getBlackjackValor() > 21) {
                        resultadobanca = 0;
                        break;
                    }
                } else {
                    msgia.setText(msgia.getText() + "\n" + "No voy a robar más cartas");
                    break;
                }
            }

            robar.setEnabled(true);
            plantarse.setEnabled(true);
        } else {
            /**
             * Reseteamos los valores iniciales para la siguiente partida
             */
            msgia.setText(msgia.getText() + "\n" + "¿Quieres jugar otra partida?");
            user.escribeuser();
            bancarrota = false;
            jugar.setEnabled(true);
            modelo.clear();
            apostar.setEnabled(true);
            manoBanca.soltar();
            manoJugador.soltar();
        }


    }//GEN-LAST:event_robarActionPerformed

    /**
     * Finaliza la partida, calcula la puntación del usuario y la de la banca,
     * reparte los premios y resetea el juego.
     *
     * @param evt
     */
    private void plantarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plantarseActionPerformed
        // TODO add your handling code here:
        robar.setEnabled(false);
        plantarse.setEnabled(false);
        mensajes.setText(mensajes.getText() + "\n" + "El Jugador se planta");
        msgia.setText(msgia.getText() + "\n" + "Ahora me toca jugar a mí.");
        while (true) {
            float beneficio = 0;
            float beneficio_hip = 0;
            float beneficio_aux = 0;
            float probabilidad = 0;
            /**
             * Primero comprobamos el beneficio que obtendriamos en la situacion
             * actual
             */

            if (manoBanca.getBlackjackValor() >= manoJugador.getBlackjackValor()) {
                beneficio = beneficio + manoJugador.apuesta;
            }

            /**
             * Sabiendo las cartas que hay en la mesa calcularemos la esperanza
             * de sacar cada una de las posibles cartas y en funcion de eso el
             * beneficio hipotetico que obtendriamos.
             */
            for (i = 1; i < 14; i++) {
                Carta aux = new Carta(i, 0);
                manoBanca.cogerCarta(aux);
                probabilidad = baraja.vistas[i - 1] / baraja.restantes();

                if (manoBanca.getBlackjackValor() >= manoJugador.getBlackjackValor()) {
                    beneficio_aux = beneficio_aux + manoJugador.apuesta;
                }

                beneficio_hip = beneficio_hip + beneficio_aux * probabilidad;
                beneficio_aux = 0;
                manoBanca.dejarCarta(manoBanca.contar() - 1);
            }
            /**
             * Si el beneficio hipotetico es mayor que el actual robamos carta
             */
            if (beneficio_hip > beneficio) {
                msgia.setText(msgia.getText() + "\n" + "Creo que tengo posibilidades de ganar");
                Carta otraCarta = baraja.robar();
                msgia.setText(msgia.getText() + "\n" + "La banca roba " + otraCarta);
                manoBanca.cogerCarta(otraCarta);
                if (manoBanca.getBlackjackValor() > 21) {
                    resultadobanca = 0;
                    break;
                }
            } else {
                msgia.setText(msgia.getText() + "\n" + "No voy a robar más cartas");
                break;
            }
        }
        /**
         * Analizamos los resultados y comunicamos el ganador
         */
        mensajes.setText(mensajes.getText() + "\n" + "Tienes un total de: " + manoJugador.getBlackjackValor() + " puntos");
        msgia.setText(msgia.getText() + "\n" + "La banca tiene un total de: " + manoBanca.getBlackjackValor() + " puntos");
        if (resultado == 0) {
            try {
                sonido.AbrirFichero("src\\ruleta\\lose.mp3");
                sonido.Play();
            } catch (Exception ex) {
                Logger.getLogger(blackjack.class.getName()).log(Level.SEVERE, null, ex);
            }
            mensajes.setText(mensajes.getText() + "\n" + "El Jugador ha perdido.");
            msgia.setText(msgia.getText() + "\n" + "¿Otra partida?");
            mensajes.setText(mensajes.getText() + "\n" + "Has perdido " + Integer.parseInt(apostar.getValue().toString()) + " fichas");
        }
        if (resultadobanca == 0) {
            try {
                sonido.AbrirFichero("src\\ruleta\\win.mp3");
                sonido.Play();
            } catch (Exception ex) {
                Logger.getLogger(blackjack.class.getName()).log(Level.SEVERE, null, ex);
            }
            msgia.setText(msgia.getText() + "\n" + "La Banca pierde.");
            user.setFichas(user.getFichas() + (Integer.parseInt(apostar.getValue().toString()) * 2));
            mensajes.setText(mensajes.getText() + "\n" + "Has ganado " + (Integer.parseInt(apostar.getValue().toString()) * 2) + " fichas");
            fichas.setText(String.valueOf(user.getFichas()));
            msgia.setText(msgia.getText() + "\n" + "¿Otra partida?");
        }
        if (resultado != 0 && resultadobanca != 0) {

            if (manoJugador.getBlackjackValor() >= manoBanca.getBlackjackValor()) {
                try {
                    sonido.AbrirFichero("src\\ruleta\\win.mp3");
                    sonido.Play();
                } catch (Exception ex) {
                    Logger.getLogger(blackjack.class.getName()).log(Level.SEVERE, null, ex);
                }
                msgia.setText(msgia.getText() + "\n" + "La Banca pierde.");
                user.setFichas(user.getFichas() + (Integer.parseInt(apostar.getValue().toString()) * 2));
                mensajes.setText(mensajes.getText() + "\n" + "Has ganado " + (Integer.parseInt(apostar.getValue().toString()) * 2) + " fichas");
                fichas.setText(String.valueOf(user.getFichas()));
                msgia.setText(msgia.getText() + "\n" + "¿Otra partida?");
            } else {
                try {
                    sonido.AbrirFichero("src\\ruleta\\lose.mp3");
                    sonido.Play();
                } catch (Exception ex) {
                    Logger.getLogger(blackjack.class.getName()).log(Level.SEVERE, null, ex);
                }
                mensajes.setText(mensajes.getText() + "\n" + "El Jugador ha perdido.");
                msgia.setText(msgia.getText() + "\n" + "¿Otra partida?");
                mensajes.setText(mensajes.getText() + "\n" + "Has perdido " + Integer.parseInt(apostar.getValue().toString()) + " fichas");
            }
        }

        /**
         * Reseteamos los valores iniciales para la siguiente partida
         */
        resultado = 1;
        resultadobanca = 1;
        jugar.setEnabled(true);
        puntos.setText("0");
        modelo.clear();
        bancarrota = false;
        manoBanca.soltar();
        manoJugador.soltar();
        apostar.setEnabled(true);


    }//GEN-LAST:event_plantarseActionPerformed

    /**
     * Actualiza la información del usuario cada vez que la ventana gana el foco
     *
     * @param evt
     */
    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
        nick.setText(user.getNick());
        fichas.setText(String.valueOf(user.getFichas()));
    }//GEN-LAST:event_formWindowGainedFocus

    /**
     * al cerrar la ventana nos devuelve al menú principal
     *
     * @see ruleta.Menu
     * @param evt
     */
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        menu.setVisible(true);
    }//GEN-LAST:event_formWindowClosed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner apostar;
    private javax.swing.JList<String> cartasActuales;
    private javax.swing.JLabel fichas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jugar;
    private javax.swing.JTextArea mensajes;
    private javax.swing.JTextArea msgia;
    private javax.swing.JLabel nick;
    private javax.swing.JButton plantarse;
    private javax.swing.JLabel pregunta;
    private javax.swing.JLabel puntos;
    private javax.swing.JButton robar;
    // End of variables declaration//GEN-END:variables
}
