<%-- 
    Document   : ConsultaAlquiler
    Created on : 13-jun-2016, 19:59:06
    Author     : Administrador
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="styles/estilo.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CONSULTA DE ALQUILERES</title>
    </head>
    <body>
            
              <table class="tablaDatos">
                 
                  <tr>
                      <th colspan="7">LISTA GENERAL DE ALQUILERES REALIZADOS</th>
                  </tr>
      
                <tr>
                   
                    <jsp:useBean class="daoImpl.AlquilerDaoImpl" id="resdao"></jsp:useBean>
                   
                    <c:forEach items="${resdao.ListaAlquiler()}" var="ad">
                        <td>${ad.codigo}</td>
                             <td>${ad.fechares}</td>
                           <td>${ad.fechalim}</td>
                           <td>${ad.clie.nombre}</td>
                           <td>${ad.clie.apellidos}</td>
                           <td>${ad.placa.nombre}</td>
                           <td${ad.placa.modelo.descripcion}</td>
                         
                      </tr> 
                        </c:forEach>     
                  ${entre}
             <tr>
                       <th colspan="3"><a href="UsuarioServlet?accion=cerrarsesion">Cerrar sesión</a></th>      
                      </tr>
        </table>
    </body>
</html>
