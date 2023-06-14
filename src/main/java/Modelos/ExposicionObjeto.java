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
public class ExposicionObjeto implements Serializable {
int idExposicion;
int idObraDeArte;
    public ExposicionObjeto() {
    }

    public int getIdExposicion() {
        return idExposicion;
    }

    public void setIdExposicion(int idExposicion) {
        this.idExposicion = idExposicion;
    }

    public int getIdObraDeArte() {
        return idObraDeArte;
    }

    public void setIdObraDeArte(int idObraDeArte) {
        this.idObraDeArte = idObraDeArte;
    }
    
}
