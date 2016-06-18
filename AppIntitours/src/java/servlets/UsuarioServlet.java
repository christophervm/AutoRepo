/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import daoImpl.ClienteDaoImpl;
import daoImpl.EmpleadoDaoImpl;

import daoImpl.UsuarioDaoImpl;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Cliente;
import model.Empleado;
import model.Usuario;

/**
 *
 * @author Administrador
 */
public class UsuarioServlet extends HttpServlet {
    UsuarioDaoImpl usdao = new UsuarioDaoImpl();
    ClienteDaoImpl clidao = new ClienteDaoImpl();
EmpleadoDaoImpl emdao = new EmpleadoDaoImpl();

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
        if (res.equalsIgnoreCase("validar")) {
            validar(request,response);
            
        }
         if (res.equalsIgnoreCase("agregar")) {
            agregar(request,response);
            
        }
         if(res.equalsIgnoreCase("cerrarsesion")){
         
           try {
            request.getSession().invalidate();
            response.sendRedirect("MenuPrincipal.jsp");
        } catch (Exception ex) {
         
        }}
        
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

    private void validar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       Usuario usu = null;
       String nomUsuario = request.getParameter("txtNombreUsuario");
       String claveUsuario = request.getParameter("txtClave");
         
        String err = "USUARIO O CONTRASEÑA INCORRECTOS";
       Usuario u = usdao.validar(nomUsuario,claveUsuario);
       if( u != null){
      String  comptipo = u.getNomusr();
       Cliente cl = clidao.buscarXusr(comptipo);
      if(cl !=null){
          response.sendRedirect("InterfazCliente.jsp");
       request.getSession().setAttribute("usuario", cl);
      
      }
     Empleado em = emdao.buscarXusr(comptipo);
      if(em !=null){
          response.sendRedirect("InterfazRecepcionista.jsp");
       request.getSession().setAttribute("usuario", cl);
      
      }
       }else{
         request.setAttribute("usuario",nomUsuario);
         request.setAttribute("error",err);
       request.getRequestDispatcher("InicioSesion.jsp").forward(request, response);
       
       
       }
       
 
            
    }

    private void agregar(HttpServletRequest request, HttpServletResponse response) {
        
        try {
      
          String nombre = request.getParameter("txtNombre");
          String contrasena = request.getParameter("txtContrasena");
          String usuario = request.getParameter("txtUsuario");
          String dni = request.getParameter("txtDNI");
          String apellidos = request.getParameter("txtApellidos");
          String brevete = request.getParameter("txtBrevete");
          String extran = request.getParameter("txtCarnetEx");
          
          
          
          Usuario us = new Usuario(usuario,contrasena);
          
          String res = usdao.agregar(us);
          if(res.equalsIgnoreCase("Exito")){
       Cliente cli = new Cliente(0,nombre,apellidos,dni,brevete,extran,us);
       String cl = clidao.agregar(cli);
       
          request.setAttribute("Mensj","REGISTRO REALIZADO CON EXITO,INICIE SESION AHORA");
          request.getRequestDispatcher("MenuPrincipal.jsp").forward(request, response);
           
            }else{
          request.setAttribute("error",res);
          request.setAttribute("nombre",nombre);
          request.getRequestDispatcher("RegistroUsuario.jsp").forward(request, response);
            }
         
          
        } catch (Exception e) {
             out.print("Error: " + e);
        }
        
        
        
    }

}
