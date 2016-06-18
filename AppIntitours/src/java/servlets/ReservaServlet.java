/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import daoImpl.AutoDaoImpl;
import daoImpl.ClienteDaoImpl;
import daoImpl.ReservaDAOImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.SimpleDateFormat;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Auto;
import model.Cliente;
import model.Reserva;

/**
 *
 * @author Administrador
 */
public class ReservaServlet extends HttpServlet {
ReservaDAOImpl resdao = new ReservaDAOImpl();
AutoDaoImpl audao = new AutoDaoImpl();
ClienteDaoImpl clidao = new ClienteDaoImpl();
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String res = request.getParameter("accion");
        if (res.equalsIgnoreCase("registrar")) {
            registrar(request,response);
            
        }
          if (res.equalsIgnoreCase("buscar")) {
            consultar(request,response);
            
        }
        
          if (res.equalsIgnoreCase("mostrar")) {
            mostr(request,response);
            
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
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
     * Handles the HTTP <code>POST</code> method.
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

    private void registrar(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
               String placa = request.getParameter("cboDisponibles");
                SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
 java.util.Date fecha = f.parse(request.getParameter("calFecha"));
 java.sql.Date fechasql= new Date(fecha.getTime());
 int codcl= 1;
               
 Auto au = audao.buscarXPlaca(placa);
 Cliente client = clidao.buscarXcodigo(codcl);
        Reserva res = new Reserva(0,fechasql,fechasql,client,au);
   
               String ag=  resdao.agregar(res);
          
                response.sendRedirect("ConsultarReservas.jsp");
           
        } catch (Exception e) {
            response.getWriter().print(e);
        }
        
        
    }

    private void consultar(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
       
       try {
           
   int codigo = Integer.parseInt(request.getParameter("codigg"));
   Reserva res = resdao.ReservaXCliente(codigo);
   request.setAttribute("resr", res);
            request.getRequestDispatcher("ConsultarReservas.jsp").forward(request, response);
         
            
        } catch (Exception e) {
            String error = "ERROR";
             request.setAttribute("rr", e);
    request.getRequestDispatcher("ConsultarReservas.jsp").forward(request, response);
           
            
        }  
        
    }

    private void mostr(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  
         
    }

}
