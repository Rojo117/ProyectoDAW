<%-- 
    Document   : RegistrarEscultura
    Created on : 12 jun. 2023, 16:22:18
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
        <h1>Registrar Escultura</h1>
<form action="<%= request.getContextPath()%>/modificarEsculturas" method="POST">

            <input value="<%= %>" type="text"  name="idObraDeArte" hidden>

            <label>material:</label>
            <input value="<%= %>" type="text"  name="material"><br>

            <label>altura:</label>
            <input value="<%= %>" type="text"  name="altura">

            <label>Peso:</label>
            <input value="<%= %>" type="text"  name="peso"><br>

            <label>Estilo:</label>
            <input value="<%= %>" type="text"  name="estilo"><br>

            <input type="submit" value="Modificar">

        </form>
        <button onclick="window.location.href = '<%= request.getContextPath()%>/listarEscultura'">Regresar al menu anterior</button><br>

    </body>
</html>
