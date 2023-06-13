<%-- 
    Document   : ModificarColeccionOtros
    Created on : 12 jun. 2023, 23:23:36
    Author     : conej
--%>

<%@page import="Datos.verificacion"%>
<%@page import="Modelos.otras_colecciones"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    new verificacion().IsConnected(request, response, "");
    otras_colecciones objeto = (otras_colecciones) request.getSession().getAttribute("leer2");
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modificar otras colecciones</title>
    </head>
    <body>
        <h1>MODIFICAR COLECCION OTROS</h1>
        <form action="<%= request.getContextPath()%>/modificarColeccionOtros" method="POST">

            <input value="<%= objeto.getIdObraDeArte()%>" type="number"  name="idObraDeArte" hidden>

            <label>Nombre de la obra de arte: </label>
            <input value="<%= objeto.getNombre_coleccion()%>" type="text"  name="nombre_coleccion"><br>

            <label>Tipo de coleccion: </label>  
            <input value="<%= objeto.getTipoColeccion()%>" type="text"  name="tipoColeccion">

            <label>Descripcion</label>
            <input value="<%= objeto.getDescripcion()%>" type="text"  name="descripcion"><br>

            <label>Direccion</label>
            <input value="<%= objeto.getDireccion()%>" type="text"  name="direccion"><br>

            <label>Telefono</label>
            <input value="<%= objeto.getTelefono()%>" type="text"  name="telefono"><br>

            <label>nombre_contacto</label>
            <input value="<%= objeto.getNombre_contacto()%>" type="text"  name="nombre_contacto"><br>

            <input type="submit" value="Modificar">

        </form>
        <button onclick="window.location.href = '<%= request.getContextPath()%>/listarColeccionOtros'">Regresar al menu anterior</button><br>

    </body>
</html>
