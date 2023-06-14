<%-- 
    Document   : RegistrarOtro
    Created on : 12 jun. 2023, 16:20:26
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
        <link rel="stylesheet" href="index.css">
        <title>Registrar Otro</title>
    </head>
    <body>
        <h1>Registrar Otro</h1>
        <form action="<%= request.getContextPath()%>/registrarOtros" method="POST">
            <label>ID de la Obra:</label>
            <input value="" type="number"  name="idObraDeArte"><br>

            <label>Tipo: </label>
            <input value="" type="text"  name="tipo"><br>

            <label>Estilo: </label>
            <input value="" type="text"  name="estilo"><br>
            
            <label>Estatus: </label>
            <input value="" type="number"  name="estatus"><br>

            <input type="submit" value="Registar">

        </form>
        <button onclick="window.location.href = '<%= request.getContextPath()%>/listarOtro'">Regresar al menu anterior</button><br>

    </body>
</html>