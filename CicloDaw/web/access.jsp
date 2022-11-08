<%@page import="modelo.alumno"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Acceso</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    </head>
    <body  class="bg-dark text-white" style="margin-top: 15%; text-align: center">
        <h1>Listado de alumnos de 2º de CFDAW</h1>
        <%
            ArrayList<alumno> alumnos=(ArrayList) modelo.BD.listaAlumnos();
        %>
        <div class="container">
            <div class="row">
                <div class="col">
                    <strong>Nombre</strong>
                </div>
                <div class="col">
                    <strong>Apellidos</strong>
                     
                </div>
                <div class="col">
                    <strong>DAWES</strong>
                     
                </div>
                <div class="col">
                    <strong>DAWEC</strong>
                    
                </div>
                <div class="col">
                    <strong>DIW</strong>
                    
                </div>
                <div class="col">
                    <strong>DAW</strong>
                    
                </div>
                <div class="col">
                    <strong>FCT</strong>
                    
                </div>
                <div class="col">
                    <strong>Proyecto</strong>
                    
                </div>
                <div class="col">
                    <strong>Editar</strong>
                </div>
                </div>
                    <%
                        for(alumno alum:alumnos){
                        
                    %>
                <div class="row">
                    <div class="col">
                    <p><%=alum.getNombre()%></p>
                 </div>   
                <div class="col">
                    <p><%=alum.getApellidos()%></p>
                 </div> 
                <div class="col">
                    <p><%=alum.getDawes()%></p>
                 </div> 
                <div class="col">
                    <p><%=alum.getDawec()%></p>
                 </div> 
                <div class="col">
                    <p><%=alum.getDiw()%></p>
                 </div> 
                <div class="col">
                    <p><%=alum.getDaw()%></p>
                 </div> 
                <div class="col">
                    <p><%=alum.getFct()%></p>
                 </div> <div class="col">
                    <p><%=alum.getProyecto()%></p>
                 </div> 
                <div class="col">
                    <p>Editar</p>
                </div> 
                </div>
                <%}%>
            
        </div>
    </body>
</html>
