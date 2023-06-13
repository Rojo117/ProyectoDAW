<%-- 
    Document   : ModificarEstatuas
    Created on : 12 jun. 2023, 23:24:22
    Author     : conej
--%>

<%@page import="Datos.verificacion"%>
<%@page import="Modelos.estatuas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    new verificacion().IsConnected(request, response, "");
    estatuas objeto = (estatuas) request.getSession().getAttribute("leer2");
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>MODIFICAR ESTATUA</h1>
        <form action="<%= request.getContextPath()%>/modificarEstatuas" method="POST">

            <input value="<%= objeto.getIdObraDeArte()%>" type="text"  name="idObraDeArte" hidden>

            <label>Altura:</label>
            <input value="<%= objeto.getAltura()%>" type="text"  name="altura"><br>

            <label>Peso:</label>
            <input value="<%= objeto.getPeso()%>" type="text"  name="peso"><br>

            <label>Representacion:</label>
            <input value="<%= objeto.getRepresentacion()%>" type="text"  name="representacion"><br>

            <input type="submit" value="Modificar">

        </form>
        <button onclick="window.location.href = '<%= request.getContextPath()%>/listarEstatua'">Regresar al menu anterior</button><br>

    </body>
</html>
