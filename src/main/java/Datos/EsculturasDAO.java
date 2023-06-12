/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Modelos.artistas;
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
    private PreparedStatement ps= null;
    private escultura escultura = null;
    private List<escultura>esculturalist;

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
}
