/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlets;

import Datos.Coleccion_permanenteDAO;
import Modelos.coleccion_permanente;
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
@WebServlet(name = "modificarColeccionPermanente", urlPatterns = {"/modificarColeccionPermanente"})
public class modificarColeccionPermanente extends HttpServlet {
String msg = null;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        coleccion_permanente objeto = new coleccion_permanente();
        objeto.setIdObraDeArte(Integer.parseInt(request.getParameter("idObraDeArte")));
        objeto.setFecha_adquisicion(Date.valueOf(request.getParameter("fecha_adquisicion")));//date
        objeto.setEstado(request.getParameter("estado"));//string
        objeto.setCosto(Integer.parseInt(request.getParameter("costo")));//int
        Coleccion_permanenteDAO access = new Coleccion_permanenteDAO();
        boolean modificado = access.modificar(objeto);
         if (modificado) {
            msg = "<script>alert('Modificado Correctamente')</script>";

        } else {
            msg = "<script>alert('No se pudo modificar')</script>";
        }
        request.getSession().setAttribute("msg", msg);
         response.sendRedirect(request.getContextPath()+"/Informacion?id="+objeto.getIdObraDeArte()+"&Seccion=ColeccionPermanente");
    }


}
