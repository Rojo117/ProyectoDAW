/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Modelos.Exposiciones;
import Modelos.otros;
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

    public boolean modificar(otros objeto) {
        try {
            ps = con.prepareStatement("UPDATE otros SET tipo=?, estilo=? WHERE idObraDeArte=?");
            ps.setString(1, objeto.getTipo());
            ps.setString(2, objeto.getEstilo());
            ps.setInt(3, objeto.getIdObraDeArte());

            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            Conexion.close(ps);
        }
    }

    public otros leer(int id9) {
                        try {
            otros = new otros();
            ps = con.prepareStatement("SELECT * FROM otros WHERE idObraDeArte=?");
            ps.setInt(1, id9);
            rs = ps.executeQuery();
            if (rs.next()) {
             otros.setIdObraDeArte(rs.getInt("idObraDeArte"));
                otros.setTipo(rs.getString("tipo"));
                otros.setEstilo(rs.getString("estilo"));

            }
            return otros;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            Conexion.close(rs);
            Conexion.close(ps);
        }
    }

    public boolean Eliminar(int id9) {
try {
            ps = con.prepareStatement("UPDATE otros SET estatus=? WHERE idobradearte=?");
            ps.setInt(1, 0);
            ps.setInt(2, id9);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            Conexion.close(ps);
        }    }
} 

