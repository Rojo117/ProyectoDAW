<%-- 
    Document   : RegistrarEstatuas
    Created on : 12 jun. 2023, 16:17:13
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
        <h1>Registrar Estatua</h1>
<form action="<%= request.getContextPath()%>/modificarEstatuas" method="POST">

            <input value="<%= %>" type="text"  name="idObraDeArte" hidden>

            <label>Altura:</label>
            <input value="<%= %>" type="text"  name="altura"><br>

            <label>Peso:</label>
            <input value="<%= %>" type="text"  name="peso"><br>

            <label>Representacion:</label>
            <input value="<%= %>" type="text"  name="representacion"><br>

            <input type="submit" value="Modificar">

        </form>
        <button onclick="window.location.href = '<%= request.getContextPath()%>/listarEstatua'">Regresar al menu anterior</button><br>

    </body>
</html>
