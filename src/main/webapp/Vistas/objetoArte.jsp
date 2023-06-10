<%-- 
    Document   : objetoArte
    Created on : 9 jun. 2023, 13:03:06
    Author     : conej
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Menu Objeto de arte</h1>
        <button onclick="window.location.href='RegistrarObjeto.jsp'">Registrar</button>
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
                <th>estatus</th>
                <th>Eliminar</th>
                <th>Modificar</th>
            </tr>

        </table>
        <button onclick="window.location.href='MenuInicio.jsp'">Regresar</button>

    </body>
</html>
