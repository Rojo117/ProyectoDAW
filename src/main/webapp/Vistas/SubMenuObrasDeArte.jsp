<%-- 
    Document   : SubMenuObrasDeArte
    Created on : 12 jun. 2023, 13:26:47
    Author     : conej
--%>

<%@page import="Datos.verificacion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    new verificacion().IsConnected(request, response, "");
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Categorias de Arte</h1>
        <button onclick="window.location.href = '<%= request.getContextPath()%>/listarPintura'">Mostrar Pinturas</button><br>
        <button onclick="window.location.href = '<%= request.getContextPath()%>/listarEstatua'">Mostrar Estatuas</button><br>
        <button onclick="window.location.href = '<%= request.getContextPath()%>/listarEscultura'">Mostrar Esculturas</button><br>
        <button onclick="window.location.href = '<%= request.getContextPath()%>/listarOtro'">Mostrar Otros</button><br>
        <button onclick="window.location.href = 'MenuInicio.jsp'">Regresar</button>
    </body>
</html>
