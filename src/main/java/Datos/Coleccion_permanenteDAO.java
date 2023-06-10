/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Modelos.coleccion_permanente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author conej
 */
public class Coleccion_permanenteDAO {
    private Connection con = null;
    private ResultSet rs = null;
    private PreparedStatement ps= null;
    private coleccion_permanente coleccion_permanente = null;
    private List<coleccion_permanente>coleccion_permanentelist;

    public Coleccion_permanenteDAO() {
        con = Conexion.getConnection();
}
}
