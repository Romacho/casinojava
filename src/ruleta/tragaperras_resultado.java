/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruleta;

import java.awt.Color;
import java.util.concurrent.ExecutionException;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingWorker;

/**
 *
 * @author Romacho
 */
public class tragaperras_resultado extends SwingWorker<Boolean, Void>{
    
    private JLabel label;
    private JTextField credito;
    private JTextField apuesta;
    private JLabel boton;
    SwingWorker swingWorkerA;
    SwingWorker swingWorkerB;
    SwingWorker swingWorkerC;
    
    /**
     * Constructor de clase
     
    tragaperras_resultado(SwingWorker a, SwingWorker b, SwingWorker c, JLabel lb,JTextField cr, JTextField ap, JLabel btn)
    {
        this.swingWorkerA=a;
        this.swingWorkerB=b;
        this.swingWorkerC=c;
        label = lb;
        credito = cr;
        apuesta = ap;
        boton = btn;
    }*/
    
    tragaperras_resultado(SwingWorker a, SwingWorker b, SwingWorker c)
    {
        this.swingWorkerA=a;
        this.swingWorkerB=b;
        this.swingWorkerC=c;
        
    }
    
    @Override
    protected Boolean doInBackground() throws Exception {
        
        int val1= (Integer) swingWorkerA.get(); 
        int val2= (Integer) swingWorkerB.get(); 
        int val3= (Integer) swingWorkerC.get();         
        if( val1==val2 && val2 == val3 )
        {            
            return true;//gana
        }        
        else
        {            
            return false;//pierde
        }        
    }
    /**
    @Override
    protected void done(){   
        try {
            //segun resultado de juego actualiza interfaz
            if( get() )
            {
                credito.setText( ""+(Integer.parseInt(credito.getText()) + Integer.parseInt(apuesta.getText())) );
                label.setForeground(Color.yellow);
                label.setText( "YOU WIN!" );                
            }
            else
            {
                credito.setText( ""+(Integer.parseInt(credito.getText()) - Integer.parseInt(apuesta.getText())) );
                label.setForeground(Color.red);
                label.setText( "YOU LOSE!" );                
            }           
            boton.setEnabled(true);
        } catch (InterruptedException ex) {
            System.err.println("InterruptedException: " + ex.getMessage());
        } catch (ExecutionException ex) {
            System.err.println("ExecutionException: " + ex.getMessage());
        }
    }**/
    
}
