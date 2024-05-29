package org.apache.jsp.kajur;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Pengajuan;
import model.PengajuanM;

public final class upengajuan_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      model.Pengajuan Pengajuan = null;
      synchronized (_jspx_page_context) {
        Pengajuan = (model.Pengajuan) _jspx_page_context.getAttribute("Pengajuan", PageContext.PAGE_SCOPE);
        if (Pengajuan == null){
          Pengajuan = new model.Pengajuan();
          _jspx_page_context.setAttribute("Pengajuan", Pengajuan, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\n');
      model.PengajuanM PengajuanModel = null;
      synchronized (_jspx_page_context) {
        PengajuanModel = (model.PengajuanM) _jspx_page_context.getAttribute("PengajuanModel", PageContext.PAGE_SCOPE);
        if (PengajuanModel == null){
          PengajuanModel = new model.PengajuanM();
          _jspx_page_context.setAttribute("PengajuanModel", PengajuanModel, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\n');
      out.write('\n');

    String role = session.getAttribute("role").toString();
    if (session.getAttribute("id") == null) response.sendRedirect("../login.jsp");
    else if (!role.equals("kajur")){
        if (role.equals("ail")) response.sendRedirect("../ail/dashboard.jsp");
        else if (role.equals("kalab")) response.sendRedirect("../kalab/dashboard.jsp");
    }
    String idPenga=request.getParameter("id_pengajuan");
    if(idPenga !=null){
      Pengajuan = PengajuanModel.getPengajuanById(idPenga);

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta http-equiv=\"Content-Language\" content=\"en\">\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>\n");
      out.write("    <title>Analytics Dashboard - This is an example dashboard created using build-in elements and components.</title>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no, shrink-to-fit=no\" />\n");
      out.write("    <meta name=\"description\" content=\"This is an example dashboard created using build-in elements and components.\">\n");
      out.write("    <meta name=\"msapplication-tap-highlight\" content=\"no\">\n");
      out.write("    <script>\n");
      out.write("    function myFunction() {\n");
      out.write("\n");
      out.write("alert(\"Apakah Anda Yakin Akan Melakukan Konfirmasi?\");\n");
      out.write("\n");
      out.write("}\n");
      out.write("function myF($pesan) {\n");
      out.write("\n");
      out.write("alert('pesan');\n");
      out.write("\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("    <!--\n");
      out.write("    =========================================================\n");
      out.write("    * ArchitectUI HTML Theme Dashboard - v1.0.0\n");
      out.write("    =========================================================\n");
      out.write("    * Product Page: https://dashboardpack.com\n");
      out.write("    * Copyright 2019 DashboardPack (https://dashboardpack.com)\n");
      out.write("    * Licensed under MIT (https://github.com/DashboardPack/architectui-html-theme-free/blob/master/LICENSE)\n");
      out.write("    =========================================================\n");
      out.write("    * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.\n");
      out.write("    -->\n");
      out.write("<link href=\"../main.css\" rel=\"stylesheet\"></head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"app-container app-theme-white body-tabs-shadow fixed-sidebar fixed-header\">\n");
      out.write("       ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../layout/headerkajur.jsp", out, false);
      out.write("  \n");
      out.write("        \n");
      out.write("                <div class=\"app-main\">\n");
      out.write("                <div class=\"app-sidebar sidebar-shadow\">\n");
      out.write("                    <div class=\"app-header__logo\">\n");
      out.write("                        <div class=\"logo-src\"></div>\n");
      out.write("                        <div class=\"header__pane ml-auto\">\n");
      out.write("                            <div>\n");
      out.write("                                <button type=\"button\" class=\"hamburger close-sidebar-btn hamburger--elastic\" data-class=\"closed-sidebar\">\n");
      out.write("                                    <span class=\"hamburger-box\">\n");
      out.write("                                        <span class=\"hamburger-inner\"></span>\n");
      out.write("                                    </span>\n");
      out.write("                                </button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"app-header__mobile-menu\">\n");
      out.write("                        <div>\n");
      out.write("                            <button type=\"button\" class=\"hamburger hamburger--elastic mobile-toggle-nav\">\n");
      out.write("                                <span class=\"hamburger-box\">\n");
      out.write("                                    <span class=\"hamburger-inner\"></span>\n");
      out.write("                                </span>\n");
      out.write("                            </button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"app-header__menu\">\n");
      out.write("                        <span>\n");
      out.write("                            <button type=\"button\" class=\"btn-icon btn-icon-only btn btn-primary btn-sm mobile-toggle-header-nav\">\n");
      out.write("                                <span class=\"btn-icon-wrapper\">\n");
      out.write("                                    <i class=\"fa fa-ellipsis-v fa-w-6\"></i>\n");
      out.write("                                </span>\n");
      out.write("                            </button>\n");
      out.write("                        </span>\n");
      out.write("                   </div>    \n");
      out.write("                  <div class=\"scrollbar-sidebar\">\n");
      out.write("                        <div class=\"app-sidebar__inner\">\n");
      out.write("                            <ul class=\"vertical-nav-menu\">\n");
      out.write("                                <li class=\"app-sidebar__heading\">Dashboard</li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"dashboard.jsp\">\n");
      out.write("                                        <i class=\"metismenu-icon pe-7s-rocket\"></i>\n");
      out.write("                                        Dashboard\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"app-sidebar__heading\">Akun</li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"kelolaakun.jsp\">\n");
      out.write("                                        <i class=\"metismenu-icon pe-7s-diamond\"></i>\n");
      out.write("                                        Kelola Akun\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"app-sidebar__heading\">Anggaran Belanja</li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"kelolaanggaran.jsp\">\n");
      out.write("                                        <i class=\"metismenu-icon pe-7s-display2\"></i>\n");
      out.write("                                        Kelola Anggaran Belanja\n");
      out.write("                                    </a>\n");
      out.write("                                    <a href=\"periode.jsp\">\n");
      out.write("                                        <i class=\"metismenu-icon pe-7s-display2\"></i>\n");
      out.write("                                        Periode\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"app-sidebar__heading\">Pengajuan</li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"pengajuan.jsp\" class=\"mm-active\">\n");
      out.write("                                        <i class=\"metismenu-icon pe-7s-mouse\">\n");
      out.write("                                        </i>Data Pengajuan\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                 <li class=\"app-sidebar__heading\">Laporan</li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"laporan.jsp\">\n");
      out.write("                                        <i class=\"metismenu-icon pe-7s-display2\"></i>Laporan\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>   \n");
      out.write("                   \n");
      out.write("                <div class=\"app-main__outer\">\n");
      out.write("                    <div class=\"app-main__inner\">\n");
      out.write("                        <div class=\"app-page-title\">\n");
      out.write("                            <div class=\"page-title-wrapper\">\n");
      out.write("                                <div class=\"page-title-heading\">\n");
      out.write("                                    <div class=\"page-title-icon\">\n");
      out.write("                                         <i class=\"metismenu-icon pe-7s-mouse\">\n");
      out.write("                                        </i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div>Data Pengajuan\n");
      out.write("                                        <div class=\"page-title-subheading\">Kelola Data Pengajuan\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                   </div>\n");
      out.write("                        </div>      \n");
      out.write("                        <div class=\"modal fade bd-example-modal-sm\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"mySmallModalLabel\" aria-hidden=\"true\">\n");
      out.write("  \n");
      out.write("</div>\n");
      out.write("                          \n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-lg-12\">\n");
      out.write("                            <div class=\"main-card mb-3 card\">\n");
      out.write("                                    <div class=\"card-body\"><h5 class=\"card-title\">Konfirmasi Pengajuan</h5>\n");
      out.write("                                         <form action = \"../UpdateStatusPengajuan\" method = \"post\">\n");
      out.write("                                            <div class=\"form-row\">\n");
      out.write("                                                 <input type=\"hidden\" class=\"form-control\" name=\"id_pengajuan\" value = ");
      out.print(Pengajuan.getId_Pengajuan());
      out.write(">\n");
      out.write("                                                <div class=\"col-md-6\">\n");
      out.write("                                                    <div class=\"position-relative form-group\"><label for=\"exampleEmail11\" class=\"\">AIL</label><input name=\"id_ail\" id=\"exampleEmail11\" value=\"");
      out.print(Pengajuan.getId_Ail());
      out.write("\" class=\"form-control\" readonly></div>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"col-md-6\">\n");
      out.write("                                                    <div class=\"position-relative form-group\"><label for=\"examplePassword11\" class=\"\">Nama Barang</label><input name=\"password\" id=\"examplePassword11\" value=\"");
      out.print(Pengajuan.getNama_Barang());
      out.write("\"\n");
      out.write("                                                                                                                                                             class=\"form-control\" readonly></div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                          <div class=\"form-row\">\n");
      out.write("                                                <div class=\"col-md-4\">\n");
      out.write("                                                    <div class=\"position-relative form-group\"><label for=\"exampleEmail11\" class=\"\">Harga</label><input name=\"email\" id=\"exampleEmail11\" value=\"");
      out.print(Pengajuan.getHarga());
      out.write("\" class=\"form-control\" readonly></div>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"col-md-4\">\n");
      out.write("                                                    <div class=\"position-relative form-group\"><label for=\"examplePassword11\" class=\"\">Jumlah</label><input name=\"password\" id=\"examplePassword11\" value=\"");
      out.print(Pengajuan.getJumlah());
      out.write("\"\n");
      out.write("                                                                                                                                                           class=\"form-control\" readonly=\"\"></div>\n");
      out.write("                                                </div>\n");
      out.write("                                               <div class=\"col-md-4\">\n");
      out.write("                                                   <div class=\"position-relative form-group\"><label for=\"exampleCity\" class=\"\">Total Harga</label><input name=\"city\" id=\"exampleCity\" value=\"");
      out.print(Pengajuan.getTotal_Harga());
      out.write("\" class=\"form-control\" readonly=\"\"></div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-row\">\n");
      out.write("                                               \n");
      out.write("                                                <div class=\"col-md-4\">\n");
      out.write("                                                    <div class=\"position-relative form-group\"><label for=\"exampleState\" class=\"\">Tanggal Pengajuan</label><input name=\"state\" id=\"exampleState\" value=\"");
      out.print(Pengajuan.getTanggal_Pengajuan());
      out.write("\" class=\"form-control\" readonly=\"\"></div>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"col-md-4\">\n");
      out.write("                                                    <div class=\"position-relative form-group\"><label for=\"exampleZip\" class=\"\">Lab</label><input name=\"zip\" id=\"exampleZip\" value=\"");
      out.print(Pengajuan.getId_Lab());
      out.write("\" class=\"form-control\" readonly=\"\"></div>\n");
      out.write("                                                </div>\n");
      out.write("                                                 <div class=\"col-md-4\">\n");
      out.write("                                                    <div class=\"position-relative form-group\"><label for=\"exampleCity\" class=\"\">Status</label>\n");
      out.write("                                                        <select name=\"status\" id=\"exampleCity\" class=\"form-control\" >\n");
      out.write("                                                                <option value=\"\">--- Status ---</option>\n");
      out.write("                                                                <option value=\"Ditolak\" >Ditolak</option>\n");
      out.write("                                                                <option value=\"Diterima\">Diterima</option>\n");
      out.write("                                                        </select>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                           \n");
      out.write("                                            <button onclick=\"myFunction()\" type =\"submit\" class=\"mt-2 btn btn-primary\" data-toggle=\"modal\" data-target=\".bd-example-modal-sm\">Konfirmasi</button>\n");
      out.write("                                        </form>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"app-wrapper-footer\">\n");
      out.write("                        <div class=\"app-footer\">\n");
      out.write("                            <div class=\"app-footer__inner\">\n");
      out.write("                                <div class=\"app-footer-left\">\n");
      out.write("                                    <ul class=\"nav\">\n");
      out.write("                                        <li class=\"nav-item\">\n");
      out.write("                                            <a href=\"javascript:void(0);\" class=\"nav-link\">\n");
      out.write("                                                sikelab_genap@2022\n");
      out.write("                                            </a>\n");
      out.write("                                        </li>\n");
      out.write("                                      \n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                            \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>    </div>\n");
      out.write("                <script src=\"http://maps.google.com/maps/api/js?sensor=true\"></script>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("<script type=\"text/javascript\" src=\"../assets/scripts/main.js\"></script></body>\n");
      out.write("</html>\n");
      out.write(" <div class=\"modal-dialog modal-sm\">\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("            <div class=\"modal-header\">\n");
      out.write("                <h5 class=\"modal-title\" id=\"exampleModalLongTitle\">Modal title</h5>\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                    <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                </button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-body\">\n");
      out.write("                <p>Praesent commodo cursus magna, vel scelerisque nisl consectetur et. Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor auctor.</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-footer\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Close</button>\n");
      out.write("                <button type=\"button\" class=\"btn btn-primary\">Save changes</button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
}
      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
