<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    <body class="bg-dark text-white" style="margin-top: 15%"> 
        <div class="container">
            <h1 style="text-align: center" class="text-info">Buscar pelicula</h1>
            <div class="row">   
                <div class="mx-auto">
                    <form method="POST" action="ServletBuscaPeli">
                        <strong>Titulo: <input type="text" name="buscaTitulo" required></strong><br>
                        <button type="submit" class="btn btn-outline-primary">Buscar</button>
                        <button type="reset" class="btn btn-outline-primary">Cancelar</button>
                    </form>
                    
                </div>
            </div>
            
            <div class="row">   
                <div class="mx-auto">
                <a href="Acceso.jsp" class="btn btn-secondary btn-lg active center-block" role="button">Volver a la pagina anterior...</a>
                </div>
            </div>
            
        </div>
    </body>
</html>
