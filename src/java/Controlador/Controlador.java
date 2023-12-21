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

public class Controlador extends HttpServlet {

    PersonaDAO dao = new PersonaDAO();
    Persona persona = new Persona();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
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

            //Asociado al metodo "Listar() de PersonaDAO"
            case "Listar":
                List<Persona> datos = dao.listar();
                request.setAttribute("datos", datos); //Envia esto a tablaA.jsp en el forEach
                request.getRequestDispatcher("tablaA.jsp").forward(request, response);
                break;
            case "Mostrar":
                List<Persona> datos2 = dao.listar();
                request.setAttribute("datos2", datos2); //Envia esto al tablaV.jsp en el forEach
                request.getRequestDispatcher("tablaV.jsp").forward(request, response);
                break;

            //"Nuevo" y "Guardar", ambos se asocian al metodo guardar() de PersonaDAO    
            case "Nuevo":
                request.getRequestDispatcher("add.jsp").forward(request, response);
                break;
            case "Guardar": //Asociado al boton "Guardar de add.jsp". ACA TRAEMOS TODOS LOS NOMBRES DE LAS CAJAS DE TEXTOS DE ESE ARCHIVO

                String nombre = request.getParameter("txtnom");
                String apellido = request.getParameter("txtapellido");
                String tematica = request.getParameter("txttematica");

                persona = new Persona(0, nombre, apellido, tematica);

                //Y con la variable dao llamamos al metodo agregar()de PersonaDAO y agregamos la persona
                dao.agregar(persona);

                //Una vez que se guarda en la base de datos, se va a listar con el sig codigo
                //PEROOOO SI NO QUEREMOS QUE EL USUARIO VEA LA LISTA DENTRO DE LOS SIG PARENTESIS COLOCAMOS DONDE IRA 
                //DESPUES DE GUARDAR LOS DATOS, POR EJ PODRA IR A UNA PAGINA QUE DIGA "CONTACTO GUARDADO EXITOSAMENTE!"
//                request.getRequestDispatcher("Controlador?accion=Listar").forward(request, response);
                
                request.getRequestDispatcher("exito.jsp").forward(request, response);
                break;

            //Aca vienen cuando presionan boton Editar de la pagina edit.jps
            //Cuando el usuario presiona en editar de ese archivo deben mostrarse el formulario cargando los datos de la fila seleccionada
            //Para que muestre los datos de la fila selecionada vamos a PersonaDAO y creamos el metodo listarID()
            //LOS CASOS Editar y Actualizar van juntos para modificar/actualizar una persona
            case "Editar":
                int id = Integer.parseInt(request.getParameter("id"));   //Este "id" entre comillas es el name="id" del input del form del index.jsp       
                Persona pers = dao.listarID(id);
                //Para que se muestren los datos en el fomrulario:
                request.setAttribute("persona", pers);

//                Va a editarse, pero primero debe mostrarse, o sea hacemos las lineas que estan antes
                request.getRequestDispatcher("edit.jsp").forward(request, response);
                break;
            case "Actualizar":
                //Las sig variables estan capturando los nuevos datos q se ingresan por las cajas de texto
                int id2 = Integer.parseInt(request.getParameter("txtid"));//Este txtid es el name del id del input del form del add.jsp y del edit.jsp              
                String nombre2 = request.getParameter("txtnom");
                String apellido2 = request.getParameter("txtapellido");
                String tematica2 = request.getParameter("txttematica");

                persona.setId(id2);
                persona.setNombre(nombre2);
                persona.setApellido(apellido2);
                persona.setTematica(tematica2);

                dao.actualizar(persona);

                //COMO EDITABA PERO NOS ENVIABA A PAGINA EN BLANCO, AGREGAMOS ESTO PARA QUE NOS ENVIE a la LISTA ACTUALIZADA
                request.getRequestDispatcher("Controlador?accion=Listar").forward(request, response);
                break;

            case "Edit":
                int id4 = Integer.parseInt(request.getParameter("id"));   //Este "id" entre comillas es el name="id" del input del form del index.jsp       
                Persona pers4 = dao.listarID(id4);
                //Para que se muestren los datos en el fomrulario:
                request.setAttribute("persona", pers4);

//                Va a editarse, pero primero debe mostrarse, o sea hacemos las lineas que estan antes
                request.getRequestDispatcher("edit2.jsp").forward(request, response);
                break;
            case "Update":
                //Las sig variables estan capturando los nuevos datos q se ingresan por las cajas de texto
                int id5 = Integer.parseInt(request.getParameter("txtid"));//Este txtid es el name del id del input del form del add.jsp y del edit.jsp              
                String nombre5 = request.getParameter("txtnom");
                String apellido5 = request.getParameter("txtapellido");
                String tematica5 = request.getParameter("txttematica");

                persona.setId(id5);
                persona.setNombre(nombre5);
                persona.setApellido(apellido5);
                persona.setTematica(tematica5);

                dao.actualizar(persona);

                //COMO EDITABA PERO NOS ENVIABA A PAGINA EN BLANCO, AGREGAMOS ESTO PARA QUE NOS ENVIE a la LISTA ACTUALIZADA
                request.getRequestDispatcher("Controlador?accion=Mostrar").forward(request, response);
                break;

            //ELIMINAR
            //Este controlador debe recibir el id de la fila que se debe eliminar(en la fila estan los datos de la persona) que
            //hace referencia al input id del index.jps, donde esta el boton "delete"
            case "Delete":
                int id3 = Integer.parseInt(request.getParameter("id"));

                //EN EL CASO DE QUE EL ID SEA UN INT, ENTONCES LA LINEA ANTERIOR DEBE SER ASI:
                //  int id2 = Integer.parseInt(request.getParameter("id"));
                //Luego vamos a ejecutar el metodo delete que esta en la clase PersonaDAO, vamos a crearlo
                dao.eliminar(id3);

                List<Persona> listaPersonas = dao.listar();
                request.setAttribute("Listar", listaPersonas);

                //LUEGO DE ELIMINAR ENVIAMOS A QUE SE VEA LA PAGINA QUE QUERAMOS, EN ESTE CASO VAMOS A MOSTRAR LA LISTA
                //ASI VEMOS QUE SE ELIMINO EL OBJETO
                request.getRequestDispatcher("Controlador?accion=Listar").forward(request, response);
                break;
            default:
                throw new AssertionError();
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
