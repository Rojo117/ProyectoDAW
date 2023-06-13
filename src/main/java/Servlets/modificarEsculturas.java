/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlets;

import Datos.EsculturasDAO;
import Modelos.escultura;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author conej
 */
@WebServlet(name = "modificarEsculturas", urlPatterns = {"/modificarEsculturas"})
public class modificarEsculturas extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        escultura objeto = new escultura();
        objeto.setIdObraDeArte(Integer.parseInt(request.getParameter("idObraDeArte")));
        objeto.setMaterial(request.getParameter("material"));//string
        objeto.setAltura(Integer.parseInt(request.getParameter("altura")));
        objeto.setPeso(Integer.parseInt(request.getParameter("peso")));
        objeto.setEstilo(request.getParameter("estilo"));//string
        EsculturasDAO access = new EsculturasDAO();
        boolean modificado = access.modificar(objeto);
                 if (modificado) {
            System.out.println("Modificado correctamente");

        } else {
            System.out.println("No se pudo modificar");
        }
         response.sendRedirect(request.getContextPath()+"/Informacion?id="+objeto.getIdObraDeArte()+"&Seccion=Esculturas");
    }


}
