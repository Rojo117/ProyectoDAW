<%-- 
    Document   : ModificarColeccionPermanente
    Created on : 12 jun. 2023, 23:23:19
    Author     : conej
--%>

<%@page import="Modelos.coleccion_permanente"%>
<%@page import="Datos.verificacion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    new verificacion().IsConnected(request, response, "");
    coleccion_permanente objeto = (coleccion_permanente) request.getSession().getAttribute("leer2");
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="index.css">
        <title>Modificar coleccion permanente</title>
    </head>
    <body>
        <h1>MODIFICAR COLECCION PERMANENTE</h1>
        <form action="<%= request.getContextPath()%>/modificarColeccionPermanente" method="POST">

             <input value="<%= objeto.getIdObraDeArte()%>" type="number"  name="idObraDeArte" hidden>

            <label>Fecha de adquisicion: </label>
            <input value="<%= objeto.getFecha_adquisicion()%>" type="date"  name="fecha_adquisicion"><br>

            <label>Estado: </label>  
            <input value="<%= objeto.getEstado()%>" type="text"  name="estado">

            <label>Costo: </label>
            <input value="<%= objeto.getCosto()%>" type="text"  name="costo"><br>

            <input type="submit" value="Modificar">

        </form>
        <button onclick="window.location.href = '<%= request.getContextPath()%>/listarColeccionPermanente'">Regresar al menu anterior</button><br>

    </body>
</html>
