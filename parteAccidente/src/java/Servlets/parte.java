package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class parte extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet parte</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet parte at " + request.getContextPath() + "</h1>");
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
       // processRequest(request, response);
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        
        String dni=request.getParameter("dni");
        String contrasena=request.getParameter("contrasena");
        ServletContext contexto=getServletContext();
        RequestDispatcher rd;
         if(compruebaDni(dni) && contrasena.equalsIgnoreCase("trebujena")){
             rd=request.getRequestDispatcher("formulario.jsp");
             rd.forward(request, response);
         }else
             rd=request.getRequestDispatcher("dniIncorrecto.html");
             rd.forward(request, response);
            /*out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet parte</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> "+numDni+" </h1>");
            out.println("</body>");
            out.println("</html>");*/
           
    }

    private boolean compruebaDni(String dni) {
       
        boolean dniCorrecto=false;
        int kk=dni.length();
        String letrasDni[]={"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E","T"};
        if (dni.length()==9) {
            try {
        int numeros=Integer.parseInt(dni.substring(0,8));
        String numDni=dni.substring(8);
        int letrDni=numeros%23;
        String letraDni=letrasDni[letrDni];
            System.out.println(letraDni+"||"+numDni);
        if (letraDni.equalsIgnoreCase(numDni)) {
            dniCorrecto=true;
        }else{
            dniCorrecto=false;
        } 
        } catch (NumberFormatException e) {
            dniCorrecto=false;
        }
        }else
            dniCorrecto=false;
        
        
        
        return dniCorrecto;
        
        
    }
}
