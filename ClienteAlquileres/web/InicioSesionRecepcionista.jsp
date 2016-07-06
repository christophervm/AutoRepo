<%-- 
    Document   : InicioSesion
    Created on : 30/06/2016, 12:14:22 PM
    Author     : alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <link href="estilo.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table class="tablaDatos">
              <tr>
                <td><a><img src="imagenes/evento_inicio3.png" width="750px" height="280px"></a></td>
            </tr>
        </table>
        <table class="tablaDatos">
              <tr>
             <td><a href="MenuPrincipal.jsp"><img src="imagenes/logo0.png" width="80px" title="Menu Principal"></a></td>
                </tr> 
        </table>
        <div class="tablaDatos" align="center">
             <form action="UsuarioServlet">
            <input type="hidden" name="accion" value="inicior" />
            <table class="tablaDatos">
                <td>
                <td>LOGIN RECEPCIONISTA</td>
                </td>            
                <tr>
                    <td>
                      User Name:  
                    </td>
                    <td><input type="text" name="txtNomUsr" value="" placeholder="Ingrese Su Nombre De Recepcionista" size="50"/></td>
                </tr>
                  <tr>
                    <td>
                       Password:
                    </td>
                    <td><input type="password" name="txtPasswd" value="" placeholder="Ingrese Su Contraseña"  size="40"/></td>
                </tr>
                  <tr>
                    <td></td>
                    <td><input type="submit" value="Iniciar Sesion" /></td>
                </tr>
            </table>  
        </div>
        </form>
        ${err}
    </body>
</html>
