<%-- 
    Document   : ModificarArtistas
    Created on : 11 jun. 2023, 21:41:43
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
        <h1>MODIFICAR ARTISTAS</h1>
        <form action="procesar_formulario.php" method="POST">
        <label>Nombre:</label>
        <input type="text" id="nombre" name="nombre"><br>
        
        <label>Fecha de Nacimiento:</label>
        <input type="text" id="fecha_nacimiento" name="fecha_nacimiento"><br>
        
        <label>Fecha de Fallecimiento:</label>
        <input type="text" id="fecha_fallecimiento" name="fecha_fallecimiento"><br>
        
        <label>País de Origen:</label>
        <input type="text" id="pais_origen" name="pais_origen"><br>
        
        <label>Época:</label>
        <input type="text" id="epoca" name="epoca"><br>
        
        <label>Estilo:</label>
        <input type="text" id="estilo" name="estilo"><br>
        
        <label>Descripción:</label>
        <input type="text" id="descripcion" name="descripcion"><br>
        
        <input type="submit" value="Enviar">
    </form>
</body>
    </body>
</html>
