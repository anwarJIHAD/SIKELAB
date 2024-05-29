<%-- 
    Document   : upengajuank
    Created on : Feb 1, 2022, 5:51:43 PM
    Author     : ASUS
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Pengajuan"%>
<%@page import="model.PengajuanM"%>

<jsp:useBean id= "Pengajuan" class = "model.Pengajuan"/>
<jsp:useBean id= "PengajuanModel" class = "model.PengajuanM"/>

<%
   
    String idPenga=request.getParameter("id_pengajuan");
    if(idPenga !=null){
      Pengajuan = PengajuanModel.getPengajuanById(idPenga);
%>
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
                                            <button type="button" tabindex="0" class="dropdown-item">Logout</button>
                                        </div>
                                    </div>
                                </div>
                                <div class="widget-content-left  ml-3 header-user-info">
                                    <div class="widget-heading">
                                        KaLab X
                                    </div>
                                    <div class="widget-subheading">
                                        Kepala Laboratorium
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>        </div>
            </div>
        </div> 
          <div class="app-main">
                <div class="app-sidebar sidebar-shadow">
                    <div class="app-header__logo">
                        <div class="logo-src"></div>
                        <div class="header__pane ml-auto">
                            <div>
                                <a href="../layout/sidebar.html"></a>
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
                                    <a href="../kalab/index.jsp">
                                        <i class="metismenu-icon pe-7s-rocket"></i>
                                        Dashboard
                                    </a>
                                </li>
                                <li class="app-sidebar__heading">Pengajuan</li>
                                <li>
                                    <a href="../kalab/pengajuan.jsp">
                                        <i class="metismenu-icon pe-7s-display2"></i>
                                        Kelola Data Pengajuan
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <i class="metismenu-icon pe-7s-display2"></i>
                                        Data Pembelian
                                    </a>
                                </li>
                                <li class="app-sidebar__heading">Persetujuan</li>
                                <li>
                                    <a href="../kalab/laporan.jsp">
                                        <i class="metismenu-icon pe-7s-pendrive"></i>
                                        Konfirmasi Laporan
                                    </a>
                                </li>
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
                                    <div>Kelola Data Pengajuan
                                        <div class="page-title-subheading">This is an example dashboard created using build-in elements and components.
                                        </div>
                                    </div>
                                </div>
                                  </div>
                        </div>            
                      <div class="row">
                            <div class="col-lg-12">
                            <div class="main-card mb-3 card">
                                    <div class="card-body"><h5 class="card-title">Konfirmasi Pengajuan</h5>
                                         <form action = "../UpStatusK" method = "post">
                                            <div class="form-row">
                                                 <input type="hidden" class="form-control" name="id_pengajuan" value = <%=Pengajuan.getId_Pengajuan()%>>
                                                <div class="col-md-6">
                                                    <div class="position-relative form-group"><label for="exampleEmail11" class="">AIL</label><input name="id_ail" id="exampleEmail11" value="<%=Pengajuan.getId_Ail()%>" class="form-control" readonly></div>
                                                </div>
                                                <div class="col-md-6">
                                                    <div class="position-relative form-group"><label for="examplePassword11" class="">Nama Barang</label><input name="password" id="examplePassword11" value="<%=Pengajuan.getNama_Barang()%>"
                                                                                                                                                             class="form-control" readonly></div>
                                                </div>
                                            </div>
                                          <div class="form-row">
                                                <div class="col-md-4">
                                                    <div class="position-relative form-group"><label for="exampleEmail11" class="">Harga</label><input name="email" id="exampleEmail11" value="<%=Pengajuan.getHarga()%>" class="form-control" readonly></div>
                                                </div>
                                                <div class="col-md-4">
                                                    <div class="position-relative form-group"><label for="examplePassword11" class="">Jumlah</label><input name="password" id="examplePassword11" value="<%=Pengajuan.getJumlah()%>"
                                                                                                                                                           class="form-control" readonly=""></div>
                                                </div>
                                               <div class="col-md-4">
                                                   <div class="position-relative form-group"><label for="exampleCity" class="">Total Harga</label><input name="city" id="exampleCity" value="<%=Pengajuan.getTotal_Harga()%>" class="form-control" readonly=""></div>
                                                </div>
                                            </div>
                                            <div class="form-row">
                                               
                                                <div class="col-md-4">
                                                    <div class="position-relative form-group"><label for="exampleState" class="">Tanggal Pengajuan</label><input name="state" id="exampleState" value="<%=Pengajuan.getTanggal_Pengajuan()%>" class="form-control" readonly=""></div>
                                                </div>
                                                <div class="col-md-4">
                                                    <div class="position-relative form-group"><label for="exampleZip" class="">Lab</label><input name="zip" id="exampleZip" value="<%=Pengajuan.getId_Lab()%>" class="form-control" readonly=""></div>
                                                </div>
                                                 <div class="col-md-4">
                                                    <div class="position-relative form-group"><label for="exampleCity" class="">Status</label>
                                                        <select name="status" id="exampleCity" class="form-control">
                                                                <option value="">--- Status ---</option>
                                                                <option value="Ditolak">Ditolak</option>
                                                                <option value="Diterima">Diterima</option>
                                                        </select>
                                                    </div>
                                                </div>
                                            </div>
                                           
                                            <button type ="submit" class="mt-2 btn btn-primary">Konfirmasi</button>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                   <jsp:include page ="../layout/footer.html"/>    
                </div>
                <script src="http://maps.google.com/maps/api/js?sensor=true"></script>
        </div>
    </div>
<script type="text/javascript" src="../assets/scripts/main.js"></script></body>
</html>
<%}%>
