<%-- 
    Document   : MenuPrincipal
    Created on : 12-jun-2016, 1:25:11
    Author     : Administrador
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="estilo.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>¡Alquila un Auto en Intitours!</title>
    </head>
    <body>
            <table align="center">
              <tr>
                  <td><a href="RegistroUsuario.jsp"><img src="imagenes/registrar.jpg" width="250px"  title="Regsitar Usuario"></a></td>           
              </tr>
          </table>
        </br>
        </br>
        </br>
        </br>
        <div>
            <table align="center">
                <tr>
                    <td><a href="MenuPrincipal.jsp"><img src="imagenes/logo0.png" width="250px" title="Menu Principal"></a></td>
                    <td><a href="ListarAuto.jsp"><img src="imagenes/logo4.png" width="250px" title="Listado de Autos"></a></td>
                    <td><a href="InicioSesionCliente.jsp"><img src="imagenes/logo5.png" width="250px" title="Login"></a></td>
                </tr>
            </table>
            <table align="center">
             <tr>
              <td><font size="30px"><h4>¡Alquila Auto en Intitours...! !Ya...!</h4> </font>  </td>
                </tr>
                  </table>   
            ${respo}
      </div>
    </body>       
</html>