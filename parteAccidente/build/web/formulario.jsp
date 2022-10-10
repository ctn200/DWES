<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
    </head>
    <body>
        <h3 style="text-align: center">DATOS DEL TRABAJADOR</h3>
        <form action="masPartes.jsp" method="POST">
            <table>
            <tr>
                <td><p>Apellido 1<input type="text" name="apellido1" required></p></td>
                <td><p>Apellido 2<input type="text" name="apellido2" required></p></td>
                <td><p>Nombre<input type="text" name="nombre" required></p></td>
            </tr>
            <tr>
                <td><p>NºSS<input type="text" name="apellido1" required></p></td>
                <td><p>Fecha ingreso en la empresa<input type="text" name="apellido2" required></p></td>
                <td><p>Fecha de nacimiento<input type="text" name="nombre" required></p></td>
            </tr>
                
        </table>
                <h3>DATOS DE LA EMPRESA</h3>
        <table>
            <tr>
                <td>CIF <input type="text" name="CIF" required></td>
            </tr>
            <tr>
                <td>Nombre o Razón Social <input type="text" name="RazonSocial" size="50" required></td>
            </tr>
            <tr>
                <td>CCC <input type="text" name="CCC" size="50" required></td>
            </tr>
        </table>
                
                <strong style="padding: 50px">Descripcion del acciddente <textarea id="descripcion" name="descripcion" rows="5" cols="100" required></textarea></strong>       
                <br>
                <table>
                    <tr>
                        <td style="height: 80px"> <button type="submit" name="añadirParte">Añadir parte</button></td>
               
                        <td> <button type="reset" name="borrarParte">Borrar parte</button></td>
               
                        <td> <button type="button" name="listadoPartes" onclick="location.href='mostrarListado.jsp'">Listado de partes</button></td>

                    </tr>
                    
                
                </table>
        </form>
                       
    </body>
</html>
