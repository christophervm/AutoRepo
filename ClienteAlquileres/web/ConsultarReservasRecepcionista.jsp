<%-- 
    Document   : ConsultarReservasRecepcionista
    Created on : 01/07/2016, 02:01:19 PM
    Author     : alumno
--%>

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
        <div class="tablaDatos">
             <table align="center"> 
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
        </table>
       </div>
    </body>
</html>
