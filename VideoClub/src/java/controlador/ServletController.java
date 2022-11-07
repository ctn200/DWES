package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.BD;

public class ServletController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        
        String usuario=request.getParameter("usuario");
        String password=request.getParameter("contrasena");
        ServletContext contexto = getServletContext();
        String error="";
        BD bd=new BD();
        if (usuario.length()<1 || password.length()<1) {
            error="NO SE PUEDE ENVIAR LOS CAMPOS VACIOS";
            contexto.setAttribute("error", error);
            request.getRequestDispatcher("errorUsuario.jsp").forward(request, response);
        }else{
            if (bd.compruebaUsuario(usuario,password)) {
                request.getRequestDispatcher("Acceso.jsp").forward(request, response);
            }else{
                error="DATOS INTRODUCIDOS INCORRECTOS";
                contexto.setAttribute("error", error);
                request.getRequestDispatcher("errorUsuario.jsp").forward(request, response);
            }
        }
    }
}
