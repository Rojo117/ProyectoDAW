/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;


import Modelos.Exposiciones;
import Modelos.escultura;
import Modelos.estatuas;
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
public class EstatuasDAO {
    private Connection con = null;
    private ResultSet rs = null;
    private PreparedStatement ps= null;
    private estatuas estatuas = null;
    private List<estatuas>estatuaslist;

    public EstatuasDAO() {
        con = Conexion.getConnection();
}
            public List<estatuas> listarTodo() {
        try {
            estatuaslist = new ArrayList<>();
            ps = con.prepareStatement("SELECT * FROM estatuas WHERE estatus = 1");
            rs = ps.executeQuery();
            while (rs.next()) {
                estatuas = new estatuas();
                estatuas.setIdObraDeArte(rs.getInt("idObraDeArte"));
                estatuas.setAltura(rs.getInt("altura"));
                estatuas.setPeso(rs.getInt("peso"));
                estatuas.setRepresentacion(rs.getString("representacion"));
                estatuaslist.add(estatuas);
            }
            return estatuaslist;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            Conexion.close(rs);
            Conexion.close(ps);
        }
    }

    public boolean modificar(estatuas objeto) {
 try {
            ps = con.prepareStatement("UPDATE estatuas SET altura=?, peso=?, representacion=? WHERE idObraDeArte=?");

            ps.setInt(1, objeto.getAltura());
            ps.setInt(2, objeto.getPeso());
            ps.setString(3, objeto.getRepresentacion());
            ps.setInt(4, objeto.getIdObraDeArte());

            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            Conexion.close(ps);
        }    }

    public estatuas leer(int id8) {
try {
            estatuas = new estatuas();
            ps = con.prepareStatement("SELECT * FROM estatuas WHERE idObraDeArte=?");
            ps.setInt(1, id8);
            rs = ps.executeQuery();
            if (rs.next()) {
             estatuas.setIdObraDeArte(rs.getInt("idObraDeArte"));
                estatuas.setAltura(rs.getInt("altura"));
                estatuas.setPeso(rs.getInt("peso"));
                estatuas.setRepresentacion(rs.getString("representacion"));

            }
            return estatuas;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            Conexion.close(rs);
            Conexion.close(ps);
        }    }

    public boolean Eliminar(int id8) {
try {
            ps = con.prepareStatement("UPDATE estatuas SET estatus=? WHERE idobradearte=?");
            ps.setInt(1, 0);
            ps.setInt(2, id8);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            Conexion.close(ps);
        }    }
}
