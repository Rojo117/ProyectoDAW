/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlets;

import Datos.OtrosDAO;
import Modelos.otros;
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
@WebServlet(name = "modificarOtros", urlPatterns = {"/modificarOtros"})
public class modificarOtros extends HttpServlet {
String msg = null;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        otros objeto = new otros();
        objeto.setIdObraDeArte(Integer.parseInt(request.getParameter("idObraDeArte")));
        objeto.setTipo(request.getParameter("tipo"));//string
        objeto.setEstilo(request.getParameter("estilo"));//string
        OtrosDAO access = new OtrosDAO();
        boolean modificado = access.modificar(objeto);
        if (modificado) {
            msg = "<script>alert('Modificado Correctamente')</script>";

        } else {
            msg = "<script>alert('No se pudo modificar')</script>";
        }
        request.getSession().setAttribute("msg", msg);
         response.sendRedirect(request.getContextPath()+"/Informacion?id="+objeto.getIdObraDeArte()+"&Seccion=Otros");
    }

}
