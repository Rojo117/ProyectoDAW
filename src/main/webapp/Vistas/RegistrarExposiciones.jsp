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
        <title>Registrar Exposiciones</title>
    </head>
    <body>
        <h1>Registrar Exposiciones</h1>
        <form action="<%= request.getContextPath()%>/registrarExposiciones" method="POST">

        <label>Nombre de la Exposicion: </label>
        <input value="" type="text" name="nombre"><br>
        
        <label>Fecha de Inicio: </label>
        <input value="" type="date"  name="fecha_inicio"><br>
        
        <label>Fecha de Fin: </label>
        <input value="" type="date"  name="fecha_fin"><br>
        
             
        <input type="submit" value="Modificar">
    </form>
        <button onclick="window.location.href = '<%= request.getContextPath()%>/listarExposiciones'">Regresar al menu anterior</button><br>
    </body>
</html>
