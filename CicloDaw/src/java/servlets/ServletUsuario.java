package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletUsuario extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletUsuario</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletUsuario at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        String usuario=request.getParameter("usuario");
        String pass=request.getParameter("contrasena");
        String error="";
        ServletContext contexto=getServletContext();
        if (usuario.length()<1 || pass.length()<1) {
            error="NO SE PUEDE INTRODUCIR CAMPO VACIO";
            contexto.setAttribute("error", error);
            request.getRequestDispatcher("errorUsuario.jsp").forward(request, response);
        }else{
            if (modelo.BD.compruebaUsuario(usuario,pass)) {
                request.getRequestDispatcher("access.jsp").forward(request, response);
            }else{
                error="DATOS INCORRECTOS";
                contexto.setAttribute("error", error);
                request.getRequestDispatcher("errorUsuario.jsp").forward(request, response);
            }
        }
    }
}
