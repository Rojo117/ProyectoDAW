/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Modelos.objeto_de_arte;
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
public class Objeto_de_arteDAO {

    private Connection con = null;
    private ResultSet rs = null;
    private PreparedStatement ps = null;
    private objeto_de_arte objetoDeArte = null;
    private List<objeto_de_arte> objetoDeArtelist;

    public Objeto_de_arteDAO() {
        con = Conexion.getConnection();
    }

    public List<objeto_de_arte> listarTodo() {
        try {
            objetoDeArtelist = new ArrayList<>();
            ps = con.prepareStatement("SELECT * FROM objeto_de_arte WHERE estatus=1");
            rs = ps.executeQuery();
            while (rs.next()) {
                objetoDeArte = new objeto_de_arte();
                objetoDeArte.setIdObraDeArte(rs.getInt("idobradearte"));
                objetoDeArte.setNombreObra(rs.getString("nombreobra"));
                objetoDeArte.setArtista(rs.getString("artista"));
                objetoDeArte.setId_coleccion(rs.getInt("id_coleccion"));
                objetoDeArte.setFecha_creacion(rs.getDate("fecha_creacion"));
                objetoDeArte.setTitulo(rs.getString("titulo"));
                objetoDeArte.setDescripcion(rs.getString("descripcion"));
                objetoDeArte.setIdEpoca(rs.getInt("idepoca"));
                objetoDeArte.setIdOrigen(rs.getInt("idorigen"));
                objetoDeArte.setIdTipo(rs.getInt("idtipo"));
                objetoDeArtelist.add(objetoDeArte);
            }
            return objetoDeArtelist;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            Conexion.close(rs);
            Conexion.close(ps);
        }
    }

    public boolean Eliminar(int id) {
        try {
            ps = con.prepareStatement("UPDATE objeto_de_arte SET estatus=? WHERE idobradearte=?");
            ps.setInt(1, 0);
            ps.setInt(2, id);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            Conexion.close(ps);
        }
    }

    public objeto_de_arte leer(int id) {

        try {
            objetoDeArte = new objeto_de_arte();
            ps = con.prepareStatement("SELECT * FROM objeto_de_arte WHERE idobradearte=?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                objetoDeArte.setIdObraDeArte(rs.getInt("idobradearte"));
                objetoDeArte.setNombreObra(rs.getString("nombreobra"));
                objetoDeArte.setArtista(rs.getString("artista"));
                objetoDeArte.setId_coleccion(rs.getInt("id_coleccion"));
                objetoDeArte.setFecha_creacion(rs.getDate("fecha_creacion"));
                objetoDeArte.setTitulo(rs.getString("titulo"));
                objetoDeArte.setDescripcion(rs.getString("descripcion"));
                objetoDeArte.setIdEpoca(rs.getInt("idepoca"));
                objetoDeArte.setIdOrigen(rs.getInt("idorigen"));
                objetoDeArte.setIdTipo(rs.getInt("idtipo"));

            }
            return objetoDeArte;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            Conexion.close(rs);
            Conexion.close(ps);
        }

    }

    public boolean modificar(objeto_de_arte objeto) {
        try {
            ps = con.prepareStatement("UPDATE objeto_de_arte SET nombreobra=?, artista=?, id_coleccion=?, fecha_creacion=?, titulo=?,descripcion=?,idepoca=?,idorigen=?,idtipo=? WHERE idobradearte=?");
            ps.setString(1, objeto.getNombreObra());
            ps.setString(2, objeto.getArtista());
            ps.setInt(3, objeto.getId_coleccion());
            ps.setDate(4, objeto.getFecha_creacion());
            ps.setString(5, objeto.getTitulo());
            ps.setString(6, objeto.getDescripcion());
            ps.setInt(7, objeto.getIdEpoca());
            ps.setInt(8, objeto.getIdOrigen());
            ps.setInt(9, objeto.getIdTipo());
            ps.setInt(10, objeto.getIdObraDeArte());
            return ps.executeUpdate()>0;
        } catch (SQLException e) {
             e.printStackTrace();
            return false;
        } finally {
             Conexion.close(ps);
        }
    }

    public boolean Registrar(objeto_de_arte objeto) {
        try {
            ps = con.prepareStatement("INSERT INTO objeto_de_arte (idobradearte,nombreobra,artista,id_coleccion,fecha_creacion,titulo,descripcion,idepoca,idorigen,idtipo,estatus) VALUES (?,?,?,?,?,?,?,?,?,?,?) ");     
           ps.setInt(1, objeto.getIdObraDeArte());
            ps.setString(2, objeto.getNombreObra());
            ps.setString(3, objeto.getArtista());
            ps.setInt(4, objeto.getId_coleccion());
            ps.setDate(5, objeto.getFecha_creacion());
            ps.setString(6, objeto.getTitulo());
            ps.setString(7, objeto.getDescripcion());
            ps.setInt(8, objeto.getIdEpoca());
            ps.setInt(9, objeto.getIdOrigen());
            ps.setInt(10, objeto.getIdTipo());     
            ps.setInt(11,1);
            
            return ps.execute();
        } catch (SQLException e) {
             e.printStackTrace();
            return false;
        } finally {
             Conexion.close(ps);
        }    }
}
