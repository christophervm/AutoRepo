<%-- 
    Document   : RegistrarAlquiler
    Created on : 13-jun-2016, 20:57:07
    Author     : Administrador
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="styles/estilo.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      <form action="AlquilerServlet">
            <div class="listaD">
               <input type="hidden" name="accion" value="agregar" />
            <table>
            <tr>
                <th>REGISTRE EL ALQUILER</th>
            </tr>
            <tr>
                <td>Auto a Alquilar : </td>
                <td>
           
                    <jsp:useBean class="daoImpl.AutoDaoImpl" id="audao"></jsp:useBean> 
                        <select name="cboAuto">
                        <c:forEach items="${audao.listardisponibles()}" var="ad">
                                        <option value="${ad.placa}">${ad.nombre}</option>
                </c:forEach>
                        </select>
                </td>
            </tr>
             <tr>
                <td>Código Cliente : </td>
                <td>
                    <input type="text" name="txtCliente" value="" />
                </td>
             
                    <jsp:useBean class="daoImpl.ClienteDaoImpl" id="resdao"></jsp:useBean>
                   
                    <c:forEach items="${resdao.ListaCliente()}" var="ad">
                    <tr>
                        <td>${ad.codigo}</td>
                           <td>${ad.nombre}</td>
                           <td>${ad.apellidos}</td>
                           </tr>
                    </c:forEach>
                     
         
                         
                 
                
                
            </tr>

             <tr>
           
                <th colspan="2">
                    <input type="submit" value="Registrar" />
                </th>
            </tr>
        </table>
              
                
            </div>
           
        </form>
    </body>
</html>
