/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlets;

import Datos.EsculturasDAO;
import Datos.ExposicionesDAO;
import Modelos.Exposiciones;
import Modelos.escultura;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "registrarExposiciones", urlPatterns = {"/registrarExposiciones"})
public class registrarExposiciones extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Exposiciones objeto = new Exposiciones();
        objeto.setNombre(request.getParameter("nombre"));
        objeto.setFecha_inicio(Date.valueOf(request.getParameter("fecha_inicio")));//date
        objeto.setFecha_fin(Date.valueOf(request.getParameter("fecha_fin")));//date
        ExposicionesDAO access = new ExposicionesDAO();
 
         boolean registrado = access.Registrar(objeto);
         if (registrado) {
            System.out.println("Registrado correctamente");

        } else {
            System.out.println("No se pudo Registrar");
        }
        
       
         response.sendRedirect(request.getContextPath()+"/listarExposiciones");

    }


}
