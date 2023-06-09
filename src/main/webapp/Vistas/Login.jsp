<%-- 
    Document   : Login
    Created on : 8 jun. 2023, 17:45:06
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


        <h1>INICIAR SESION</h1>
        <a href="<%= request.getContextPath()%>/index.jsp"><button>regresar</button>
        </a>
        
        <form method="post" action="/login">
            <label>
                usuario:
            </label>
            <input type="text" name="usuario">
            <label>
                contraseña:
            </label>
            <input type="password" name="pass">
            <input type="submit" value="login">
        </form>
    </body>
</html>
