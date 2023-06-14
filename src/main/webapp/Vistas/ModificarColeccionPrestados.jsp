<%-- 
    Document   : ModificarColeccionPrestados
    Created on : 12 jun. 2023, 23:23:48
    Author     : conej
--%>

<%@page import="Modelos.prestados"%>
<%@page import="Datos.verificacion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    new verificacion().IsConnected(request, response, "");
    prestados objeto = (prestados) request.getSession().getAttribute("leer2");
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="index.css">
        <title>Modificar Coleccion Temporal</title>
    </head>
    <body>
        <h1>MODIFICAR COLECCION PRESTADOS</h1>
        <form action="<%= request.getContextPath()%>/modificarColeccionPrestados" method="POST">

            <input value="<%= objeto.getIdObraDeArte()%>" type="number"  name="idObraDeArte" hidden>

            <label>Nombre del Prestamista: </label>
            <input value="<%= objeto.getPrestamista()%>" type="text"  name="prestamista"><br>

             <label>Fecha de inicio del prestamo: </label>
            <input value="<%= objeto.getFecha_inicio()%>" type="date"  name="fecha_inicio"><br>

            <label>Fecha de fin del prestamo: </label>
            <input value="<%= objeto.getFecha_fin()%>" type="date"  name="fecha_fin"><br>


            <input type="submit" value="Modificar">

        </form>
        <button onclick="window.location.href = '<%= request.getContextPath()%>/listarColeccionTemporal'">Regresar al menu anterior</button><br>

    </body>
</html>