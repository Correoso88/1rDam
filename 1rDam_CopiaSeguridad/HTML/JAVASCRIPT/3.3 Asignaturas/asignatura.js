const asignaturas1 = ["Llenguatges", "Sistemas","Programacion"];
const asignaturas2 = ["Sistemas de Gestión","Interficies","Programacion Multimedia"];
const DAM = [asignaturas1,asignaturas2];

console.log("Primer: ",asignaturas1);
console.log("Segon: ",asignaturas2);
console.log("DAM: ",DAM);
    
document.getElementById("btn-add").onclick = meterassignatura;
document.getElementById("btn-rem").onclick = quitarassignatura;
document.getElementById("btn-search").onclick = buscarassignatura; 

function meterassignatura(){ //Creo una funcion para meter en el primer año una asignatura nueva
    let nuevaAsignatura = prompt("Introduce una nueva asignatura");
    asignaturas1.push(nuevaAsignatura);
    const d = Date().toLocalString();
    console.log("Primer: ",asignaturas1, "Fecha: ",d);
    
}

delete asignaturas2[1];
console.log("Segon: ",asignaturas2);




meterassignatura(); //Uso la funcion
let assigCogida = prompt("Escoge una assignatura valida");

for(let i=0;i>asignaturas1.length;i++){
    if(assigCogida.toUpperCase() == DAM[i]){
        assigCogida == DAM[i]
        delete DAM[i];
    }
}



//Funcion para quitar una assignatura
function quitarassignatura(){
    let del = prompt('Que asignatura quieres eliminar');
    if (!del) return; 
    
    let encontrada = false;
    let minusculas = del.toLowerCase();

    for(let i = 0; i < asignaturasPrimero.length; i++){
        if(minusculas == assignaturasPrimero[i].toLowerCase()){
            asignaturasPrimero.splice(i, 1);
            encontrada = true;
            break;
        }
    }

    if (!encontrada) {
        for(let j = 0; j < asignaturas2.length; j++){
            if(minusculas == asignaturas2[j].toLowerCase()){
                asignaturas2.splice(j, 1);
                encontrada = true;
                break;
            }
        }
    }

    if (encontrada) {
        alert('Asignatura Eliminada');
    } else {
        alert('No hay esta la assignatura');
    }
}


//Funcion para buscar asignatura
function buscarassignatura(){
    let search = prompt('Que asignatura quieres eliiminar');
    if (!search) return;
    let minusculas = search.toLowerCase();
    let donde = ""; //Creo una variable para dependiendo de que año sea, que lo diga al fina

    // Miro el array de primero
    for(let i = 0; i < asignaturas1.length; i++){
        if(minusculas == asignaturas1[i].toLowerCase()){
            donde ="Primer año";
        }
    }

    // Miro el array de segundp
    for(var j = 0; j < asignaturas2.length; j++){
        if(minusculas == asignaturas2[j].toLowerCase()){
            donde ="Segundo año";
        }
    }

    // Resultado final
    if(donde !== ""){
        alert('Esta asignatura se encuentra en ' + donde);
    } else {
        alert('Esta asignatura no existe');
    }
}

console.log(DAM);