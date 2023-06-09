<%-- 
    Document   : Otros
    Created on : 12 jun. 2023, 15:26:38
    Author     : conej
--%>

<%@page import="Modelos.otros"%>
<%@page import="java.util.List"%>
<%@page import="Datos.verificacion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    new verificacion().IsConnected(request, response,"");
    List<otros> lista = (List<otros>) request.getSession().getAttribute("objeto");
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
       
        <title>Otros</title>
    </head>
    <body>
               <h1>Otros Objetos de Arte</h1>
    <button onclick="window.location.href='RegistrarOtro.jsp'">Registrar Otro Objeto</button>
    <table>
   
        <tr>
            <th>idObraDeArte</th>
            <th>tipo</th>
            <th>estilo</th>
            <th>Eliminar</th>
            <th>Modificar</th>
        </tr>
        <%
                if (lista != null) {
                    for (otros objeto : lista) {
            %>
            <tr>
                <th><%= objeto.getIdObraDeArte()%> </th>
                <th><%= objeto.getTipo()%></th>
                <th><%= objeto.getEstilo()%> </th>
               <th> <button onclick="window.location.href='<%= request.getContextPath() %>/Vistas/Confirmar.jsp?id=<%= objeto.getIdObraDeArte() %>&seccion=2'">Eliminar</button> </th>
                <th> <button onclick="window.location.href='<%= request.getContextPath()%>/Informacion?id=<%=objeto.getIdObraDeArte()%>&Seccion=Otros'">Modificar</button> </th>
            </tr>
            <%
                    }
                }
            %>
     
    </table>
    <button onclick="window.location.href='SubMenuObrasDeArte.jsp'">Regresar</button>
    </body>
</html>
