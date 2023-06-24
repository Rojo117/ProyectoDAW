/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlets;

import Datos.ExposicionesDAO;
import Modelos.Exposiciones;
import java.io.IOException;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author conej
 */
@WebServlet(name = "modificarExposiciones", urlPatterns = {"/modificarExposiciones"})
public class modificarExposiciones extends HttpServlet {
String msg = null;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Exposiciones objeto = new Exposiciones();
        objeto.setIdExposicion(Integer.parseInt(request.getParameter("idExposicion")));
        objeto.setNombre(request.getParameter("nombre"));
        objeto.setFecha_inicio(Date.valueOf(request.getParameter("fecha_inicio")));//date
        objeto.setFecha_fin(Date.valueOf(request.getParameter("fecha_fin")));//date
        ExposicionesDAO access = new ExposicionesDAO();
        boolean modificado = access.modificar(objeto);
        if (modificado) {
            msg = "<script>alert('Modificado Correctamente')</script>";

        } else {
            msg = "<script>alert('No se pudo modificar')</script>";
        }
        request.getSession().setAttribute("msg", msg);
         response.sendRedirect(request.getContextPath()+"/Informacion?id="+objeto.getIdExposicion()+"&Seccion=Exposiciones");
    }

}
