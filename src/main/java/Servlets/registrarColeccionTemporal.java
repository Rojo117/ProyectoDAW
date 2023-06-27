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
@WebServlet(name = "registrarColeccionTemporal", urlPatterns = {"/registrarColeccionTemporal"})
public class registrarColeccionTemporal extends HttpServlet {
String msg = null;
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
                 boolean existe = access.comprobar(objeto.getIdObraDeArte());
        if (existe) {
            System.out.println("Esta coleccion de arte ya existe");
            
        }else{
         boolean registrado = access.Registrar(objeto);
         if (registrado) {
            msg = "<script>alert('Registrado Correctamente')</script>";

        } else {
            msg = "<script>alert('No se pudo Registrar - vuelve a intentarlo')</script>";
        }
        request.getSession().setAttribute("msg", msg);
        }
       
         response.sendRedirect(request.getContextPath()+"/listarColeccionTemporal");
    }


    }


