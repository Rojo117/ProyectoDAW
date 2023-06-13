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

            <input value="<%= %>" type="text"  name="idObraDeArte" hidden>

            <label>nombreObra:</label>
            <input value="<%= %>" type="text"  name="nombreObra"><br>


            <input value="<%= %>" type="text"  name="artista"hidden>

            <label>id_coleccion:</label>
            <input value="<%= %>" type="text"  name="id_coleccion"><br>

            <label>fecha_creacion:</label>
            <input value="<%= %>" type="text"  name="fecha_creacion"><br>

            <label>titulo:</label>
            <input value="<%= %>" type="text"  name="titulo"><br>

            <label>descripcion:</label>
            <input value="<%= %>" type="text"  name="descripcion"><br>

            <label>idEpoca:</label>
            <input value="<%= %>" type="text"  name="idEpoca"><br>

            <label>idOrigen:</label>
            <input value="<%= %>" type="text"  name="idOrigen"><br>

            <label>idTipo:</label>
            <input value="<%= %>" type="text"  name="idTipo"><br>

            <input type="submit" value="Modificar">

        </form>
        <button onclick="window.location.href = '<%= request.getContextPath()%>/listarObjeto'">Regresar al menu anterior</button><br>

    </body>
</html>
