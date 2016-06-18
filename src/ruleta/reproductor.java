package ruleta;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javazoom.jlgui.basicplayer.BasicPlayer;
import java.io.File;

/**
 *
 * @author Romacho
 */
public class reproductor {

    private BasicPlayer player;

    /**
     * Constructor de la clase
     *
     * Clase que hace uso de las librerias para reproducir música BasicPlayer
     *
     * - player reproductor de música
     */
    public reproductor() {
        player = new BasicPlayer();
    }

    /**
     * Método para reproducir una pista de audio
     *
     * @throws Exception
     */
    public void Play() throws Exception {
        player.play();
    }

    /**
     * Abre un fichero de audio y se lo pasa al reproductor que lo pone en cola
     *
     * @param ruta
     * @throws Exception
     */
    public void AbrirFichero(String ruta) throws Exception {
        player.open(new File(ruta));
    }

    /**
     * Igual que el anterior pero recibiendo un fichero en lugar de una ruta al
     * fichero
     *
     * @param fl
     * @throws Exception
     */
    public void AbrirFichero(File fl) throws Exception {
        player.open(fl);
    }

    /**
     * Pausa la reproducción de la pista de audio
     *
     * @throws Exception
     */
    public void Pausa() throws Exception {
        player.pause();
    }

    /**
     * Continúa la reproducción pausada
     *
     * @throws Exception
     *
     */
    public void Continuar() throws Exception {
        player.resume();
    }

    /**
     * Para por completo la reproducción de una pista de audio, pero no la saca
     * de la cola de reproducción
     *
     * @throws Exception
     */
    public void Stop() throws Exception {
        player.stop();
    }

}
