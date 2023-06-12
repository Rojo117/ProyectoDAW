<%-- 
    Document   : ModificarExposiciones
    Created on : 11 jun. 2023, 21:43:49
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
        <h1>MODIFICAR EXPOSCIONES</h1>
        <form action="procesar_formulario.php" method="POST">
        <label>ID Exposición:</label>
        <input type="text" id="idExposicion" name="idExposicion"><br>
        
        <label>Nombre:</label>
        <input type="text" id="nombre" name="nombre"><br>
        
        <label>Fecha de Inicio:</label>
        <input type="text" id="fecha_inicio" name="fecha_inicio"><br>
        
        <label>Fecha de Fin:</label>
        <input type="text" id="fecha_fin" name="fecha_fin"><br>
        
        <label>Estatus:</label>
        <input type="text" id="estatus" name="estatus"><br>
        
        <input type="submit" value="Enviar">
    </form>
    </body>
</html>
