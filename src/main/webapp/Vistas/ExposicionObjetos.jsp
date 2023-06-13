<%-- 
    Document   : ExposicionObjetos
    Created on : 9 jun. 2023, 14:26:01
    Author     : conej
--%>

<%@page import="Datos.verificacion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    new verificacion().IsConnected(request, response,"");
%>
<html
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exposiciones de Objetos de arte</title>
    </head>
    <body>
        <h1>Exposicion de Obras de arte</h1>
    </body>
    <button onclick="window.location.href='Exposiciones.jsp'">Regresar</button>
</html>
