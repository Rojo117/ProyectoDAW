/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;


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
            ps = con.prepareStatement("SELECT * FROM artistas WHERE estatus = 1");
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
}
