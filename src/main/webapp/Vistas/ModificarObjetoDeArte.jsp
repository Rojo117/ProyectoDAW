<%-- 
    Document   : ModificarObjetoDeArte
    Created on : 11 jun. 2023, 21:33:57
    Author     : conej
--%>

<%@page import="Datos.verificacion"%>
<%@page import="Modelos.objeto_de_arte"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    new verificacion().IsConnected(request, response, "");
    objeto_de_arte objeto = (objeto_de_arte) request.getSession().getAttribute("leer2");
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>MODIFICAR OBJETO DE ARTE</h1>
        <form action="<%= request.getContextPath()%>/modificarObjetoDeArte" method="POST">

            <input value="<%= objeto.getIdObraDeArte()%>" type="number"  name="idObraDeArte" hidden>

            <label>Nombre de la obra de arte: </label>
            <input value="<%= objeto.getNombreObra()%>" type="text"  name="nombreObra"><br>


            <input value="<%= objeto.getArtista()%>" type="text"  name="artista"hidden>

            <label>Id de la coleccion: </label>
            <input value="<%= objeto.getId_coleccion()%>" type="number"  name="id_coleccion"><br>

            <label>Fecha de creacion: </label>
            <input value="<%= objeto.getFecha_creacion()%>" type="date"  name="fecha_creacion"><br>

            <label>Titulo:</label>
            <input value="<%= objeto.getTitulo()%>" type="text"  name="titulo"><br>

            <label>Descripcion: </label>
            <input value="<%= objeto.getDescripcion()%>" type="text"  name="descripcion"><br>

            <label>IdEpoca: </label>
            <input value="<%= objeto.getIdEpoca()%>" type="number"  name="idEpoca"><br>

            <label>IdOrigen: </label>
            <input value="<%= objeto.getIdOrigen()%>" type="number"  name="idOrigen"><br>

            <label>IdTipo: </label>
            <input value="<%= objeto.getIdTipo()%>" type="number"  name="idTipo"><br>

            <input type="submit" value="Modificar">

        </form>
        <button onclick="window.location.href = '<%= request.getContextPath()%>/listarObjeto'">Regresar al menu anterior</button><br>

    </body>
</html>
