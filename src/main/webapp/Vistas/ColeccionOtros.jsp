<%-- 
    Document   : ColeccionOtros
    Created on : 9 jun. 2023, 14:18:30
    Author     : conej
--%>

<%@page import="Modelos.otras_colecciones"%>
<%@page import="java.util.List"%>
<%@page import="Datos.verificacion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    new verificacion().IsConnected(request, response,"");
    List<otras_colecciones> lista = (List<otras_colecciones>) request.getSession().getAttribute("objeto");
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
        <title>Menu Otras Colecciones</title>
    </head>
    <body>
               <h1>Otras Colecciones</h1>
               <button onclick="window.location.href='RegistrarOtrasColecciones.jsp'">Registrar Otras Colecciones</button>
        <table>
            <tr>
                <th>idObraDeArte</th>
                <th>nombre_coleccion </th>
                <th>tipoColeccion </th>
                <th>descripcion </th>  
                <th>direccion</th>  
                <th>telefono</th>  
                <th>nombre_contacto</th>  
                <th>Eliminar</th>  
                <th>Modificar</th>  
            </tr>
<%
                if (lista != null) {
                    for (otras_colecciones objeto : lista) {
            %>
            <tr>
                <th><%= objeto.getIdObraDeArte()%> </th>
                <th><%= objeto.getNombre_coleccion()%></th>
                <th><%= objeto.getTipoColeccion()%> </th>
                <th><%= objeto.getDescripcion()%></th>
                <th><%= objeto.getDireccion()%></th>
                <th><%= objeto.getTelefono()%></th>
                <th><%= objeto.getNombre_contacto()%></th>
                <th> <button onclick="window.location.href = '<%= request.getContextPath()%>/Vistas/Confirmar.jsp?id=<%=objeto.getIdObraDeArte()%>&seccion=6'">Eliminar</button> </th>
                <th> <button onclick="window.location.href = '<%= request.getContextPath()%>/Informacion?id=<%=objeto.getIdObraDeArte()%>&Seccion=ColeccionOtros'">Modificar</button> </th>
            </tr>
            <%
                    }
                }
            %>
        </table>
    </body>
        <button onclick="window.location.href='Colecciones.jsp'">Regresar</button>
</html>
