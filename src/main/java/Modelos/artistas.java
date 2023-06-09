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
public class artistas implements Serializable {
 String nombre;
   Date fecha_nacimiento;
   Date fecha_fallecimiento;
   String pais_origen;
    int epoca;
    String estilo;
    String descripcion;
    public artistas() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Date getFecha_fallecimiento() {
        return fecha_fallecimiento;
    }

    public void setFecha_fallecimiento(Date fecha_fallecimiento) {
        this.fecha_fallecimiento = fecha_fallecimiento;
    }

    public String getPais_origen() {
        return pais_origen;
    }

    public void setPais_origen(String pais_origen) {
        this.pais_origen = pais_origen;
    }

    public int getEpoca() {
        return epoca;
    }

    public void setEpoca(int epoca) {
        this.epoca = epoca;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
