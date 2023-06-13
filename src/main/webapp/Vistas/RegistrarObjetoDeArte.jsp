<%-- 
    Document   : RegistrarObjetoDeArte
    Created on : 13 jun. 2023, 09:27:15
    Author     : conej
--%>

<%@page import="Datos.verificacion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    new verificacion().IsConnected(request, response,"");
%>
<html
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Registrar objeto</h1>
 <form action="<%= request.getContextPath()%>/modificarObjetoDeArte" method="POST">

     <label>Id de la obra:</label>
            <input value="" type="number"  name="idObraDeArte"><br>

            <label>Nombre de Obra:</label>
            <input value="" type="text"  name="nombreObra"><br>

            <label>Nombre del artista:</label>
            <input value="" type="text"  name="artista"><br>

            <label>Id coleccion::</label>
            <input value="" type="number"  name="id_coleccion"><br>

            <label>Fecha de Creacion:</label>
            <input value="" type="date"  name="fecha_creacion"><br>

            <label>Titulo:</label>
            <input value="" type="text"  name="titulo"><br>

            <label>Descripcion:</label>
            <input value="" type="text"  name="descripcion"><br>

            <label>Id de la Epoca:</label>
            <input value="" type="number"  name="idEpoca"><br>

            <label>Id del Origen:</label>
            <input value="" type="number"  name="idOrigen"><br>

            <label>Id del tipo:</label>
            <input value="" type="number"  name="idTipo"><br>
            
            <label>Estatus:</label>
            <input value="" type="number"  name="estatus"><br>

            <input type="submit" value="Registrar">

        </form>
        <button onclick="window.location.href = '<%= request.getContextPath()%>/listarObjeto'">Regresar al menu anterior</button><br>

    </body>
</html>
