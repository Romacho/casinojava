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

/**
 *
 * @author Romacho Clase que almacena los usuarios fichas: numero de fichas del
 * usuario avatar: id del avatar seleccionado actualmente por el usuario nick:
 * nombre del usuario password: contraseña del usuario
 *
 */
public class usuario implements Serializable {

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

    /**
     * Recibe un usuario y lo escribe en el archivo que contiene los usuarios
     *
     * @param u
     */
    public boolean escribeuser() {
        try {

            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("user.ser"), true));
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
                
                while (true) {

                    usuario aux = (usuario) ois.readObject();
                    System.out.println(aux.nick);
                    System.out.println(aux.password);
                    System.out.println("===========");
                    if (this.nick.equalsIgnoreCase(aux.nick) && this.password.equalsIgnoreCase(aux.password)) {
                        ois.close();
                        return true;
                    }

                }
                
            } catch (Exception ex) {
                System.out.println("ni uno");
                ois.close();
                return false;
            }
            
                

        }
        /**
         * Comprueba si un usuario existe en el fichero de usuarios
         *
         * @param u
         * @return
         */
    public boolean comprobarExistencia(String u) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("usuarios.dat"));
            // Se lee el primer objeto
            Object aux = ois.readObject();

            // Mientras haya objetos
            while (aux != null) {
                if (aux instanceof usuario) {
                    if (((usuario) aux).getNick().equalsIgnoreCase(u)) {
                        ois.close();
                        return true;
                    }
                }
                aux = ois.readObject();
            }
            ois.close();

        } catch (IOException ex) {
            Logger.getLogger(usuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public usuario buscarUsuario(String u) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("usuarios.dat"));
            // Se lee el primer objeto
            Object aux = ois.readObject();

            // Mientras haya objetos
            while (aux != null) {

                if (((usuario) aux).getNick().equalsIgnoreCase(u)) {
                    ois.close();
                    usuario user = new usuario(((usuario) aux).getNick(), ((usuario) aux).getPassword(), ((usuario) aux).getFichas(), ((usuario) aux).getAvatar());
                    return user;
                }

                aux = ois.readObject();
            }
            ois.close();

        } catch (IOException ex) {
            Logger.getLogger(usuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
