<%-- 
    Document   : Login
    Created on : 30/10/2020, 09:09:17 PM
    Author     : padil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <hr> 
        <h1>Formulario de Acceso</h1>
        <hr>
        <form action="login.jsp" method="POST"> 
            Usuario: <input type="text" name="txtUsuario"><br>
            Contraseña: <input type="text" name="txtContraseña"><br>
            <input type="submit" name="btnIngresar" value="Ingresa"><br>
            
        
        
        </form>        
    </body>
</html>
