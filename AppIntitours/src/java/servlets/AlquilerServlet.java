/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import dao.AlquilerDAO;
import daoImpl.AlquilerDaoImpl;
import daoImpl.AutoDaoImpl;
import daoImpl.ClienteDaoImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.SimpleDateFormat;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Alquiler;
import model.Auto;
import model.Cliente;
import model.Reserva;

/**
 *
 * @author Administrador
 */
public class AlquilerServlet extends HttpServlet {
    AlquilerDaoImpl aldao = new AlquilerDaoImpl();
    ClienteDaoImpl clidao = new ClienteDaoImpl();
    AutoDaoImpl audao = new AutoDaoImpl();

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
        if (res.equalsIgnoreCase("entregar")) {
            entr(request,response);
            
        }
         if (res.equalsIgnoreCase("agregar")) {
            alq(request,response);
            
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

    private void entr(HttpServletRequest request, HttpServletResponse response) throws IOException {
     
           try {
               String placa = request.getParameter("txtPlaca");
               int codigo = Integer.parseInt(request.getParameter("txtCodigo"));

               String ent=  aldao.Entregar(placa,codigo);
          request.setAttribute("entre", ent);
                response.sendRedirect("ConsultaAlquiler.jsp");
           
        } catch (Exception e) {
            response.getWriter().print(e);
        }
        
    }

    private void alq(HttpServletRequest request, HttpServletResponse response) throws IOException {
     
          try {
               String placa = request.getParameter("cboAuto");
               int cliente =Integer.parseInt(request.getParameter("txtCliente"));
               Cliente clien = clidao.buscarXcodigo(cliente);
               Auto au = audao.buscarXPlaca(placa);
               
               Alquiler alq = new Alquiler(0,null,null,clien,au);
               String ag = aldao.agregar(alq);
          
                response.sendRedirect("ConsultaAlquiler.jsp");
           
        } catch (Exception e) {
            response.getWriter().print(e);
        }   
        
        
        
    }

}
