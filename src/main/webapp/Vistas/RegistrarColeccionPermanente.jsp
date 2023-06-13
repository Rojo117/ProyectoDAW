<%-- 
    Document   : RegistrarColeccionPermanente
    Created on : 12 jun. 2023, 16:09:51
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
        <h1>Registrar Coleccion Permanente</h1>
        <form action="<%= request.getContextPath()%>/modificarColeccionPermanente" method="POST">
            <label>Id de la Obra: </label>
             <input value="" type="text"  name="idObraDeArte"><br>

            <label>Fecha de adquisicion: </label>
            <input value="" type="date"  name="fecha_adquisicion"><br>

            <label>Estado: </label>  
            <input value="" type="text"  name="estado"><br>

            <label>Costo: </label>
            <input value="" type="text"  name="costo"><br>
            
            <label>Estatus: </label>
            <input value="" type="number"  name="estatus"><br>

            <input type="submit" value="Registrar">

        </form>
        <button onclick="window.location.href = '<%= request.getContextPath()%>/listarColeccionPermanente'">Regresar al menu anterior</button><br>

    </body>
</html>
