<%-- 
    Document   : RegistroUsuarios
    Created on : 24 jun. 2023, 13:15:10
    Author     : conej
--%>

<%@page import="Datos.verificacion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="index.css">
        <title>Registrar Cuenta</title>
    </head>
    <body>
        <h1>Registrar Cuenta</h1>
        <form action="<%= request.getContextPath()%>/Registrar" method="POST">
        <label>Nombre: </label>
        <input value="" type="text"  name="nombre"><br>
        
        <label>Usuario: </label>
        <input value="" type="text"  name="usuario"><br>
        
        <label>Password: </label>
        <input value="" type="text"  name="contra"><br>
        
        <label>Correo: </label>
        <input value="" type="text"  name="correo"><br>
        <input type="submit" value="Registrar">
    </form>
        <button onclick="window.location.href = '<%= request.getContextPath()%>/index.jsp'">Regresar al la pagina de inicio</button><br>
</body>
</html>
