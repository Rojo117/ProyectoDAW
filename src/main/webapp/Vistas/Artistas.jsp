<%-- 
    Document   : Artistas
    Created on : 9 jun. 2023, 13:57:25
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
    <h1>Menu Artistas</h1>
    <button onclick="window.location.href='registrarArtista.jsp'">Registrar</button>
    <table>
   
        <tr>
            <th>nombre</th>
            <th>fecha_nacimiento</th>
            <th>fecha_fallecimiento</th>
            <th>pais_origen</th>
            <th>epoca</th>
            <th>estilo</th>
            <th>descripcion</th>
            <th>Eliminar</th>
            <th>Modificar</th>
        </tr>
     
    </table>
    <button onclick="window.location.href='MenuInicio.jsp'">Regresar</button>
</body>
</html>
