/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        // Tu código aquí
        Connection data;
        Conexion con = new Conexion();
        if (con.getConnection()!= null) {
            System.out.println("Exito");
        }
    }
}


