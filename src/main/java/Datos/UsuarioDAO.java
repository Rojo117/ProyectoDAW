/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Modelos.Usuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author conej
 */
public class UsuarioDAO {
    private Connection con = null;
    private ResultSet rs = null;
    private PreparedStatement ps= null;
    private Usuarios user = null;
    private List<Usuarios>userlist;

    public UsuarioDAO() {
        con = Conexion.getConnection();
    }

    public Usuarios getUser(String usuario, String pass) {
        try {
            ps = con.prepareStatement("SELECT * FROM Usuarios WHERE usuario=? AND contra=?");
            ps.setString(1, usuario);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            if (rs.next()) {user=new Usuarios();
            user.setIdUsuario(rs.getInt("idUsuario"));
            user.setNombre(rs.getString("nombre"));
            user.setUsuario(usuario);
            user.setContra(pass);
            user.setCorreo(rs.getString("correo"));
            
            }
            return user;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            Conexion.close(rs);
            Conexion.close(ps);
            
        }
        
    }
    
}
