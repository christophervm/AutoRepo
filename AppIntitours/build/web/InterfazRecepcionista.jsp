<%-- 
    Document   : InterfazEmpleado
    Created on : 13-jun-2016, 9:21:26
    Author     : Administrador
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="styles/estilo.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <div>
           <ul class="listaMenu">
            <li>Bienvenido, ${usuario.nombre}</li>
            <li><a href="ConsultaAlquiler.jsp">Consultar Alquileres</a></li>
            <li><a href="ConsultarReservasRecepcionista.jsp">Consultar Reservas</a></li>
             <li><a href="RegistrarEntrega.jsp">Registrar Entregas</a></li>
             <li><a href="RegistrarAlquiler.jsp">Registrar Alquileres</a></li>
              <tr>
                       <th colspan="3"><a href="UsuarioServlet?accion=cerrarsesion">Cerrar sesión</a></th>      
                      </tr>
        </ul>
        </div>
    </body>
</html>
