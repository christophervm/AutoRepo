<%-- 
    Document   : RegistroUsuario
    Created on : 13-jun-2016, 4:56:31
    Author     : Administrador
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="styles/estilo.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>REGISTRO DE USUARIO</title>
    </head>
    <body>
        <form action="UsuarioServlet">
            <div class="listaD">
               <input type="hidden" name="accion" value="agregar" />
            <table>
            <tr>
                <th>REGISTRE SU USUARIO AHORA</th>
            </tr>
            <tr>
                <td>Nombre : </td>
                <td>
                    <input type="text" name="txtNombre" value="" />
                </td>
            </tr>
             <tr>
                <td>Apellidos : </td>
                <td>
                    <input type="text" name="txtApellidos" value="" />
                </td>
            </tr>
             <tr>
                <td>DNI(Si no posee ingresar carnet extranjería) : </td>
                <td>
                    <input type="text" name="txtDNI" value="" />
                </td>
            </tr>
             <tr>
                <td>Brevete : </td>
                <td>
                    <input type="text" name="txtBrevete" value="" />
                </td>
            </tr>
             <tr>
                <td>Carnet Extranjeria : </td>
                <td>
                    <input type="text" name="txtCarnetEx" value="" />
                </td>
            </tr>
             <tr>
                <td>Nombre de Usuario : </td>
                <td>
                    <input type="text" name="txtUsuario" value="" />
                </td>
            </tr> <tr>
                <td>Contraseña : </td>
                <td>
                    <input type="text" name="txtContrasena" value="" />
                </td>
            </tr>
             <tr>
           
                <th colspan="2">
                    <input type="submit" value="Registrarse" />
                </th>
            </tr>
        </table>
              
                
            </div>
           
        </form>
        ${Mensj}
    </body>
</html>
