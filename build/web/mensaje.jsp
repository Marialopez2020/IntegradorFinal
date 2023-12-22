<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Error</title>
       <!-- Favicon -->
        <link rel="shortcut icon" href="dist/img/logo2.ico" type="image/x-icon">

        <!-- Google Fonts -->
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Heebo:wght@400;500;600;700&display=swap" rel="stylesheet">

        <!-- Iconos-->
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">

        <!-- Bootstrap  -->
        <link href="dist/css//bootstrap.min.css" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
        <!-- Css -->
        <link href="dist/css/style.css" rel="stylesheet">
    </head>
    <body>
        <div class="container-xxl position-relative bg-white d-flex p-0">
            <section class="container text-center">
                <div class="bg-secondary p-4 mt-5">
                    <h2 class="text-danger">500</h2>
                    <div>
                        <h3><i class="fa fa-warning text-danger fw-bold"></i></h3>
                        <h4 class="text-danger">Oops! Algo salió mal </h4>
                        <p>Desde la Administración de la Conferencia Bs As. estaremos trabajando para solucionarlo de inmediato.
                        </p>
                        <div class="input-group-btn">
                            <button href="" class="btn btn-dark">Volver
                            </button>
                        </div>
                    </div>
                </div>
            </section>
        </div>
        
        <!-- JavaScript -->
        <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>
        <script src="js/main.js"></script>
        <script src="https://kit.fontawesome.com/9a6888701c.js" crossorigin="anonymous"></script>
    </body>

</html>