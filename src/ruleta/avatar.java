/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruleta;

import java.io.Serializable;

/**
 *
 * @author Romacho
 * 
 * @see ruleta.usuario
 */
public class avatar implements Serializable{
    private String nombre;
    private int codigo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * constructor de la clase
     * Clase a la que pertenecen los avatares que puede comprar y usar el usuario
     * 
     * @param nombre nombre del avatar
     * @param codigo ID del avatar
     */
    public avatar(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }
    
}
