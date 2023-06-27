/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlets;

import Datos.Otras_ColeccionesDAO;
import Modelos.otras_colecciones;
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
@WebServlet(name = "registrarColeccionOtros", urlPatterns = {"/registrarColeccionOtros"})
public class registrarColeccionOtros extends HttpServlet {
String msg = null;
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
        boolean existe = access.comprobar(objeto.getIdObraDeArte());
        if (existe) {
            System.out.println("Esta coleccion de arte ya existe");

        } else {
            boolean registrado = access.Registrar(objeto);
            if (registrado) {
                msg = "<script>alert('Registrado Correctamente')</script>";

            } else {
                msg = "<script>alert('No se pudo Registrar - vuelve a intentarlo')</script>";
            }
            request.getSession().setAttribute("msg", msg);
        }

        response.sendRedirect(request.getContextPath() + "/listarColeccionOtros");
    }

}
