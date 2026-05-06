let inputUsuario = document.getElementById("Usuario");
let inputContraseña = document.getElementById("contrasenya");
let login = document.getElementById("login");
login.addEventListener("submit", ValidarContraseña);

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
async function carregarProductos() {
  try {
    // Carrega el fitxer JSON
    const response = await fetch("Datos/datosProducto.json");
    // Transforma el contingut JSON en un objecte JavaScript
    // i el guarda a la constant jsonData
    jsonData = await response.json();
    // Mostra les dades carregades
    carregarProductos();
    jsonData.productos.forEach((producto) => {
      console.log(producto.nombre);
    });
  } catch (error) {
    console.error("Error carregant el json:", error);
  }
}
