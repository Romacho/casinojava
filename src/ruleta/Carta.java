/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ruleta;

/**
 *
 * @author Romacho Clase con la que vamos a representar cada una de las cartas
 * de la baraja
 * @see ruleta.Baraja
 * @see ruleta.blackjack
 *
 */
public class Carta {

    public final static int TREBOLES = 0,
            CORAZONES = 1,
            DIAMANTES = 2,
            PICAS = 3;
    public final static int AS = 1,
            JOKER = 11,
            QUEEN = 12,
            KING = 13;

    private final int palo;
    private final int valor;

    /**
     * Metodo constructor
     *
     * - TREBOLES Constantes enteras que definen los palos y las cartas que no
     * tienen valor numerico
     *
     * - CORAZONES Constantes enteras que definen los palos y las cartas que no
     * tienen valor numerico
     *
     * -DIAMANTES Constantes enteras que definen los palos y las cartas que no
     * tienen valor numerico 
     * 
     * - PICAS Constantes enteras que definen los palos y
     * las cartas que no tienen valor numerico 
     * 
     * - AS Constantes enteras que
     * definen los palos y las cartas que no tienen valor numerico 
     * 
     * - JOKER Constantes enteras que definen los palos y las cartas que no tienen valor
     * numerico 
     * 
     * - QUEEN Constantes enteras que definen los palos y las cartas
     * que no tienen valor numerico 
     * 
     * - KING Constantes enteras que definen los
     * palos y las cartas que no tienen valor numerico
     *
     * - palo propiedad palo de cada carta - valor propiedad valor (puntos) de
     * cada carta
     */
    public Carta(int val, int pal) {
        valor = val;
        palo = pal;
    }

    /**
     * @return devuelve el palo como entero
     */
    public int getPalo() {
        return palo;
    }

    /**
     *
     * @return devuelve el valor como entero
     */
    public int getValor() {
        return valor;
    }

    /**
     *
     * @return devuelve el palo como cadena de texto
     */
    public String getPaloString() {
        switch (palo) {
            case TREBOLES:
                return "Tréboles";
            case CORAZONES:
                return "Corazones";
            case DIAMANTES:
                return "Diamantes";
            case PICAS:
                return "Picas";
            default:
                return "??";
        }
    }

    /**
     *
     * @return devuelve el valor como cadena
     */
    public String getValorString() {
        switch (valor) {
            case 1:
                return "As";
            case 2:
                return "2";
            case 3:
                return "3";
            case 4:
                return "4";
            case 5:
                return "5";
            case 6:
                return "6";
            case 7:
                return "7";
            case 8:
                return "8";
            case 9:
                return "9";
            case 10:
                return "10";
            case 11:
                return "J";
            case 12:
                return "Q";
            case 13:
                return "K";
            default:
                return "??";
        }
    }

    /**
     *
     * @return devuelve el la información completa de la carta como cadena
     */
    public String toString() {
        return getValorString() + " de " + getPaloString();
    }
}
