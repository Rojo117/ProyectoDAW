<%-- 
    Document   : Esculturas
    Created on : 12 jun. 2023, 14:50:40
    Author     : conej
--%>

<%@page import="Modelos.escultura"%>
<%@page import="java.util.List"%>
<%@page import="Datos.verificacion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    new verificacion().IsConnected(request, response,"");
    List<escultura> lista = (List<escultura>) request.getSession().getAttribute("objeto");
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Esculturas</h1>
         <button onclick="window.location.href='RegistrarEscultura.jsp'">Registrar Escultura</button>
    <table>
   
        <tr>
            <th>idObraDeArte</th>
            <th>material</th>
            <th>altura</th>
            <th>peso</th>
            <th>estilo</th>
            <th>Eliminar</th>
            <th>Modificar</th>
        </tr>
        <%
                if (lista != null) {
                    for (escultura objeto : lista) {
            %>
            <tr>
                <th><%= objeto.getIdObraDeArte()%> </th>
                <th><%= objeto.getMaterial()%></th>
                <th><%= objeto.getAltura()%> </th>
                <th><%= objeto.getPeso()%></th>
                <th><%= objeto.getEstilo()%></th>
                <th> <button onclick="window.location.href='<%= request.getContextPath()%>/Eliminar?id=<%=objeto.getIdObraDeArte()%>&Seccion=Esculturas'">Eliminar</button> </th>
                <th> <button onclick="window.location.href='<%= request.getContextPath()%>/Informacion?id=<%=objeto.getIdObraDeArte()%>&Seccion=Esculturas'">Modificar</button> </th>
            </tr>
            <%
                    }
                }
            %>
     
    </table>
    <button onclick="window.location.href='SubMenuObrasDeArte.jsp'">Regresar</button>
    </body>
</html>
