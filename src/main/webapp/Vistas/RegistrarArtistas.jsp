<%-- 
    Document   : RegistrarArtistas
    Created on : 12 jun. 2023, 15:55:20
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
        <h1>Registrar Artistas</h1>
 <form action="<%= request.getContextPath()%>/modificarArtistas" method="POST">
        <label>Nombre del Artista: </label>
        <input value="" type="text"  name="nombre"><br>
        
        <label>Fecha de Nacimiento: </label>
        <input value="" type="date"  name="fecha_nacimiento"><br>
        
        <label>Fecha de Fallecimiento: </label>
        <input value="" type="date"  name="fecha_fallecimiento"><br>
        
        <label>País de Origen: </label>
        <input value="" type="text"  name="pais_origen"><br>
        
        <label>Época: </label>
        <input value="" type="text"  name="epoca"hidden>
        
        <label>Estilo: </label>
        <input value="" type="text"  name="estilo"><br>
        
        <label>Descripción: </label>
        <input value="" type="text"  name="descripcion"><br>
        
        <label>Estatus: </label>
        <input value="" type="number"  name="estatus"><br>
        
        <input type="submit" value="Registrar">
    </form>
        <button onclick="window.location.href = '<%= request.getContextPath()%>/listarArtistas'">Regresar al menu anterior</button><br>
</body>
</html>