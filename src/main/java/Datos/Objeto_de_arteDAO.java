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
}
