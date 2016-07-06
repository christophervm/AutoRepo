<%-- 
    Document   : RegistrarAlquiler
    Created on : 13-jun-2016, 20:57:07
    Author     : Administrador
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <link href="styles/estilo.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>REGISTRAR ALQUILERES</title>
        <script language="javascript" type="text/javascript">

function minimizar(nombre_capa){
document.getElementById(nombre_capa).style.display="none";
}
function maximizar(nombre_capa){
document.getElementById(nombre_capa).style.display="block";
}
</script>
    </head>
    <body>
            <%
        if(request.getSession().getAttribute("usuario") == null){
   response.sendRedirect("InicioSesion.jsp");
}
        %>
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
                 <td>${codigocliente}</td>
                 <td>${nombrecliente}</td>
                 <td>${apellidoscliente}</td>
                 <td>${usuariocliente}</td>
                 
             </tr>
   
                          </table>
 
                      </div>
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
       
                    
                   <form action="AlquilerServlet">
                   
                   <div class="listaD">
               <input type="hidden" name="accion" value="agregar" />
                 <input type="button" id="botonocultamuestra" value="Min" style="font-size:14px;cursor:pointer;margin:15px;padding:5px;" onclick="minimizar('divocultamuestra')" />
                       <input type="button" id="botonocultamuestra" value="Max" style="font-size:14px;cursor:pointer;margin:15px;padding:5px;" onclick="maximizar('divocultamuestra')" />
            <table  id="divocultamuestra">
            <tr>
                <th colspan="4">REGISTRE EL ALQUILER</th>
            </tr>
            <tr>
                <td style="text-align: center;" >Auto a Alquilar: </td>
                <td>
           
                    <jsp:useBean class="daoImpl.AutoDaoImpl" id="audao"></jsp:useBean> 
                        <select name="cboAuto">
                        <c:forEach items="${audao.listardisponibles()}" var="ad">
                                        <option value="${ad.placa}">${ad.modelo.descripcion} ${ad.nombre}</option>
                </c:forEach>
                        </select>
                </td>
            
                <td style="text-align: center;">Código Cliente: </td>
                <td >
                    <input type="text" name="txtCliente" value="" />
                </td>
                
                
             </tr>
             
             <tr>
           
                <th colspan="4">
                    <input type="submit" value="Registrar" />
                </th>
            </tr>
             <tr>
                 <th>Código</th>
                  <th>Nombre del Cliente</th>
                   <th>Apellidos del Cliente</th>
                    <th>Usuario del cliente</th>
                 
                 
             </tr>
                    <jsp:useBean class="daoImpl.ClienteDaoImpl" id="resdao"></jsp:useBean>
                   
                    <c:forEach items="${resdao.ListaCliente()}" var="ad">
                    <tr>
                        <td style="text-align: center;">${ad.codigo}</td>
                           <td style="text-align: center;">${ad.nombre}</td>
                           <td style="text-align: center;">${ad.apellidos}</td>
                           <td style="text-align: center;">${ad.usuario.nomusr}</td>
                           </tr>
                    </c:forEach>

                           <tr>
                       <th colspan="6"><a href="InterfazRecepcionista.jsp">Volver al menú principal</a></th>              
                          
                      </tr>

        </table>
              
                
            </div>
           
        </form>
                    
                    
                    
                    
            
    </body>
</html>
