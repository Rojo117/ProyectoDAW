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
public class estatuas implements Serializable {
int idObraDeArte;
    int altura;
    int peso;
  String  representacion;
    public estatuas() {
    }

    public int getIdObraDeArte() {
        return idObraDeArte;
    }

    public void setIdObraDeArte(int idObraDeArte) {
        this.idObraDeArte = idObraDeArte;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getRepresentacion() {
        return representacion;
    }

    public void setRepresentacion(String representacion) {
        this.representacion = representacion;
    }
    
}
