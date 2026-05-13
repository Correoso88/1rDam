let inputUsuario = document.getElementById("Usuario");
let inputContraseña = document.getElementById("contrasenya");
let login = document.getElementById("login");
if (login != null) {
  login.addEventListener("submit", ValidarContraseña);
}


function ValidarContraseña(event) {
  event.preventDefault();
  const contrasenya = document.getElementById("contrasenya").value;
  const tieneMayus = contrasenya !== contrasenya.toLowerCase();
  const tieneMinus = contrasenya !== contrasenya.toUpperCase();
  let tieneNumero = false;

  for (let i = 0; i < contrasenya.length; i++) {
    if (!isNaN(contrasenya[i]) && contrasenya[i] !== " ") {
      tieneNumero = true;
    }
  }

  if (!tieneMayus) {
    alert("Falta una mayúscula");
  } else if (!tieneMinus) {
    alert("Falta una minúscula");
  } else if (!tieneNumero) {
    alert("Falta un número");
  } else {
    sessionStorage.setItem("Usuario", inputUsuario.value);
    alert("Se ha iniciado sesion");
    location.reload();
  }
}

function mostrarUsuario() {
  let Usuario = sessionStorage.getItem("Usuario");
  let ubiUsuario = document.getElementById("usuario");
  if (ubiUsuario && Usuario) {
    ubiUsuario.innerHTML = `
            <p>${Usuario}</p>
            <button onclick="CerrarSesion()"> Salir</button>
        `;
  }
}

window.addEventListener("DOMContentLoaded", mostrarUsuario);

function CerrarSesion() {
  let usuario = sessionStorage.getItem("Usuario");
  alert("Adiós " + usuario);
  sessionStorage.clear();
  location.reload();
}

async function cargarProductos() {
  const response = await fetch("Datos/datosProducto.json");
  const jsonData = await response.json();
  const listaProductos = document.getElementById("lista-productos");

  jsonData.productos.forEach((producto, i) => {
    listaProductos.innerHTML += `
        <article class="tarjeta-producto">
            <img src="img/${producto.foto}" alt="${producto.nombre}">
            <h3><a href="detalles.html?id=${i}">${producto.nombre}</a></h3>
            <p class="precio">${producto.precio}€</p>
            <button onclick="añadirCesta(${i})">Añadir a la cesta</button>
        </article>
    `;
  });
}
if (document.getElementById("lista-productos")) {
  cargarProductos();
}
async function cargarProductosIndex() {
  const response = await fetch("Datos/datosProducto.json");
  const jsonData = await response.json();
  const listaProductosIndice = document.getElementById("lista-productos-index");

  for (let i = 0; i < 3; i++) {
    const producto = jsonData.productos[i];
    listaProductosIndice.innerHTML += `
        <article class="tarjeta-producto">
            <img src="img/${producto.foto}" alt="${producto.nombre}">
            <h3><a href="detalles.html?id=${i}">${producto.nombre}</a></h3>
            <p class="precio">${producto.precio}€</p>
            <button onclick="añadirCesta(${i})">Añadir a la cesta</button>
        </article>
    `;
  }
}
if (document.getElementById("lista-productos-index")) {
  cargarProductosIndex();
}

async function cargarDetalle() {
  const ficha_producto = document.getElementById("ficha-producto");
  const id = new URLSearchParams(window.location.search).get("id");
  const response = await fetch("Datos/datosProducto.json");
  const jsonData = await response.json();
  const producto = jsonData.productos[id];
  ficha_producto.innerHTML = `
    <div class="imagen-detalle">
    <img src="img/${producto.foto}" alt="${producto.nombre}" width="50px">
      </div>
      <div>
      <h1>${producto.nombre}</h1>
      <p>Categoría: ${producto.categoria}</p>
      <p>${producto.descripcion}</p>
      <p>Precio: ${producto.precio}€</p>
      <button>Añadir a la cesta</button>
      </div>`;

}
if (document.getElementById("ficha-producto")){
  cargarDetalle()
}

function añadirCesta(i) {
  let cesta = JSON.parse(localStorage.getItem("cesta"));
  cesta.push(i);
  localStorage.setItem("cesta", JSON.stringify(cesta));
  alert("Producto añadido!");
}

async function cargarCesta() {
  const lista_cesta = document.getElementById("lista-cesta");
  const cesta = JSON.parse(localStorage.getItem("cesta"));
  const response = await fetch("Datos/datosProducto.json");
   const jsonData = await response.json();

  cesta.forEach(function(i){
    const producto = jsonData.productos[i];
    lista_cesta.innerHTML += `
      <article class="tarjeta-producto">
      <img src="img/${producto.foto}"alt="${producto.nombre}">
      <h3>${producto.nombre}</h3>
      <p class="precio">${producto.precio}€</p>
      <button onclick="eliminarCesta(${i})">Eliminar</button>
      </article>
        `;
  });
}
cargarCesta();
function eliminarCesta(i) {
  let cesta = JSON.parse(localStorage.getItem("cesta")) || [];
  for (let j = 0; j < cesta.length; j++) {
    if (cesta[j] === i) {
      /*El splice lo qe hace es localizar la posicion actual de la j, quitar la que tenga la misma posicion, y reordena la lista */
      cesta.splice(j, 1);
    }
  }
  localStorage.setItem("cesta", JSON.stringify(cesta));
  location.reload();
}
