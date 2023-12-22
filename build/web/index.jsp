<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    if (session.getAttribute("usuario") != null) {
%>

<html lang="es">
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
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
        <!-- Css -->
        <link href="dist/css/style.css" rel="stylesheet">
    </head>

    <body>
        <div class="sidebar">
            <nav class="navbar bg-dark navbar-dark">
                <a href="#" class="navbar-brand mx-4 pt-3">
                    <h6>PANEL ADMINISTRATIVO</h6>
                </a>
                <div class="d-flex align-items-center ms-2 mt-4 mb-3">
                    <div class="position-relative">                 
                        <img class="rounded-circle flex-shrink-0 user-wh" src="dist/img/${usuario.nombreUsuario}.jpg" alt="Imagen Admin">                      
                    </div>
                    <div class="ms-3 text-light">
                        <p>Hola, ${usuario.nombreUsuario}! </p>
                        <i class="fa fa-circle text-success"></i> Online
                    </div>
                </div>
                <div class="navbar-nav w-100">
                    <a href="#" class="nav-item nav-link active mb-1"><i class="fa fa-tachometer-alt me-2"></i>Dashboard</a>

                    <a href="tabla-tickets-admin.html" class="nav-item nav-link"><i class="fa-solid fa-ticket fa-lg me-2 i-col"></i>Venta
                        Tickets</a>
                    <a href="tablaA.jsp" class="nav-item nav-link"><i
                            class="fa-solid fa-microphone-lines fa-lg me-2 i-col"></i>Lista Oradores</a>
                    <div class="nav-item dropdown">
                        <a href="#" class="nav-link dropdown-toggle" data-bs-toggle="dropdown"><i
                                class="fa-solid fa-chart-line fa-lg me-2 i-col"></i>Balance
                            General</a>
                        <div class="dropdown-menu bg-transparent border-0">
                            <a href="#" class="dropdown-item">Ganancias Anuales</a>
                            <a href="#" class="dropdown-item">Costos</a>
                            <a href="#" class="dropdown-item">Otros</a>
                        </div>
                    </div>
                    <a href="#" class="nav-item nav-link"><i class="fa-regular fa-handshake fa-lg me-2 i-col"></i>Partners</a>
                    <a href="#" class="nav-item nav-link"><i class="fa-solid fa-landmark fa-lg me-2 i-col"></i>Bancos</a>
                    <div class="nav-item dropdown">
                        <a href="#" class="nav-link dropdown-toggle" data-bs-toggle="dropdown"><i
                                class="fa-solid fa-chart-pie fa-lg me-2 i-col"></i>Graficos</a>
                        <div class="dropdown-menu bg-transparent border-0">
                            <a href="#" class="dropdown-item">Graficos Ventas</a>
                            <a href="#" class="dropdown-item">Graficos Ganancias</a>
                            <a href="#" class="dropdown-item">Graficos Totales</a>
                            <a href="#" class="dropdown-item">Graficos Generales</a>
                        </div>
                    </div>
                </div>
            </nav>
        </div>
        <div class="content">
            <nav class="navbar navbar-expand bg-dark navbar-light sticky-top px-4 py-0">
                <a href="#" class="navbar-brand d-flex d-lg-none me-4 ">
                </a>
                <a href="#" class="sidebar-toggler flex-shrink-0 d-lg-none">
                    <h3><i class="fa fa-bars pt-3 "></i></h3>
                </a>
                <div class="navbar-nav align-items-center ms-auto">
                    <div class="nav-item dropdown">
                        <a href="#" class="nav-link dropdown-toggle" data-bs-toggle="dropdown">
                            <i class="fa fa-bell me-lg-2"></i>
                            <span class="d-none d-lg-inline-flex">Notificaciones</span>
                        </a>
                        <div class="dropdown-menu dropdown-menu-end bg-light border-0 rounded-0 rounded-bottom m-0">
                            <a href="#" class="dropdown-item">
                                <h6 class="fw-normal mb-0">Nuevo usuario agregado</h6>
                                <small>Hace 10 minutos</small>
                            </a>
                            <hr class="dropdown-divider">
                            <a href="#" class="dropdown-item">
                                <h6 class="fw-normal mb-0">Perfil actualizado</h6>
                                <small>Hace 25 minutos</small>
                            </a>
                            <hr class="dropdown-divider">
                            <a href="#" class="dropdown-item">
                                <h6 class="fw-normal mb-0">Clave modificada</h6>
                                <small>Hace 30 minutos</small>
                            </a>
                            <hr class="dropdown-divider">
                            <a href="#notif" class="dropdown-item ">*Mirar Notificaciones*</a>
                        </div>
                    </div>
                    <div class="nav-item dropdown">
                        <a href="#" class="nav-link dropdown-toggle" data-bs-toggle="dropdown">
                            <img class="rounded-circle flex-shrink-0 user-wh" src="dist/img/${usuario.nombreUsuario}.jpg" alt="Imagen Admin">
                            <span class="hidden-xs"> ${usuario.nombreUsuario}</span>
                        </a>
                        <ul class="dropdown-menu dropdown-menu-end bg-light border-0 rounded-0 rounded-bottom m-0">
                            <li class="user-header ps-3">
                                <img class="rounded-circle flex-shrink-0 user-wh" src="dist/img/${usuario.nombreUsuario}.jpg" alt="Imagen Admin">
                                <p>
                                    Hola, ${usuario.nombreUsuario}!
                                    <small>Usted es ${usuario.cargo.nombreCargo} </small>
                                </p>
                            </li>
                            <li> <a href="#" class="dropdown-item">Perfil</a></li>
                            <li><a href="#" class="dropdown-item">Configuracion</a></li>
                            <li>
                                <a href="srvUsuario?accion=identificar" class="dropdown-item">Cerrar Sesion</a>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>
            <div class="container-fluid pt-4 px-4">
                <div class="row g-4">
                    <div class="col-sm-6 col-xl-3">
                        <div class="bg-white rounded d-flex align-items-center justify-content-between p-4">
                            <img src="dist/img/ok2.jpg" alt="Imagen Aumento Ventas">
                            <div class="ms-3">
                                <p class="mb-2">Ventas Hoy</p>
                                <h6 class="mb-0">$1111</h6>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-6 col-xl-3">
                        <div class="bg-white rounded d-flex align-items-center justify-content-between p-4">
                            <img src="dist/img/ok.jpg" alt="Imagen Ok">
                            <div class="ms-3">
                                <p class="mb-2">Total Ventas</p>
                                <h6 class="mb-0">$1111</h6>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-6 col-xl-3">
                        <div class="bg-white rounded d-flex align-items-center justify-content-between p-4">
                            <img src="dist/img/ok3.jpg" alt="Imagen ventas">
                            <div class="ms-3">
                                <p class="mb-2">Ingresos Hoy</p>
                                <h6 class="mb-0">$1111</h6>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-6 col-xl-3">
                        <div class="bg-white rounded d-flex align-items-center justify-content-between p-4">
                            <img src="dist/img/ok4.jpg" alt="Imagen ventas">
                            <div class="ms-3">
                                <p class="mb-2">Total Ingresos</p>
                                <h6 class="mb-0">$1111</h6>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="container-fluid pt-4 pb-4">
                <div class="row g-4">
                    <div class="col-sm-12 col-md-6 col-xl-6">
                        <div class="h-100 bg-light rounded p-4">
                            <div class="d-flex align-items-center justify-content-between mb-2">
                                <h6 class="mb-0" id="notif">Mensajes</h6>
                                <a href="" class="text-success fw-bold ">Mostrar Todos</a>
                            </div>
                            <div class="d-flex align-items-center border-bottom py-3">
                                <img class="rounded-circle flex-shrink-0 user-wh" src="dist/img/MATIAS.jpg" alt="Imagen usuario">
                                <div class="w-100 ms-3">
                                    <div class="d-flex w-100 justify-content-between">
                                        <h6 class="mb-0">Usuario</h6>
                                        <small>Hace 2 minutos</small>
                                    </div>
                                    <span>Lorem ipsum dolor sit amet consectetur adipisicing elit. Similique veritatis
                                        doloribus inventore libero laborum reprehenderit nobis quia nihil pariatur
                                        laudantium..</span>
                                </div>
                            </div>
                            <div class="d-flex align-items-center border-bottom py-3">
                                <img class="rounded-circle flex-shrink-0 user-wh" src="dist/img/MARIA.jpg" alt="Imagen usuario">
                                <div class="w-100 ms-3">
                                    <div class="d-flex w-100 justify-content-between">
                                        <h6 class="mb-0">Usuario</h6>
                                        <small>Hace 5 minutos </small>
                                    </div>
                                    <span>Lorem ipsum dolor sit amet consectetur adipisicing elit. Quia pariatur at
                                        doloribus nihil doloremque ab quam quod corporis. Porro, illo.</span>
                                </div>
                            </div>
                            <div class="d-flex align-items-center border-bottom py-3">
                                <img class="rounded-circle flex-shrink-0 user-wh" src="dist/img/MATIAS.jpg" alt="Imagen usuario">
                                <div class="w-100 ms-3">
                                    <div class="d-flex w-100 justify-content-between">
                                        <h6 class="mb-0">Usuario</h6>
                                        <small>Hace 30 minutos </small>
                                    </div>
                                    <span>Lorem ipsum dolor sit amet consectetur adipisicing elit. Itaque nam hic commodi,
                                        dolores alias labore! Velit consequatur atque voluptates ipsam?</span>
                                </div>
                            </div>
                            <div class="d-flex align-items-center pt-3">
                                <img class="rounded-circle flex-shrink-0 user-wh" src="dist/img/MARIA.jpg" alt="Imagen usuario">
                                <div class="w-100 ms-3">
                                    <div class="d-flex w-100 justify-content-between">
                                        <h6 class="mb-0">Usuario</h6>
                                        <small>Hace 1d</small>
                                    </div>
                                    <span>Lorem ipsum dolor, sit amet consectetur adipisicing elit. Numquam atque optio
                                        natus tenetur non ut officia aut iusto nulla quo.</span>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-12 col-md-6 col-xl-6">
                        <div class="h-100 bg-light rounded p-4">
                            <div class="d-flex align-items-center justify-content-between mb-4">
                                <h6 class="mb-0">Lista TO DO</h6>
                                <a href="" class="text-success fw-bold ">Mostrar Todo</a>
                            </div>
                            <div class="d-flex mb-2">
                                <input class="form-control bg-transparent" type="text" placeholder="Ingresar tarea...">
                                <button type="button" class="btn btn-success ms-2">Nueva</button>
                            </div>
                            <div class="d-flex align-items-center border-bottom py-2">
                                <input class="form-check-input m-0 bg-success" type="checkbox" checked>
                                <div class="w-100 ms-3">
                                    <div class="d-flex w-100 align-items-center justify-content-between">
                                        <span><del>Lorem ipsum dolor sit amet.</del></span>
                                        <button class="btn btn-sm text-success"><i class="fa fa-times"></i></button>
                                    </div>
                                </div>
                            </div>
                            <div class="d-flex align-items-center border-bottom py-2">
                                <input class="form-check-input m-0 bg-success" type="checkbox">
                                <div class="w-100 ms-3">
                                    <div class="d-flex w-100 align-items-center justify-content-between">
                                        <span>Lorem ipsum dolor sit amet.</span>
                                        <button class="btn btn-sm text-success"><i class="fa fa-times"></i></button>
                                    </div>
                                </div>
                            </div>
                            <div class="d-flex align-items-center border-bottom py-2">
                                <input class="form-check-input m-0 bg-success" type="checkbox">
                                <div class="w-100 ms-3">
                                    <div class="d-flex w-100 align-items-center justify-content-between">
                                        <span>Lorem ipsum dolor sit amet.</span>
                                        <button class="btn btn-sm text-success"><i class="fa fa-times"></i></button>
                                    </div>
                                </div>
                            </div>
                            <div class="d-flex align-items-center border-bottom py-2">
                                <input class="form-check-input m-0 bg-success" type="checkbox">
                                <div class="w-100 ms-3">
                                    <div class="d-flex w-100 align-items-center justify-content-between">
                                        <span>Lorem ipsum dolor sit amet.</span>
                                        <button class="btn btn-sm text-success"><i class="fa fa-times"></i></button>
                                    </div>
                                </div>
                            </div>
                            <div class="d-flex align-items-center border-bottom py-2">
                                <input class="form-check-input m-0 bg-success" type="checkbox" checked>
                                <div class="w-100 ms-3">
                                    <div class="d-flex w-100 align-items-center justify-content-between">
                                        <span><del>Lorem ipsum dolor sit amet.</del></span>
                                        <button class="btn btn-sm text-success"><i class="fa fa-times"></i></button>
                                    </div>
                                </div>
                            </div>
                            <div class="d-flex align-items-center pt-2">
                                <input class="form-check-input m-0 bg-success" type="checkbox">
                                <div class="w-100 ms-3">
                                    <div class="d-flex w-100 align-items-center justify-content-between">
                                        <span>Lorem ipsum dolor sit amet.</span>
                                        <button class="btn btn-sm text-success "><i class="fa fa-times"></i></button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>           
        </div>
    </div>

    <!-- JavaScript -->
    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>
    <script src="dist/js/main.js"></script>
    <script src="https://kit.fontawesome.com/9a6888701c.js" crossorigin="anonymous"></script>
</body>

</html>

<%
    } else {
        response.sendRedirect("identificar.jsp");
    }
%>