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

            <input value="<%= objeto.getIdObraDeArte()%>" type="text"  name="idObraDeArte" hidden>

            <label>nombreObra:</label>
            <input value="<%= objeto.getNombreObra()%>" type="text"  name="nombreObra"><br>


            <input value="<%= objeto.getArtista()%>" type="text"  name="artista"hidden>

            <label>id_coleccion:</label>
            <input value="<%= objeto.getId_coleccion()%>" type="text"  name="id_coleccion"><br>

            <label>fecha_creacion:</label>
            <input value="<%= objeto.getFecha_creacion()%>" type="text"  name="fecha_creacion"><br>

            <label>titulo:</label>
            <input value="<%= objeto.getTitulo()%>" type="text"  name="titulo"><br>

            <label>descripcion:</label>
            <input value="<%= objeto.getDescripcion()%>" type="text"  name="descripcion"><br>

            <label>idEpoca:</label>
            <input value="<%= objeto.getIdEpoca()%>" type="text"  name="idEpoca"><br>

            <label>idOrigen:</label>
            <input value="<%= objeto.getIdOrigen()%>" type="text"  name="idOrigen"><br>

            <label>idTipo:</label>
            <input value="<%= objeto.getIdTipo()%>" type="text"  name="idTipo"><br>

            <input type="submit" value="Modificar">

        </form>
        <button onclick="window.location.href = '<%= request.getContextPath()%>/listarObjeto'">Regresar al menu anterior</button><br>

    </body>
</html>
