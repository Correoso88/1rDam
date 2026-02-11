const nota1= Number(prompt("Nota1"));
const nota2= Number(prompt("Nota2"));
const nota3= Number(prompt("Nota3"));
let media = (nota1+nota2+nota3)/3;
alert(media);
if(media<=5){
    console.log("Suspes");
}else if(media>=5 && media<=7){
    console.log("Aprovat");
}else if(media>=7 && media<=9){
    console.log("Notable");
}else if(media==10){
    console.log("Excelent");
}
