/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlets;

import Datos.PinturaDAO;
import Modelos.pintura;
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
@WebServlet(name = "modificarPinturas", urlPatterns = {"/modificarPinturas"})
public class modificarPinturas extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        pintura objeto = new pintura();
        objeto.setIdObraDeArte(Integer.parseInt(request.getParameter("idObraDeArte")));
        objeto.setTipo_pintura(request.getParameter("tipo_pintura"));//string
        objeto.setMaterial(request.getParameter("material"));//string
        objeto.setEstilo(request.getParameter("estilo"));//string
        PinturaDAO access = new PinturaDAO();
        boolean modificado = access.modificar(objeto);
                 if (modificado) {
            System.out.println("Modificado correctamente");

        } else {
            System.out.println("No se pudo modificar");
        }
         response.sendRedirect(request.getContextPath()+"/Informacion?id="+objeto.getIdObraDeArte()+"&Seccion=Pinturas");
    }

}
