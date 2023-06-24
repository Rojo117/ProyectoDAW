/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlets;

import Datos.Objeto_de_arteDAO;
import Modelos.objeto_de_arte;
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
@WebServlet(name = "modificarObjetoDeArte", urlPatterns = {"/modificarObjetoDeArte"})
public class modificarObjetoDeArte extends HttpServlet {
String msg = null;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        objeto_de_arte objeto = new objeto_de_arte();
        objeto.setIdObraDeArte(Integer.parseInt(request.getParameter("idObraDeArte")));
        objeto.setNombreObra(request.getParameter("nombreObra"));
        objeto.setArtista(request.getParameter("artista"));//string
        objeto.setId_coleccion(Integer.parseInt(request.getParameter("id_coleccion")));//int
        objeto.setFecha_creacion(Date.valueOf(request.getParameter("fecha_creacion")));//date
        objeto.setTitulo(request.getParameter("titulo"));//string
        objeto.setDescripcion(request.getParameter("descripcion"));//string
        objeto.setIdEpoca(Integer.parseInt(request.getParameter("idEpoca")));//int
        objeto.setIdOrigen(Integer.parseInt(request.getParameter("idOrigen")));//int
        objeto.setIdTipo(Integer.parseInt(request.getParameter("idTipo")));//int
        Objeto_de_arteDAO access = new Objeto_de_arteDAO();
        boolean modificado = access.modificar(objeto);
        if (modificado) {
            msg = "<script>alert('Modificado Correctamente')</script>";

        } else {
            msg = "<script>alert('No se pudo modificar')</script>";
        }
        request.getSession().setAttribute("msg", msg);
         response.sendRedirect(request.getContextPath()+"/Informacion?id="+objeto.getIdObraDeArte()+"&Seccion=ObraDeArte");
    }

}
