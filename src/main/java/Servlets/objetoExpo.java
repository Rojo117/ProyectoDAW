/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlets;

import Datos.ExposicionesDAO;
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
@WebServlet(name = "objetoExpo", urlPatterns = {"/objetoExpo"})
public class objetoExpo extends HttpServlet {

    String msg=null;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getSession().setAttribute("IDobra", Integer.parseInt(request.getParameter("id")));
        ExposicionesDAO dataexpo = new ExposicionesDAO();
        request.getSession().setAttribute("listExpo", dataexpo.listarTodo());
        response.sendRedirect(request.getContextPath() + "/Vistas/objetoExpo.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String option = request.getParameter("option");
        ExposicionesDAO dataexpo = new ExposicionesDAO();
        int idExpo = dataexpo.mostrarID(option);
        boolean agregado = dataexpo.agregarObjeto(idExpo, (Integer) request.getSession().getAttribute("IDobra"));
        if (!agregado) {
            msg = "<script>alert('Se agrego la obra de arte a exposicion: "+option+"')</script>";
        } else {
            msg = "<script>alert('No fue posible agregarlo - intentalo más tarde')</script>";
        }
        request.getSession().setAttribute("msg", msg);
        response.sendRedirect(request.getContextPath()+"/listarObjeto");

    }

}
