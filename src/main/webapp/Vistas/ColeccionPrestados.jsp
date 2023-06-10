<%-- 
    Document   : ColeccionPrestados
    Created on : 9 jun. 2023, 14:18:21
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
            <h1>Prestados</h1>
        <table>
            <tr>
                <th>idObraDeArte</th>
                <th>prestamista</th>
                <th>fecha_inicio</th>
                <th>fecha_fin</th>
           
            </tr>

        </table>
    </body>
        <button onclick="window.location.href='Colecciones.jsp'">Regresar</button>
</html>
