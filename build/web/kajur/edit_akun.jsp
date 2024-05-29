<%-- 
    Document   : dashboard
    Created on : Feb 4, 2022, 6:47:01 PM
    Author     : Harlem
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    if (session.getAttribute("id") == null) response.sendRedirect("../login.jsp");
    else {
        String role = session.getAttribute("role").toString();
        if (!role.equals("kajur")){
            if (role.equals("ail")) response.sendRedirect("../ail/dashboard.jsp");
            else if (role.equals("kalab")) response.sendRedirect("../kalab/dashboard.jsp");
        }
    }
%>
<!DOCTYPE html>
<html>
    <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta http-equiv="Content-Language" content="en">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>Analytics Dashboard - This is an example dashboard created using build-in elements and components.</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no, shrink-to-fit=no" />
    <meta name="description" content="This is an example dashboard created using build-in elements and components.">
    <meta name="msapplication-tap-highlight" content="no">
    <!--
    =========================================================
    * ArchitectUI HTML Theme Dashboard - v1.0.0
    =========================================================
    * Product Page: https://dashboardpack.com
    * Copyright 2019 DashboardPack (https://dashboardpack.com)
    * Licensed under MIT (https://github.com/DashboardPack/architectui-html-theme-free/blob/master/LICENSE)
    =========================================================
    * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
    -->
<link href="../main.css" rel="stylesheet"></head>
<body>
    <div class="app-container app-theme-white body-tabs-shadow fixed-sidebar fixed-header">
         <jsp:include page ="../layout/headerkajur.jsp"/>        
                <div class="app-main">
                <div class="app-sidebar sidebar-shadow">
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
                    </div>    
                    <div class="scrollbar-sidebar">
                        <div class="app-sidebar__inner">
                            <ul class="vertical-nav-menu">
                                <li class="app-sidebar__heading">Dashboard</li>
                                <li>
                                    <a href="dashboard.jsp">
                                        <i class="metismenu-icon pe-7s-rocket"></i>
                                        Dashboard
                                    </a>
                                </li>
                                <li class="app-sidebar__heading">Akun</li>
                                <li>
                                    <a href="kelolaakun.jsp" class="mm-active">
                                        <i class="metismenu-icon pe-7s-diamond"></i>
                                        Kelola Akun
                                    </a>
                                </li>
                                <li class="app-sidebar__heading">Anggaran Belanja</li>
                                <li>
                                    <a href="kelolaanggaran.jsp">
                                        <i class="metismenu-icon pe-7s-display2"></i>
                                        Kelola Anggaran Belanja
                                    </a>
                                    <a href="periode.jsp">
                                        <i class="metismenu-icon pe-7s-display2"></i>
                                        Periode
                                    </a>
                                </li>
                                <li class="app-sidebar__heading">Pengajuan</li>
                                <li>
                                    <a href="pengajuan.jsp" >
                                        <i class="metismenu-icon pe-7s-mouse">
                                        </i>Data Pengajuan
                                    </a>
                                </li>
                                 <li class="app-sidebar__heading">Laporan</li>
                                <li>
                                    <a href="laporan.jsp">
                                        <i class="metismenu-icon pe-7s-display2"></i>Laporan
                                    </a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>    
                <div class="app-main__outer">
                    <div class="app-main__inner">
                        <div class="app-page-title">
                            <div class="page-title-wrapper">
                                <div class="page-title-heading">
                                    <div class="page-title-icon">
                                        <i class="pe-7s-users icon-gradient bg-mean-fruit">
                                        </i>
                                    </div>
                                    <div><strong><a href="kelolaakun.jsp" style="color: #333333">Kelola Akun</a> / Edit Akun</strong>
                                        
                                    </div>
                                </div>
                            </div>
                        </div>
                        <%
                            try {
                                String id = request.getParameter("id_akun");
                                String host = "jdbc:mysql://localhost:3306/sikelab";
                                Connection con = null;
                                Statement stmt = null;
                                ResultSet rs = null;
                                Class.forName("com.mysql.jdbc.Driver");
                                con = DriverManager.getConnection(host, "root", "");
                                stmt = con.createStatement();
                                String data = "SELECT * FROM akun WHERE id_akun= " + id;
                                rs = stmt.executeQuery(data);
                                while (rs.next()){
                        %>
                        <div class="main-card mb-3 card">
                            <div class="card-body">
                                <form action="edit_akun" method="POST">
                                    <input type="hidden" name ="id" value="<%=rs.getString("id_akun")%>">
                                    <div class="position-relative form-group"><label for="nama" class="">Nama Lengkap</label><input name="nama" id="nama" type="text" class="form-control" value="<%=rs.getString("nama")%>"></div>
                                    <div class="position-relative form-group"><label for="email" class="">Email</label><input name="email" id="email" type="email" class="form-control" value="<%=rs.getString("email")%>"></div>
                                    <div class="position-relative form-group"><label for="password" class="">Password</label><input name="password" id="password" type="password" class="form-control" value="<%=rs.getString("password")%>"></div>
                                    <div class="position-relative form-group"><label for="noHP" class="">No Hp</label><input name="no_hp" id="noHP" type="text" class="form-control" value="<%=rs.getString("no_hp")%>"></div>

                                    <div class="position-relative form-group"><label for="role" class="">Role</label><select name="role" id="role" class="form-control" required>
                                            <%if (rs.getString("role").equals("ail")){%>
                                                <option>Asisten Instruktur Lab</option>
                                                <option>Kepala Laboratorium</option>
                                            <%} else {%>
                                                <option>Kepala Laboratorium</option>
                                                <option>Asisten Instruktur Lab</option>
                                            <%}%>
                                        
                                    </select></div>
                                    
                                    <div class="position-relative form-group">
                                        <small class="form-text text-muted">Pastikan data yang anda masukkan sudah tepat.</small>
                                    </div>
                                    <button class="mt-1 btn btn-primary">Submit</button>
                                </form>
                            </div>
                        </div>
                        <%
                            }
                            rs.close();
                            stmt.close();
                            con.close();
                            } catch (Exception e){
                                out.println("Can't connect to database, with error = " + e.getMessage());
                            }
                        %>
                    </div>
                    <div class="app-wrapper-footer">
                        <div class="app-footer">
                            <div class="app-footer__inner">
                                <div class="app-footer-left">
                                    <ul class="nav">
                                        <li class="nav-item">
                                            <a href="javascript:void(0);" class="nav-link">
                                                Footer Link 1
                                            </a>
                                        </li>
                                        <li class="nav-item">
                                            <a href="javascript:void(0);" class="nav-link">
                                                Footer Link 2
                                            </a>
                                        </li>
                                    </ul>
                                </div>
                                <div class="app-footer-right">
                                    <ul class="nav">
                                        <li class="nav-item">
                                            <a href="javascript:void(0);" class="nav-link">
                                                Footer Link 3
                                            </a>
                                        </li>
                                        <li class="nav-item">
                                            <a href="javascript:void(0);" class="nav-link">
                                                <div class="badge badge-success mr-1 ml-0">
                                                    <small>NEW</small>
                                                </div>
                                                Footer Link 4
                                            </a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>    </div>
                <script src="http://maps.google.com/maps/api/js?sensor=true"></script>
        </div>
    </div>
<script type="text/javascript" src="../assets/scripts/main.js"></script></body>
</html>
