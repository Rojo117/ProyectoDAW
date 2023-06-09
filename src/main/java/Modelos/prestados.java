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
public class prestados implements Serializable {
 int idObraDeArte;
    String prestamista;
   Date fecha_inicio;
   Date fecha_fin;
    public prestados() {
    }

    public int getIdObraDeArte() {
        return idObraDeArte;
    }

    public void setIdObraDeArte(int idObraDeArte) {
        this.idObraDeArte = idObraDeArte;
    }

    public String getPrestamista() {
        return prestamista;
    }

    public void setPrestamista(String prestamista) {
        this.prestamista = prestamista;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }
    
}
