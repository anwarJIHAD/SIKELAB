<%-- 
    Document   : upengajuan
    Created on : Feb 1, 2022, 3:55:13 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Pengajuan"%>
<%@page import="model.PengajuanM"%>

<jsp:useBean id= "Pengajuan" class = "model.Pengajuan"/>
<jsp:useBean id= "PengajuanModel" class = "model.PengajuanM"/>

<%
    String role = session.getAttribute("role").toString();
    if (session.getAttribute("id") == null) response.sendRedirect("../login.jsp");
    else if (!role.equals("kajur")){
        if (role.equals("ail")) response.sendRedirect("../ail/dashboard.jsp");
        else if (role.equals("kalab")) response.sendRedirect("../kalab/dashboard.jsp");
    }
    String idPenga=request.getParameter("id_pengajuan");
    if(idPenga !=null){
      Pengajuan = PengajuanModel.getPengajuanById(idPenga);
%>
<!DOCTYPE html>
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
    <script>
    function myFunction() {

alert("Apakah Anda Yakin Akan Melakukan Konfirmasi?");

}
function myF($pesan) {

alert('pesan');

}
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
                                    <a href="pengajuan.jsp" class="mm-active">
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
                                         <i class="metismenu-icon pe-7s-mouse">
                                        </i>
                                    </div>
                                    <div>Data Pengajuan
                                        <div class="page-title-subheading">Kelola Data Pengajuan
                                        </div>
                                    </div>
                                </div>
                                   </div>
                        </div>      
                        <div class="modal fade bd-example-modal-sm" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel" aria-hidden="true">
  
</div>
                          
                        <div class="row">
                            <div class="col-lg-12">
                            <div class="main-card mb-3 card">
                                    <div class="card-body"><h5 class="card-title">Konfirmasi Pengajuan</h5>
                                         <form action = "../UpdateStatusPengajuan" method = "post">
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
                                                        <select name="status" id="exampleCity" class="form-control" >
                                                                <option value="">--- Status ---</option>
                                                                <option value="Ditolak" >Ditolak</option>
                                                                <option value="Diterima">Diterima</option>
                                                        </select>
                                                    </div>
                                                </div>
                                            </div>
                                           
                                            <button onclick="myFunction()" type ="submit" class="mt-2 btn btn-primary" data-toggle="modal" data-target=".bd-example-modal-sm">Konfirmasi</button>
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
                    </div>    </div>
                <script src="http://maps.google.com/maps/api/js?sensor=true"></script>
        </div>
    </div>
<script type="text/javascript" src="../assets/scripts/main.js"></script></body>
</html>
 <div class="modal-dialog modal-sm">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLongTitle">Modal title</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <p>Praesent commodo cursus magna, vel scelerisque nisl consectetur et. Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor auctor.</p>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                <button type="button" class="btn btn-primary">Save changes</button>
            </div>
        </div>
    </div>
<%}%>
