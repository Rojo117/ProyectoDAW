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
import Modelos.Exposiciones;
import Modelos.artistas;
import Modelos.coleccion_permanente;
import Modelos.escultura;
import Modelos.estatuas;
import Modelos.objeto_de_arte;
import Modelos.otras_colecciones;
import Modelos.otros;
import Modelos.pintura;
import Modelos.prestados;
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
@WebServlet(name = "Informacion", urlPatterns = {"/Informacion"})
public class Informacion extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        boolean eliminado;

        String Seccion = request.getParameter("Seccion");
        switch (Seccion) {
            case "ObraDeArte":
                objeto_de_arte obra = new objeto_de_arte();
                int id = Integer.parseInt(request.getParameter("id"));
                Objeto_de_arteDAO acceso = new Objeto_de_arteDAO();
                obra = acceso.leer(id);
                request.getSession().setAttribute("leer2", obra);
                response.sendRedirect(request.getContextPath() + "/Vistas/ModificarObjetoDeArte.jsp");
                break;
            case "Artistas":
                artistas artis = new artistas();
                String nombre = request.getParameter("id");
                ArtistasDAO acceso2 = new ArtistasDAO();
                artis = acceso2.leer(nombre);
                request.getSession().setAttribute("leer2", artis);
                response.sendRedirect(request.getContextPath() + "/Vistas/ModificarArtistas.jsp");
                break;
            case "Exposiciones":
                Exposiciones expo = new Exposiciones();
                int id3 = Integer.parseInt(request.getParameter("id"));
                ExposicionesDAO acceso3 = new ExposicionesDAO();
                expo = acceso3.leer(id3);
                request.getSession().setAttribute("leer2", expo);
                response.sendRedirect(request.getContextPath() + "/Vistas/ModificarExposiciones.jsp");
                break;
            case "ColeccionOtros":
                otras_colecciones oc = new otras_colecciones();
                int id4 = Integer.parseInt(request.getParameter("id"));
                Otras_ColeccionesDAO acceso4 = new Otras_ColeccionesDAO();
                oc = acceso4.leer(id4);
                request.getSession().setAttribute("leer2", oc);
                response.sendRedirect(request.getContextPath() + "/Vistas/ModificarColeccionOtros.jsp");
                break;
            case "ColeccionPermanente":
                coleccion_permanente cp = new coleccion_permanente();
                int id5 = Integer.parseInt(request.getParameter("id"));
                Coleccion_permanenteDAO acceso5 = new Coleccion_permanenteDAO();
                cp = acceso5.leer(id5);
                request.getSession().setAttribute("leer2", cp);
                response.sendRedirect(request.getContextPath() + "/Vistas/ModificarColeccionPermanente.jsp");
                break;
            case "ColeccionPrestados":
                prestados prest = new prestados();
                int id6 = Integer.parseInt(request.getParameter("id"));
                PrestadosDAO acceso6 = new PrestadosDAO();
                prest = acceso6.leer(id6);
                request.getSession().setAttribute("leer2", prest);
                response.sendRedirect(request.getContextPath() + "/Vistas/ModificarColeccionPrestados.jsp");

                break;
            case "Esculturas":
                escultura esc = new escultura();
                int id7 = Integer.parseInt(request.getParameter("id"));
                EsculturasDAO acceso7 = new EsculturasDAO();
                esc = acceso7.leer(id7);
                request.getSession().setAttribute("leer2", esc);
                response.sendRedirect(request.getContextPath() + "/Vistas/ModificarEsculturas.jsp");

                break;
            case "Estatuas":
                estatuas esta = new estatuas();
                int id8 = Integer.parseInt(request.getParameter("id"));
                EstatuasDAO acceso8 = new EstatuasDAO();
                esta = acceso8.leer(id8);
                request.getSession().setAttribute("leer2", esta);
                response.sendRedirect(request.getContextPath() + "/Vistas/ModificarEstatuas.jsp");

                break;
            case "Otros":
                otros otr = new otros();
                int id9 = Integer.parseInt(request.getParameter("id"));
                OtrosDAO acceso9 = new OtrosDAO();
                otr = acceso9.leer(id9);
                request.getSession().setAttribute("leer2", otr);
                response.sendRedirect(request.getContextPath() + "/Vistas/ModificarOtros.jsp");
                
                break;
            case "Pinturas":
                pintura pint = new pintura();
                int id10 = Integer.parseInt(request.getParameter("id"));
                PinturaDAO acceso10 = new PinturaDAO();
                pint = acceso10.leer(id10);
                request.getSession().setAttribute("leer2", pint);
                response.sendRedirect(request.getContextPath() + "/Vistas/ModificarPinturas.jsp");

                break;

            default:
                throw new AssertionError();
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
