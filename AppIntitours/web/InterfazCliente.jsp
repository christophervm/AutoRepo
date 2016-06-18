<%-- 
    Document   : RegistrarReserva
    Created on : 12-jun-2016, 7:26:12
    Author     : Administrador
--%>



<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page import="java.util.Date"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Panel de Control</title>
        <link href="styles/estilo.css" rel="stylesheet" type="text/css"/>
        
        <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
  <script src="//code.jquery.com/jquery-1.10.2.js"></script>
  <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script>
   $(function() {
  var date = $('#datepicker').datepicker({ dateFormat: 'dd/mm/yy' }).val();
  });
  </script>

        
        
    </head>
    <body>
        <form action="AutoServlet">
               <div class='listaD'>
                   <input type="hidden" name="accion" value="registrar" />
                   <table class="tablaC">
                <tr>
                    <th colspan="3">¡REGISTRE SU RESERVA AHORA!</th>  
                </tr>
              <tr>
                    <td>Elija el auto: </td>
                    <td>
                        <jsp:useBean class="daoImpl.AutoDaoImpl" id="audao"></jsp:useBean> 
                        <select name="cboDisponibles">
                        <c:forEach items="${audao.listardisponibles()}" var="ad">
                                        <option value="${ad.placa}">${ad.nombre}</option>
                </c:forEach>
                        </select>
                    </td>
                </tr>
                <tr>
                    
                    <td>
                       
                        <p>Elija fecha de Reserva:
                            
                    </p>
                  
                    </td>
                    <td><input type="text" id="datepicker" name="calFecha"></td>
                </tr>
                 </div>
                        
                <div class='tablaListarD'>
                       <c:forEach items="${audao.listardisponibles()}" var="ad">     
                      <tr>
                          
                             <td>${ad.modelo.marca.descripcion}</td>
                             <td>${ad.modelo.descripcion}</td>
                           <td>${ad.nombre}</td>
                      </tr> 
                </div>
                  
                       
                </c:forEach>
                      <th colspan="2">
               
                              <input type="submit" value="Reservar" />
 
                      </th>
                      <th colspan="2">
                     
            <input type="button" value="Consultar Reservas realizadas" onclick = "location='ConsultarReservas.jsp'"/>
                        
                      </th>
                      <tr>
                       <th colspan="3"><a href="UsuarioServlet?accion=cerrarsesion">Cerrar sesión</a></th>      
                      </tr>
                   
            </table>
            
       
                      Bienvenido, ${usuario.nombre}
                    
                        
        </form>
     
    </body>
</html>
