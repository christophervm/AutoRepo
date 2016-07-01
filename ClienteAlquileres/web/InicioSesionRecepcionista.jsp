<%-- 
    Document   : InicioSesion
    Created on : 30/06/2016, 12:14:22 PM
    Author     : alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <form action="UsuarioServlet">
            <input type="hidden" name="accion" value="inicior" />
        <input type="text" name="txtNomUsr" value="" />
        <input type="text" name="txtPasswd" value="" />
        <input type="submit" value="Iniciar Sesion" />
        ${err}
        </form>
        
    </body>
</html>
