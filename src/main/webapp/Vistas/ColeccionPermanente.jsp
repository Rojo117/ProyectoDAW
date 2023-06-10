<%-- 
    Document   : ColeccionPermanente
    Created on : 9 jun. 2023, 14:18:07
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
         <h1>Coleccion Permanente</h1>
        <table>
            <tr>
                <th>idObraDeArte</th>
                <th>fecha_adquisicion</th>
                <th>estado</th>
                <th>costo</th>
           
            </tr>

        </table>
    </body>
        <button onclick="window.location.href='Colecciones.jsp'">Regresar</button>
</html>
