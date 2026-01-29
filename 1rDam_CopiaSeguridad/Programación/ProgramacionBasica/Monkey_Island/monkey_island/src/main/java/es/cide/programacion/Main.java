//DNI:45190261E
//Hugo Correosos Caparros
package es.cide.programacion;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();
        System.out.println("Bienvenido pirata, las reglas del juego son simples. El mono pirata te insultara y te saldran tres opciones y una es la correcta. Seran 3 preguntas, si enciertas una tendras 2 puntos y si fallas te restaran un punto.Y cuidado marinero, porque si te quedas con 0 puntos te atacaran");//Descripccion del juego
        int puntos=2;
        int i=0;
        boolean salir=true;
        int insulto1=0;//Creo 5 variables contadores para que no se me repitan los insultos de los monos pirata
        int insulto2=0;
        int insulto3=0;
        int insulto4=0;
        int insulto5=0;
        String[] insultos={//Creo un arrays para guardar los insultos de los piratas
        "¡Llevarás mi espada como si fueras un pincho moruno!",
        "¡Luchas como un granjero!",
        "¡No hay palabras para describir lo asqueroso que eres!",
        "¡He hablado con simios más educados que tu!",
        "¡No pienso aguantar tu insolencia aquí sentado!"
        };
        String[] contenstacion_incorrectos={//Creo un arrays para guardar todos los insultos incorrectos
        "¡Tus palabras no son de un macho!",
        "Quería asegurarme de que estuvieras a gusto conmigo.",
        "¿Incluso antes de que huelan tu aliento?",
        "La única forma en la que te conservarás será disecado.",
        "Estaría acabado si la usases alguna vez.",
        
        };
        String[] contenstacion_incorrectos1={//Creo un arrays para guardar todos los insultos incorrectos
        "Con tu aliento, seguro que todos fueron asfixiados.",
        "Cuando acabe CONTIGO, serás un bistec con disentería.",
        "Tu solo olor me deja enfadado, agitado y enojado.",
        "Contigo alrededor, preferiría ser fumigado.",
        "Podré, si utilizas un espray contra tu mal aliento."
        };
        String[] contenstacion_correctos={//Creo un arrays para guardar todos los insultos correctos y pongo que si en el primer insulto del array de insultos es posicion 0, que la correcta sea en el array 0. Asi siempre habra una respuesta correcta coherente
        "Primero deberías dejar de usarla como un plumero.",
        "Qué apropiado, tú peleas como una vaca.",
        "Sí que las hay, sólo que nunca las has aprendido.",
        "Me alegra que asistieras a tu reunión familiar diaria.",
        "Ya te están fastidiando otra vez las almorranas, ¿Eh?"};
            System.out.println("Elige entre 3 o 5 rondas");
            int num_ronda=sc.nextInt(); //Eliges el numero de rondas
            while(num_ronda<3||num_ronda>5){ //Si no es entre 3 o 5 que lo vuelvas a repetir
                System.out.println("Elige entre 3 o 5 rondas");
                num_ronda=sc.nextInt(); 
                }
        for(i=0;num_ronda>i && salir ;i++){   //Minetras la cantidad de rondas que le pongas sea menor a una variable que se sume todo el rato, cuando la i llegue a la cantidad que le has puesto se acabara el bucle
            int posicion=aleatorio.nextInt(3)+1; //Para elegir la posicion
            int insulto_random=aleatorio.nextInt(5); //Elegir un insulto random
        while(insulto1==1 && insulto_random==0||insulto2==1 && insulto_random==1||insulto3==1 && insulto_random==2||insulto4==1 && insulto_random==3||insulto5==1 && insulto_random==4){//Voy sumando variables para que no me vuelva a repetir los mismos insultos y si se repite que vuelva a randomizar
            insulto_random=aleatorio.nextInt(5);//Con este numero randomizo los insultos y los insultos incorrectos y correctos
        }
        System.out.println(insultos[insulto_random]);
            if(posicion==1){//Si el numero random es 1 que sea en este orden
                System.out.println("1. "+contenstacion_correctos[insulto_random]);//Posicion correcta
                System.out.println("2. "+contenstacion_incorrectos1[insulto_random]);//Posicion incorrecta
                System.out.println("3. "+contenstacion_incorrectos[insulto_random]);//Posicion incorrecta
            }
            if(posicion==2){//Si el numero random es 2 que sea en este orden
                System.out.println("1. "+contenstacion_incorrectos1[insulto_random]);//Posicion incorrecta
                System.out.println("2. "+contenstacion_correctos[insulto_random]);//Posicion correcta
                System.out.println("3. "+contenstacion_incorrectos[insulto_random]);//Posicion incorrecta
            }
            if(posicion==3){//Si el numero random es 3 que sea en este orden
                System.out.println("1. "+contenstacion_incorrectos1[insulto_random]);//Posicion incorrecta
                System.out.println("2. "+contenstacion_incorrectos[insulto_random]);//Posicion incorrecta
                System.out.println("3. "+contenstacion_correctos[insulto_random]);//Posicion correcta
                
            }
        char eleccion = sc.next().charAt(0);
        //mirar si has introducido 1, 2, 3 o n. Si no, volver a repetirlo (bucle while)
        //si es n, sales
        //si es 1, 2 o 3 covniertes el char eleccion a numero y intento= a esta conversion
        while(eleccion=='1'||eleccion=='2'||eleccion=='3'||eleccion=='n' && salir){
            if(eleccion=='1'){
                eleccion=1;
            }
            else if(eleccion=='2'){
                eleccion=2;
            }
            else if(eleccion=='3'){
                eleccion=3;
            }
            else if(eleccion=='n'){
                System.out.println("Gracias por jugar");
                salir=false;
            }
        }
        if(eleccion==posicion){ //Si por ejemplo la posicion 1, la primera es la correcta, si el intento es == a la posicion, que indica la correcta. Que sume 2
            puntos=puntos+2;
            System.out.println("Es correcta");
            System.out.println("Tienes actualmente "+puntos+" puntos");
        }
        else{//En caso contrario que reste 1
            puntos=puntos-1;
           System.out.println("Incorrecta");
           System.out.println("Tienes actualmente "+puntos+" puntos");     
        }
        switch (insulto_random) {//Si el random de antes es por ejemplo 1, se sumara la variable del insulto1 y no podra volver a repetirse
            case 0:
                insulto1++; //Sumo 1 a la variable
                break;
            case 1:
                insulto2++;//Sumo 1 a la variable
                break;
            case 2:
                insulto3++;//Sumo 1 a la variable
                break;
            case 3:
                insulto4++;//Sumo 1 a la variable
                break;
            case 4:
                insulto5++;//Sumo 1 a la variable
                break;      
        } 
        }
        if(num_ronda==3){//Si has elegido 3 rondas
        if (puntos==8) {//Si tienes 8 puntos que imprima esto
            System.out.println("Eres el rey de los piratas");
        }
        else if(puntos<8 && puntos>2){//Si tienes entre 8 o 2 puntos que imprima esto
            System.out.println("Te has defendido como un buen marinero!");
        }
        else if(puntos==2){//si puntos es menor que 3 que imprima esto
            System.out.println("Los loros se rien de ti!");
        }
        }
        if(num_ronda==4){//Si has elegido 4 rondas
            if (puntos==10) {//Si tienes 10 puntos que imprima esto
            System.out.println("Eres el rey de los piratas");
        }
        else if(puntos>=6 && puntos<10){//Si tienes entre 10 y 6 puntos que imprima esto
            System.out.println("Te has defendido como un buen marinero!");
        }
        else if(puntos<6 && puntos>1){//Si tienes entre 6 y 1 puntos que imprima esto
            System.out.println("Los loros se rien de ti!");
        }
        }
        if(num_ronda==5){//Si has elegido 5 rondas
            if (puntos==12) {//Si puntos es 6 o 5 que imprima esto
            System.out.println("Eres el rey de los piratas");
        }
        else if(puntos>=6 && puntos<12){//si putnos es 4 o 3 que imprima esto
            System.out.println("Te has defendido como un buen marinero!");
        }
        else if(puntos<6 && puntos>1){//si puntos es menor que 3 que imprima esto
            System.out.println("Los loros se rien de ti!");
        }
        }
    }
} 
