/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruleta;

import java.awt.Color;
import java.awt.Image;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SwingWorker;

/**
 *
 * @author Romacho
 */
public class tragaperras_resultado extends SwingWorker<Boolean, Void> {

    private JLabel label;
    JLabel mul1,mul2,mul3, fichas, premi;
    private JTextField credito;
    private JTextField apuesta;
    private JLabel boton;
    SwingWorker swingWorkerA;
    SwingWorker swingWorkerB;
    SwingWorker swingWorkerC;
    JButton btn;
    JSpinner aps;
    usuario user;
    int premio=0;
    /**
     * Constructor de clase
     *
     * tragaperras_resultado(SwingWorker a, SwingWorker b, SwingWorker c, JLabel
     * lb,JTextField cr, JTextField ap, JLabel btn) { this.swingWorkerA=a;
     * this.swingWorkerB=b; this.swingWorkerC=c; label = lb; credito = cr;
     * apuesta = ap; boton = btn;
    }
     */
    tragaperras_resultado(SwingWorker a, SwingWorker b, SwingWorker c, JButton bt, JLabel m1, JLabel m2, JLabel m3, JSpinner ap,
            usuario us, JLabel fich, JLabel prem) {
        this.swingWorkerA = a;
        this.swingWorkerB = b;
        this.swingWorkerC = c;
        btn = bt;
        mul1=m1;
        mul2=m2;
        mul3=m3;
        aps = ap;
        user = us;
        fichas = fich;
        premi = prem;

    }

    @Override
    protected Boolean doInBackground() throws Exception {

        int val1 = (Integer) swingWorkerA.get();
        int val2 = (Integer) swingWorkerB.get();
        int val3 = (Integer) swingWorkerC.get();
        System.out.println(val1 + " " + val2 + " " + val3);

        if (val1 == val2 && val2 == val3) {
            if(val1==-300){
                mul1.setEnabled(true);
                premio = Integer.parseInt(aps.getValue().toString())*2;
                premi.setText("¡Ganas "+premio+" fichas!");
                user.setFichas(user.getFichas()+premio);
                fichas.setText(String.valueOf(user.getFichas()));
            }
            if(val1==-100){
                mul2.setEnabled(true);
                premio = Integer.parseInt(aps.getValue().toString())*3;
                premi.setText("¡Ganas "+premio+" fichas!");
                user.setFichas(user.getFichas()+premio);
                fichas.setText(String.valueOf(user.getFichas()));
            }
            if(val1==-200){
                mul3.setEnabled(true);
                premio = Integer.parseInt(aps.getValue().toString())*4;
                premi.setText("¡Ganas "+premio+" fichas!");
                user.setFichas(user.getFichas()+premio);
                fichas.setText(String.valueOf(user.getFichas()));
            }
            return true;//gana
        } else {
            premi.setText("¡Prueba otra vez!");
            return false;//pierde
        }

    }

    @Override
    protected void done() {
        try {
            //segun resultado de juego actualiza interfaz
            if (get()) {

            } else {

            }
            Image img = ImageIO.read(getClass().getResource("PALANCARRIBA.png"));
            btn.setIcon(new ImageIcon(img));
            btn.setEnabled(true);
            aps.setEnabled(true);
        } catch (InterruptedException ex) {
            System.err.println("InterruptedException: " + ex.getMessage());
        } catch (ExecutionException ex) {
            System.err.println("ExecutionException: " + ex.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(tragaperras_resultado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
