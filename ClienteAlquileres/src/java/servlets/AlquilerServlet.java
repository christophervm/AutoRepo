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
import services.Alquiler;
import services.ServicioAlquiler_Service;
import services.ServicioEntrega_Service;
import services.ServicioListar_Service;

/**
 *
 * @author alumno
 */
public class AlquilerServlet extends HttpServlet {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/ServicioAlquileres/ServicioListar.wsdl")
    private ServicioListar_Service service_2;
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/ServicioAlquileres/ServicioEntrega.wsdl")
    private ServicioEntrega_Service service_1;
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/ServicioAlquileres/ServicioAlquiler.wsdl")
    private ServicioAlquiler_Service service;

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
            if (accion.equals("alquilar")) {
                RegAlquiler(request,response);
            }
            if (accion.equalsIgnoreCase("entregar")) {
                Entregar(request,response);
            }
            if (accion.equalsIgnoreCase("buscarp")) {
                BuscarPlaca(request,response);
            }
            
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AlquilerServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AlquilerServlet at " + request.getContextPath() + "</h1>");
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

   

    private void RegAlquiler(HttpServletRequest request, HttpServletResponse response) {
        try {
           int codcli = Integer.parseInt(request.getParameter("txtCliente"));
      String placa = request.getParameter("cboAuto");  
         services.ServicioAlquiler port = service.getServicioAlquilerPort();
        String res = port.registrarAlquiler(codcli, placa);
        if (res.equalsIgnoreCase("ALQUILER REALIZADO CORRECTAMENTE")) {
            request.setAttribute("resul", res);
            request.getRequestDispatcher("RegistroAlquiler.jsp").forward(request, response);
        }   
        
        } catch (Exception e) {
        }
   
    }

    private void Entregar(HttpServletRequest request, HttpServletResponse response) {
     
        try {
            String placa = request.getParameter("txtPlaca");
     String codigocl =request.getParameter("txtCodigo");
      
          services.ServicioEntrega port = service_1.getServicioEntregaPort();
        String res =  port.entrAuto(placa, codigocl);
        
        if (res.equalsIgnoreCase("ENTREGA REALIZADA CORRECTAMENTE")) {
            request.setAttribute("res", res);
              request.getRequestDispatcher("RegistroEntrega.jsp").forward(request, response);
        }  else{
        
        
        }
        } catch (Exception e) {
            
            
        }
        
    }

    private void BuscarPlaca(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String placa = request.getParameter("txtPlacaBuscar");
    services.ServicioListar port = service_2.getServicioListarPort();
        Alquiler al = port.listarAlqNoEntxPlaca(placa);
request.setAttribute("alq", al);
          request.getRequestDispatcher("RegistroEntrega.jsp").forward(request, response);
          
        } catch (Exception e) {
            
                String err = "ERROR NO EXISTE EL USUARIO O CONTRASEÑA INCORRECTA";
            request.setAttribute("err",err);
            request.getRequestDispatcher("RegistroEntrega.jsp").forward(request, response);
        }

    }

    
 
}
