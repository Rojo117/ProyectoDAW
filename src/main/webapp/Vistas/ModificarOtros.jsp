<%-- 
    Document   : ModificarOtros
    Created on : 12 jun. 2023, 23:24:48
    Author     : conej
--%>

<%@page import="Datos.verificacion"%>
<%@page import="Modelos.otros"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    new verificacion().IsConnected(request, response, "");
    otros objeto = (otros) request.getSession().getAttribute("leer2");
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
        <title>Modificar otros tipos de arte</title>
    </head>
    <body>
        <h1>MODIFICAR OTRO</h1>
        <form action="<%= request.getContextPath()%>/modificarOtros" method="POST">

            <input value="<%= objeto.getIdObraDeArte()%>" type="number"  name="idObraDeArte" hidden>

            <label>Tipo: </label>
            <input value="<%= objeto.getTipo()%>" type="text"  name="tipo"><br>

            <label>Estilo: </label>
            <input value="<%= objeto.getEstilo()%>" type="text"  name="estilo"><br>

            <input type="submit" value="Modificar">

        </form>
        <button onclick="window.location.href = '<%= request.getContextPath()%>/listarOtro'">Regresar al menu anterior</button><br>

    </body>
</html>
