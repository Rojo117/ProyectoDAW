<%-- 
    Document   : Exposiciones
    Created on : 9 jun. 2023, 14:10:40
    Author     : conej
--%>

<%@page import="Modelos.Exposiciones"%>
<%@page import="java.util.List"%>
<%@page import="Datos.verificacion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    new verificacion().IsConnected(request, response,"");
    List<Exposiciones> lista = (List<Exposiciones>) request.getSession().getAttribute("objeto");
%>
<%
            String msg = "";
            if (request.getSession().getAttribute("msg") != null) {
                msg = request.getSession().getAttribute("msg").toString();
                out.print(msg);
                request.getSession().removeAttribute("msg");
            }
        %>
<html
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="index.css">
        <title>Exposiciones</title>
    </head>
    <body>
        <h1>Exposiciones</h1>
        <button onclick="window.location.href='RegistrarExposiciones.jsp'">Registrar Exposicion</button>
        <table>
            <tr>
                <th>idExposicion</th>
                <th>nombre</th>
                <th>fecha_inicio</th>
                <th>fecha_fin</th>
                <th>estatus</th>
                <th>Eliminar</th>
                <th>Modificar</th>
            </tr>
<%
                if (lista != null) {
                    for (Exposiciones objeto : lista) {
            %>
            <tr>
                <th><%= objeto.getIdExposicion()%> </th>
                <th><%= objeto.getNombre()%></th>
                <th><%= objeto.getFecha_inicio()%> </th>
                <th><%= objeto.getFecha_fin()%></th>
                <th><%= objeto.getEstatus()%></th>
                <th> <button onclick="window.location.href='<%= request.getContextPath()%>/Vistas/Confirmar.jsp?id=<%=objeto.getIdExposicion()%>&seccion=10'">Eliminar</button> </th>
                <th> <button onclick="window.location.href='<%= request.getContextPath()%>/Informacion?id=<%=objeto.getIdExposicion()%>&Seccion=Exposiciones'">Modificar</button> </th>
            </tr>
            <%
                    }
                }
            %>
        </table>
        <button onclick="window.location.href='MenuInicio.jsp'">Regresar</button>

    </body>
</html>
 
