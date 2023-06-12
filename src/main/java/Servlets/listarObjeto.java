/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlets;

import Datos.Objeto_de_arteDAO;
import Modelos.objeto_de_arte;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author conej
 */
@WebServlet(name = "listarObjeto", urlPatterns = {"/listarObjeto"})
public class listarObjeto extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Objeto_de_arteDAO acceso = new Objeto_de_arteDAO();
        List<objeto_de_arte> lista = acceso.listarTodo();
        req.getSession().setAttribute("objetos", lista);
        resp.sendRedirect(req.getContextPath()+"/Vistas/objetoArte.jsp");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       doPost(req, resp);
    }


}

