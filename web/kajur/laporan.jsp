<%-- 
    Document   : laporan
    Created on : Jan 27, 2022, 9:49:49 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Ail"%>
<%@page import="model.AilM"%>
<jsp:useBean id= "Ail" class = "model.Ail"/>
<jsp:useBean id= "AilModel" class = "model.AilM"/>

<%
     String role = session.getAttribute("role").toString();
    if (session.getAttribute("id") == null) response.sendRedirect("../login.jsp");
    else if (!role.equals("kajur")){
        if (role.equals("ail")) response.sendRedirect("../ail/dashboard.jsp");
        else if (role.equals("kalab")) response.sendRedirect("../kalab/dashboard.jsp");
    }
    Ail[] daftarAil = AilModel.getDaftarAil();
%>
<!doctype html>
<!doctype html>
<html lang="en">

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
                                    <a href="kelolaakun.jsp">
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
                                    <a href="laporan.jsp" class="mm-active">
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
                                         <i class="metismenu-icon pe-7s-mouse">
                                        </i>
                                    </div>
                                    <div>Data Laporan
                                        <div class="page-title-subheading">Laporan
                                        </div>
                                    </div>
                                </div>
                                   </div>
                        </div>            
                        <div class="row">
                            <div class="col-lg-12">
                                <div class="main-card mb-3 card">
                                    <div class="card-body"><h5 class="card-title">Laporan</h5>
                                        <table class="mb-0 table">
                                            <thead>
                                            <tr>
                                                <th>#</th>
                                                <th>AIL</th>
                                                <th>Laporan</th>
                                            </tr>
                                            </thead>
                                            <tbody>
                                            <%
                for (int i = 0; i < daftarAil.length; i++) {
                    Ail = daftarAil[i];
            %>
                                            <tr>
                                               
                                                <td><%=Ail.getId_Ail()%></td>
                                                <td><%=Ail.getNama_Ail()%></td>
                                                <td><a href="detail_laporan.jsp?id_ail=<%=Ail.getId_Ail()%>"><i class="fa fa-search-plus"></i></a></td>
                                        
                                            </tr>
                                             <%}%>
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
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
                                                sikelab_genap@2022
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
