/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlets;

import Datos.UsuarioDAO;
import java.io.IOException;
import Modelos.Usuarios;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author conej
 */
@WebServlet(name = "Registrar", urlPatterns = {"/Registrar"})
public class Registrar extends HttpServlet {
    String msg = null;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Usuarios newUser = new Usuarios();
        newUser.setNombre(request.getParameter("nombre"));
        newUser.setUsuario(request.getParameter("usuario"));
        newUser.setContra(request.getParameter("contra"));
        newUser.setCorreo(request.getParameter("correo"));
        UsuarioDAO dao = new UsuarioDAO();
        boolean registrado = dao.registrar(newUser);
        if (!registrado) {
              msg = "<script>alert('Registrado correctamente')</script>";

        } else {
             msg = "<script>alert('No se pudo registrar, intentelo denuevo c:')</script>";
             
        }
        request.getSession().setAttribute("msg", msg);
        response.sendRedirect(request.getContextPath()+"/Vistas/Login.jsp");
    }

}
