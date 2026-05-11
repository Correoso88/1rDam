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
    alert("Contraseña Correcta");
    sessionStorage.setItem("Usuario", inputUsuario.textContent);
    alert("Se ha iniciado sesion");
  }
}

function CerrarSesion() {
  alert("Adios " + inputUsuario.value);
  sessionStorage.clear();
}
let jsonData;
async function cargarProductos() {
  const response = await fetch("Datos/datosProducto.json");
  const jsonData = await response.json();
  const contenedor = document.getElementById("lista-productos");

  jsonData.productos.forEach((producto, i) => {
    contenedor.innerHTML += `
        <article class="tarjeta-producto">
            <img src="img/${producto.foto}" alt="${producto.nombre}">
            <h3><a href="detalles.html?id=${i}">${producto.nombre}</a></h3>
            <p class="precio">${producto.precio}€</p>
            <button onclick="añadirCesta(${i})">Añadir a la cesta</button>
        </article>
    `;
  });
}
cargarProductos();

async function cargarDetalle() {
  const contenedor = document.getElementById("ficha-producto");

  const id = new URLSearchParams(window.location.search).get("id");
  const response = await fetch("Datos/datosProducto.json");
  const jsonData = await response.json();
  const producto = jsonData.productos[id];
  contenedor.innerHTML = `
        <div class="imagen-detalle">
          <img src="img/${producto.foto}" alt="${producto.nombre}">
        </div>
        <div>
          <h1>${producto.nombre}</h1>
          <p>Categoría: ${producto.categoria}</p>
          <p>${producto.descripcion}</p>
          <p>Precio: ${producto.precio}€</p>
          <button>Añadir a la cesta</button>
        </div>
    `;
}
cargarDetalle();

function añadirCesta(i) {
  let cesta = JSON.parse(localStorage.getItem("cesta")) || [];
  cesta.push(i);
  localStorage.setItem("cesta", JSON.stringify(cesta));
  alert("Producto añadido!");
}

async function cargarCesta() {
  const contenedor = document.getElementById("lista-cesta");
  if (!contenedor) return;

  const cesta = JSON.parse(localStorage.getItem("cesta")) || [];
  const response = await fetch("Datos/datosProducto.json");
  const jsonData = await response.json();

  cesta.forEach((i) => {
    const producto = jsonData.productos[i];
    contenedor.innerHTML += `
            <article class="tarjeta-producto">
                <img src="img/${producto.foto}" alt="${producto.nombre}">
                <h3>${producto.nombre}</h3>
                <p class="precio">${producto.precio}€</p>
                <button onclick="eliminarCesta(${i})">Eliminar</button>
            </article>
        `;
  });
}

function eliminarCesta(i) {
  let cesta = JSON.parse(localStorage.getItem("cesta")) || [];
  cesta = cesta.filter(item => item !== i);
  localStorage.setItem("cesta", JSON.stringify(cesta));
  location.reload();
}

cargarCesta();