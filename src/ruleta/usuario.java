/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruleta;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Romacho Clase que almacena los usuarios fichas: numero de fichas del
 * usuario avatar: id del avatar seleccionado actualmente por el usuario nick:
 * nombre del usuario password: contraseña del usuario
 *
 */
public class usuario implements Serializable{

    private int fichas, avatar;
    private String nick, password;

    public usuario(){
        
    }
    public usuario(String n, String p) {
        this.nick = n;
        this.password = p;
        this.fichas = 500;
        this.avatar = 1;
    }
    public usuario(String n, String p, int f, int a) {
        this.nick = n;
        this.password = p;
        this.fichas = f;
        this.avatar = a;
    }

    public int getFichas() {
        return fichas;
    }

    public void setFichas(int fichas) {
        this.fichas = fichas;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
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

    /**
     * Recibe un usuario y lo escribe en el archivo que contiene los usuarios
     * @param u 
     */
    public void escribeuser(usuario u) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("usuarios.dat",true));
            oos.writeObject(u);
            oos.close();
        } catch (IOException ex) {
            Logger.getLogger(usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Comprueba si un usuario existe en el fichero de usuarios
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
                    if(((usuario) aux).getNick().equalsIgnoreCase(u)){
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
                
                    if(((usuario) aux).getNick().equalsIgnoreCase(u)){
                        ois.close();
                        usuario user = new usuario(((usuario) aux).getNick(),((usuario) aux).getPassword()
                        ,((usuario) aux).getFichas(),((usuario) aux).getAvatar());
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
