<%-- 
    Document   : Login
    Created on : 8 jun. 2023, 17:45:06
    Author     : conej
--%>

<%@page import="Datos.verificacion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%new verificacion().IsConnected(request,response,"login");
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
        
        <title>Iniciar sesion</title>
    </head>
    <body>


        <h1>INICIAR SESION</h1>
        <a href="<%= request.getContextPath()%>/index.jsp"><button>regresar</button>
        </a>
        
        <form method="post" action="<%= request.getContextPath()%>/login">
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
            <button onclick="window.location.href='<%= request.getContextPath()%>/Vistas/RegistroUsuarios.jsp'">Crear una cuenta</button><br>
    </body>
</html>
