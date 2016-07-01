/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import services.Auto;
import services.Cliente;

import services.ServicioListar_Service;
import services.ServicioReserva_Service;

/**
 *
 * @author alumno
 */
public class ReservaServlet extends HttpServlet {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/ServicioAlquileres/ServicioListar.wsdl")
    private ServicioListar_Service service_1;
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/ServicioAlquileres/ServicioReserva.wsdl")
    private ServicioReserva_Service service;

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
            if (accion.equals("reservar")) {
                regReserva(request,response);
            }
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ReservaServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ReservaServlet at " + request.getContextPath() + "</h1>");
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

    private void regReserva(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
                    String placa = request.getParameter("cboAuto");
 String fecha = request.getParameter("calFecha");
 
 Cliente abusc= (Cliente) request.getSession().getAttribute("emp");
 int codcl = abusc.getCodigo();
 
  services.ServicioReserva port = service.getServicioReservaPort();
    String r =  port.registroReserva(placa, fecha, codcl);
 
            if (r.equalsIgnoreCase("RESERVA REALIZADA CORRECTAMENTE")) {
                
               request.setAttribute("res",r);
              request.getRequestDispatcher("InterfazCliente.jsp").forward(request, response);   
                
            }
               
              
             
        
        } catch (Exception e) {
               request.setAttribute("err", "ERROR EN PROGRAMACION" + e);
              request.getRequestDispatcher("InterfazCliente.jsp").forward(request, response);  
            
        }

        
        
        
    }
  
 
  
}
