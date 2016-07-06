<%-- 
    Document   : InicioSesionCliente
    Created on : 01/07/2016, 10:47:39 AM
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
                <td><a><img src="imagenes/rentacar.png" width="750px" height="180px"></a></td>
            </tr>
        </table>
        <table class="tablaDatos">          
                 <tr>
             <td><a href="MenuPrincipal.jsp"><img src="imagenes/logo0.png" width="80px" title="Menu Principal"></a></td>
                </tr>
        </table>
        <div class="tablaDatos">
            <form action="UsuarioServlet">
            <input type="hidden" name="accion" value="inicioc" />
            <table>
                <tr>  
                     <td>LOGIN CLIENTE</td>                
                </tr>             
                <tr>
                    <td>
                     User Name:
                    </td>
                    <td>
                        <input type="text" name="txtNomUsr" value="" placeholder="Ingrese su Nombre de Usuario" size="50px" />
                    </td>
                </tr>
                  <tr>
                    <td>
                      Password:
                    </td>
                    <td><input type="password" name="txtPasswd" value="" placeholder="Ingrese Su Contraseña" size="40px"/></td>
                </tr>
                  <tr>
                    <td></td>
                    <td><input type="submit" value="Iniciar Sesion" /></td>  
                </tr>
            </table>        
        </form>
        ${err}
        </div>  
    </body>
</html>
