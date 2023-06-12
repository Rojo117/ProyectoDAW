<%-- 
    Document   : RegistrarArtistas
    Created on : 12 jun. 2023, 15:55:20
    Author     : conej
--%>

<%@page import="Datos.verificacion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    new verificacion().IsConnected(request, response,"");
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Registrar Artistas</h1>
    </body>
    <button onclick="window.location.href='Artistas.jsp'">Regresar</button>
</html>
