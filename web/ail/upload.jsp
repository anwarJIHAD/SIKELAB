<%-- 
    Document   : upload
    Created on : Feb 1, 2022, 6:23:55 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Pembelian"%>
<%@page import="model.PembelianM"%>
<jsp:useBean id= "Pembelian" class = "model.Pembelian"/>
<jsp:useBean id= "PembelianModel" class = "model.PembelianM"/>
<%
     String role = session.getAttribute("role").toString();
    if (session.getAttribute("id") == null) response.sendRedirect("../login.jsp");
    else if (!role.equals("ail")){
        if (role.equals("kalab")) response.sendRedirect("../kalab/dashboard.jsp");
        else if (role.equals("kajur")) response.sendRedirect("../kajur/dashboard.jsp");
    }
    String idPem=request.getParameter("id_pembelian");
    if(idPem !=null){
      Pembelian = PembelianModel.getBeliById(idPem);
%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta http-equiv="Content-Language" content="en">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>Dashboard AIL</title>
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
                                        AIL X
                                    </div>
                                    <div class="widget-subheading">
                                        Asisten Instruktur Lab
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>        
                </div>
            </div>
        </div>
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
                    </div>    <div class="scrollbar-sidebar">
                        <div class="app-sidebar__inner">
                            <ul class="vertical-nav-menu">
                                <li class="app-sidebar__heading">Dashboard</li>
                                <li>
                                    <a href="dashboard.jsp" >
                                        <i class="metismenu-icon pe-7s-rocket"></i>
                                        Dashboard
                                    </a>
                                </li>
                                <li class="app-sidebar__heading">Pengajuan</li>
                                <li>
                                    <!-- insert link di sini -->
                                    <a href="#"> 
                                        <i class="metismenu-icon pe-7s-display2"></i>
                                        Pengajuan Pembelian
                                    </a>
                                </li>
                                <li>
                                    <a href="kelola_pengajuan.jsp">
                                        <i class="metismenu-icon pe-7s-mouse"></i>
                                        Kelola Pengajuan
                                    </a>

                                </li>
                                
                                <li class="app-sidebar__heading">Persetujuan</li>
                                <li>
                                    <a href="#">
                                        <i class="metismenu-icon pe-7s-pendrive"></i>
                                        Status Persetujuan
                                    </a>
                                </li>
                                <li>
                                    <a href="unggahbeli.jsp" class="mm-active">
                                        <i class="metismenu-icon pe-7s-eyedropper"></i>
                                        Unggah Bukti Pembelian
                                    </a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>    <div class="app-main__outer">
                    <div class="app-main__inner">
                        <div class="app-page-title">
                            <div class="page-title-wrapper">
                                <div class="page-title-heading">
                                    <div class="page-title-icon">
                                        <i class="pe-7s-car icon-gradient bg-mean-fruit">
                                        </i>
                                    </div>
                                    <div>Analytics Dashboard
                                        <div class="page-title-subheading">This is an example dashboard created using build-in elements and components.
                                        </div>
                                    </div>
                                </div>
                                 </div>
                        </div>            
                       <div class="row">
                            <div class="col-lg-12">
                                <div class="main-card mb-3 card">
                                    <div class="card-body"><h5 class="card-title">Unggah Bukti</h5>
                                    
                                        <form action = "../UploadBukti" method = "post">
                                            <input type="hidden" class="form-control" name="id_pembelian" value = <%=Pembelian.getId_Pembelian()%>>
                                            <div class="form-row">
                                                <div class="col-md-12">
                                                    <div class="position-relative form-group">
                                                       <input name="bukti_pembelian" id="exampleFile" type="file" class="form-control-file"></div>
                                                </div>
                                              
                                            </div>
                                            <button  type="subtmit" class="mt-2 btn btn-primary">Tambah</button>
                                        </form>
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
                    </div>   </div>
                <script src="http://maps.google.com/maps/api/js?sensor=true"></script>
        </div>
    </div>
                   
<script type="text/javascript" src="../assets/scripts/main.js"></script></body>
</html>
<%}%>