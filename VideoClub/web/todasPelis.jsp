<%@page import="modelo.Directores"%>
<%@page import="java.util.ArrayList"%>
<%@page import="modelo.Pelicula"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Todas Las Pelis</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    <body class="bg-dark text-white" style="margin-top: 15%"> 
        
        <h1 style="text-align: center" class="text-info">Listado de peliculas</h1><br>
        <%
            ArrayList<Pelicula> pelis=modelo.BD.listaPelis();
            ArrayList<Directores> director=modelo.BD.listaDirectores();
            for(Pelicula peli: pelis){
            
            
            
            
        %>
        
        <div class="container-fluid text-center">
            <div class="row">
                <div class="col">
                        <%=peli.getTitulo()%>
                </div>
                <%
                    for(Directores direc: director){
                    if (peli.getDirector().equals(direc.getId())) {
                            
                        
                %>
                <div class="col">
                    <%=direc.getNombre()%>
                    <br>
                <%}}%>
                </div>
                <div class="col">
                    <%=peli.getFecha()%>
                </div>
                
                
                
            </div>
        </div>
               
            <%}%>
            <div class="row">   
                <div class="mx-auto">
                <a href="listaPeli.jsp" class="btn btn-secondary btn-lg active center-block" role="button">Volver a la gestion de pelis...</a>
                </div>
            </div>

        
    </body>
</html>
