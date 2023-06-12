<%-- 
    Document   : RegistrarExposiciones
    Created on : 12 jun. 2023, 15:45:57
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
        <h1>Registrar Exposiciones</h1>
    </body>
    <button onclick="window.location.href='Exposiciones.jsp'">Regresar</button>
</html>
