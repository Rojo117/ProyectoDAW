/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Modelos.objeto_de_arte;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author conej
 */
public class Objeto_de_arteDAO {
    private Connection con = null;
    private ResultSet rs = null;
    private PreparedStatement ps= null;
    private objeto_de_arte objetoDeArte = null;
    private List<objeto_de_arte>objetoDeArtelist;

    public Objeto_de_arteDAO() {
        con = Conexion.getConnection();
}
}
