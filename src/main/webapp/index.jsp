<%-- 
    Document   : index
    Created on : 23 jun. 2023, 21:33:19
    Author     : conej
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>Museo Nacional de Arte</title>
  <style>
    header {
      background-color: #f2f2f2;
      padding: 20px;
      text-align: center;
    }

    h1 {
      color: #333;
      margin: 0;
    }

 
    .login-button {
      display: inline-block;
      background-color: #ff8800;
      color: #fff;
      padding: 10px 20px;
      text-decoration: none;
      border-radius: 5px;
    }

 
    .content {
      margin: 20px;
      text-align: center;
    }

  
    body {
      font-family: Arial, sans-serif;
    }

    .art-museum-theme {
      background-color: #f9f9f9;
      color: #333;
    }

    .art-museum-theme h1 {
      font-size: 32px;
    }

    .art-museum-theme .login-button {
      background-color: #555;
    }
   
img.bg-image {
  width: 750px; 
  border-radius: 10px; 
}

  </style>
</head>
<body class="art-museum-theme">
  <header>
    <h1>BIENVENIDO</h1>
    <a class="login-button" href="<%=request.getContextPath()%>/Vistas/Login.jsp">Iniciar sesión</a>
  </header>

  <div class="content">
    <h2>Museo Nacional de Arte</h2>
    <p>Explora nuestra colección de arte y descubre nuevas obras maestras.</p>
<img src="bg.jpg" class="bg-image" alt="Imagen de fondo">
  </div>
</body>
</html>
