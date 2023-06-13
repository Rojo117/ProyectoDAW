/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Modelos.escultura;
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
public class EsculturasDAO {

    private Connection con = null;
    private ResultSet rs = null;
    private PreparedStatement ps = null;
    private escultura escultura = null;
    private List<escultura> esculturalist;

    public EsculturasDAO() {
        con = Conexion.getConnection();
    }

    public List<escultura> listarTodo() {
        try {
            esculturalist = new ArrayList<>();
            ps = con.prepareStatement("SELECT * FROM escultura WHERE estatus = 1");
            rs = ps.executeQuery();
            while (rs.next()) {
                escultura = new escultura();
                escultura.setIdObraDeArte(rs.getInt("idObraDeArte"));
                escultura.setMaterial(rs.getString("material"));
                escultura.setAltura(rs.getInt("altura"));
                escultura.setPeso(rs.getInt("peso"));
                escultura.setEstilo(rs.getString("estilo"));
                esculturalist.add(escultura);
            }
            return esculturalist;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            Conexion.close(rs);
            Conexion.close(ps);
        }
    }

    public boolean modificar(escultura objeto) {
        try {
            ps = con.prepareStatement("UPDATE escultura SET material=?, altura=?, peso=?, estilo=? WHERE idObraDeArte=?");

            ps.setString(1, objeto.getMaterial());
            ps.setInt(2, objeto.getAltura());
            ps.setInt(3, objeto.getPeso());
            ps.setString(4, objeto.getEstilo());
            ps.setInt(5, objeto.getIdObraDeArte());

            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            Conexion.close(ps);
        }
    }

    public escultura leer(int id7) {
        try {
            escultura = new escultura();
            ps = con.prepareStatement("SELECT * FROM escultura WHERE idObraDeArte=?");
            ps.setInt(1, id7);
            rs = ps.executeQuery();
            if (rs.next()) {
                escultura.setIdObraDeArte(rs.getInt("idObraDeArte"));
                escultura.setMaterial(rs.getString("material"));
                escultura.setAltura(rs.getInt("altura"));
                escultura.setPeso(rs.getInt("peso"));
                escultura.setEstilo(rs.getString("estilo"));

            }
            return escultura;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            Conexion.close(rs);
            Conexion.close(ps);
        }
    }

    public boolean Eliminar(int id7) {
        try {
            ps = con.prepareStatement("UPDATE escultura SET estatus=? WHERE idobradearte=?");
            ps.setInt(1, 0);
            ps.setInt(2, id7);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            Conexion.close(ps);
        }
    }

    public boolean Registrar(escultura objeto) {
        try {
            ps = con.prepareStatement("INSERT INTO escultura (idobradearte,material,altura,peso,estilo,estatus) VALUES(?,?,?,?,?,?)");
            ps.setInt(1, objeto.getIdObraDeArte());
            ps.setString(2, objeto.getMaterial());
            ps.setInt(3, objeto.getAltura());
            ps.setInt(4, objeto.getPeso());
            ps.setString(5, objeto.getEstilo());
            ps.setInt(6, 1);

            return ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            Conexion.close(ps);
        }
    }

    public boolean comprobar(int idObraDeArte) {
        try {
            ps = con.prepareStatement("SELECT * FROM escultura WHERE idobradearte=?");
            ps.setInt(1, idObraDeArte);
            rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            Conexion.close(ps);
        }
    }
}
