<%-- 
    Document   : RegistrarPinturas
    Created on : 12 jun. 2023, 16:14:49
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
        <title>Registrar Pintura</title>
    </head>
    <body>
        <h1>Registrar Pintura</h1>
       <form action="<%= request.getContextPath()%>/registrarPinturas" method="POST">
           <label>Id de la Obra:</label>
            <input value="" type="number"  name="idObraDeArte"><br>

            <label>Tipo de pintura:</label>
            <input value=""  type="text"  name="tipo_pintura"><br>

            <label>Material:</label>
            <input value=""  type="text"  name="material"><br>

            <label>Estilo:</label>
            <input value=""  type="text"  name="estilo"><br>
            
            <label>Estatus:</label>
            <input value="" type="number"  name="estatus"><br>

           <input type="submit" value="Registrar">

        </form>
        <button onclick="window.location.href = '<%= request.getContextPath()%>/listarPintura'">Regresar al menu anterior</button><br>

    </body>
</html>
