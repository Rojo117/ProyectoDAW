package Datos;


import Modelos.Usuarios;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author conej
 */
public class verificacion {

    public void IsConnected(HttpServletRequest request, HttpServletResponse response, String path) throws IOException {
        Usuarios user = (Usuarios) request.getSession().getAttribute("IsConnected");
        if (user != null) {
            if (path.equals("login")) {
                response.sendRedirect(request.getContextPath() + "/Vistas/MenuInicio.jsp");
            }
            return;
        }
        if (path.equals("login")) {
            return;
        }
        response.sendRedirect(request.getContextPath() + "/index.html");
    }
}

