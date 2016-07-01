<%-- 
    Document   : InicioSesionCliente
    Created on : 01/07/2016, 10:47:39 AM
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
            <input type="hidden" name="accion" value="inicioc" />
            <table>
                <tr>
                    <td>Nombre de Usuario</td>
                    <td><input type="text" name="txtNomUsr" value="" /></td>
                </tr>
                  <tr>
                    <td>Contraseña</td>
                    <td><input type="text" name="txtPasswd" value="" /></td>
                </tr>
                  <tr>
                    <td></td>
                    <td><input type="submit" value="Iniciar Sesion" /></td>
                </tr>
            </table>
        </form>
        ${err}
        
    </body>
</html>
