<%-- 
    Document   : ListarAuto1
    Created on : 05/07/2016, 01:27:29 AM
    Author     : Administrador
--%>

<%@page import="services.Marca"%>
<%@page import="services.Modelo"%>
<%@page import="RESTservices.TBModeloRestClient"%>
<%@page import="com.sun.jersey.api.client.ClientResponse"%>
<%@page import="com.sun.jersey.api.client.GenericType"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="services.Auto"%>
<%@page import="services.Auto"%>
<%@page import="RESTservices.TBAutoRestClient"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      
        <div>
              <jsp:include page="MenuPrincipal.jsp"></jsp:include>
              <form action="RESTservices/TBAutoRestClient.java/countREST()">
              <table class="tablaDatos">
                <tr>
             <td><a href="VerAutos.jsp"><img src="imagenes/logo8.png" width="300px" title="Ver de Autos"></a></td>
             <td>
                 <input type="submit" value="Ver" />
             </td>
             <td>
                 <%
                 TBAutoRestClient aurest = new TBAutoRestClient();
                 List<Auto> lstAuto = new ArrayList<Auto>();
                GenericType<List<Auto>> genericType = new GenericType<List<Auto>>() {};
                 ClientResponse respons = aurest.findAll_XML(ClientResponse.class);
                 
                 
                 
                 TBModeloRestClient modrest = new TBModeloRestClient(); 
                 List<Modelo> lstModelo = new ArrayList<Modelo>();
                  GenericType<List<Modelo>> genericType2 = new GenericType<List<Modelo>>() {};
                 ClientResponse respons2 = modrest.findAll_XML(ClientResponse.class);
                 
                 lstModelo = respons2.getEntity(genericType2);
                 
                 
                    TBModeloRestClient marest = new TBModeloRestClient(); 
                 List<Marca> lstMarca = new ArrayList<Marca>();
                  GenericType<List<Marca>> genericType3 = new GenericType<List<Marca>>() {};
                 ClientResponse respons3 = marest.findAll_XML(ClientResponse.class);
                 lstMarca = respons3.getEntity(genericType3);
                 
                 
                lstAuto = respons.getEntity(genericType);
                
                
             
               
                
                
                for(services.Auto au : lstAuto){        
             %>
             
                <tr>
                      <td><%=au.getNombre()%></td>
                 
                 
                      <td><%=au.getModelo().getDescripcion()%></td>
                      <td><%=au.getModelo().getCodigo()%></td>
                    
                </tr>
           
             
             
                 <%
    
               }
                
                
                 %>
             </td>
            
             
                </tr>
            </table>
                  </form>
        </div>
    </body>
</html>

