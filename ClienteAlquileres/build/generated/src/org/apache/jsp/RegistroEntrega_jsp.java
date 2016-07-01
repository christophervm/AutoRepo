package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;

public final class RegistroEntrega_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${err}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("        \n");
      out.write("         \n");
      out.write("        <form action=\"AlquilerServlet\">\n");
      out.write("            <input type=\"hidden\" name=\"accion\" value=\"buscarp\" />\n");
      out.write("            <div>\n");
      out.write("                <table class=\"tablaDatos\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Bucar placas no entregadas</td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"text\" name=\"txtPlacaBuscar\" value=\"\" />\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"submit\" value=\"Buscar\" />\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${\"Codigo\" + alq.codigo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                        <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${alq.clie.nombre}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                        <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${alq.clie.apellidos}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                        <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${alq.placa.placa}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("        </form> \n");
      out.write("        \n");
      out.write("        \n");
      out.write("           \n");
      out.write("     <form action=\"AlquilerServlet\">\n");
      out.write("         <input type=\"hidden\" name=\"accion\" value=\"entregar\" />\n");
      out.write("    \n");
      out.write("                  <div>\n");
      out.write("                     \n");
      out.write("                      <table class=\"tablaDatos\">\n");
      out.write("                         <tr>\n");
      out.write("                            <th>Ingrese Código de alquiler : </th>\n");
      out.write("                          <td style=\"text-align: center;\"> <input type=\"text\" name=\"txtCodigo\" value=\"\" /></td> \n");
      out.write("                      </tr> \n");
      out.write("                      <tr>\n");
      out.write("                              <th>Ingrese Placa : </th>\n");
      out.write("                          <td style=\"text-align: center;\"> <input type=\"text\" name=\"txtPlaca\" value=\"\" /></td> \n");
      out.write("                      </tr>\n");
      out.write("                      \n");
      out.write("                      <tr>\n");
      out.write("                          <th colspan=\"5\">\n");
      out.write("                              <input type=\"submit\" value=\"Registrar Entrega\" />\n");
      out.write("                          </th>\n");
      out.write("                      </tr>\n");
      out.write("                  <tr>\n");
      out.write("                      <th colspan=\"7\">LISTA GENERAL DE ALQUILERES NO ENTREGADOS</th>\n");
      out.write("                  </tr>\n");
      out.write("      \n");
      out.write("                <tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Código</th>\n");
      out.write("   \n");
      out.write("                    <th>Nombre</th>\n");
      out.write("                    <th>Apellidos</th>\n");
      out.write("                    <th>Placa</th>\n");
      out.write("                </tr>\n");
      out.write("                  \n");
      out.write("                  ");
      out.write("<hr/>\n");
      out.write("    ");

    try {
	services.ServicioListar_Service service = new services.ServicioListar_Service();
	services.ServicioListar port = service.getServicioListarPort();
	// TODO process result here
	java.util.List<services.Alquiler> result = port.listarAlquiNoEnt();
	for(services.Alquiler al : result){
        
  
       
        
      out.write(" \n");
      out.write("        <tr>\n");
      out.write("            <td>\n");
      out.write("                ");
      out.print(al.getCodigo());
      out.write("\n");
      out.write("            </td>    \n");
      out.write("                <td>\n");
      out.write("                 ");
      out.print(al.getClie().getNombre());
      out.write("\n");
      out.write("                 </td>\n");
      out.write("                 <td>\n");
      out.write("                   ");
      out.print(al.getClie().getApellidos());
      out.write("\n");
      out.write("                  </td>\n");
      out.write("                  <td>\n");
      out.write("                   ");
      out.print(al.getPlaca().getPlaca());
      out.write("\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("                  ");

        }
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    
      out.write("\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("       \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </table>\n");
      out.write("                    </div>\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("\n");
      out.write("        \n");
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
