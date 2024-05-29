/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kajur;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Harlem
 */
public class edit_akun extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
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
        HttpSession session = request.getSession();
        
        if (session.getAttribute("id") == null) response.sendRedirect("../login.jsp");
        else if (!session.getAttribute("role").equals("kajur")) response.sendRedirect("../login.jsp");
        else response.sendRedirect("kelolaakun.jsp");
        
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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String id = request.getParameter("id");
            String nama = request.getParameter("nama");
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            String no_hp = request.getParameter("no_hp");
            String role;
            if (request.getParameter("role").equals("Asisten Instruktur Lab")) role = "ail";
            else role = "kalab";
            
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sikelab", "root", "");
                if (con != null){
                    if (id != null && nama != null && email != null && password != null && password != null && no_hp != null && role != null){
                        PreparedStatement pst = con.prepareStatement("UPDATE akun SET id_akun = ?, nama = ?, email = ?, password = ?, no_hp = ?, role = ? WHERE id_akun = '"+id+"'");
                        pst.setString(1, id);
                        pst.setString(2, nama);
                        pst.setString(3, email);
                        pst.setString(4, password);
                        pst.setString(5, no_hp);
                        pst.setString(6, role);
                        pst.executeUpdate();
                        
                        if (role.equals("ail")){
                            
                            String query = "SELECT * FROM ail WHERE id_akun = '"+id+"'";
                            Statement stmt = con.createStatement();
                            ResultSet rs = null;
                            rs = stmt.executeQuery(query);
                            
                            if (rs.next()){
                                pst = con.prepareStatement("UPDATE ail SET nama_ail = ?, no_hp = ? WHERE id_akun= '"+id+"'");
                                pst.setString(1, nama);
                                pst.setString(2, no_hp);
                                pst.executeUpdate();  
                            } else {
                                pst = con.prepareStatement("INSERT INTO ail (id_akun, nama_ail, no_hp) VALUES (?, ?, ?)");
                                pst.setString(1, id);
                                pst.setString(2, nama);
                                pst.setString(3, no_hp);
                                pst.executeUpdate();   
                            }
                        } else {
                            pst = con.prepareStatement("DELETE FROM ail WHERE id_akun = '"+id+"'");
                            pst.executeUpdate();
                        }
                        
                        response.sendRedirect("kelolaakun.jsp");
                    }
                } else {
                    out.println("Gagal Simpan");
                    request.getRequestDispatcher("kelolaakun.jsp");
                }
            } catch (Exception e){
                out.println("Can't connect to database, with error = " + e.getMessage());
            }
        }
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

}
