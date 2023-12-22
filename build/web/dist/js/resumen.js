var select = document.querySelector("#miSelect");
var formulario = document.querySelector("#miFormulario");
const valorTicket = 200;
var valorTotal;
var opciones = document.querySelectorAll(".opcion");

opciones.forEach(function (opcion) {
  opcion.addEventListener("click", function () {
    // Obtener el valor de la opcion desde el atributo data
    var valorOpcion = opcion.dataset.opcion;
    // Llamar a la funcion para cambiar la opcion con descuento
    cambiarOpcionDescuento(valorOpcion);
  });
});

function cambiarOpcionDescuento(valor) {
  // Cambia la opcion seleccionada al valor deseado
  select.value = valor;
  // Para disparar evento "change" en el select
  select.dispatchEvent(new Event("change"));
}

const resumenBtn = document.querySelector("#resumen");
resumenBtn.addEventListener("click", calcularResumen);

function calcularResumen(event) {
  event.preventDefault();

  var inputCantidad = document.querySelector("#input-cantidad");
  var cantidad = inputCantidad.value;
  var opcion = select.value;
  var descuento;

  switch (opcion) {
    case "1":
      descuento = 0.2;
      break;
    case "2":
      descuento = 0.5;
      break;
    case "3":
      descuento = 0.85;
      break;
    default:
      descuento = 1;
      break;
  }

  valorTotalTickets = valorTicket * descuento * cantidad;
  
  document.querySelector("#total").innerHTML =
    "Total a Pagar: $" + valorTotalTickets;
}
