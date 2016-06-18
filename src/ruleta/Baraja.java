/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ruleta;

/**
 *
 * @author Romacho
 * @see ruleta.Carta
 * @see ruleta.blackjack
 */
public class Baraja {

    private static Carta[] baraja;
    public int[] vistas;
    private int robadas;

    /**
     * Metodo constructor. Recorremos todos los valores posibles y todos los
     * palos posibles Clase que representara nuestra baraja de 52 cartas
     *
     * -Carta: la baraja es un array de Cartas
     *
     * - vistas: array con las cartas vistas, sobre la mesa o en posesión de la
     * banca
     *
     * - robadas; número de cartas robadas
     */
    public Baraja() {
        baraja = new Carta[52];
        vistas = new int[13];
        int creadas = 0;
        for (int palo = 0; palo <= 3; palo++) {
            for (int valor = 1; valor <= 13; valor++) {
                baraja[creadas] = new Carta(valor, palo);
                creadas++;
            }
        }
        robadas = 0;
    }

    /**
     * Método que ordena la baraja en orden aleatorio
     */
    public void barajar() {
        for (int i = 51; i > 0; i--) {
            int rand = (int) (Math.random() * (i + 1));
            Carta temp = baraja[i];
            baraja[i] = baraja[rand];
            baraja[rand] = temp;
        }
        robadas = 0;
    }

    /* Método que devuelve el numero de cartas que nos quedan en la baraja*/
    public int restantes() {
        return 52 - robadas;
    }

    /**
     * Método para robar carta del mazo. Cuando robamos una carta cogemos la
     * primera del mazo y actualizamos el array de cartas vistas
     */
    public Carta robar() {
        if (robadas == 52) {
            barajar();
        }
        robadas++;
        vistas[((baraja[robadas - 1]).getValor()) - 1]++;
        return baraja[robadas - 1];
    }
}
