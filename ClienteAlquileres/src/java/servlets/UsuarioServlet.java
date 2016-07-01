/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import services.Cliente;
import services.ServicioSes_Service;
import services.Empleado;
import services.ServicioAlquiler_Service;

/**
 *
 * @author alumno
 */
public class UsuarioServlet extends HttpServlet {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/ServicioAlquileres/ServicioAlquiler.wsdl")
    private ServicioAlquiler_Service service_1;
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/ServicioAlquileres/ServicioSes.wsdl")
    private ServicioSes_Service service;
  

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String accion = request.getParameter("accion");
            if (accion.equalsIgnoreCase("inicior")) {
                inis(request,response);
            }
            if(accion.equalsIgnoreCase("cerrarsesion")){
         
           try {
            request.getSession().invalidate();
            response.sendRedirect("MenuPrincipal.jsp");
        } catch (Exception ex) {
         
        }}
            if (accion.equals("buscar")) {
                buscarc(request,response);
            }
             if (accion.equalsIgnoreCase("inicioc")) {
                inisc(request,response);
            }
            
            
            
            
            
            
            
            
            
            
            
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet UsuarioServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UsuarioServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

   
    private void inis(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     
        
        try {

            
               services.ServicioSes port = service.getServicioSesPort();
     
       String nomusr = request.getParameter("txtNomUsr");
            String passwd = request.getParameter("txtPasswd");
            
             Empleado em = port.validaSes(nomusr,passwd);
             if (em !=null) {
                   request.getSession().setAttribute("emp", em);
 response.sendRedirect("InterfazRecepcionista.jsp");
    
            }else{
             String err = "ERROR NO EXISTE EL USUARIO O CONTRASEÑA INCORRECTA";
            request.setAttribute("err",err);
            request.getRequestDispatcher("InicioSesionRecepcionista.jsp").forward(request, response);
             
             }
             

     
        } catch (Exception e) {
            String err = "ERROR NO EXISTE EL USUARIO O CONTRASEÑA INCORRECTA";
            request.setAttribute("err",err);
            request.getRequestDispatcher("InicioSesionRecepcionista.jsp").forward(request, response);
        }
       
    }

    private void buscarc(HttpServletRequest request, HttpServletResponse response) {
        try {
             String usr = request.getParameter("txtUsuarioBuscar");
         services.ServicioAlquiler port = service_1.getServicioAlquilerPort();
          Cliente cli =  port.buscarCliente(usr);
         
         request.setAttribute("cli",cli);
          request.getRequestDispatcher("RegistroAlquiler.jsp").forward(request, response);
        } catch (Exception e) {
        }
       
        
    }

    private void inisc(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
        
        
        
          
        try {

            
               services.ServicioSes port = service.getServicioSesPort();
     
       String nomusr = request.getParameter("txtNomUsr");
            String passwd = request.getParameter("txtPasswd");
            
             Cliente em = port.validarSesClie(nomusr,passwd);
             if (em !=null) {
                   request.getSession().setAttribute("emp", em);
 response.sendRedirect("InterfazCliente.jsp");
    
            }else{
             String err = "ERROR NO EXISTE EL USUARIO O CONTRASEÑA INCORRECTA";
            request.setAttribute("err",err);
            request.getRequestDispatcher("InicioSesionCliente.jsp").forward(request, response);
             
             }
             

     
        } catch (Exception e) {
            String err = "ERROR NO EXISTE EL USUARIO O CONTRASEÑA INCORRECTA";
            request.setAttribute("err",err);
            request.getRequestDispatcher("InicioSesionCliente.jsp").forward(request, response);
        }
         
    
        
        
        
    }

   
}
