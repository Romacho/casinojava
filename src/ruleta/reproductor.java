package ruleta;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Romacho
 */
import javazoom.jlgui.basicplayer.BasicPlayer;
import java.io.File;

public class reproductor {

    private BasicPlayer player;

    public reproductor() {
        player = new BasicPlayer();
    }

    public void Play() throws Exception {
        player.play();
    }

    public void AbrirFichero(String ruta) throws Exception {
        player.open(new File(ruta));
    }

    public void AbrirFichero(File fl) throws Exception {
        player.open(fl);
    }
    public void Pausa() throws Exception {
        player.pause();
    }

    public void Continuar() throws Exception {
        player.resume();
    }

    public void Stop() throws Exception {
        player.stop();
    }

}
