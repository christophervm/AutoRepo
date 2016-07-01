package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class InterfazCliente_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("              <link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css\">\n");
      out.write("  <script src=\"//code.jquery.com/jquery-1.10.2.js\"></script>\n");
      out.write("  <script src=\"//code.jquery.com/ui/1.11.4/jquery-ui.js\"></script>\n");
      out.write("  <link rel=\"stylesheet\" href=\"/resources/demos/style.css\">\n");
      out.write("  <script>\n");
      out.write("   $(function() {\n");
      out.write("  var date = $('#datepicker').datepicker({ dateFormat: 'dd/mm/yy' }).val();\n");
      out.write("  });\n");
      out.write("  </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"ReservaServlet\">\n");
      out.write("            <input type=\"hidden\" name=\"accion\" value=\"reservar\" />\n");
      out.write("        <table>\n");
      out.write("              <li>   Bienvenido,  ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${emp.nombre}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</li>\n");
      out.write("              ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${res}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("              ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${err}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("              <tr>\n");
      out.write("        \n");
      out.write("                <td>\n");
      out.write("            <select name=\"cboAuto\">\n");
      out.write("                        ");
      out.write("<hr/>\n");
      out.write("    ");

    try {
	services.ServicioListar_Service service = new services.ServicioListar_Service();
	services.ServicioListar port = service.getServicioListarPort();
	// TODO process result here
	java.util.List<services.Auto> result = port.operation();
         for(services.Auto au : result){
   
         
      out.write("\n");
      out.write("         <option value=\"");
      out.print(au.getPlaca());
      out.write("\"> \n");
      out.write("         ");
      out.print(au.getModelo().getDescripcion());
      out.write("\n");
      out.write("         ");
      out.print(au.getNombre());
      out.write("\n");
      out.write("         </option>\n");
      out.write("                        ");

         
         }
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    
      out.write("\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write(" </select>\n");
      out.write(" </td>\n");
      out.write("   <td><input type=\"text\" id=\"datepicker\" name=\"calFecha\"></td>\n");
      out.write(" <td>\n");
      out.write("     <input type=\"submit\" value=\"Reservar\" />\n");
      out.write(" </td>\n");
      out.write("    </tr>     \n");
      out.write("              \n");
      out.write("              \n");
      out.write("               <tr>\n");
      out.write("      <th colspan=\"3\"><a href=\"UsuarioServlet?accion=cerrarsesion\">Cerrar sesión</a></th>      \n");
      out.write("                      </tr>\n");
      out.write("            \n");
      out.write("        </table>\n");
      out.write(" </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
