<%-- 
    Document   : objetoExpo
    Created on : 26 jun 2023, 14:32:37
    Author     : conej
--%>

<%@page import="Modelos.Exposiciones"%>
<%@page import="java.util.List"%>
<%@page import="Datos.verificacion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    new verificacion().IsConnected(request, response, "");
    List<Exposiciones> expoList = (List<Exposiciones>) request.getSession().getAttribute("listExpo");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="index.css">
        <title>Seleccionar exposicion</title>
    </head>
    <body>
        <h1>Seleccionar Exposición...</h1>

        <form method="post" action="<%= request.getContextPath()%>/objetoExpo">
            <select name="option">
                <%
                    if (expoList != null) {
                        for (Exposiciones expo : expoList) {
                %>
                <option><%= expo.getNombre()%></option>

                <%
                        }
                    }
                %>

            </select><br>
            <button type="submit">Agregar</button>
        </form>
                <button onclick="window.location.href = '<%= request.getContextPath()%>/listarObjeto'">Regresar al menu anterior</button><br>
    </body>
</html>
