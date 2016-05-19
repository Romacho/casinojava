package ruleta;


import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JComponent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Romacho
 */
public class JFigura extends JComponent {
    
    private ImageIcon image= new ImageIcon( getClass().getResource("figuras.jpg"));           
    private int y=0;
    private Dimension d = new Dimension(100,100);
    
    /** Constructor de clase */
    JFigura()
    {
        setSize(d);
        setPreferredSize(d);
        setVisible(true);
    }
    
    /** Actualiza coordenada en Y */
    public void updateY(int value)
    {
        y = value;
        repaint();
    }
    
    @Override
    public void paint (Graphics g){
        super.paint(g);
        g.drawImage(image.getImage(), 0, y, 100, 400, this);                
	g.dispose();
    }
 
}
