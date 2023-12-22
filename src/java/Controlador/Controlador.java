package Controlador;

import Modelo.Persona;
import Modelo.PersonaDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @authors Matias Contreras & Maria Lopez - Email : lopezmariasoledad2020@gmail.com
 */
public class Controlador extends HttpServlet {

    PersonaDAO dao = new PersonaDAO();
    Persona persona = new Persona();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controlador</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controlador at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");

        switch (accion) {

            case "Listar":
                List<Persona> datos = dao.listar();
                request.setAttribute("datos", datos); //Envia esto a tablaA.jsp en el forEach
                request.getRequestDispatcher("tablaA.jsp").forward(request, response);
                break;
            case "Mostrar":
                List<Persona> datos2 = dao.listar();
                request.setAttribute("datos2", datos2);
                request.getRequestDispatcher("tablaV.jsp").forward(request, response);
                break;
  
            case "Nuevo":
                request.getRequestDispatcher("add.jsp").forward(request, response);
                break;
            case "Guardar":
                String nombre = request.getParameter("txtnom");
                String apellido = request.getParameter("txtapellido");
                String tematica = request.getParameter("txttematica");

                persona = new Persona(0, nombre, apellido, tematica);

                dao.agregar(persona);

                request.getRequestDispatcher("exito.jsp").forward(request, response);
                break;

            case "Editar":
                int id = Integer.parseInt(request.getParameter("id"));
                Persona pers = dao.listarID(id);
                request.setAttribute("persona", pers);

                request.getRequestDispatcher("edit.jsp").forward(request, response);
                break;
            case "Actualizar":
                int id2 = Integer.parseInt(request.getParameter("txtid"));
                String nombre2 = request.getParameter("txtnom");
                String apellido2 = request.getParameter("txtapellido");
                String tematica2 = request.getParameter("txttematica");

                persona.setId(id2);
                persona.setNombre(nombre2);
                persona.setApellido(apellido2);
                persona.setTematica(tematica2);

                dao.actualizar(persona);
                request.getRequestDispatcher("Controlador?accion=Listar").forward(request, response);
                break;

            case "Edit":
                int id4 = Integer.parseInt(request.getParameter("id"));
                Persona pers4 = dao.listarID(id4);
                request.setAttribute("persona", pers4);

                request.getRequestDispatcher("edit2.jsp").forward(request, response);
                break;
            case "Update":
                int id5 = Integer.parseInt(request.getParameter("txtid"));
                String nombre5 = request.getParameter("txtnom");
                String apellido5 = request.getParameter("txtapellido");
                String tematica5 = request.getParameter("txttematica");

                persona.setId(id5);
                persona.setNombre(nombre5);
                persona.setApellido(apellido5);
                persona.setTematica(tematica5);

                dao.actualizar(persona);
                request.getRequestDispatcher("Controlador?accion=Mostrar").forward(request, response);
                break;

            case "Delete":
                int id3 = Integer.parseInt(request.getParameter("id"));
                dao.eliminar(id3);

                List<Persona> listaPersonas = dao.listar();
                request.setAttribute("Listar", listaPersonas);
                request.getRequestDispatcher("Controlador?accion=Listar").forward(request, response);
                break;
            default:
                throw new AssertionError();
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
