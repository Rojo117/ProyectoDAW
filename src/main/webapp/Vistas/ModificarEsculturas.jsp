<%-- 
    Document   : ModificarEsculturas
    Created on : 12 jun. 2023, 23:24:38
    Author     : conej
--%>

<%@page import="Datos.verificacion"%>
<%@page import="Modelos.escultura"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    new verificacion().IsConnected(request, response, "");
    escultura objeto = (escultura) request.getSession().getAttribute("leer2");
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>MODIFICAR ESCULTURA</h1>
        <form action="<%= request.getContextPath()%>/modificarEsculturas" method="POST">

            <input value="<%= objeto.getIdObraDeArte()%>" type="text"  name="idObraDeArte" hidden>

            <label>material:</label>
            <input value="<%= objeto.getMaterial()%>" type="text"  name="material"><br>

            <label>altura:</label>
            <input value="<%= objeto.getAltura()%>" type="text"  name="altura">

            <label>Peso:</label>
            <input value="<%= objeto.getPeso()%>" type="text"  name="peso"><br>

            <label>Estilo:</label>
            <input value="<%= objeto.getEstilo()%>" type="text"  name="Estilo"><br>

            <input type="submit" value="Modificar">

        </form>
        <button onclick="window.location.href = '<%= request.getContextPath()%>/listarEscultura'">Regresar al menu anterior</button><br>

    </body>
</html>
