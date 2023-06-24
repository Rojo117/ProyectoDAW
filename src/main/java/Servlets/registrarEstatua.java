/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlets;

import Datos.EstatuasDAO;
import Modelos.estatuas;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author conej
 */
@WebServlet(name = "registrarEstatua", urlPatterns = {"/registrarEstatua"})
public class registrarEstatua extends HttpServlet {
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
        boolean existe = access.comprobar(objeto.getIdObraDeArte());
            if (existe) {
            System.out.println("Esta obra de arte ya existe");
            
        }else{
         boolean registrado = access.Registrar(objeto);
        if (registrado) {
            msg = "<script>alert('Registrado Correctamente')</script>";

        } else {
            msg = "<script>alert('No se pudo Registrar - vuelve a intentarlo')</script>";
        }
        request.getSession().setAttribute("msg", msg);
        }
       
         response.sendRedirect(request.getContextPath()+"/listarEstatua");
    }
    }

