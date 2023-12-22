package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class tickets_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>\n");
      out.write("        Comprar Tickets\n");
      out.write("    </title>\n");
      out.write("\n");
      out.write("    <!-- Favicon -->\n");
      out.write("    <link rel=\"shortcut icon\" href=\"dist/img/logo2.ico\" type=\"image/x-icon\">\n");
      out.write("    <!-- CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"dist/css/styles.css\">\n");
      out.write("    <!--  Fonts -->\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Roboto:wght@400;500&display=swap\" rel=\"stylesheet\">\n");
      out.write("    <!-- Animaciones -->\n");
      out.write("    <link href=\"https://unpkg.com/aos@2.3.1/dist/aos.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- Bootstrap -->\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\n");
      out.write("        integrity=\"sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ\" crossorigin=\"anonymous\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <header>\n");
      out.write("        <nav class=\"navbar navbar-expand-lg bg-dark fixed-top\">\n");
      out.write("            <a class=\"navbar-brand d-none d-lg-block\" href=\"add.jsp\"><img class=\"img-logo ms-4\"\n");
      out.write("                    src=\"dist/img/logo2.png\" alt=\"Logo\"></a>\n");
      out.write("            <a class=\"navbar-brand d-md-block d-lg-none\" href=\"add.jsp\"><img class=\"img-logo ms-4\"\n");
      out.write("                    src=\"dist/img/codoacodo.png\" alt=\"Logo\"></a>\n");
      out.write("            <button class=\"navbar-toggler collapsed bg-secondary me-4\" type=\"button\" data-bs-toggle=\"collapse\"\n");
      out.write("                data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\n");
      out.write("                aria-label=\"Toggle navigation\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("            <div class=\"collapse navbar-collapse justify-content-lg-end\" id=\"navbarSupportedContent\">\n");
      out.write("                <ul class=\"navbar-nav ps-3 ml-auto\">\n");
      out.write("                    <li class=\"nav-item inicio\">\n");
      out.write("                        <a class=\"nav-link text-secondary\" href=\"add.jsp\">La conferencia</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item inicio\">\n");
      out.write("                        <a class=\"nav-link text-secondary\" href=\"add.jsp\">Los oradores</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item inicio\">\n");
      out.write("                        <a class=\"nav-link text-secondary\" href=\"add.jsp\">El lugar y la fecha</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item inicio\">\n");
      out.write("                        <a class=\"nav-link text-secondary\" href=\"add.jsp\">Conviértete en orador</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item inicio\">\n");
      out.write("                        <a class=\"nav-link text-success me-5\" href=\"#\">Comprar tickets</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("    </header>\n");
      out.write("    <main>\n");
      out.write("        <!-- Seccion tickets-descuentos -->\n");
      out.write("        <section class=\"tickets-section\">\n");
      out.write("            <div class=\"container text-center\">\n");
      out.write("                <div class=\"row row-cols-1 row-cols-md-3 mt-5\">\n");
      out.write("                    <div class=\"col mt-5\">\n");
      out.write("                        <div class=\"card h-100 shadow border-3 border-info card-hover opcion\" data-opcion=\"1\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <h5 class=\"card-title\">Estudiante</h5>\n");
      out.write("                                <p class=\"card-text\">Tiene un descuento</p>\n");
      out.write("                                <p class=\"card-text py-1\">80%</p>\n");
      out.write("                                <p class=\"card-text text-muted\"><small>*Presentar documentación</small></p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col mt-5\">\n");
      out.write("                        <div class=\"card h-100 shadow border-3 border-primary card-hover opcion\" data-opcion=\"2\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <h5 class=\"card-title\">Trainee</h5>\n");
      out.write("                                <p class=\"card-text\">Tiene un descuento</p>\n");
      out.write("                                <p class=\"card-text py-1\">50%</p>\n");
      out.write("                                <p class=\"card-text text-muted\"><small>*Presentar documentación</small></p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col mt-5\">\n");
      out.write("                        <div class=\"card h-100 shadow border-3 border-warning card-hover opcion\" data-opcion=\"3\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <h5 class=\"card-title\">Junior</h5>\n");
      out.write("                                <p class=\"card-text\">Tiene un descuento</p>\n");
      out.write("                                <p class=\"card-text py-1\">15%</p>\n");
      out.write("                                <p class=\"card-text text-muted\"><small>*Presentar documentación</small></p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row d-flex justify-content-center\">\n");
      out.write("                    <div class=\"text-center\">\n");
      out.write("                        <p class=\"layout-subtitle mt-3\">VENTA</p>\n");
      out.write("                        <h2 class=\"layout-title\">VALOR DE TICKET $200</h2>\n");
      out.write("                        <form class=\"formulario\" id=\"miFormulario\">\n");
      out.write("                            <div>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-6\">\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" placeholder=\"Nombre\"\n");
      out.write("                                            aria-label=\"Nombre\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-6\">\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" placeholder=\"Apellido\"\n");
      out.write("                                            aria-label=\"Apellido\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-12 mt-3\">\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" id=\"email\" aria-label=\"email\"\n");
      out.write("                                            placeholder=\"Correo\" minlength=\"10\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-6 mt-3 text-start\">\n");
      out.write("                                        <label for=\"input-cantidad\" class=\"ps-1\">Cantidad</label>\n");
      out.write("                                        <input type=\"text\" class=\"form-control mt-2\" id=\"input-cantidad\"\n");
      out.write("                                            placeholder=\"Cantidad\" aria-label=\"Cantidad\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-6 mt-3 text-start\">\n");
      out.write("                                        <label for=\"miSelect\" class=\"ps-1\">Categoria</label>\n");
      out.write("                                        <select name=\"select-tickets\" id=\"miSelect\"\n");
      out.write("                                            class=\"form-select select-tickets mt-2\">\n");
      out.write("                                            <option selected>Selecciona una categoria</option>\n");
      out.write("                                            <option value=\"1\" class=\"value\">Estudiante</option>\n");
      out.write("                                            <option value=\"2\" class=\"value\">Trainee</option>\n");
      out.write("                                            <option value=\"3\" class=\"value\">Junior</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-12 mt-3 \">\n");
      out.write("                                        <h5 class=\"form-control py-3 total-pagar text-start bg-lightblue\" id=\"total\">\n");
      out.write("                                            Total a Pagar: $</h5>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-6 my-3\">\n");
      out.write("                                        <button type=\"reset\" class=\"btn btn-success btn-tickets\"\n");
      out.write("                                            id=\"borrar\">Borrar</button>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-6 my-3\">\n");
      out.write("                                        <button type=\"submit\" class=\"btn btn-success btn-tickets\"\n");
      out.write("                                            id=\"resumen\">Resumen</button>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("    </main>\n");
      out.write("\n");
      out.write("    <footer class=\"d-flex align-items-center\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row d-flex justify-content-around text-center\">\n");
      out.write("                <div class=\"col-6 col-sm-4 col-lg-1\">\n");
      out.write("                    <a href=\"#\">Preguntas frecuentes</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-6 col-sm-4 col-lg-1\">\n");
      out.write("                    <a href=\"#\">Contáctanos</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-6 col-sm-4 col-lg-1\">\n");
      out.write("                    <a href=\"#\">Prensa</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-6 col-sm-4 col-lg-1\">\n");
      out.write("                    <a href=\"#\">Conferencias</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-6 col-sm-4 col-lg-1\">\n");
      out.write("                    <a href=\"#\">Términos y condiciones</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-6 col-sm-4 col-lg-1\">\n");
      out.write("                    <a href=\"#\">Privacidad</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("\n");
      out.write("    <!-- Fontawesome -->\n");
      out.write("    <script src=\"https://kit.fontawesome.com/9a6888701c.js\" crossorigin=\"anonymous\">\n");
      out.write("    </script>\n");
      out.write("    <script src=\"dist/js/resumen.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap -->\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js\"\n");
      out.write("        integrity=\"sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe\" crossorigin=\"anonymous\">\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    <!-- Animaciones -->\n");
      out.write("    <script src=\"https://unpkg.com/aos@2.3.1/dist/aos.js\"></script>\n");
      out.write("    <script>\n");
      out.write("        AOS.init();\n");
      out.write("    </script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
