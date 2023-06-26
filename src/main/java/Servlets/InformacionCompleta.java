/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlets;

import Datos.EsculturasDAO;
import Datos.EstatuasDAO;
import Datos.Objeto_de_arteDAO;
import Datos.OtrosDAO;
import Datos.PinturaDAO;
import Modelos.escultura;
import Modelos.estatuas;
import Modelos.objeto_de_arte;
import Modelos.otros;
import Modelos.pintura;
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
@WebServlet(name = "InformacionCompleta", urlPatterns = {"/InformacionCompleta"})
public class InformacionCompleta extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Objeto_de_arteDAO data = new Objeto_de_arteDAO();
        objeto_de_arte objeto = data.leer(id);
        request.getSession().setAttribute("objeto", objeto);
        switch(objeto.getIdTipo()){
            case 1:
                PinturaDAO datapintura = new PinturaDAO();
                pintura pintura = datapintura.leer(id);
                request.getSession().setAttribute("pintura", pintura);
                break;
            case 2:
                EsculturasDAO dataescultura = new EsculturasDAO();
                escultura escultura = dataescultura.leer(id);
                request.getSession().setAttribute("escultura", escultura);
                break;
            case 3:
                EstatuasDAO dataestatua = new EstatuasDAO();
                estatuas estatua = dataestatua.leer(id);
                request.getSession().setAttribute("estatua", estatua);
                break;
            default:
                OtrosDAO dataotros = new OtrosDAO();
                otros otros = dataotros.leer(id);
                request.getSession().setAttribute("otros", otros);
                break;
        }
        response.sendRedirect(request.getContextPath()+"/Vistas/vertodo.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
