<%-- 
    Document   : RegistrarObjeto
    Created on : 9 jun. 2023, 17:59:08
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
    </body>
    <button onclick="window.location.href='objetoArte.jsp'">Regresar</button>
</html>
