/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Modelos.Exposiciones;
import Modelos.otros;
import Modelos.pintura;
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
public class PinturaDAO {

    private Connection con = null;
    private ResultSet rs = null;
    private PreparedStatement ps = null;
    private pintura pintura = null;
    private List<pintura> pinturalist;

    public PinturaDAO() {
        con = Conexion.getConnection();
    }

    public List<pintura> listarTodo() {
        try {
            pinturalist = new ArrayList<>();
            ps = con.prepareStatement("SELECT * FROM pintura WHERE estatus = 1");
            rs = ps.executeQuery();
            while (rs.next()) {
                pintura = new pintura();
                pintura.setIdObraDeArte(rs.getInt("idObraDeArte"));
                pintura.setTipo_pintura(rs.getString("tipo_pintura"));
                pintura.setMaterial(rs.getString("material"));
                pintura.setEstilo(rs.getString("estilo"));
                pinturalist.add(pintura);
            }
            return pinturalist;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            Conexion.close(rs);
            Conexion.close(ps);
        }
    }

    public boolean modificar(pintura objeto) {
        try {
            ps = con.prepareStatement("UPDATE pintura SET tipo_pintura=?, material=?, estilo=? WHERE idObraDeArte=?");
            
            ps.setString(1, objeto.getTipo_pintura());
            ps.setString(2, objeto.getMaterial());
            ps.setString(3, objeto.getEstilo());
            ps.setInt(4, objeto.getIdObraDeArte());

            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            Conexion.close(ps);
        }
    }

    public pintura leer(int id10) {
                        try {
            pintura = new pintura();
            ps = con.prepareStatement("SELECT * FROM pintura WHERE idObraDeArte=?");
            ps.setInt(1, id10);
            rs = ps.executeQuery();
            if (rs.next()) {
              pintura.setIdObraDeArte(rs.getInt("idObraDeArte"));
                pintura.setTipo_pintura(rs.getString("tipo_pintura"));
                pintura.setMaterial(rs.getString("material"));
                pintura.setEstilo(rs.getString("estilo"));

            }
            return pintura;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            Conexion.close(rs);
            Conexion.close(ps);
        }    }
}
