<%-- 
    Document   : headerkajur
    Created on : Feb 2, 2022, 4:54:43 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.io.*,java.sql.*" %>
<%
   String namalogin = session.getAttribute("nama").toString();
%>
<!DOCTYPE html>
   <div class="app-header header-shadow">
            <div class="app-header__logo">
                <div class="logo-src"></div>
                <div class="header__pane ml-auto">
                    <div>
                        <button type="button" class="hamburger close-sidebar-btn hamburger--elastic" data-class="closed-sidebar">
                            <span class="hamburger-box">
                                <span class="hamburger-inner"></span>
                            </span>
                        </button>
                    </div>
                </div>
            </div>
            <div class="app-header__mobile-menu">
                <div>
                    <button type="button" class="hamburger hamburger--elastic mobile-toggle-nav">
                        <span class="hamburger-box">
                            <span class="hamburger-inner"></span>
                        </span>
                    </button>
                </div>
            </div>
            <div class="app-header__menu">
                <span>
                    <button type="button" class="btn-icon btn-icon-only btn btn-primary btn-sm mobile-toggle-header-nav">
                        <span class="btn-icon-wrapper">
                            <i class="fa fa-ellipsis-v fa-w-6"></i>
                        </span>
                    </button>
                </span>
            </div>    <div class="app-header__content">
                
                <div class="app-header-right">
                    <div class="header-btn-lg pr-0">
                        <div class="widget-content p-0">
                            <div class="widget-content-wrapper">
                                <div class="widget-content-left " >
                                      <a href="pengajuan.jsp" class="nav-link" >
                                        <i class="nav-link-icon fa fa-bell"></i><p class=" badge badge-warning" style="font-size: 10px">
                                            <%
           

            try {
                
                String Host = "jdbc:mysql://localhost:3306/sikelab";
                
                Connection conn = null;
                Statement st = null;
                ResultSet rs = null;
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection(Host, "root", "");
                st = conn.createStatement();
                String Data = "select count(id_pengajuan) from pengajuan where status='Diproses'";
                rs = st.executeQuery(Data);
               String Count="";
                while(rs.next()){
                Count = rs.getString(1);
                out.println(Count);
                }
             
              
                
                rs.close();
                st.close();
                conn.close();
            }catch(SQLException e){
                out.println("GAGAL KONEKSI "+e.getMessage());
            }
        %>
                                            
                                        </p>
                                        </a>
                                    
                                </div>
                                <div class="widget-content-left">
                                    <div class="btn-group">
                                        <a data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" class="p-0 btn">
                                            <img width="42" class="rounded-circle" src="../assets/images/avatars/1.jpg" alt="">
                                            <i class="fa fa-angle-down ml-2 opacity-8"></i>
                                        </a>
                                        <div tabindex="-1" role="menu" aria-hidden="true" class="dropdown-menu dropdown-menu-right">
                                            <h6 tabindex="-1" class="dropdown-header">Pengaturan Akun</h6>
                                            <form action="../logout">
                                                <button type="submit" tabindex="0" class="dropdown-item">Logout</button>
                                            </form>
                                        </div>
                                    </div>
                                </div>
                                <div class="widget-content-left  ml-3 header-user-info">
                                    <div class="widget-heading">
                                        ${nama}
                                    </div>
                                    <div class="widget-subheading">
                                        Kepala Jurusan
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>        
                </div>
            </div>
        </div>        