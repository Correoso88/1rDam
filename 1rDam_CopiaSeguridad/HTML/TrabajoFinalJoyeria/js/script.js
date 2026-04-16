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
  }else{
    alert("Contraseña Correcta");
    sessionStorage.setItem("Usuario",inputUsuario.textContent);
    alert("Se ha iniciado sesion");
  }
}




function CerrarSesion(){
  alert("Adios "+ inputUsuario.value);
  sessionStorage.clear();
  
}

