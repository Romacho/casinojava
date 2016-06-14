/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruleta;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Romacho Clase que almacena los usuarios fichas: numero de fichas del
 * usuario avatar: id del avatar seleccionado actualmente por el usuario nick:
 * nombre del usuario password: contraseña del usuario
 *
 */
public class usuario implements Serializable {

    private static long serialVersionUID = 1L;
    private int fichas;
    private String nick, password;
    private Vector<avatar> avt = new Vector<avatar>();
    private avatar seleccionado;

    public usuario() {

    }

    public usuario(String n, String p) {
        this.nick = n;
        this.password = p;
        this.fichas = 500;
        avatar chico = new avatar("Chico", 1);
        avatar chica = new avatar("Chica", 2);
        this.seleccionado = chico;
        avt.add(chico);
        avt.add(chica);
    }

    public usuario(String n, String p, int f, Vector v) {
        this.nick = n;
        this.password = p;
        this.fichas = 500;
        this.avt = v;

    }

    public int getFichas() {
        return fichas;
    }

    public void setFichas(int fichas) {
        this.fichas = fichas;
    }

    public Vector getAvatar() {
        return avt;
    }

    public void addAvatar(avatar av) {
        this.avt.add(av);
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSeleccion(avatar av) {
        this.seleccionado = av;
    }

    public avatar getSeleccion() {
        return seleccionado;
    }
    
    public boolean tieneAvatar(int i){
        for (int j = 0; j < avt.size(); j++) {
            if(avt.elementAt(j).getCodigo()==i){
                return true;
            }
            
        }
        return false;
    }
    
    public void compraAvatar(String s, int i){
        avatar av = new avatar(s, i);
        avt.add(av);
        
    }

    /**
     * Recibe un usuario y lo escribe en el archivo que contiene los usuarios
     *
     * @param u
     */
    public boolean escribeuser() {
        try {

            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("user.ser")));
            oos.writeObject(this);
            oos.close();
            return true;
        } catch (IOException ex) {
            Logger.getLogger(usuario.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean leeuser() throws IOException {
        
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("user.ser")));
            try {
                usuario aux; 
                while (true) {

                    aux = (usuario) ois.readObject();
                    
                    
                    if (this.nick.equalsIgnoreCase(aux.nick) && this.password.equalsIgnoreCase(aux.password)) {
                        ois.close();
                        this.fichas = aux.fichas;
                        this.avt = aux.avt;
                        this.seleccionado = aux.seleccionado;
                        return true;
                    }

                }
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "El usuario no existe");
                ois.close();
                return false;
            }
            
                

        }
}
