<%-- 
    Document   : InterfazEmpleado
    Created on : 13-jun-2016, 9:21:26
    Author     : Administrador
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="estilo.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Panel de Control</title>
    </head>
    <body>  
        <div>
            <table class="tablaDatos">
              <tr>
                <td><a><img src="imagenes/evento_inicio3.png" width="750px" height="280px" align="center" ></a></td>
            </tr>
             </table>
        </div>
        <table class="tablaDatos">
                 <li>  Bienvenido,  ${emp.nombre}</li>
                <tr>
               <td><a href="MenuPrincipal.jsp"><img src="imagenes/logo0.png" height="60px" title="Menu Principal"></a></td>
               <td><a href="ConsultarReservasRecepcionista.jsp"><img src="imagenes/consultarR.jpg" height="50px" title="Consultar Reservas"></a></td>
               <td><a href="RegistroEntrega.jsp"><img src="imagenes/RegistrarEntrega.jpg" height="50px" title="Registrar Entregas<"></a></td>
                <td><a href="RegistroAlquiler.jsp"><img src="imagenes/RegistrarA.jpg" height="50px" title="Registrar Alquileres"></a></td>
                <td><a href="ConsultaAlquiler.jsp"><img src="imagenes/consultarA.jpg" height="50px" title="Consultar Alquileres"></a></td>
                <td><a href="VerAutos.jsp"><img src="imagenes/verAutos.jpg" height="50px" title="Ver Autos"></a></td>
                <td><a href="UsuarioServlet?accion=cerrarsesion"><img src="imagenes/logout_1.PNG" height="50px" title="Cerra Session"></a></td>  
                </tr>
        </table>     
    </body>
</html>
