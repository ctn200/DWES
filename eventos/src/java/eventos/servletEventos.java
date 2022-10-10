package eventos;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servletEventos extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet servletEventos</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet servletEventos at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            response.setContentType("text/html");
            PrintWriter out=response.getWriter();
            String usuario=request.getParameter("usuario");
            String contrasena=request.getParameter("contrasena");
            String usuarios[]={"eso","sanidad","cocica","informatica"};
            String contrasenas[]={"cdpjosecabreraeso","cdpjosecabrerasanidad","cdpjosecabreracocina","cdpjosecabrerainformatica"};
            boolean correcto=false;
            ServletContext contexto=getServletContext();
            RequestDispatcher rd;
            String departamento="";
        for(int x=0;x<usuarios.length;x++){
                    departamento=usuarios[x];
                    contexto.setAttribute("departamento", departamento);
                 if (usuario.equalsIgnoreCase(usuarios[x]) && contrasena.equalsIgnoreCase(contrasenas[x])) {
                 correcto=true;
                 break;
                 }  else{
                    correcto=false;  
                 } 
        }
      
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet servletEventos</title>");            
            out.println("</head>");
            out.println("<body>");
              if (correcto) {
                   rd=contexto.getRequestDispatcher("/Registro.jsp");
                   rd.forward(request, response);
              }else{
                   rd=contexto.getRequestDispatcher("/ErrorUsuario.html");
                   rd.forward(request, response);
        }
            
            out.println("</body>");
            out.println("</html>");
    }
}
