/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Modelos.Exposiciones;
import Modelos.artistas;
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
public class ArtistasDAO {
    private Connection con = null;
    private ResultSet rs = null;
    private PreparedStatement ps= null;
    private artistas artistas = null;
    private List<artistas>artistaslist;
    

    public ArtistasDAO() {
        con = Conexion.getConnection();
} 

        public List<artistas> listarTodo() {
        try {
            artistaslist = new ArrayList<>();
            ps = con.prepareStatement("SELECT * FROM artistas WHERE estatus = 1");
            rs = ps.executeQuery();
            while (rs.next()) {
                artistas = new artistas();
                artistas.setNombre(rs.getString("nombre"));
                artistas.setFecha_nacimiento(rs.getDate("fecha_nacimiento"));
                artistas.setFecha_fallecimiento(rs.getDate("fecha_fallecimiento"));
                artistas.setPais_origen(rs.getString("pais_origen"));
                artistas.setEpoca(rs.getInt("epoca"));
                artistas.setEstilo(rs.getString("estilo"));
                artistas.setDescripcion(rs.getString("descripcion"));
                artistaslist.add(artistas);
            }
            return artistaslist;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            Conexion.close(rs);
            Conexion.close(ps);
        }
    }

    public boolean Eliminar(String id2){ try {
            ps = con.prepareStatement("UPDATE artistas SET estatus=? WHERE nombre=?");
            ps.setInt(1, 0);
            ps.setString(2, id2);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            Conexion.close(ps);
        }
    }

    public boolean modificar(artistas objeto) {
        try {
            ps = con.prepareStatement("UPDATE artistas SET fecha_nacimiento=?, fecha_fallecimiento=?, pais_origen=?, epoca=?, estilo=?,descripcion=? WHERE nombre=?");
            
            ps.setDate(1, objeto.getFecha_nacimiento());
            ps.setDate(2, objeto.getFecha_fallecimiento());        
            ps.setString(3, objeto.getPais_origen());
            ps.setInt(4, objeto.getEpoca());
            ps.setString(5, objeto.getEstilo());
            ps.setString(6, objeto.getDescripcion());
            ps.setString(7, objeto.getNombre());
            return ps.executeUpdate()>0;
        } catch (SQLException e) {
             e.printStackTrace();
            return false;
        } finally {
             Conexion.close(ps);
        }    }

    public artistas leer(String id) {
                        try {
            artistas = new artistas();
            ps = con.prepareStatement("SELECT * FROM artistas WHERE nombre=?");
            ps.setString(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                 artistas.setNombre(rs.getString("nombre"));
                artistas.setFecha_nacimiento(rs.getDate("fecha_nacimiento"));
                artistas.setFecha_fallecimiento(rs.getDate("fecha_fallecimiento"));
                artistas.setPais_origen(rs.getString("pais_origen"));
                artistas.setEpoca(rs.getInt("epoca"));
                artistas.setEstilo(rs.getString("estilo"));
                artistas.setDescripcion(rs.getString("descripcion"));

            }
            return artistas;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            Conexion.close(rs);
            Conexion.close(ps);
        }
    }}

