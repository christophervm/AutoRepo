<%-- 
    Document   : ConsultarReservas
    Created on : 12-jun-2016, 22:18:24
    Author     : Administrador
--%>

<%@page import="model.Auto"%>
<%@page import="daoImpl.AutoDaoImpl"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page import="model.Usuario"%>
<%@page import="model.Reserva"%>
<%@page import="java.util.List"%>
<%@page import="daoImpl.ReservaDAOImpl"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="styles/estilo.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CONSULTA DE RESERVAS</title>
    </head>
    <body>
        <form action="AutoServlet">
        <input type="hidden" name="accion" value="buscar" />
        <input type="hidden" name="codigg" value="${usuario.getCodigo()}" />
        <table class="tablaDatos">  
            <tr>
           
                <th colspan="4">
                    <input type="submit" value="Consultar Reservas como : ${usuario.getNombre()}" />
                </th>
      
                <tr>
              <%
            
            try{
            ReservaDAOImpl resdao = new ReservaDAOImpl();
            AutoDaoImpl audao = new AutoDaoImpl();
            List<Reserva> lstDistritos = resdao.ReservasList(Integer.parseInt(request.getParameter("codigg")
            )); 
          
              
            
            for(Reserva dis : lstDistritos){
                
           Auto au = audao.buscarXPlaca(dis.getPlaca().getPlaca());
           String auto = au.getNombre();
            %>
            <tr>
         
                
                <td><%=dis.getClie().getNombre()%></td>
                <td>
                    <fmt:formatDate  pattern="dd/MM/yyyy" value="<%=dis.getFechares()%>"  ></fmt:formatDate>
                </td>
               <td>
                    <fmt:formatDate  pattern="dd/MM/yyyy" value="<%=dis.getFechalim()%>"  ></fmt:formatDate>
                </td>
                  <td><%=auto%></td>
            </tr>
           
              
           
            

            <%
            }
            
            
            }catch(Exception e){}
            
                
                
            
            %>
                      
                <td>
                  
               ${rr}
                </td>
            </tr>
            
             <tr>
                       <th colspan="4"><a href="UsuarioServlet?accion=cerrarsesion">Cerrar sesión</a></th>      
                      </tr>
        </table>
                </form>
    </body>
</html>
