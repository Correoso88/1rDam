const asignaturas1 = ["Llenguatges", "Sistemas","Programacion"];
const asignaturas2 = ["Sistemas de Gestión","Interficies","Programacion Multimedia"];
const DAM = [asignaturas1,asignaturas2];

console.log("Primer: ",asignaturas1);
console.log("Segon: ",asignaturas2);
console.log("DAM: ",DAM);


function meterassignatura(){ //Creo una funcion para meter en el primer año una asignatura nueva
    let nuevaAsignatura = prompt("Introduce una nueva asignatura");
    asignaturas1.push(nuevaAsignatura);
    const d = Date();
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
console.log(DAM);