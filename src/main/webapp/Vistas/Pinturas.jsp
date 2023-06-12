<%-- 
    Document   : Pinturas
    Created on : 12 jun. 2023, 14:12:56
    Author     : conej
--%>

<%@page import="Modelos.pintura"%>
<%@page import="java.util.List"%>
<%@page import="Datos.verificacion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    new verificacion().IsConnected(request, response,"");
    List<pintura> lista = (List<pintura>) request.getSession().getAttribute("objeto");
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
            <h1>Pinturas</h1>
    <button onclick="window.location.href='RegistrarPinturas.jsp'">Registrar Pintura</button>
    <table>
   
        <tr>
            <th>idobradearte</th>
            <th>tipo_pintura</th>
            <th>material</th>
            <th>estilo</th>
            <th>Eliminar</th>
            <th>Modificar</th>
        </tr>
        <%
                if (lista != null) {
                    for (pintura objeto : lista) {
            %>
            <tr>
                <th><%= objeto.getIdObraDeArte()%> </th>
                <th><%= objeto.getTipo_pintura()%></th>
                <th><%= objeto.getMaterial()%> </th>
                <th><%= objeto.getEstilo()%></th>
                <th> <button onclick="window.location.href='<%= request.getContextPath()%>/Eliminar?id=<%=objeto.getIdObraDeArte()%>&Seccion=Artistas'">Eliminar</button> </th>
                <th> <button onclick="window.location.href='<%= request.getContextPath()%>/Modificar?id=<%=objeto.getIdObraDeArte()%>'">Modificar</button> </th>
            </tr>
            <%
                    }
                }
            %>
     
    </table>
    <button onclick="window.location.href='SubMenuObrasDeArte.jsp'">Regresar</button>
    </body>
</html>
