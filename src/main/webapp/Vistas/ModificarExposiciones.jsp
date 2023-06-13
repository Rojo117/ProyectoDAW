<%-- 
    Document   : ModificarExposiciones
    Created on : 11 jun. 2023, 21:43:49
    Author     : conej
--%>
<%@page import="Datos.verificacion"%>
<%@page import="Modelos.Exposiciones"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    new verificacion().IsConnected(request, response, "");
    Exposiciones objeto = (Exposiciones) request.getSession().getAttribute("leer2");
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>MODIFICAR EXPOSCIONES</h1>
        <form action="<%= request.getContextPath()%>/modificarExposiciones" method="POST">
       
        <input value="<%= objeto.getIdExposicion()%>" type="text"  name="idExposicion"hidden>
        
        <label>Nombre:</label>
        <input value="<%= objeto.getNombre()%>" type="text" name="nombre"><br>
        
        <label>Fecha de Inicio:</label>
        <input value="<%= objeto.getFecha_inicio()%>" type="text"  name="fecha_inicio"><br>
        
        <label>Fecha de Fin:</label>
        <input value="<%= objeto.getFecha_fin()%>" type="text"  name="fecha_fin"><br>
             
        <input type="submit" value="Modificar">
    </form>
        <button onclick="window.location.href = '<%= request.getContextPath()%>/listarExposiciones'">Regresar al menu anterior</button><br>
    </body>
</html>
