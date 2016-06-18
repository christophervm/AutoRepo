<%-- 
    Document   : ConsultarReservasRecepcionista
    Created on : 13-jun-2016, 19:26:56
    Author     : Administrador
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="model.Auto"%>
<%@page import="java.util.List"%>
<%@page import="model.Reserva"%>
<%@page import="daoImpl.AutoDaoImpl"%>
<%@page import="daoImpl.ReservaDAOImpl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="styles/estilo.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CONSULTA DE RESERVAS</title>
    </head>
    <body>
        <form >
            
              <table class="tablaDatos">
                 
                  <tr>
                      <th colspan="7">LISTA GENERAL DE RESERVAS REALIZADAS</th>
                  </tr>
      
                <tr>
            
                    <jsp:useBean class="daoImpl.ReservaDAOImpl" id="resdao"></jsp:useBean>
                   
                            <c:forEach items="${resdao.ReservaEmp()}" var="ad">
                         
                               <td></td>
                             <td>${ad.codigo}</td>
                             <td>${ad.fechares}</td>
                           <td>${ad.fechalim}</td>
                           <td>${ad.clie.nombre}</td>
                           <td>${ad.clie.apellidos}</td>
                           <td>${ad.placa.nombre}</td>
                           <td${ad.placa.modelo.descripcion}</td>
                      </tr> 
                        </c:forEach>     
             <tr>
                       <th colspan="3"><a href="UsuarioServlet?accion=cerrarsesion">Cerrar sesión</a></th>      
                      </tr>
                  
            
        </table>
            
            
            
            
        </form>
      
    </body>
</html>
