<%-- 
    Document   : frmLogin
    Created on : 04/04/2016, 06:21:22 PM
    Author     : alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="styles/estilo.css" rel="stylesheet" type="text/css"/>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>INGRESO AL SISTEMA</title>
    </head>
    <body>

        
        <div class="contenido">
            <form action="UsuarioServlet">
                <input type="hidden" name="accion" value="validar" />
                <table class="tablaFRM">
                    <tr>
                        <td colspan="2">INGRESO AL SISTEMA</td>
                    </tr>
                    <tr>
                        <td>Nombre de Usuario:</td>
                        <td><input type="text" name="txtNombreUsuario" placeholder="Ingrese el Nombre de usuario" value="${usuarios}"></td>
                    </tr>
                    <tr>
                        <td>Clave:</td>
                        <td><input type="password" name="txtClave" placeholder="Ingrese la Clave"></td>
                    </tr>                
                    <tr>
                        <td></td>
                        <td><input type="submit" value="Ingresar"></td>
                    </tr>
                </table>
                    ${error}
            </form>
        </div>
    </body>
</html>
