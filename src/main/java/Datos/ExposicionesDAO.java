/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Modelos.Exposiciones;
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
public class ExposicionesDAO {

    private Connection con = null;
    private ResultSet rs = null;
    private PreparedStatement ps = null;
    private Exposiciones Exposiciones = null;
    private List<Exposiciones> Exposicioneslist;

    public ExposicionesDAO() {
        con = Conexion.getConnection();
    }

    public List<Exposiciones> listarTodo() {
        try {
            Exposicioneslist = new ArrayList<>();
            ps = con.prepareStatement("SELECT * FROM exposiciones WHERE estatus=1");
            rs = ps.executeQuery();
            while (rs.next()) {
                Exposiciones = new Exposiciones();
                Exposiciones.setIdExposicion(rs.getInt("idExposicion"));
                Exposiciones.setNombre(rs.getString("Nombre"));
                Exposiciones.setFecha_inicio(rs.getDate("fecha_inicio"));
                Exposiciones.setFecha_fin(rs.getDate("fecha_fin"));
                Exposiciones.setEstatus(rs.getInt("estatus"));
                Exposicioneslist.add(Exposiciones);
            }
            return Exposicioneslist;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            Conexion.close(rs);
            Conexion.close(ps);
        }
    }

    public boolean Eliminar(int id3) {
        try {
            ps = con.prepareStatement("UPDATE exposiciones SET estatus=? WHERE idexposicion=?");
            ps.setInt(1, 0);
            ps.setInt(2, id3);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            Conexion.close(ps);
        }
    }

    public Exposiciones leer(int id) {

        try {
            Exposiciones = new Exposiciones();
            ps = con.prepareStatement("SELECT * FROM exposiciones WHERE idexposicion=?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                Exposiciones.setIdExposicion(rs.getInt("idExposicion"));
                Exposiciones.setNombre(rs.getString("nombre"));
                Exposiciones.setFecha_inicio(rs.getDate("fecha_inicio"));
                Exposiciones.setFecha_fin(rs.getDate("fecha_fin"));

            }
            return Exposiciones;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            Conexion.close(rs);
            Conexion.close(ps);
        }

    }

    public boolean modificar(Exposiciones objeto) {
        try {
            ps = con.prepareStatement("UPDATE exposiciones SET nombre=?, fecha_inicio=?, fecha_fin=? WHERE idexposicion=?");
            ps.setString(1, objeto.getNombre());
            ps.setDate(2, objeto.getFecha_inicio());
            ps.setDate(3, objeto.getFecha_fin());
            ps.setInt(4, objeto.getIdExposicion());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            Conexion.close(ps);
        }
    }

    public boolean Registrar(Exposiciones objeto) {
        try {
            ps = con.prepareStatement("INSERT INTO exposiciones (nombre,fecha_inicio,fecha_fin,estatus) VALUES(?,?,?,?)");
            ps.setString(1, objeto.getNombre());
            ps.setDate(2, objeto.getFecha_inicio());
            ps.setDate(3, objeto.getFecha_fin());
            ps.setInt(4, 1);
            ps.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            Conexion.close(ps);
        }
    }

    public int mostrarID(String option) {
        try {
            ps = con.prepareStatement("SELECT * FROM exposiciones WHERE nombre=?");
            ps.setString(1, option);
            rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt("idExposicion");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexion.close(rs);
            Conexion.close(ps);
        }
        return 0;
    }

    public boolean agregarObjeto(int idExpo, int idobradearte) {
       try {
            ps = con.prepareStatement("INSERT INTO exposicionobjeto (idexposicion, idobradearte) VALUES(?,?)");
            ps.setInt(1, idExpo);
            ps.setInt(2, idobradearte);
            return ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            Conexion.close(ps);
        }
    }
}
