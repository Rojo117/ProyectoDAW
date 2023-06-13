/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Modelos.otras_colecciones;
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
public class Otras_ColeccionesDAO {

    private Connection con = null;
    private ResultSet rs = null;
    private PreparedStatement ps = null;
    private otras_colecciones otrascolecciones = null;
    private List<otras_colecciones> otrascoleccioneslist;

    public Otras_ColeccionesDAO() {
        con = Conexion.getConnection();
    }

    public List<otras_colecciones> listarTodo() {
        try {
            otrascoleccioneslist = new ArrayList<>();
            ps = con.prepareStatement("SELECT * FROM otras_colecciones");
            rs = ps.executeQuery();
            while (rs.next()) {
                otrascolecciones = new otras_colecciones();
                otrascolecciones.setIdObraDeArte(rs.getInt("idObraDeArte"));
                otrascolecciones.setNombre_coleccion(rs.getString("nombre_coleccion"));
                otrascolecciones.setTipoColeccion(rs.getString("tipoColeccion"));
                otrascolecciones.setDescripcion(rs.getString("descripcion"));
                otrascolecciones.setDireccion(rs.getString("direccion"));
                otrascolecciones.setTelefono(rs.getString("telefono"));
                otrascolecciones.setNombre_contacto(rs.getString("nombre_contacto"));
                otrascoleccioneslist.add(otrascolecciones);
            }
            return otrascoleccioneslist;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            Conexion.close(rs);
            Conexion.close(ps);
        }
    }

    public boolean modificar(otras_colecciones objeto) {
        try {
            ps = con.prepareStatement("UPDATE otras_colecciones SET nombre_coleccion=?, tipoColeccion=?, descripcion=?, direccion=?, telefono=?, nombre_contacto=?  WHERE idObraDeArte=?");
            ps.setString(1, objeto.getNombre_coleccion());
            ps.setString(2, objeto.getTipoColeccion());
            ps.setString(3, objeto.getDescripcion());
            ps.setString(4, objeto.getDireccion());
            ps.setString(5, objeto.getTelefono());
            ps.setString(6, objeto.getNombre_contacto());
            ps.setInt(7, objeto.getIdObraDeArte());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            Conexion.close(ps);
        }
    }

    public otras_colecciones leer(int id4) {
        try {
            otrascolecciones = new otras_colecciones();
            ps = con.prepareStatement("SELECT * FROM otras_colecciones WHERE idObraDeArte=?");
            ps.setInt(1, id4);
            rs = ps.executeQuery();
            if (rs.next()) {
                otrascolecciones.setIdObraDeArte(rs.getInt("idObraDeArte"));
                otrascolecciones.setNombre_coleccion(rs.getString("nombre_coleccion"));
                otrascolecciones.setTipoColeccion(rs.getString("tipoColeccion"));
                otrascolecciones.setDescripcion(rs.getString("descripcion"));
                otrascolecciones.setDireccion(rs.getString("direccion"));
                otrascolecciones.setTelefono(rs.getString("telefono"));
                otrascolecciones.setNombre_contacto(rs.getString("nombre_contacto"));

            }
            return otrascolecciones;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            Conexion.close(rs);
            Conexion.close(ps);
        }
    }

    public boolean Eliminar(int id4) {
try {
            ps = con.prepareStatement("UPDATE otras_colecciones SET estatus=? WHERE idobradearte=?");
            ps.setInt(1, 0);
            ps.setInt(2, id4);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            Conexion.close(ps);
        }    }
}
