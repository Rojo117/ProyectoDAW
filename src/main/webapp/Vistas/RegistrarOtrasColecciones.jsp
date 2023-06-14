<%-- 
    Document   : RegistrarOtrasColecciones
    Created on : 12 jun. 2023, 16:07:04
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
        <title>Registrar Otras Colecciones</title>
    </head>
    <body>
        <h1>Registrar Otras Colecciones</h1>
        <form action="<%= request.getContextPath()%>/registrarColeccionOtros" method="POST">
    
            <label>Id de la Obra:</label>
            <input value="" type="number"  name="idObraDeArte"><br>
            
            <label>Nombre de la coleccion: </label>
            <input value="" type="text"  name="nombre_coleccion"><br>

            <label>Tipo de Coleccion:</label>
            <input value="" type="text"  name="tipoColeccion"><br>

            <label>Descripcion: </label>
            <input value="" type="text"  name="descripcion"><br>
            
            <label>Direccion:  </label>
            <input value="" type="text"  name="direccion"><br>
            
            <label>Telefono: </label>
            <input value="" type="text"  name="telefono"><br>
            
            <label>Nombre de contacto: </label>
            <input value="" type="text"  name="nombre_contacto"><br>
            
            <label>Estatus:</label>
            <input value="" type="number"  name="estatus"><br>

            <input type="submit" value="Registrar">

        </form>
        <button onclick="window.location.href = '<%= request.getContextPath()%>/listarColeccionOtros'">Regresar al menu anterior</button><br>

    </body>
</html>
