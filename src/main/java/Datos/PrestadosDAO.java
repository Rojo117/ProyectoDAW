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
    private PreparedStatement ps = null;
    private prestados prestados = null;
    private List<prestados> prestadoslist;

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

    public boolean modificar(prestados objeto) {
        try {
            ps = con.prepareStatement("UPDATE prestados SET prestamista=?, fecha_inicio=?, fecha_fin=? WHERE idObraDeArte=?");
            ps.setString(1, objeto.getPrestamista());
            ps.setDate(2, objeto.getFecha_inicio());
            ps.setDate(3, objeto.getFecha_fin());
            ps.setInt(4, objeto.getIdObraDeArte());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            Conexion.close(ps);
        }
    }

    public prestados leer(int id6) {
                        try {
            prestados = new prestados();
            ps = con.prepareStatement("SELECT * FROM prestados WHERE idObraDeArte=?");
            ps.setInt(1, id6);
            rs = ps.executeQuery();
            if (rs.next()) {
                prestados.setIdObraDeArte(rs.getInt("idObraDeArte"));
                prestados.setPrestamista(rs.getString("prestamista"));
                prestados.setFecha_inicio(rs.getDate("fecha_inicio"));
                prestados.setFecha_fin(rs.getDate("fecha_fin"));

            }
            return prestados;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            Conexion.close(rs);
            Conexion.close(ps);
        }
    }
}
