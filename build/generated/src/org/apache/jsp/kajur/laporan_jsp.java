package org.apache.jsp.kajur;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Ail;
import model.AilM;

public final class laporan_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      model.Ail Ail = null;
      synchronized (_jspx_page_context) {
        Ail = (model.Ail) _jspx_page_context.getAttribute("Ail", PageContext.PAGE_SCOPE);
        if (Ail == null){
          Ail = new model.Ail();
          _jspx_page_context.setAttribute("Ail", Ail, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\n');
      model.AilM AilModel = null;
      synchronized (_jspx_page_context) {
        AilModel = (model.AilM) _jspx_page_context.getAttribute("AilModel", PageContext.PAGE_SCOPE);
        if (AilModel == null){
          AilModel = new model.AilM();
          _jspx_page_context.setAttribute("AilModel", AilModel, PageContext.PAGE_SCOPE);
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
    Ail[] daftarAil = AilModel.getDaftarAil();

      out.write("\n");
      out.write("<!doctype html>\n");
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
      out.write("      ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../layout/headerkajur.jsp", out, false);
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
      out.write("                   </div>   \n");
      out.write("                   <div class=\"scrollbar-sidebar\">\n");
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
      out.write("                                    <a href=\"pengajuan.jsp\" >\n");
      out.write("                                        <i class=\"metismenu-icon pe-7s-mouse\">\n");
      out.write("                                        </i>Data Pengajuan\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                 <li class=\"app-sidebar__heading\">Laporan</li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"laporan.jsp\" class=\"mm-active\">\n");
      out.write("                                        <i class=\"metismenu-icon pe-7s-display2\"></i>Laporan\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>    \n");
      out.write("                <div class=\"app-main__outer\">\n");
      out.write("                    <div class=\"app-main__inner\">\n");
      out.write("                        <div class=\"app-page-title\">\n");
      out.write("                            <div class=\"page-title-wrapper\">\n");
      out.write("                                <div class=\"page-title-heading\">\n");
      out.write("                                    <div class=\"page-title-icon\">\n");
      out.write("                                         <i class=\"metismenu-icon pe-7s-mouse\">\n");
      out.write("                                        </i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div>Data Laporan\n");
      out.write("                                        <div class=\"page-title-subheading\">Laporan\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                   </div>\n");
      out.write("                        </div>            \n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-lg-12\">\n");
      out.write("                                <div class=\"main-card mb-3 card\">\n");
      out.write("                                    <div class=\"card-body\"><h5 class=\"card-title\">Laporan</h5>\n");
      out.write("                                        <table class=\"mb-0 table\">\n");
      out.write("                                            <thead>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <th>#</th>\n");
      out.write("                                                <th>AIL</th>\n");
      out.write("                                                <th>Laporan</th>\n");
      out.write("                                            </tr>\n");
      out.write("                                            </thead>\n");
      out.write("                                            <tbody>\n");
      out.write("                                            ");

                for (int i = 0; i < daftarAil.length; i++) {
                    Ail = daftarAil[i];
            
      out.write("\n");
      out.write("                                            <tr>\n");
      out.write("                                               \n");
      out.write("                                                <td>");
      out.print(Ail.getId_Ail());
      out.write("</td>\n");
      out.write("                                                <td>");
      out.print(Ail.getNama_Ail());
      out.write("</td>\n");
      out.write("                                                <td><a href=\"detail_laporan.jsp?id_ail=");
      out.print(Ail.getId_Ail());
      out.write("\"><i class=\"fa fa-search-plus\"></i></a></td>\n");
      out.write("                                        \n");
      out.write("                                            </tr>\n");
      out.write("                                             ");
}
      out.write("\n");
      out.write("                                            </tbody>\n");
      out.write("                                        </table>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                          \n");
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
