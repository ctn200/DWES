<%-- 
    Document   : Registro
    Created on : 6 oct. 2022, 12:32:31
    Author     : alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Registro </title>
    </head>
    <body>
        <form action="Listado.jsp">
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
                                        <input type="checkbox" name="tipoActividad" value="ON" />academica<br>
                                        <input type="checkbox" name="tipoActividad" value="ON" />deportiva<br>                              
                                        <input type="checkbox" name="tipoActividad" value="ON" />cultural<br>
                                        <input type="checkbox" name="tipoActividad" value="ON" />convivencia<br>
                                    </td>
                                    <tr>
                                        <td>Curso destinado</td>
                                            <td>
                                        <select name="cursoDestinado">
                                        <option> ESO </option>
                                        <option> SANIDAD </option>
                                        <option> COCINA </option>
                                        <option> INFORMATICA </option>
                                    </select>
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
                                            <button type="button">Añadir Actividad</button>
                                             <button type="reset">Borrar Actividad</button>
                                            <button type="submit" action="Listado.jsp">Listado de  Actividades</button>
                                        </td>
                                    </tr>
                                </table>       
                                    
           
           
            </form>
                               
   
    </body>
</html>
