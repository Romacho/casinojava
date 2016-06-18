package ruleta;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JComponent;

/**
 *
 * @author Romacho
 * @see ruleta.tragaperras_interfaz
 * @see ruleta.tragaperras_giro
 * @see ruleta.tragaperras_resultado
 *
 *
 *
 */
public class JFigura extends JComponent {

    private ImageIcon image = new ImageIcon(getClass().getResource("figuras.jpg"));
    private int y = 0;
    private Dimension d = new Dimension(100, 100);

    /**
     * Constructor de clase
     *
     * clase que recorre una imagen con todas las figuras para mostrar sólo una
     * a la vez
     *
     * - image la imagen con todas las figuras
     *
     * - y la posición en la que nos situamos dentro de la imagen
     *
     * - d el recorte que mostramos desde la posición y
     */
    public JFigura() {
        setSize(d);
        setPreferredSize(d);
        setVisible(true);
    }

    /**
     * Actualiza coordenada en Y
     */
    public void updateY(int value) {
        y = value;
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(image.getImage(), 0, y, 100, 400, this);
        g.dispose();
    }

}
