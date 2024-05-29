<%-- 
    Document   : dashboard
    Created on : Feb 4, 2022, 6:47:01 PM
    Author     : Harlem
--%>

<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.List"%>
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
        <link rel="stylesheet" type="text/css" href="../assets/DataTables/bulma.min.css"/>
        <link rel="stylesheet" type="text/css" href="../assets/DataTables/dataTables.bulma.min.css"/>
        <script type="text/javascript" language="javascript" src="../assets/DataTables/jquery-3.5.1.js"></script>
        <script type="text/javascript" src="../assets/DataTables/jquery.dataTables.min.js"></script>
        <script type="text/javascript" language="javascript" src="../assets/DataTables/dataTables.bulma.min.js"></script>
        
        <script type="text/javascript" class="init">
            $(document).ready(function() {
                $('#view').DataTable({
                    "lengthChange": false,
                    "pageLength": 10
                });
            } );
            
	</script>
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
                                    <div>
                                        <strong>Kelola Akun</strong>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <%
                            String host = "jdbc:mysql://localhost:3306/sikelab";
                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                Connection conn = DriverManager.getConnection(host, "root", "");
                                String query = "SELECT * FROM akun WHERE role = 'ail' OR role = 'kalab'";
                                Statement stmt = conn.createStatement();
                                ResultSet rs = null;
                                rs = stmt.executeQuery(query);
                        %>
                        <div class="main-card mb-3 card">
                            <div class="card-body">
                                <!--<h5 class="card-title header">Daftar Akun</h5>--> 
<!--                                <form action="tambah_akun.jsp">
                                    <button class="mb-2 mr-2 btn btn-success"><strong style="color: #ffffff">Tambah</strong></button>
                                </form>-->
                                <a class="btn btn-success" href="tambah_akun.jsp" role="button">
                                    <i class="metismenu-icon pe-7s-add-user"></i>
                                    <strong style="color: #ffffff">Tambah Akun</strong>
                                </a>
                                <table id="view" class="mb-0 table table-striped">
                                    <thead>
                                    <tr>
                                        <th>#</th>
                                        <th>Nama</th>
                                        <th>Email</th>
                                        <th>No Hp</th>
                                        <th>Role</th>
                                        <th>Aksi</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                        <%int i = 1; while (rs.next()){%>
                                        <tr>
                                            <td><%=i++%></td>
                                            <td><%=rs.getString("nama")%></td>
                                            <td><%=rs.getString("email")%></td>
                                            <td><%=rs.getString("no_hp")%></td>
                                            <td><%=rs.getString("role")%></td>
                                            <td>
                                                <a class="btn btn-warning" href="edit_akun.jsp?id_akun=<%=rs.getString("id_akun")%>" role="button">
                                                    <i class="metismenu-icon pe-7s-edit"></i>
                                                    <!--<strong>Ubah</strong>-->
                                                </a>
                                                <a class="btn btn-danger" href="hapus_akun?id_akun=<%=rs.getString("id_akun")%>" onClick="return confirm('Konfirmasi hapus Akun')" role="button">
                                                    <i class="metismenu-icon pe-7s-trash"></i>
                                                    <!--<strong>Hapus</strong>-->
                                                </a>
                                            </td>
                                        </tr>
                                        <%}%>
                                    </tbody>
                                </table>
                                <%
                                    rs.close();
                                    stmt.close();
                                    conn.close();
                                    }
                                    catch (SQLException ex){
                                        out.print(ex);
                                    }
                                    catch (Exception ex){
                                        out.print(ex.getMessage());
                                    }
                                %>
                            </div>
                        </div>
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
<script type="text/javascript" src="../assets/scripts/main.js"></script>
</body>
</html>
