<%-- 
    Document   : ColeccionOtros
    Created on : 9 jun. 2023, 14:18:30
    Author     : conej
--%>

<%@page import="Modelos.otras_colecciones"%>
<%@page import="java.util.List"%>
<%@page import="Datos.verificacion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    new verificacion().IsConnected(request, response,"");
    List<otras_colecciones> lista = (List<otras_colecciones>) request.getSession().getAttribute("objeto");
%>
<html
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
               <h1>OtrasColecciones</h1>
        <table>
            <tr>
                <th>idObraDeArte</th>
                <th>nombre_coleccion </th>
                <th>tipoColeccion </th>
                <th>descripcion </th>  
                <th>direccion</th>  
                <th>telefono</th>  
                <th>nombre_contacto</th>  
            </tr>
<%
                if (lista != null) {
                    for (otras_colecciones objeto : lista) {
            %>
            <tr>
                <th><%= objeto.getIdObraDeArte()%> </th>
                <th><%= objeto.getNombre_coleccion()%></th>
                <th><%= objeto.getTipoColeccion()%> </th>
                <th><%= objeto.getDescripcion()%></th>
                <th><%= objeto.getDireccion()%></th>
                <th><%= objeto.getTelefono()%></th>
                <th><%= objeto.getNombre_contacto()%></th>
                <th>Eliminar </th>
                <th>Modificar </th>
            </tr>
            <%
                    }
                }
            %>
        </table>
    </body>
        <button onclick="window.location.href='Colecciones.jsp'">Regresar</button>
</html>
