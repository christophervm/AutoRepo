<%-- 
    Document   : RegistrarEntrega
    Created on : 13-jun-2016, 20:10:04
    Author     : Administrador
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="styles/estilo.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>REGISTRAR ENTREGAS</title>
    </head>
    <body>
     <form action="AlquilerServlet">
         <input type="hidden" name="accion" value="entregar" />
              <table class="tablaDatos">
                 
                  <tr>
                      <th colspan="7">LISTA GENERAL DE ALQUILERES NO ENTREGADOS</th>
                  </tr>
      
                <tr>
               
                    <jsp:useBean class="daoImpl.AlquilerDaoImpl" id="resdao"></jsp:useBean>
                   
                    <c:forEach items="${resdao.ListaAlquilerNoEnt()}" var="ad">
                         <td>${ad.codigo}</td>
                             <td>${ad.fechares}</td>
                           <td>${ad.fechalim}</td>
                           <td>${ad.clie.nombre}</td>
                           <td>${ad.clie.apellidos}</td>
                           <td>${ad.placa.nombre}</td>
                           <td${ad.placa.modelo.descripcion}</td>
                             <td>${ad.placa.placa}</td>
                      </tr> 
                        </c:forEach>     
            
                      <tr>
                          <td>Ingrese Placa : </td>
                          <td> <input type="text" name="txtPlaca" value="" /></td> 
                      </tr> 
                       <tr>
                            <td>Ingrese Código de alquiler : </td>
                          <td> <input type="text" name="txtCodigo" value="" /></td> 
                      </tr> 
                      <tr>
                          <td>
                              <input type="submit" value="Entregar" />
                          </td>
                      </tr>
            
        </table>
        </form>
    </body>
</html>
