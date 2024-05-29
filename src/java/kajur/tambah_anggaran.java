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
 * @author LENOVO
 */
public class tambah_anggaran extends HttpServlet {

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
        else response.sendRedirect("tambah_anggaran.jsp");
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
            String id_periode = request.getParameter("periode");
            String nama = request.getParameter("nama");
            String jumlah_anggaran = request.getParameter("jumlah_anggaran");
            
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sikelab", "root", "");
                if (con != null){
                    if (id_periode != null && nama != null && jumlah_anggaran != null){
                        PreparedStatement pst = con.prepareStatement("INSERT INTO anggaran (id_periode, nama_anggaran, jumlah_anggaran) VALUES (?, ?, ?)");
                        pst.setString(1, id_periode);
                        pst.setString(2, nama);
                        pst.setString(3, jumlah_anggaran);
                        pst.executeUpdate();
                        
                        response.sendRedirect("kelolaanggaran.jsp");
                    }
                } else {
                    out.println("Gagal Simpan");
                    request.getRequestDispatcher("kelolaanggaran.jsp");
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
