<%-- 
    Document   : ColeccionPermanente
    Created on : 9 jun. 2023, 14:18:07
    Author     : conej
--%>

<%@page import="Modelos.coleccion_permanente"%>
<%@page import="java.util.List"%>
<%@page import="Datos.verificacion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    new verificacion().IsConnected(request, response, "");
    List<coleccion_permanente> lista = (List<coleccion_permanente>) request.getSession().getAttribute("objeto");
%>
<html
    <html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="index.css">
        <title>Menu Permanentes</title>
    </head>
    <body>
        <h1>Coleccion Permanente</h1>
        <button onclick="window.location.href = 'RegistrarColeccionPermanente.jsp'">Registrar Coleccion Permanente</button>
        <table>
            <tr>
                <th>idObraDeArte</th>
                <th>fecha_adquisicion</th>
                <th>estado</th>
                <th>costo</th>
                <th>Eliminar</th>
                <th>Modificar</th>



            </tr>
            <%
                if (lista != null) {
                    for (coleccion_permanente objeto : lista) {
            %>
            <tr>
                <th><%= objeto.getIdObraDeArte()%></th>
                <th><%= objeto.getFecha_adquisicion()%></th>
                <th><%= objeto.getEstado()%></th>
                <th><%= objeto.getCosto()%></th>
                <th> <button onclick="window.location.href = '<%= request.getContextPath()%>/Eliminar?id=<%=objeto.getIdObraDeArte()%>&Seccion=ColeccionPermanente'">Eliminar</button> </th>
                <th> <button onclick="window.location.href = '<%= request.getContextPath()%>/Informacion?id=<%=objeto.getIdObraDeArte()%>&Seccion=ColeccionPermanente'">Modificar</button> </th>
            </tr>
            <%
                    }
                }
            %>

        </table>
    </body>
    <button onclick="window.location.href = 'Colecciones.jsp'">Regresar</button>
</html>
