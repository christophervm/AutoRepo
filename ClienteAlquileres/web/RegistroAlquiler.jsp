<%-- 
    Document   : ListaAutos
    Created on : 29/06/2016, 08:47:38 PM
    Author     : ADOLPHEER
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
       </br>
                   <div class="tablaDatos">    
             <form action="UsuarioServlet">
                     <table>
                      <input type="hidden" name="accion" value="buscar" />
                  <tr>
                 <td>                           
                     Buscar por nombre de usuario:
                 </td>
                 <td>
                     <input type="text" name="txtUsuarioBuscar" placeholder="Busque aquí al cliente" size="40px"/>
                 </td>
                 <td>
                     <input  type="submit" value="Buscar" />                    
                 </td>
             </tr> 
             <tr>
                 <td>${cli.codigo}</td>
                 <td>${cli.nombre}</td>
                 <td>${cli.apellidos}</td>
                 <td>${cli.usuario.nomusr}</td>
             </tr>
            </table>   
             </form>
             
             
                       <form action="AlquilerServlet">
                                       <input type="hidden" name="accion" value="alquilares" />
                   <div class="listaD" >
                            <input type="button" id="botonocultamuestra" value="Min" style="font-size:14px;cursor:pointer;margin:15px;padding:5px;" onclick="minimizar('divregistoalquilereserva')" />
                 
                              <input type="button" id="botonocultamuestra" value="Max" style="font-size:14px;cursor:pointer;margin:15px;padding:5px;" onclick="maximizar('divregistoalquilereserva')" />  
                  
                              <table id="divregistoalquilereserva">
         <tr>
                <th colspan="4">REGISTRE EL ALQUILER</th>
            </tr>
            <tr>
                ${res}
                <td>INGRESE EL CÓDIGO DE RESERVA</td>
                <td>
                    <input type="text" name="txtCodReserva" value="" />
                </td>     
                <td>
                    <input type="submit" value="Registrar" />
                </td>
                
            </tr>
            ${resultado}
                       </table>
            
                   </div>  
                     
                     
                     
                 </form>
             
     
             
             
             
                </div>
             </br>
             <div class="tablaDatos">
        <form action="AlquilerServlet">
            <input type="hidden" name="accion" value="alquilar" />      
        <table align="center"> 
            <tr>  
                <td>Autos dispponibles:            
            <select name="cboAuto">              
                        <%-- start web service invocation --%><hr/>
    <%
    try {
	services.ServicioListar_Service service = new services.ServicioListar_Service();
	services.ServicioListar port = service.getServicioListarPort();
	// TODO process result here
	java.util.List<services.Auto> result = port.operation();
         for(services.Auto au : result){
   
         %>
         <option value="<%=au.getPlaca()%>"> 
         <%=au.getModelo().getDescripcion()%>
         <%=au.getNombre()%>
         </option>
                        <%
         
         }
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
 </select>
 </td>
 <td>
     <input type="submit" value="Alquilar" />
 </td>
    </tr>
    <tr>
        <td>Cliente Reservado:
            <input type="text" name="txtCliente" value="" placeholder="ingrese su reserva a cliente" size="40px" />
        </td>
    </tr>
    ${resul}
            </table>
            <table>
                    <%-- start web service invocation --%><hr/>
    <%
    try {
	services.ServicioListar_Service service = new services.ServicioListar_Service();
	services.ServicioListar port = service.getServicioListarPort();
	// TODO process result here
	java.util.List<services.Cliente> result = port.listarCliente();
	for(services.Cliente cl : result){
        
          %>
          <tr>
              <td><%=cl.getCodigo()%></td>
              <td><%=cl.getNombre()%></td>
              <td><%=cl.getApellidos()%></td>
              <td><%=cl.getUsuario().getNomusr()%></td>
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
