<%-- 
    Document   : Exposiciones
    Created on : 9 jun. 2023, 14:10:40
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
        <h1>Exposiciones</h1>
        <button onclick="window.location.href='RegistrarObjeto.jsp'">Registrar</button>
        <table>
            <tr>
                <th>idExposicion</th>
                <th>nombre</th>
                <th>fecha_inicio</th>
                <th>fecha_fin</th>
                <th>estatus</th>
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
        <button onclick="window.location.href='MenuInicio.jsp'">Regresar a Inicio</button>

    </body>
    <button onclick="window.location.href='Colecciones.jsp'">Regresar a Colecciones</button>
</html>
 
