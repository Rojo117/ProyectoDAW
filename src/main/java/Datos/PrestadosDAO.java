/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;


import Modelos.prestados;
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
public class PrestadosDAO {
    private Connection con = null;
    private ResultSet rs = null;
    private PreparedStatement ps= null;
    private prestados prestados = null;
    private List<prestados>prestadoslist;

    public PrestadosDAO() {
        con = Conexion.getConnection();
}

        public List<prestados> listarTodo() {
        try {
            prestadoslist = new ArrayList<>();
            ps = con.prepareStatement("SELECT * FROM prestados");
            rs = ps.executeQuery();
            while (rs.next()) {
                prestados = new prestados();
                prestados.setIdObraDeArte(rs.getInt("idObraDeArte"));
                prestados.setPrestamista(rs.getString("prestamista"));
                prestados.setFecha_inicio(rs.getDate("fecha_inicio"));
                prestados.setFecha_fin(rs.getDate("fecha_fin"));
                prestadoslist.add(prestados);
            }
            return prestadoslist;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            Conexion.close(rs);
            Conexion.close(ps);
        }
    }
}