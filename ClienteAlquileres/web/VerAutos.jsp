<%-- 
    Document   : VerAutos
    Created on : 05/07/2016, 01:43:21 AM
    Author     : Administrador
--%>

<%@page import="RESTservices.TBAutoRestClient"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table align="center">
              <tr>
                <td><a><img src="imagenes/imagesss.jpg" width="750px" height="180px"></a></td>
            </tr>
        </table>
        <jsp:include page="MenuPrincipal.jsp"></jsp:include>
    </table>
        <div>
            <from>
                <table align="center">
                    <tr>
                 <td><a href="InicioSesionCliente.jsp"><img src="imagenes/A2.jpg" width="500px" title="ver de Autos"></a></td>  
                 <td><a href="InicioSesionCliente.jsp"><img src="imagenes/A2.jpg" width="500px" title="ver de Autos"></a></td>  
                    </tr>
              </table>
                </br>
                
         <%
         
         TBAutoRestClient autorest = new TBAutoRestClient();
       
         
         %>
            
            
                <table align="center">
                 <tr>          
             <td><a href="InicioSesionCliente.jsp"><img src="imagenes/sa.jpg" width="300px" title="ver de Autos"></a></td>
                </tr>
                </table>
            </from>
        </div>
    </body>
</html>
