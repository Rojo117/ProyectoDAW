/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlets;

import Datos.ArtistasDAO;
import Modelos.artistas;
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
@WebServlet(name = "registrarArtistas", urlPatterns = {"/registrarArtistas"})
public class registrarArtistas extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         artistas objeto = new artistas();
        objeto.setNombre(request.getParameter("nombre"));//string
        objeto.setFecha_nacimiento(Date.valueOf(request.getParameter("fecha_nacimiento")));//date
        objeto.setFecha_fallecimiento(Date.valueOf(request.getParameter("fecha_fallecimiento")));//date
        objeto.setPais_origen(request.getParameter("pais_origen"));//string
        objeto.setEpoca(Integer.parseInt(request.getParameter("epoca")));//int
        objeto.setEstilo(request.getParameter("estilo"));//string
        objeto.setDescripcion(request.getParameter("descripcion"));//string
        ArtistasDAO access = new ArtistasDAO();
                 boolean registrado = access.Registrar(objeto);
         if (registrado) {
            System.out.println("Registrado correctamente");

        } else {
            System.out.println("No se pudo Registrar");
        }
        
       
         response.sendRedirect(request.getContextPath()+"/listarArtistas");


    }


}
