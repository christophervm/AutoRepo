<%-- 
    Document   : InterfazCliente
    Created on : 01/07/2016, 10:51:43 AM
    Author     : alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
              <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
  <script src="//code.jquery.com/jquery-1.10.2.js"></script>
  <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script>
   $(function() {
  var date = $('#datepicker').datepicker({ dateFormat: 'dd/mm/yy' }).val();
  });
  </script>
    </head>
    <body>
        <form action="ReservaServlet">
            <input type="hidden" name="accion" value="reservar" />
        <table>
              <li>   Bienvenido,  ${emp.nombre}</li>
              ${res}
              ${err}
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
   <td><input type="text" id="datepicker" name="calFecha"></td>
 <td>
     <input type="submit" value="Reservar" />
 </td>
    </tr>     
              
              
               <tr>
      <th colspan="3"><a href="UsuarioServlet?accion=cerrarsesion">Cerrar sesión</a></th>      
                      </tr>
            
        </table>
 </form>
    </body>
</html>
