/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ruleta;

import java.util.Vector;

/**
 *
 * @author Romacho
 *
 * @see ruleta.blackjack
 *
 *
 *
 */
public class Mano {

    private Vector mano;
    int apuesta;

    /**
     * Constructor Con esta clase vamos a representar las cartas que tiene un
     * jugador en cierta jugada y las fichas apostadas
     *
     * - mano: cartas en la mano (es un vector por que el número de cartas en
     * mano es variable)
     */
    public Mano() {
        mano = new Vector();
    }

    public void setApuesta(int i) {
        this.apuesta = i;
    }

    /**
     * Suelta todas las cartas
     */
    public void soltar() {
        mano.removeAllElements();
    }

    /**
     * Añade una carta a su mano
     *
     * @param c carta añadida
     * @see ruleta.Carta
     */
    public void cogerCarta(Carta c) {
        if (c != null) {
            mano.addElement(c);
        }
    }

    /**
     * Suelta una de sus cartas
     *
     * @param c carta soltada
     * @see ruleta.Carta
     */
    public void dejarCarta(Carta c) {
        mano.removeElement(c);
    }

    /**
     * Suelta la carta en la posicion marcada por pos
     *
     * @param pos
     */
    public void dejarCarta(int pos) {
        if (pos >= 0 && pos < mano.size()) {
            mano.removeElementAt(pos);
        }
    }
// Cuenta las cartas que tiene en la mano

    public int contar() {
        return mano.size();
    }

    /**
     * Nos dice la carta que tiene en la posicion pos
     *
     * @param pos
     * @return
     */
    public Carta obtenerCarta(int pos) {
        if (pos >= 0 && pos < mano.size()) {
            return (Carta) mano.elementAt(pos);
        } else {
            return null;
        }
    }

    /**
     * Cuenta los puntos que suman las cartas de nuestra mano
     *
     * @return
     */
    public int getBlackjackValor() {
        int val;
        boolean as;
        int cartas;
        val = 0;
        as = false;
        cartas = contar();
        for (int i = 0; i < cartas; i++) {
            Carta carta;
            int cartaVal;
            carta = obtenerCarta(i);
            cartaVal = carta.getValor();
            if (cartaVal > 10) {
                cartaVal = 10;
            }
            if (cartaVal == 1) {
                as = true;
            }
            val = val + cartaVal;
        }
        /**
         * El as en principio vale 1, pero si al cambiar su valor por 11
         * conseguimos un resultado igual a 21 o menor lo cambiaremos
         */
        if (as == true && val + 10 <= 21) {
            val = val + 10;
        }
        return val;
    }
}
