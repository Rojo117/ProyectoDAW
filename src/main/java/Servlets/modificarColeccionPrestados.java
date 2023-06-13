/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlets;

import Datos.PrestadosDAO;
import Modelos.prestados;
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
@WebServlet(name = "modificarColeccionPrestados", urlPatterns = {"/modificarColeccionPrestados"})
public class modificarColeccionPrestados extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        prestados objeto = new prestados();
        objeto.setIdObraDeArte(Integer.parseInt(request.getParameter("idObraDeArte")));
        objeto.setPrestamista(request.getParameter("prestamista"));//string
        objeto.setFecha_inicio(Date.valueOf(request.getParameter("fecha_inicio")));//date
        objeto.setFecha_fin(Date.valueOf(request.getParameter("fecha_fin")));//date
        PrestadosDAO access = new PrestadosDAO();
        boolean modificado = access.modificar(objeto);
                 if (modificado) {
            System.out.println("Modificado correctamente");

        } else {
            System.out.println("No se pudo modificar");
        }
         response.sendRedirect(request.getContextPath()+"/Informacion?id="+objeto.getIdObraDeArte()+"&Seccion=ColeccionPrestados");
    }


}
