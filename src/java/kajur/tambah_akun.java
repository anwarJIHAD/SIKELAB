/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kajur;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.jboss.weld.servlet.SessionHolder;

/**
 *
 * @author Harlem
 */
public class tambah_akun extends HttpServlet {

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
        else response.sendRedirect("tambah_akun.jsp");
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
                    if (nama != null && email != null && password != null && password != null && no_hp != null && role != null){
                        PreparedStatement pst = con.prepareStatement("INSERT INTO akun (nama, email, password, no_hp, role) VALUES (?, ?, ?, ?, ?)");
                        pst.setString(1, nama);
                        pst.setString(2, email);
                        pst.setString(3, password);
                        pst.setString(4, no_hp);
                        pst.setString(5, role);
                        pst.executeUpdate();
                        
                        if (role.equals("ail")){
                            String query = "SELECT id_akun FROM akun WHERE role = 'ail' AND nama = '"+nama+"'";
                            Statement stmt = con.createStatement();
                            ResultSet rs = null;
                            rs = stmt.executeQuery(query);
                            rs.next();
                            
                            pst = con.prepareStatement("INSERT INTO ail (nama_ail, no_hp, id_akun) VALUES (?, ?, ?)");
                            pst.setString(1, nama);
                            pst.setString(2, no_hp);
                            pst.setString(3, rs.getString("id_akun"));
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
