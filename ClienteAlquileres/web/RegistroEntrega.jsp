<%-- 
    Document   : RegistroEntrega
    Created on : 01/07/2016, 12:09:01 AM
    Author     : alumno
--%>



<%@page import="java.text.SimpleDateFormat"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <link href="estilo.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>  
        <jsp:include page="InterfazRecepcionista.jsp"></jsp:include>
      ${err}     
       </br>
      <div class="tablaDatos"> 
        <form action="AlquilerServlet">
            <input type="hidden" name="accion" value="buscarp" />
                <table align="center" >
                    <tr>
                        <td>Bucar placas no entregadas</td>
                        <td>
                            <input type="text" name="txtPlacaBuscar" value="" placeholder="ingrese su placa a buscar" size="50px"/>
                        </td>
                        <td>
                            <input type="submit" value="Buscar" />
                        </td>
                    </tr>
                    <tr>
                        <td>${alq.codigo}</td>
                        <td>${alq.clie.nombre}</td>
                        <td>${alq.clie.apellidos}</td>
                        <td>${alq.placa.placa}</td>
                    </tr>                 
                </table> 
        </form> 
              </div>     
                    </br>
       <div class="tablaDatos">
     <form action="AlquilerServlet">
         <input type="hidden" name="accion" value="entregar" />
                      <table align="center">
                         <tr>
                            <th>Ingrese Código de alquiler : </th>
                          <td style="text-align: center;"> <input type="text" name="txtCodigo" value="" placeholder="ingrese su codigo de alquiler" size="10px" /></td> 
                      </tr> 
                      <tr>
                              <th>Ingrese Placa : </th>
                          <td style="text-align: center;"> <input type="text" name="txtPlaca" value="" placeholder="ingrese su placa de auto"  size="10px"/></td> 
                      </tr>                      
                      <tr>
                          <th colspan="5">
                              <input type="submit" value="Registrar Entrega" />
                          </th>
                      </tr>   
                  <tr>
                   <th colspan="7">LISTA GENERAL DE ALQUILERES NO ENTREGADOS</th>
                  </tr>
                <tr>
                <tr>
                    <th>Código</th>
                    <th>Nombre</th>
                    <th>Apellidos</th>
                    <th>Placa</th>
                </tr>     
                  <%-- start web service invocation --%><hr/>
    <%
    try {
	services.ServicioListar_Service service = new services.ServicioListar_Service();
	services.ServicioListar port = service.getServicioListarPort();
	// TODO process result here
	java.util.List<services.Alquiler> result = port.listarAlquiNoEnt();
	for(services.Alquiler al : result){
        
  
       
        %> 
        <tr>
            <td>
                <%=al.getCodigo()%>
            </td>    
                <td>
                 <%=al.getClie().getNombre()%>
                 </td>
                 <td>
                   <%=al.getClie().getApellidos()%>
                  </td>
                  <td>
                   <%=al.getPlaca().getPlaca()%>
            </td>
        </tr>                            
                  <%
        }
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>       
        </table>       
        </form>
          </div>
    </body>
</html>
