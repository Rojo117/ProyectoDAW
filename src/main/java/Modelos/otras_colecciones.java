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
public class otras_colecciones implements Serializable {
 int idObraDeArte;
  String  nombre_coleccion;
   String tipoColeccion;
   String descripcion;
  String  direccion;
   String telefono;
   String nombre_contacto;
    public otras_colecciones() {
    }

    public int getIdObraDeArte() {
        return idObraDeArte;
    }

    public void setIdObraDeArte(int idObraDeArte) {
        this.idObraDeArte = idObraDeArte;
    }

    public String getNombre_coleccion() {
        return nombre_coleccion;
    }

    public void setNombre_coleccion(String nombre_coleccion) {
        this.nombre_coleccion = nombre_coleccion;
    }

    public String getTipoColeccion() {
        return tipoColeccion;
    }

    public void setTipoColeccion(String tipoColeccion) {
        this.tipoColeccion = tipoColeccion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre_contacto() {
        return nombre_contacto;
    }

    public void setNombre_contacto(String nombre_contacto) {
        this.nombre_contacto = nombre_contacto;
    }
    
}
