<%-- 
    Document   : ModificarArtistas
    Created on : 11 jun. 2023, 21:41:43
    Author     : conej
--%>

<%@page import="Modelos.artistas"%>
<%@page import="Datos.verificacion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    new verificacion().IsConnected(request, response,"");
   artistas objeto = (artistas) request.getSession().getAttribute("leer2");
%>
<%
    
            String msg = "";
            if (request.getSession().getAttribute("msg") != null) {
                msg = request.getSession().getAttribute("msg").toString();
                out.print(msg);
                request.getSession().removeAttribute("msg");
            }
        %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="index.css">
        <title>Modificar artista</title>
    </head>
    <body>
        <h1>MODIFICAR ARTISTAS</h1>
        <form action="<%= request.getContextPath()%>/modificarArtistas" method="POST">
        
        <input value="<%= objeto.getNombre()%>" type="text"  name="nombre" hidden>
        
        <label>Fecha de Nacimiento:</label>
        <input value="<%= objeto.getFecha_nacimiento()%>" type="date"  name="fecha_nacimiento"><br>
        
        <label>Fecha de Fallecimiento:</label>
        <input value="<%= objeto.getFecha_fallecimiento()%>" type="date"  name="fecha_fallecimiento"><br>
        
        <label>País de Origen:</label>
        <input value="<%= objeto.getPais_origen()%>" type="text"  name="pais_origen"><br>
        
        <label>Época:</label>
        <input value="<%= objeto.getEpoca()%>" type="text"  name="epoca"hidden>
        
        <label>Estilo:</label>
        <input value="<%= objeto.getEstilo()%>" type="text"  name="estilo"><br>
        
        <label>Descripción:</label>
        <input value="<%= objeto.getDescripcion()%>" type="text"  name="descripcion"><br>
        
        <input type="submit" value="Modificar">
    </form>
        <button onclick="window.location.href = '<%= request.getContextPath()%>/listarArtistas'">Regresar al menu anterior</button><br>
</body>
</html>
