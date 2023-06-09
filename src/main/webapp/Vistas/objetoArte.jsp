<%-- 
    Document   : objetoArte
    Created on : 9 jun. 2023, 13:03:06
    Author     : conej
--%>

<%@page import="java.util.List"%>
<%@page import="Modelos.objeto_de_arte"%>
<%@page import="Datos.verificacion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    new verificacion().IsConnected(request, response, "");
    List<objeto_de_arte> lista = (List<objeto_de_arte>) request.getSession().getAttribute("objetos");
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
        <title>objeto de arte</title>
    </head>
    <body>
        <h1>Menu Objeto de arte</h1>
        <button onclick="window.location.href = 'RegistrarObjetoDeArte.jsp'">Registrar Objeto de Arte</button>
        <table>
            <tr>
                <th>idObraDeArte</th>
                <th>nombreObra</th>
                <th>artista</th>
                <th>id_coleccion</th>
                <th>fecha_creacion</th>
                <th>titulo</th>
                <th>descripcion</th>
                <th>idEpoca</th>
                <th>idOrigen</th>
                <th>idTipo</th>
                <th>Eliminar</th>
                <th>Modificar</th>
                <th>Mostrar Información</th>
            </tr>
            <%
                if (lista != null) {
                    for (objeto_de_arte objeto : lista) {
            %>
            <tr>         
                <th><%= objeto.getIdObraDeArte()%> </th>
                <th><%= objeto.getNombreObra()%></th>
                <th><%= objeto.getArtista()%> </th>
                <th><%= objeto.getId_coleccion()%></th>
                <th><%= objeto.getFecha_creacion()%></th>
                <th><%= objeto.getTitulo()%></th>
                <th><%= objeto.getDescripcion()%></th>
                <th><%= objeto.getIdEpoca()%></th>
                <th><%= objeto.getIdOrigen()%></th>
                <th><%= objeto.getIdTipo()%> </th>
                <th> <button onclick="window.location.href = '<%= request.getContextPath()%>/Vistas/Confirmar.jsp?id=<%= objeto.getIdObraDeArte()%>&seccion=5'">Eliminar</button> </th>
                <th> <button onclick="window.location.href = '<%= request.getContextPath()%>/Informacion?id=<%=objeto.getIdObraDeArte()%>&Seccion=ObraDeArte'">Modificar</button> </th>
                <th> 
                    <button onclick="window.location.href = '<%= request.getContextPath()%>/InformacionCompleta?id=<%=objeto.getIdObraDeArte()%>&coleccion=<%=objeto.getIdTipo()%>'">Ver más</button> 
                    <button onclick="window.location.href = '<%= request.getContextPath()%>/objetoExpo?id=<%=objeto.getIdObraDeArte()%>'">Agregar a exposición</button> 
                </th>
            </tr>
            <%
                    }
                }
            %>
        </table>
        <button onclick="window.location.href = 'MenuInicio.jsp'">Regresar</button>

    </body>
</html>
