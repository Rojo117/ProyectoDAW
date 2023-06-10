/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Modelos.colecciones;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author conej
 */
public class ColeccionesDAO {
     private Connection con = null;
    private ResultSet rs = null;
    private PreparedStatement ps= null;
    private colecciones colecciones = null;
    private List<colecciones>coleccioneslist;

    public ColeccionesDAO() {
        con = Conexion.getConnection();
}
}
