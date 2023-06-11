/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Modelos.coleccion_permanente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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

    public List<coleccion_permanente> listarTodo() {
        try {
            coleccion_permanentelist = new ArrayList<>();
            ps = con.prepareStatement("SELECT * FROM coleccion_permanente");
            rs = ps.executeQuery();
            while (rs.next()) {
                coleccion_permanente = new coleccion_permanente();
                coleccion_permanente.setIdObraDeArte(rs.getInt("idObraDeArte"));
                coleccion_permanente.setFecha_adquisicion(rs.getDate("fecha_adquisicion"));
                coleccion_permanente.setEstado(rs.getString("estado"));
                coleccion_permanente.setCosto(rs.getInt("costo"));
                coleccion_permanentelist.add(coleccion_permanente);
            }
            return coleccion_permanentelist;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            Conexion.close(rs);
            Conexion.close(ps);
        }
    }
}
