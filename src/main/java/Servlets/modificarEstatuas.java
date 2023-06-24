/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlets;

import Datos.EstatuasDAO;
import Modelos.estatuas;
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
@WebServlet(name = "modificarEstatuas", urlPatterns = {"/modificarEstatuas"})
public class modificarEstatuas extends HttpServlet {
String msg = null;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        estatuas objeto = new estatuas();
        objeto.setIdObraDeArte(Integer.parseInt(request.getParameter("idObraDeArte")));
        objeto.setAltura(Integer.parseInt(request.getParameter("altura")));
        objeto.setPeso(Integer.parseInt(request.getParameter("peso")));
        objeto.setRepresentacion(request.getParameter("representacion"));//string
        EstatuasDAO access = new EstatuasDAO();
        boolean modificado = access.modificar(objeto);
         if (modificado) {
            msg = "<script>alert('Modificado Correctamente')</script>";

        } else {
            msg = "<script>alert('No se pudo modificar')</script>";
        }
        request.getSession().setAttribute("msg", msg);
         response.sendRedirect(request.getContextPath()+"/Informacion?id="+objeto.getIdObraDeArte()+"&Seccion=Estatuas");
    }


}
