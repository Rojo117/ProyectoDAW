<%-- 
    Document   : Artistas
    Created on : 9 jun. 2023, 13:57:25
    Author     : conej
--%>

<%@page import="java.util.List"%>
<%@page import="Modelos.artistas"%>
<%@page import="Datos.verificacion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    new verificacion().IsConnected(request, response, "");
    List<artistas> lista = (List<artistas>) request.getSession().getAttribute("objeto");
%>
<%
    String msg = "";
    if (request.getSession().getAttribute("msg") != null) {
        msg = request.getSession().getAttribute("msg").toString();
        out.print(msg);
        request.getSession().removeAttribute("msg");
    }
%>
<html
    <html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="index.css">
        <title>Artistas</title>
    </head>
    <body>
        <h1>Menu Artistas</h1>
        <button onclick="window.location.href = 'RegistrarArtistas.jsp'">Registrar Artistas</button>
        <table>

            <tr>
                <th>nombre</th>
                <th>fecha_nacimiento</th>
                <th>fecha_fallecimiento</th>
                <th>pais_origen</th>
                <th>epoca</th>
                <th>estilo</th>
                <th>descripcion</th>
                <th>Eliminar</th>
                <th>Modificar</th>
                <th>Obras</th>
            </tr>
            <%
                if (lista != null) {
                    for (artistas objeto : lista) {
            %>
            <tr>
                <th><%= objeto.getNombre()%> </th>
                <th><%= objeto.getFecha_nacimiento()%></th>
                <th><%= objeto.getFecha_fallecimiento()%> </th>
                <th><%= objeto.getPais_origen()%></th>
                <th><%= objeto.getEpoca()%></th>
                <th><%= objeto.getEstilo()%></th>
                <th><%= objeto.getDescripcion()%></th>
                <th> <button onclick="window.location.href = '<%= request.getContextPath()%>/Vistas/Confirmar.jsp?id=<%=objeto.getNombre()%>&seccion=9'">Eliminar</button> </th>
                <th> <button onclick="window.location.href = '<%= request.getContextPath()%>/Informacion?id=<%=objeto.getNombre()%>&Seccion=Artistas'">Modificar</button> </th>
                <th> <button onclick="window.location.href = '<%= request.getContextPath()%>/arteArtista?id=<%=objeto.getNombre()%>'">Ver arte</button> </th>
            </tr>
            <%
                    }
                }
            %>

        </table>
        <button onclick="window.location.href = 'MenuInicio.jsp'">Regresar</button>
    </body>
</html>
