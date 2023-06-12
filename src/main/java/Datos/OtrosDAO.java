/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Modelos.otros;
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
public class OtrosDAO {
    private Connection con = null;
    private ResultSet rs = null;
    private PreparedStatement ps= null;
    private otros otros = null;
    private List<otros>otroslist;

    public OtrosDAO() {
        con = Conexion.getConnection();
}
                public List<otros> listarTodo() {
        try {
            otroslist = new ArrayList<>();
            ps = con.prepareStatement("SELECT * FROM otros WHERE estatus = 1");
            rs = ps.executeQuery();
            while (rs.next()) {
                otros = new otros();
                otros.setIdObraDeArte(rs.getInt("idObraDeArte"));
                otros.setTipo(rs.getString("tipo"));
                otros.setEstilo(rs.getString("estilo"));
                otroslist.add(otros);
            }
            return otroslist;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            Conexion.close(rs);
            Conexion.close(ps);
        }
    }
} 

