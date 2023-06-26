<%-- 
    Document   : vertodo
    Created on : 26 jun 2023, 13:01:36
    Author     : conej
--%>

<%@page import="Modelos.otros"%>
<%@page import="Modelos.estatuas"%>
<%@page import="Modelos.escultura"%>
<%@page import="Modelos.pintura"%>
<%@page import="Modelos.objeto_de_arte"%>
<%@page import="Datos.verificacion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    new verificacion().IsConnected(request, response, "");
    objeto_de_arte objeto = (objeto_de_arte) request.getSession().getAttribute("objeto");

%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="index.css">
        <title>Informacion Completa</title>
    </head>
    <body>
        <h1>Información</h1>
        <div>
            <label> ID obra: <%= objeto.getIdObraDeArte()%></label>
            <label> Nombre: <%= objeto.getNombreObra()%></label>
            <label> Artista: <%= objeto.getArtista()%></label>
            <label> Colección: <%= objeto.getId_coleccion()%></label>
            <label> Fecha Creación: <%= objeto.getFecha_creacion()%></label>
            <label> Titulo: <%= objeto.getTitulo()%></label>
            <label> Descripcion: <%= objeto.getDescripcion()%></label>
            <%
                switch (objeto.getIdTipo()) {
                    case 1:
                        pintura pintura = (pintura) request.getSession().getAttribute("pintura");
            %>
            <label> Tipo: Pintura </label>
            <label> Tipo Pintura: <%= pintura.getTipo_pintura()%></label>
            <label> Material: <%= pintura.getMaterial()%></label>
            <label> Estilo: <%= pintura.getEstilo()%></label>
            <%
                    break;
                case 2:
                    escultura escultura = (escultura) request.getSession().getAttribute("escultura");
            %>
            <label> Tipo: Escultura </label>
            <label> Material: <%= escultura.getMaterial() %></label>
            <label> Altura: <%=  escultura.getAltura() %></label>
            <label> Peso: <%= escultura.getPeso() %></label>
            <label> Estilo: <%= escultura.getEstilo() %></label>
            <%
                    break;
                case 3:
                    estatuas estatua = (estatuas) request.getSession().getAttribute("estatua");
            %>
            <label> Tipo: Estatua </label>
            <label> Altura: <%= estatua.getAltura() %></label>
            <label> Peso: <%= estatua.getPeso() %></label>
            <label> Representación: <%= estatua.getRepresentacion() %></label>

            <%
                    break;
                default:
                    otros otros = (otros) request.getSession().getAttribute("otros");
            %>
            <label> Tipo: Otro </label>
            <label> Tipo: <%= otros.getTipo() %></label>
            <label> Estilo: <%= otros.getEstilo() %></label>
            <%
                        break;
                }
            %>
        </div>
        <button onclick="window.location.href = '<%= request.getContextPath()%>/listarObjeto'">Regresar al menu anterior</button><br>
    </body>
</html>
