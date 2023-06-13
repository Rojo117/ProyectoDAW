<%-- 
    Document   : Estatuas
    Created on : 12 jun. 2023, 15:12:03
    Author     : conej
--%>

<%@page import="Modelos.estatuas"%>
<%@page import="java.util.List"%>
<%@page import="Datos.verificacion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    new verificacion().IsConnected(request, response,"");
    List<estatuas> lista = (List<estatuas>) request.getSession().getAttribute("objeto");
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Estatuas</h1>
    <button onclick="window.location.href='RegistrarEstatuas.jsp'">Registrar Estatua</button>
    <table>
   
        <tr>
            <th>idObraDeArte</th>
            <th>altura</th>
            <th>peso</th>
            <th>representacion</th>
            <th>Eliminar</th>
            <th>Modificar</th>
        </tr>
        <%
                if (lista != null) {
                    for (estatuas objeto : lista) {
            %>
            <tr>
                <th><%= objeto.getIdObraDeArte()%> </th>
                <th><%= objeto.getAltura()%></th>
                <th><%= objeto.getPeso()%> </th>
                <th><%= objeto.getRepresentacion()%></th>
               <th> <button onclick="window.location.href='<%= request.getContextPath()%>/Eliminar?id=<%=objeto.getIdObraDeArte()%>&Seccion=Estatuas'">Eliminar</button> </th>
                <th> <button onclick="window.location.href='<%= request.getContextPath()%>/Informacion?id=<%=objeto.getIdObraDeArte()%>&Seccion=Estatuas'">Modificar</button> </th>
            </tr>
            <%
                    }
                }
            %>
     
    </table>
    <button onclick="window.location.href='SubMenuObrasDeArte.jsp'">Regresar</button>
    </body>
</html>
