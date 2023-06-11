<%-- 
    Document   : Colecciones
    Created on : 9 jun. 2023, 14:10:32
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
        <title>JSP Page</title>
 </head>
<body>
    <h1>Menu Colecciones</h1>
    
    <button onclick="window.location.href='<%= request.getContextPath()%>/listarColeccionTemporal">Mostrar colección prestados</button><br>
    <button onclick="window.location.href='<%= request.getContextPath()%>/listarColeccionPermanente'">Mostrar colección permanente</button><br>
    <button onclick="window.location.href='<%= request.getContextPath()%>/listarColeccionOtros'">Mostrar colección otros</button><br>
    <button onclick="window.location.href='<%= request.getContextPath()%>/listarColeccionTemporal'">Mostrar colección prestados</button><br>
    <button onclick="window.location.href='MenuInicio.jsp'">Regresar</button>
</body>
</html>
