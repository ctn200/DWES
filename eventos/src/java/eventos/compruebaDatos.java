package eventos;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.actividad;

public class compruebaDatos extends HttpServlet {
        ArrayList<actividad> evento=new ArrayList<>();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet compruebaDatos</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet compruebaDatos at " + request.getContextPath() + "</h1>");
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
        //processRequest(request, response);
        
        ServletContext contexto= getServletContext();
        RequestDispatcher rd;
        
        String nombre=request.getParameter("nombre");
        String lugar=request.getParameter("celebracion");
        String fecha=request.getParameter("fecha");
        String hora=request.getParameter("hora");
        String destinado=request.getParameter("alumnado");
        String actividades[]=request.getParameterValues("tipoActividad");
        String actividad="";
            for (String actividade : actividades) {
                actividad = actividad + actividade + ",";
            }
        String curso=request.getParameter("cursoDestinado");
        String profesor=request.getParameter("profesor");
        String observaciones=request.getParameter("observaciones");
        actividad act=new actividad(nombre,lugar,fecha,hora,destinado,actividad,curso,profesor,observaciones);
        evento.add(act);
        contexto.setAttribute("evento", evento);
        rd=request.getRequestDispatcher("Registro.jsp");
        rd.forward(request, response);
        
        
    }

}
