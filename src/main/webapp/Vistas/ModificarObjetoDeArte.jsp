<%-- 
    Document   : ModificarObjetoDeArte
    Created on : 11 jun. 2023, 21:33:57
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
        <h1>MODIFICAR OBJETO DE ARTE</h1>
        <form action="procesar_formulario.php" method="POST">
            <label>idObraDeArte:</label>
            <input type="text"  name="idObraDeArte"><br>

            <label>nombreObra:</label>
            <input type="text"  name="nombreObra"><br>

            <label>artista:</label>
            <input type="text"  name="artista"><br>

            <label>id_coleccion:</label>
            <input type="text"  name="id_coleccion"><br>

            <label>fecha_creacion:</label>
            <input type="text"  name="fecha_creacion"><br>

            <label>titulo:</label>
            <input type="text"  name="titulo"><br>

            <label>descripcion:</label>
            <input type="text"  name="descripcion"><br>

            <label>idEpoca:</label>
            <input type="text"  name="idEpoca"><br>

            <label>idOrigen:</label>
            <input type="text"  name="idOrigen"><br>

            <label>idTipo:</label>
            <input type="text"  name="idTipo"><br>

            <label>estatus:</label>
            <input type="text"  name="estatus"><br>

            <input type="submit" value="Enviar">
        </form>

    </body>
</html>
