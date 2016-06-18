package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Auto;
import daoImpl.AutoDaoImpl;
import model.Usuario;
import model.Reserva;
import java.util.List;
import daoImpl.ReservaDAOImpl;

public final class ConsultarReservas_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_formatDate_value_pattern_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_fmt_formatDate_value_pattern_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_fmt_formatDate_value_pattern_nobody.release();
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link href=\"styles/estilo.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"AutoServlet\">\n");
      out.write("        <input type=\"hidden\" name=\"accion\" value=\"buscar\" />\n");
      out.write("        <input type=\"hidden\" name=\"codigg\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.getCodigo()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("        <table class=\"tablaDatos\">  \n");
      out.write("            <tr>\n");
      out.write("           \n");
      out.write("                <th colspan=\"4\">\n");
      out.write("                    <input type=\"submit\" value=\"Consultar Reservas como : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.getNombre()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                </th>\n");
      out.write("      \n");
      out.write("                <tr>\n");
      out.write("              ");

            
            try{
            ReservaDAOImpl resdao = new ReservaDAOImpl();
            AutoDaoImpl audao = new AutoDaoImpl();
            List<Reserva> lstDistritos = resdao.ReservasList(Integer.parseInt(request.getParameter("codigg")
            )); 
          
              
            
            for(Reserva dis : lstDistritos){
                
           Auto au = audao.buscarXPlaca(dis.getPlaca().getPlaca());
           String auto = au.getNombre();
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("         \n");
      out.write("                \n");
      out.write("                <td>");
      out.print(dis.getClie().getNombre());
      out.write("</td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      //  fmt:formatDate
      org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
      _jspx_th_fmt_formatDate_0.setPageContext(_jspx_page_context);
      _jspx_th_fmt_formatDate_0.setParent(null);
      _jspx_th_fmt_formatDate_0.setPattern("dd/MM/yyyy");
      _jspx_th_fmt_formatDate_0.setValue(dis.getFechares());
      int _jspx_eval_fmt_formatDate_0 = _jspx_th_fmt_formatDate_0.doStartTag();
      if (_jspx_th_fmt_formatDate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_0);
        return;
      }
      _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_0);
      out.write("\n");
      out.write("                </td>\n");
      out.write("               <td>\n");
      out.write("                    ");
      //  fmt:formatDate
      org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_1 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
      _jspx_th_fmt_formatDate_1.setPageContext(_jspx_page_context);
      _jspx_th_fmt_formatDate_1.setParent(null);
      _jspx_th_fmt_formatDate_1.setPattern("dd/MM/yyyy");
      _jspx_th_fmt_formatDate_1.setValue(dis.getFechalim());
      int _jspx_eval_fmt_formatDate_1 = _jspx_th_fmt_formatDate_1.doStartTag();
      if (_jspx_th_fmt_formatDate_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_1);
        return;
      }
      _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_1);
      out.write("\n");
      out.write("                </td>\n");
      out.write("                  <td>");
      out.print(auto);
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("           \n");
      out.write("              \n");
      out.write("           \n");
      out.write("            \n");
      out.write("\n");
      out.write("            ");

            }
            
            
            }catch(Exception e){}
            
                
                
            
            
      out.write("\n");
      out.write("                      \n");
      out.write("                <td>\n");
      out.write("                  \n");
      out.write("               ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rr}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("             <tr>\n");
      out.write("                       <th colspan=\"4\"><a href=\"UsuarioServlet?accion=cerrarsesion\">Cerrar sesión</a></th>      \n");
      out.write("                      </tr>\n");
      out.write("        </table>\n");
      out.write("                </form>\n");
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
