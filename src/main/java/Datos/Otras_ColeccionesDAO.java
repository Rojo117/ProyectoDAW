/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Modelos.artistas;
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
    private PreparedStatement ps= null;
    private otras_colecciones otrascolecciones = null;
    private List<otras_colecciones>otrascoleccioneslist;

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
}
