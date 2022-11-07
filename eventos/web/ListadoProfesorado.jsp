<%@page import="java.util.ArrayList"%>
<%@page import="modelo.actividad"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Listado </title>
    </head>
    <body>
        <form action="Registro.jsp">
            <table border="1">
                <%
                    ArrayList<actividad> evento=new ArrayList<>();
                    //actividad acti=new actividad();
                    evento=(ArrayList) getServletContext().getAttribute("evento");
                %>
            <tr style="background-color: #3386FF ">
                <td>Fecha</td>
                <td> Hora </td>
                <td> Nombre de la actividad </td>
                <td> Lugar de celebracion </td>
                <td> Personal de destino </td>
                <td> Curso </td>
                <td> Tipo de actividad </td>
                <td> Dpto que lo organiza </td>
                <td> Responsable </td>
                <td> Observaciones </td>
            </tr>
            <%
                
                        
                    
                for(actividad act:evento){
                    
               if (act.getDestinado().equalsIgnoreCase("profesorado")) {
            %>
            <tr style="background-color: #33FFE9 ">
                <td><%=act.getFecha()%></td>
                <td><%=act.getHora()%></td>
                <td><%=act.getNombre()%></td>
                <td><%=act.getLugar()%></td>
                <td><%=act.getDestinado()%></td>
                <td><%=act.getCurso()%></td>
                <td><%=act.getActividad()%></td>
                <td><%=act.getCurso()%></td>
                <td><%=act.getProfesor()%></td>
                <td><%=act.getObservaciones()%></td>               
                
            </tr>
            <%}}%>
        </table>
               <button type="submit">Seguir añadiendo actividades</button>
               <button type="button" onclick="location.href='Listado.jsp'">Ver todas las actividades</button>
               <button type="button" onclick="location.href='ListadoAlumnado.jsp'">Ver actividades del alumnado</button>
               <button type="button" onclick="location.href='ListadoProfesorado.jsp'">Ver actividades del profesorado</button>
        </form>
        
    </body>
</html>
