/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlets;

import Datos.ArtistasDAO;
import Datos.Coleccion_permanenteDAO;
import Datos.EsculturasDAO;
import Datos.EstatuasDAO;
import Datos.ExposicionesDAO;
import Datos.Objeto_de_arteDAO;
import Datos.Otras_ColeccionesDAO;
import Datos.OtrosDAO;
import Datos.PinturaDAO;
import Datos.PrestadosDAO;
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
            case "Exposiciones":
                int id3 = Integer.parseInt(request.getParameter("id"));
                ExposicionesDAO acceso3 = new ExposicionesDAO();
                eliminado = acceso3.Eliminar(id3);
                comprobar(eliminado);
                response.sendRedirect(request.getContextPath() + "/listarExposiciones");
                break;
                case "ColeccionOtros":
                int id4 = Integer.parseInt(request.getParameter("id"));
                Otras_ColeccionesDAO acceso4 = new Otras_ColeccionesDAO();
                eliminado = acceso4.Eliminar(id4);
                comprobar(eliminado);     
                response.sendRedirect(request.getContextPath() + "/listarColeccionOtros");
                break;
            case "ColeccionPermanente":             
                int id5 = Integer.parseInt(request.getParameter("id"));
                Coleccion_permanenteDAO acceso5 = new Coleccion_permanenteDAO();
                eliminado = acceso5.Eliminar(id5);
                comprobar(eliminado); 
                response.sendRedirect(request.getContextPath() + "/listarColeccionPermanente");
                break;
            case "ColeccionPrestados":
                int id6 = Integer.parseInt(request.getParameter("id"));
                PrestadosDAO acceso6 = new PrestadosDAO();
                 eliminado = acceso6.Eliminar(id6);
                comprobar(eliminado); 
                response.sendRedirect(request.getContextPath() + "/listarColeccionTemporal");

                break;
            case "Esculturas":
                int id7 = Integer.parseInt(request.getParameter("id"));
                EsculturasDAO acceso7 = new EsculturasDAO();
                eliminado = acceso7.Eliminar(id7);
                comprobar(eliminado);
                response.sendRedirect(request.getContextPath() + "/listarEscultura");

                break;
            case "Estatuas":
                int id8 = Integer.parseInt(request.getParameter("id"));
                EstatuasDAO acceso8 = new EstatuasDAO();
                eliminado = acceso8.Eliminar(id8);
                comprobar(eliminado);
                response.sendRedirect(request.getContextPath() + "/listarEstatua");

                break;
            case "Otros":
                int id9 = Integer.parseInt(request.getParameter("id"));
                OtrosDAO acceso9 = new OtrosDAO();
                eliminado = acceso9.Eliminar(id9);
                comprobar(eliminado);
                response.sendRedirect(request.getContextPath() + "/listarOtro");
                
                break;
            case "Pinturas":
                int id10 = Integer.parseInt(request.getParameter("id"));
                PinturaDAO acceso10 = new PinturaDAO();
                eliminado = acceso10.Eliminar(id10);
                comprobar(eliminado);
                response.sendRedirect(request.getContextPath() + "/listarPintura");

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
