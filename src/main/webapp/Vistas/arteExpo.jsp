<%-- 
    Document   : arteExpo
    Created on : 26 jun 2023, 16:17:45
    Author     : conej
--%>

<%@page import="Modelos.objeto_de_arte"%>
<%@page import="java.util.List"%>
<%@page import="Datos.verificacion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    new verificacion().IsConnected(request, response, "");
    List<objeto_de_arte> lista = (List<objeto_de_arte>) request.getSession().getAttribute("list");
    String expo = (String) request.getSession().getAttribute("expo");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="index.css">
        <title>Obras <%= expo%></title>
    </head>
    <body>
        <h1>Obras <%= expo%></h1>
        <table>
            <tr>
                <th>idObraDeArte</th>
                <th>nombreObra</th>
                <th>artista</th>
                <th>id_coleccion</th>
                <th>fecha_creacion</th>
                <th>titulo</th>
                <th>descripcion</th>
                <th>idEpoca</th>
                <th>idOrigen</th>
                <th>idTipo</th>
            </tr>
            <%
                if (lista != null) {
                    for (objeto_de_arte objeto : lista) {
            %>
            <tr>         
                <th><%= objeto.getIdObraDeArte()%> </th>
                <th><%= objeto.getNombreObra()%></th>
                <th><%= objeto.getArtista()%> </th>
                <th><%= objeto.getId_coleccion()%></th>
                <th><%= objeto.getFecha_creacion()%></th>
                <th><%= objeto.getTitulo()%></th>
                <th><%= objeto.getDescripcion()%></th>
                <th><%= objeto.getIdEpoca()%></th>
                <th><%= objeto.getIdOrigen()%></th>
                <th><%= objeto.getIdTipo()%> </th>
            </tr>
            <%
                    }
                }
            %>
        </table>
        <button onclick="window.location.href = '<%= request.getContextPath()%>/listarExposiciones'">Regresar</button>
    </body>
</html>
