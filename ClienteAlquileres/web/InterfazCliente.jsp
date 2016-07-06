<%-- 
    Document   : InterfazCliente
    Created on : 01/07/2016, 10:51:43 AM
    Author     : alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
            <link href="estilo.css" rel="stylesheet" type="text/css"/>
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
        <table class="tablaDatos">
              <tr>
                <td><a><img src="imagenes/evento_inicio1.png" width="750px" height="280px"></a></td>
            </tr>
        </table>
        <table class="tablaDatos">
            <tr>
                <td><a href="MenuPrincipal.jsp"><img src="imagenes/logo0.png" height="50px" title="Menu Principal"></a></td>
                <td><a href="ListarAuto.jsp"><img src="imagenes/verAutos.jpg" height="50px" title="Ver Autos"></a></td>
               <td><a href="UsuarioServlet?accion=cerrarsesion"><img src="imagenes/logout_1.PNG" height="50px" title="Cerra Session"></a></td>  
            </tr>
        </table> 
         </br>
        </br>
        <div class="tablaDatos">
             <form action="ReservaServlet">
            <input type="hidden" name="accion" value="reservar" />
        <table>
            <td colspan="2"><li>   Bienvenido,  ${emp.nombre}</li></td> 
              ${res}
              ${err}
              <tr>
                <td>Auto por Placa:
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
        </table>
 </form>
        </div> 
    </body>
</html>
