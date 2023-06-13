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
        <title>Registrar Estatua</title>
    </head>
    <body>
        <h1>Registrar Estatua</h1>
<form action="<%= request.getContextPath()%>/registrarEstatua" method="POST">
            <label>Id de la Obra:</label>
            <input value="" type="text"  name="idObraDeArte"><br>

            <label>Altura en centimetros: </label>
            <input value="" type="number"  name="altura"><br>

            <label>Peso en gramos: </label>
            <input value="" type="number"  name="peso"><br>

            <label>Representacion: </label>
            <input value="" type="text"  name="representacion"><br>
            
            <label>Estatus: </label>
            <input value="" type="number"  name="estatus"><br>

            <input type="submit" value="Registrar">

        </form>
        <button onclick="window.location.href = '<%= request.getContextPath()%>/listarEstatua'">Regresar al menu anterior</button><br>

    </body>
</html>
