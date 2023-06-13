/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlets;

import Datos.Otras_ColeccionesDAO;
import Modelos.otras_colecciones;
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
@WebServlet(name = "modificarColeccionOtros", urlPatterns = {"/modificarColeccionOtros"})
public class modificarColeccionOtros extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        otras_colecciones objeto = new otras_colecciones();
        objeto.setIdObraDeArte(Integer.parseInt(request.getParameter("idObraDeArte")));
        objeto.setNombre_coleccion(request.getParameter("nombre_coleccion"));//string
        objeto.setTipoColeccion(request.getParameter("tipoColeccion"));//string
        objeto.setDescripcion(request.getParameter("descripcion"));//string
        objeto.setDireccion(request.getParameter("direccion"));//string
        objeto.setTelefono(request.getParameter("telefono"));//string
        objeto.setNombre_contacto(request.getParameter("nombre_contacto"));//string
        Otras_ColeccionesDAO access = new Otras_ColeccionesDAO();
        boolean modificado = access.modificar(objeto);
                 if (modificado) {
            System.out.println("Modificado correctamente");

        } else {
            System.out.println("No se pudo modificar");
        }
         response.sendRedirect(request.getContextPath()+"/Informacion?id="+objeto.getIdObraDeArte()+"&Seccion=ColeccionOtros");
    }

}
