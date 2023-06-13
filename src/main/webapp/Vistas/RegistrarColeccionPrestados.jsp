<%-- 
    Document   : RegistrarColeccionPrestados
    Created on : 12 jun. 2023, 16:11:53
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
        <h1>Registrar Coleccion Prestados</h1>
       <form action="<%= request.getContextPath()%>/registrarColeccionTemporal" method="POST">
            
           <label>Id de la obra:</label>
            <input value="" type="number"  name="idObraDeArte"><br>

            <label>Nombre del Prestamista:</label>
            <input value="" type="text"  name="prestamista"><br>

             <label>Fecha de inicio de prestamo: </label>
            <input value="" type="date"  name="fecha_inicio"><br>

            <label>Fecha de fin de prestamo:</label>
            <input value="" type="date"  name="fecha_fin"><br>
            
            <label>Estatus:</label>
            <input value="" type="number"  name="estatus"><br>


            <input type="submit" value="Registrar">

        </form>
        <button onclick="window.location.href = '<%= request.getContextPath()%>/listarColeccionTemporal'">Regresar al menu anterior</button><br>

    </body>
</html>
