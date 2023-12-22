package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class edit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html lang=\"es\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Panel Administrativo</title>\n");
      out.write("        <!-- Favicon -->\n");
      out.write("        <link rel=\"shortcut icon\" href=\"dist/img/logo2.ico\" type=\"image/x-icon\">>\n");
      out.write("\n");
      out.write("        <!-- Google Fonts -->\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Heebo:wght@400;500;600;700&display=swap\" rel=\"stylesheet\">\n");
      out.write("    <a href=\"tablaA.jsp\"></a>\n");
      out.write("\n");
      out.write("    <!-- Iconos-->\n");
      out.write("    <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Bootstrap  -->\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\n");
      out.write("          integrity=\"sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ\" crossorigin=\"anonymous\">\n");
      out.write("    <!-- Css -->\n");
      out.write("    <link href=\"dist/css/style.css\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <!-- Barra Lateral -->\n");
      out.write("    <div class=\"sidebar\">\n");
      out.write("        <nav class=\"navbar bg-dark navbar-dark\">\n");
      out.write("            <a href=\"#\" class=\"navbar-brand mx-4 pt-3\">\n");
      out.write("                <h6>PANEL ADMINISTRATIVO</h6>\n");
      out.write("            </a>\n");
      out.write("            <div class=\"d-flex align-items-center ms-2 mt-4 mb-3\">\n");
      out.write("                <div class=\"position-relative\">\n");
      out.write("                    <img class=\"rounded-circle flex-shrink-0 user-wh\" src=\"dist/img/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.nombreUsuario}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(".jpg\" alt=\"Imagen Admin\">                      \n");
      out.write("                </div>\n");
      out.write("                <div class=\"ms-3 text-light\">\n");
      out.write("                    <p>Hola, ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.nombreUsuario}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("! </p>\n");
      out.write("                    <p></p>\n");
      out.write("                    <!-- Estado Usuario-->\n");
      out.write("                    <i class=\"fa fa-circle text-success\"></i> Online\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"navbar-nav w-100\">\n");
      out.write("                <a href=\"index.jsp\" class=\"nav-item nav-link active mb-1\"><i class=\"fa fa-tachometer-alt me-2\"></i>Dashboard</a>\n");
      out.write("\n");
      out.write("                <a href=\"tabla-tickets-admin.html\" class=\"nav-item nav-link\"><i class=\"fa-solid fa-ticket fa-lg me-2\"\n");
      out.write("                                                                                style=\"color: rgb(99, 105, 135);\"></i>Venta\n");
      out.write("                    Tickets</a>\n");
      out.write("                <a href=\"tablaA.jsp\" class=\"nav-item nav-link\"><i\n");
      out.write("                        class=\"fa-solid fa-microphone-lines fa-lg me-2\" style=\"color: rgb(99, 105, 135);\"></i>Lista Oradores</a>\n");
      out.write("                <div class=\"nav-item dropdown\">\n");
      out.write("\n");
      out.write("                    <a href=\"#\" class=\"nav-link dropdown-toggle\" data-bs-toggle=\"dropdown\"><i\n");
      out.write("                            class=\"fa-solid fa-chart-line fa-lg me-2\" style=\"color:rgb(99, 105, 135);\"></i>Balance\n");
      out.write("                        General</a>\n");
      out.write("                    <div class=\"dropdown-menu bg-transparent border-0\">\n");
      out.write("                        <a href=\"#\" class=\"dropdown-item\">Ganancias Anuales</a>\n");
      out.write("                        <a href=\"#\" class=\"dropdown-item\">Costos</a>\n");
      out.write("                        <a href=\"#\" class=\"dropdown-item\">Otros</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <a href=\"#\" class=\"nav-item nav-link\"><i class=\"fa-regular fa-handshake fa-lg me-2\"\n");
      out.write("                                                                 style=\"color: rgb(99, 105, 135);\"></i>Partners</a>\n");
      out.write("                <a href=\"# class=\"nav-item nav-link\"><i class=\"fa-solid fa-landmark fa-lg me-2\"\n");
      out.write("                                                                  style=\"color: rgb(99, 105, 135);\"></i>Bancos</a>\n");
      out.write("                <div class=\"nav-item dropdown\">\n");
      out.write("                    <a href=\"#\" class=\"nav-link dropdown-toggle\" data-bs-toggle=\"dropdown\"><i\n");
      out.write("                            class=\"fa-solid fa-chart-pie fa-lg me-2\" style=\"color: rgb(99, 105, 135);\"></i>Graficos</a>\n");
      out.write("                    <div class=\"dropdown-menu bg-transparent border-0\">\n");
      out.write("                        <a href=\"#\" class=\"dropdown-item\">Graficos Ventas</a>\n");
      out.write("                        <a href=\"#\" class=\"dropdown-item\">Graficos Ganancias</a>\n");
      out.write("                        <a href=\"#\" class=\"dropdown-item\">Graficos Totales</a>\n");
      out.write("                        <a href=\"#\" class=\"dropdown-item\">Graficos Generales/a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"content\">\n");
      out.write("        <!-- Navbar Start -->\n");
      out.write("        <nav class=\"navbar navbar-expand bg-dark navbar-light sticky-top px-4 py-0\">\n");
      out.write("            <a href=\"#\" class=\"navbar-brand d-flex d-lg-none me-4 \">\n");
      out.write("            </a>\n");
      out.write("            <a href=\"#\" class=\"sidebar-toggler flex-shrink-0 d-lg-none\">\n");
      out.write("                <h3><i class=\"fa fa-bars pt-3 \"></i></h3>\n");
      out.write("            </a>\n");
      out.write("            <div class=\"navbar-nav align-items-center ms-auto\">\n");
      out.write("                <div class=\"nav-item dropdown\">\n");
      out.write("                    <a href=\"#\" class=\"nav-link dropdown-toggle\" data-bs-toggle=\"dropdown\">\n");
      out.write("                        <i class=\"fa fa-bell me-lg-2\"></i>\n");
      out.write("                        <span class=\"d-none d-lg-inline-flex\">Notificaciones</span>\n");
      out.write("                    </a>\n");
      out.write("                    <div class=\"dropdown-menu dropdown-menu-end bg-light border-0 rounded-0 rounded-bottom m-0\">\n");
      out.write("                        <a href=\"#\" class=\"dropdown-item\">\n");
      out.write("                            <h6 class=\"fw-normal mb-0\">Nuevo usuario agregado</h6>\n");
      out.write("                            <small>Hace 10 minutos</small>\n");
      out.write("                        </a>\n");
      out.write("                        <hr class=\"dropdown-divider\">\n");
      out.write("                        <a href=\"#\" class=\"dropdown-item\">\n");
      out.write("                            <h6 class=\"fw-normal mb-0\">Perfil actualizado</h6>\n");
      out.write("                            <small>Hace 25 minutos</small>\n");
      out.write("                        </a>\n");
      out.write("                        <hr class=\"dropdown-divider\">\n");
      out.write("                        <a href=\"#\" class=\"dropdown-item\">\n");
      out.write("                            <h6 class=\"fw-normal mb-0\">Clave modificada</h6>\n");
      out.write("                            <small>Hace 30 minutos</small>\n");
      out.write("                        </a>\n");
      out.write("                        <hr class=\"dropdown-divider\">\n");
      out.write("                        <a href=\"index.jsp\" class=\"dropdown-item \">*Mirar Notificaciones*</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"nav-item dropdown\">\n");
      out.write("                    <a href=\"#\" class=\"nav-link dropdown-toggle\" data-bs-toggle=\"dropdown\">\n");
      out.write("                        <img class=\"rounded-circle flex-shrink-0  user-wh\" src=\"dist/img/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.nombreUsuario}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(".jpg\" alt=\"Imagen Usuario\">\n");
      out.write("                        <span class=\"hidden-xs\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.nombreUsuario}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("                    </a>\n");
      out.write("                    <ul class=\"dropdown-menu dropdown-menu-end bg-light border-0 rounded-0 rounded-bottom m-0\">\n");
      out.write("                        <li class=\"user-header ps-3\">\n");
      out.write("                            <img class=\"rounded-circle flex-shrink-0 user-wh\" src=\"dist/img/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.nombreUsuario}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(".jpg\" alt=\"Imagen Usuario\">\n");
      out.write("                            <p>\n");
      out.write("                                Hola, ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.nombreUsuario}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("!\n");
      out.write("                                <small>Usted es ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.cargo.nombreCargo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </small>\n");
      out.write("                            </p>\n");
      out.write("                        </li>\n");
      out.write("                        <li> <a href=\"#\" class=\"dropdown-item\">Perfil</a></li>\n");
      out.write("                        <li><a href=\"#\" class=\"dropdown-item\">Configuracion</a></li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"srvUsuario?accion=identificar\" class=\"dropdown-item\">Cerrar Sesion</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"container-fluid pt-4 px-4\">\n");
      out.write("            <div class=\"bg-light text-center rounded p-4\">\n");
      out.write("                <div class=\"align-middle mb-3\">\n");
      out.write("                    <h3 class=\"mb-0 ps-5 ms-2 text-success fw-bold\">Editar Oradores</h3>\n");
      out.write("                    <form action=\"Controlador\" method=\"POST\">\n");
      out.write("                        <input type=\"hidden\" name=\"txtid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${persona.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                        <br><br>\n");
      out.write("                        NOMBRE:\n");
      out.write("                        <input type=\"text\" name=\"txtnom\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${persona.getNombre()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                        <br><br>\n");
      out.write("                        APELLIDO:\n");
      out.write("                        <input type=\"text\" name=\"txtapellido\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${persona.getApellido()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                        <br><br>\n");
      out.write("                        TEMATICA:\n");
      out.write("                        <input type=\"text\" name=\"txttematica\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${persona.getTematica()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                        <br><br>\n");
      out.write("                        <input class=\"btn btn-success mt-3\" type=\"submit\" value=\"Actualizar\" name=\"accion\">\n");
      out.write("                    </form>    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- JavaScript -->\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.4.1.min.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <script src=\"dist/js/main.js\"></script>\n");
      out.write("        <script src=\"https://kit.fontawesome.com/9a6888701c.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
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
