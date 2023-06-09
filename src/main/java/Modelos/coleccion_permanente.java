/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @author conej
 */
public class coleccion_permanente implements Serializable {
    int idObraDeArte;
    Date fecha_adquisicion;
    String estado;
    int costo;
    public coleccion_permanente() {
    }

    public int getIdObraDeArte() {
        return idObraDeArte;
    }

    public void setIdObraDeArte(int idObraDeArte) {
        this.idObraDeArte = idObraDeArte;
    }

    public Date getFecha_adquisicion() {
        return fecha_adquisicion;
    }

    public void setFecha_adquisicion(Date fecha_adquisicion) {
        this.fecha_adquisicion = fecha_adquisicion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
    
}
