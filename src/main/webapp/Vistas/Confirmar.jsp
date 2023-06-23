<%-- 
    Document   : Confirmar
    Created on : 23 jun. 2023, 14:02:20
    Author     : conej
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Confirmar</title>
    </head>
    <body>
        <h1>Confirmar eliminar</h1>
        <%
            String path = "";
            String path2 = "";
            int action = Integer.parseInt(request.getParameter("seccion"));
            int id=0;
            
            switch (action) {
                case 1:  id=Integer.parseInt(request.getParameter("id"));
                    path = request.getContextPath() + "/Eliminar?id="+id+"&Seccion=Pinturas";
                   path2= request.getContextPath()+"/listarPinturas";
                    break;
                case 2:  id=Integer.parseInt(request.getParameter("id"));
                    path = request.getContextPath() + "/Eliminar?id="+id+"&Seccion=Otros";
                   path2= request.getContextPath()+"/listarOtro";
                    break;
                case 3:  id=Integer.parseInt(request.getParameter("id"));
                    path = request.getContextPath() + "/Eliminar?id="+id+"&Seccion=Esculturas";
                    path2= request.getContextPath()+"/listarEscultura";
                    break;
                case 4:  id=Integer.parseInt(request.getParameter("id"));
                    path = request.getContextPath() + "/Eliminar?id="+id+"&Seccion=Estatuas";
                    path2= request.getContextPath()+"/listarEstatua";
                    break;
                case 5:id=Integer.parseInt(request.getParameter("id"));
                    path = request.getContextPath() + "/Eliminar?id="+id+"&Seccion=ObraDeArte";
                    path2= request.getContextPath()+"/listarObjeto";
                   
                    break;
                case 6:
                    
                    break;
                case 7:
                   
                    break;
                case 8:
                    
                    break;
                     case 9:
                    
                    break;
                     case 10:
                   
                    break;
                     case 11:
                   
                    break;
                    
                    
            }
        %>
           <form method="post" action="<%=path%>">
            <label>
               Deseas eliminar este elemento?
            </label>
            <input type="submit" name="option" value="Si">
             </form>
             <form method="post" action="<%=path2%>">
            <input type="submit" value="No">
        </form>
        
    </body>
</html>
