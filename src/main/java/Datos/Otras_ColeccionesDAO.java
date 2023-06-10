/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Modelos.otras_colecciones;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author conej
 */
public class Otras_ColeccionesDAO {
   private Connection con = null;
    private ResultSet rs = null;
    private PreparedStatement ps= null;
    private otras_colecciones otrascolecciones = null;
    private List<otras_colecciones>otrascoleccioneslist;

    public Otras_ColeccionesDAO() {
        con = Conexion.getConnection();
}
}
