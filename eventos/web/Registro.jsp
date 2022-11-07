<%
    String departamento = (String) getServletContext().getAttribute("departamento");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Registro </title>
    </head>
    <body>
        <form action="compruebaDatos" method="POST">
             <table>
                                    <tr>
                                        <td> Nombre de la actividad</td><td>  <input type="type" name="nombre" size="50"></td><br>
                                    </tr>
                                    <tr>
                                        <td> Lugar de celebracion </td><td> <input type="type" name="celebracion" size="50"></td>
                                    </tr>
                                    <tr>
                                        <td> Fecha </td><td><input type="date" name="fecha"></td>
                                    </tr>
                                    <tr>
                                        <td> Hora  </td><td> <input type="time" name="hora"></td>
                                    </tr>
                                    <tr>
                                        <td> Destinado a:  </td><td><input type="radio" name="alumnado" value="alumnado" />alumnado
                                        <input type="radio" name="alumnado" value="profesorado" />profesorado<br></td>
                                    </tr>                           
                                     <td> Tipo de actividad:</td>
                                    <br>
                                    <td>
                                        <input type="checkbox" name="tipoActividad" value="academica" />academica<br>
                                        <input type="checkbox" name="tipoActividad" value="deportiva" />deportiva<br>                              
                                        <input type="checkbox" name="tipoActividad" value="cultural" />cultural<br>
                                        <input type="checkbox" name="tipoActividad" value="convivencia" />convivencia<br>
                                    </td>
                                    <tr>
                                        <td>Curso destinado</td>
                                           
                                                <% if (departamento.equalsIgnoreCase("eso")) {


                                                %>
                                        <td>
                                        <select name="cursoDestinado">
                                        <option> 1ºESO </option>
                                        <option> 2ºESO</option>
                                        <option> 3ºESO</option>
                                        <option> 4ºESO</option>
                                        </select>
                                                <%
                                                    }else{
                                                %>
                                        <td>        
                                        <select name="cursoDestinado">
                                        <option> 1ºCURSO </option>
                                        <option> 2ºCURSO</option>
                                        </select>
                                                 <%
                                                    }
                                                %>
                                            </td>
                                    </tr>
                                    <tr>
                                        <td> Profesor responsable </td>
                                        <td> <input type="type" name="profesor" size="50"></td>
                                    </tr>
                                    <tr>
                                        <td> Observaciones </td>
                                        <td>
                                            <textarea name="observaciones" rows="5" cols="50">
                                            </textarea>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td></td>
                                        <td>
                                            <button type="submit">Añadir Actividad</button>
                                            <button type="reset">Borrar Actividad</button>
                                            <button type="button" onclick="location.href='Listado.jsp'">Listado de  Actividades</button>
                                        </td>
                                    </tr>
                                </table>     
            </form>
                               
   
    </body>
</html>
