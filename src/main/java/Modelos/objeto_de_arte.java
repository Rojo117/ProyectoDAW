/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.sql.Date;

/**
 *
 * @author conej
 */
public class objeto_de_arte {
    int idObraDeArte;
    String nombreObra;
    String artista;
    int id_coleccion;
    Date fecha_creacion;
    String titulo;
    String descripcion;
    int idEpoca;
    int idOrigen;
    int idTipo;
    int estatus;
    public objeto_de_arte() {
    }

    public int getIdObraDeArte() {
        return idObraDeArte;
    }

    public void setIdObraDeArte(int idObraDeArte) {
        this.idObraDeArte = idObraDeArte;
    }

    public String getNombreObra() {
        return nombreObra;
    }

    public void setNombreObra(String nombreObra) {
        this.nombreObra = nombreObra;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getId_coleccion() {
        return id_coleccion;
    }

    public void setId_coleccion(int id_coleccion) {
        this.id_coleccion = id_coleccion;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdEpoca() {
        return idEpoca;
    }

    public void setIdEpoca(int idEpoca) {
        this.idEpoca = idEpoca;
    }

    public int getIdOrigen() {
        return idOrigen;
    }

    public void setIdOrigen(int idOrigen) {
        this.idOrigen = idOrigen;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public int getEstatus() {
        return estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }
    
}
