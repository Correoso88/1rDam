let tamaño = 16;
function augmentarMida(){
    tamaño+=4;
    let paragrafo = document.getElementById("paragraf").style.fontSize = (tamaño + "px");
}
function disminuirMida(){
    tamaño-=4;
    let paragrafo = document.getElementById("paragraf").style.fontSize = (tamaño + "px");
}
function canviarColor(){
    let chgcolor = document.getElementById("paragraf").style.color = "blue";

}
function afegirParagraf(){
    let paragrafonuevo = prompt("Pon un paragrafo nuevo");
    const contenedor = document.getElementById("contenidor");
    let nuevoparrafo = document.createElement("p");
    
    contenedor.appendChild(nuevoparrafo);
}
function eliminarParagraf(){

}