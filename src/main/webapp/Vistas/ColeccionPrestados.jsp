<%-- 
    Document   : ColeccionPrestados
    Created on : 9 jun. 2023, 14:18:21
    Author     : conej
--%>

<%@page import="Modelos.prestados"%>
<%@page import="java.util.List"%>
<%@page import="Datos.verificacion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    new verificacion().IsConnected(request, response,"");
    List<prestados> lista = (List<prestados>) request.getSession().getAttribute("objeto");
%>
<html
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="index.css">
        <title>Menu Prestados</title>
    </head>
    <body>
            <h1>Prestados</h1>
            <button onclick="window.location.href='RegistrarColeccionPrestados.jsp'">Registrar Coleccion Prestados</button>

        <table>
            <tr>
                <th>idObraDeArte</th>
                <th>prestamista</th>
                <th>fecha_inicio</th>
                <th>fecha_fin</th>
                <th>Eliminar</th>
                <th>Modificar</th>
           
            </tr>
<%
                if (lista != null) {
                    for (prestados objeto : lista) {
            %>
            <tr>
                <th><%= objeto.getIdObraDeArte()%> </th>
                <th><%= objeto.getPrestamista()%></th>
                <th><%= objeto.getFecha_inicio()%> </th>
                <th><%= objeto.getFecha_fin()%></th>
                <th> <button onclick="window.location.href='<%= request.getContextPath()%>/Eliminar?id=<%=objeto.getIdObraDeArte()%>&Seccion=ColeccionPrestados'">Eliminar</button> </th>
                <th> <button onclick="window.location.href='<%= request.getContextPath()%>/Informacion?id=<%=objeto.getIdObraDeArte()%>&Seccion=ColeccionPrestados'">Modificar</button> </th>
            </tr>
            <%
                    }
                }
            %>
        </table>
    </body>
        <button onclick="window.location.href='Colecciones.jsp'">Regresar</button>
</html>
