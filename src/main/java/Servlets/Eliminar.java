/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlets;

import Datos.ArtistasDAO;
import Datos.Objeto_de_arteDAO;
import Modelos.objeto_de_arte;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author conej
 */
@WebServlet(name = "Eliminar", urlPatterns = {"/Eliminar"})
public class Eliminar extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        boolean eliminado;
        String Seccion = request.getParameter("Seccion");
        switch (Seccion) {
            case "ObraDeArte":
                int id = Integer.parseInt(request.getParameter("id"));
                Objeto_de_arteDAO acceso = new Objeto_de_arteDAO();
                eliminado = acceso.Eliminar(id);
                comprobar(eliminado);
                response.sendRedirect(request.getContextPath() + "/listarObjeto");
                break;
            case "Artistas":
                String id2 = request.getParameter("id");
                ArtistasDAO acceso2 = new ArtistasDAO();
                eliminado = acceso2.Eliminar(id2);
                comprobar(eliminado);
                response.sendRedirect(request.getContextPath() + "/listarArtistas");
                break;
            default:
                throw new AssertionError();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    protected void comprobar(boolean eliminado) {
        if (eliminado) {
            System.out.println("Eliminado correctamente");

        } else {
            System.out.println("No se pudo eliminar");
        }
    }

}
