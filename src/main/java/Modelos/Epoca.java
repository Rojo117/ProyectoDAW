/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.io.Serializable;

/**
 *
 * @author conej
 */
public class Epoca implements Serializable {
    int idEpoca;
    String descripcion;

    public Epoca() {
    }

    public int getIdEpoca() {
        return idEpoca;
    }

    public void setIdEpoca(int idEpoca) {
        this.idEpoca = idEpoca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    
}
