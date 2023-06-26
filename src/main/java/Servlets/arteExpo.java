/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlets;

import Datos.Objeto_de_arteDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author conej
 */
@WebServlet(name = "arteExpo", urlPatterns = {"/arteExpo"})
public class arteExpo extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int  id = Integer.parseInt(request.getParameter("id"));
        Objeto_de_arteDAO data = new Objeto_de_arteDAO();
        request.getSession().setAttribute("list", data.arteExpo(id));
        request.getSession().setAttribute("expo", request.getParameter("expo"));
        response.sendRedirect(request.getContextPath()+"/Vistas/arteExpo.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

}
