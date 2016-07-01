<%-- 
    Document   : ConsultarReservasRecepcionista
    Created on : 01/07/2016, 02:01:19 PM
    Author     : alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table>
            
             <tr>
                <th>CodigoAlquiler</th>
                  <th>Nombre</th>
                    <th>Auto</th>
            </tr>
              <%-- start web service invocation --%><hr/>
    <%
    try {
	services.ServicioListar_Service service = new services.ServicioListar_Service();
	services.ServicioListar port = service.getServicioListarPort();
	// TODO process result here
	java.util.List<services.Reserva> result = port.listaGenReserva();
	for(services.Reserva alq : result){
            
          
        %> 
        <tr>
        <td><%=alq.getCodigo()%></td>
    
         <td><%=alq.getClie().getNombre()%> <%=alq.getClie().getApellidos()%> </td>
         <td><%=alq.getPlaca().getModelo().getDescripcion()%>  
         <%=alq.getPlaca().getModelo().getMarca().getDescripcion()%> 
         </td>
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
            
        
    </body>
</html>
