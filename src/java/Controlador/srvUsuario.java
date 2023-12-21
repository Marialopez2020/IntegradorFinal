package Controlador;

import Modelo.usuario;
import Modelo.DAOUSUARIO;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @authors Matias Contreras & Maria Lopez - Email : lopezmariasoledad2020@gmail.com
 */
public class srvUsuario extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, Exception {
        response.setContentType("text/html;charset=UTF-8");
        String accion = request.getParameter("accion");
        try {
            if (accion != null) {
                switch (accion) {
                    case "verificar":
                        verificar(request, response);
                        break;
                    case "cerrar":
                        cerrarsession(request, response); 
                    default:
                        response.sendRedirect("identificar.jsp");
                }
            } else {
                response.sendRedirect("identificar.jsp");
            }
        } catch (IOException e) {
            try {
                this.getServletConfig().getServletContext().getRequestDispatcher("mensaje.jsp").forward(request, response);

            } catch (IOException | ServletException ex) {
                System.out.println("Error" + ex.getMessage());
            }
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(srvUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(srvUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
    
    
     private void verificar(HttpServletRequest request, HttpServletResponse response) throws Exception{
        HttpSession sesion;
        DAOUSUARIO dao = new DAOUSUARIO();
        usuario usuario = this.obtenerUsuario(request);
        
        usuario = dao.identificar(usuario);
        if (usuario != null && usuario.getCargo().getNombreCargo().equals("ADMINISTRADOR")) {
            sesion = request.getSession();
            sesion.setAttribute("usuario", usuario);
              request.getRequestDispatcher("index.jsp").forward(request, response);
            
        }else if(usuario != null && usuario.getCargo().getNombreCargo().equals("VENDEDOR")){
           sesion = request.getSession();
            sesion.setAttribute("vendedor", usuario);
            
             request.getRequestDispatcher("formVendedor.jsp").forward(request, response);
            
        }else{
            request.getRequestDispatcher("identificar.jsp").forward(request, response);
        }
            
    }

    private void cerrarsession(HttpServletRequest request, HttpServletResponse response) throws Exception{  
        HttpSession sesion = request.getSession();
        sesion.setAttribute("usuario", null);
        sesion.invalidate();
        response.sendRedirect("identificar.jsp");
        
    }

    private usuario obtenerUsuario(HttpServletRequest request) {
        usuario u = new usuario();
        u.setNombreUsuario(request.getParameter("txtUsu"));
        u.setClave(request.getParameter("txtPass"));
        return u;
    }

}
