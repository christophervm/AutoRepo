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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
            Bienvenido ${emp.nombre}
             <form action="UsuarioServlet">
                      <div class="listaD">
                          <table>
                             <input type="hidden" name="accion" value="buscar" />
                  <tr>
                 <td>Buscar por nombre de usuario</td>
                 <td>
                     <input type="text" name="txtUsuarioBuscar" placeholder="Busque aquí al cliente" />
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
 
                      </div>
             </form>
        
        
        <form action="AlquilerServlet">
            <input type="hidden" name="accion" value="alquilar" />
  
         
        <table>
           
              
               
            <tr>
        
                <td>
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
        <td>
            <input type="text" name="txtCliente" value="" />
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
    <tr>
                 <th colspan="3"><a href="UsuarioServlet?accion=cerrarsesion">Cerrar sesión</a></th>      
                      </tr>
                  <tr>
                 <th colspan="3"><a href="InterfazRecepcionista.jsp">Volver al menú principal</a></th>      
                      </tr>
            </table>
            
            
        
 </form>
 
    </body>
</html>
