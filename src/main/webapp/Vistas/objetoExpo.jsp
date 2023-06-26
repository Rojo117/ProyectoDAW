
<%@page import="Datos.verificacion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    new verificacion().IsConnected(request, response, "");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="index.css">
        <title>Seleccionar exposicion</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
