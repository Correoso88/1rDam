const asignaturas1 = ["Llenguatges", "Sistemas","Programacion"];
const asignaturas2 = ["Sistemas de Gestión","Interficies","Programacion Multimedia"];
const DAM = [asignaturas1,asignaturas2];

console.log("Primer: ",asignaturas1);
console.log("Segon: ",asignaturas2);
console.log("DAM: ",DAM);

let nuevaAsignatura = prompt("Introduce una nueva asignatura");
asignaturas1.push(nuevaAsignatura);
console.log("Primer: ",asignaturas1);

delete asignaturas2[1];
console.log("Segon: ",asignaturas2);


