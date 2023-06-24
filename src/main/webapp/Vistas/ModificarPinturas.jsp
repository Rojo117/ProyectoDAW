<%-- 
    Document   : ModificarPinturas
    Created on : 12 jun. 2023, 23:24:13
    Author     : conej
--%>

<%@page import="Modelos.pintura"%>
<%@page import="Datos.verificacion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    new verificacion().IsConnected(request, response, "");
    pintura objeto = (pintura) request.getSession().getAttribute("leer2");
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
        <link rel="stylesheet" href="index.css">
        <title>Modificar pintura</title>
    </head>
    <body>
        <h1>MODIFICAR PINTURA</h1>
        <form action="<%= request.getContextPath()%>/modificarPinturas" method="POST">

            <input value="<%= objeto.getIdObraDeArte()%>" type="number"  name="idObraDeArte" hidden>

            <label>Tipo de pintura:</label>
            <input value="<%= objeto.getTipo_pintura()%>" type="text"  name="tipo_pintura"><br>

            <label>Material: </label>
            <input value="<%= objeto.getMaterial()%>" type="text"  name="material"><br>

            <label>Estilo: </label>
            <input value="<%= objeto.getEstilo()%>" type="text"  name="estilo"><br>

           <input type="submit" value="Modificar">

        </form>
        <button onclick="window.location.href = '<%= request.getContextPath()%>/listarPintura'">Regresar al menu anterior</button><br>

    </body>
</html>