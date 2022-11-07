<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Acceso</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    </head>
    <body class="bg-dark text-white" style="margin-top: 15%"> 
        <div class="container">
            <h1 style="text-align: center" class="text-info">Gestion de Videoclub</h1>
            <div class="row">   
                <div class="mx-auto">
                    <button type="button" class="btn btn-outline-primary" onclick="location.href='altaPeli.jsp'">Alta de peliculas</button>
                    <button type="button" class="btn btn-outline-primary" onclick="location.href='modificacionPeli.jsp'">Modificacion de peliculas</button>
                    <button type="button" class="btn btn-outline-primary" onclick="location.href='bajaPeli.jsp'">Baja de peliculas</button>
                    <button type="button" class="btn btn-outline-primary" onclick="location.href='listaPeli.jsp'">Listado de peliculas</button>
                </div>
            </div>
            
            <div class="row">   
                <div class="mx-auto">
                <a href="index.html" class="btn btn-secondary btn-lg active center-block" role="button">Volver a la pagina de inicio...</a>
                </div>
            </div>
            
        </div>
    </body>
</html>
