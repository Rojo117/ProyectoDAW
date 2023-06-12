<%-- 
    Document   : RegistrarColeccionPrestados
    Created on : 12 jun. 2023, 16:11:53
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
        <h1>Registrar Coleccion Prestados</h1>
    </body>
    <button onclick="window.location.href='ColeccionPrestados.jsp'">Regresar</button>
</html>
