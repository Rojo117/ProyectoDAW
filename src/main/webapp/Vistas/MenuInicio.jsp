<%-- 
    Document   : MenuInicio
    Created on : 9 jun. 2023, 10:36:02
    Author     : conej
--%>

<%@page import="Modelos.Usuarios"%>
<%@page import="Datos.verificacion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    new verificacion().IsConnected(request, response,"");
    Usuarios user = (Usuarios)request.getSession().getAttribute("IsConnected");
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <title>JSP Page</title>
</head>
<body>
    <h1>Menu de inicio</h1>
    <p>Nombre de usuario conectado: <%= user.getUsuario()%> </p>
    <button onclick="window.location.href='<%= request.getContextPath()%>/listarObjeto'">Objeto de arte</button><br> <!-- CUANDO LE DE CLIC AL BOTON OBTIENE LA RUTA ABSOLUTA DEL PROJECTO Y ENVIA UNA PETICION AL SERVLET listarObjeto -->
     <button onclick="window.location.href='SubMenuObrasDeArte.jsp'">Obras de Arte</button><br>
    <button onclick="window.location.href='<%= request.getContextPath()%>/listarArtistas'">Artistas</button><br>
    <button onclick="window.location.href='Colecciones.jsp'">Colecciones</button><br>
    <button onclick="window.location.href='<%= request.getContextPath()%>/listarExposiciones'">Exposiciones</button><br>
</body>
</html>
