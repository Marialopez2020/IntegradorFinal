<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Panel Administrativo</title>
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
            <div class="container-fluid bg-secondary">
                <div class="row h-100 align-items-center justify-content-center" style="min-height: 100vh;">
                    <div class="col-12 col-sm-8 col-md-6 col-lg-5 col-xl-4">
                        <div class="bg-light rounded p-4 p-sm-5 my-4 mx-3">
                            <div class="">
                                <h4 class="text-success text-center">INGRESO A PANEL ADMINISTRATIVO</h4>
                                <h5 class="text-center">Codo a Codo</h5>
                                <form action="srvUsuario?accion=verificar" method="POST">
                                    <div class="form-floating mb-3">
                                        <input type="text" name="txtUsu" id="txtUsu" value="" class="form-control"  placeholder="Usuario">
                                        <label for="txtUsu">Usuario</label>
                                    </div>
                                    <div class="form-floating mb-4">
                                        <input type="password" name="txtPass" id="txtPass" value="" class="form-control" placeholder="******">
                                        <label for="txtPass">Password</label>
                                    </div>
                                    <div class="d-flex align-items-center justify-content-between mb-4">
                                        <div class="form-check">
                                            <input type="checkbox" class="form-check-input" id="check">
                                            <label class="form-check-label" for="check">Recordarme</label>
                                        </div>
                                        <a href="">Olvide mi contraseña</a>
                                    </div>
                                    <input type="submit" name="verificar" value="Verificar" class="btn btn-success py-3 w-100 mb-4"/>
                                    <p class="text-center mb-0"><a href="">Registrarme</a></p>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <!-- JavaScript -->
            <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>
            <script src="js/main.js"></script>
            <script src="https://kit.fontawesome.com/9a6888701c.js" crossorigin="anonymous"></script>
    </body>

</html>
