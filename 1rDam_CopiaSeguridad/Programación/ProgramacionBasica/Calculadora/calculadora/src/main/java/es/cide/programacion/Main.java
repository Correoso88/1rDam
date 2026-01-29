//DNI: 45190261E
//Nom: Hugo Correoso Caparros
//Fecha 13/10/2025
package es.cide.programacion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //Primero de todo inicio las variables, la a y b seran los numeros enteros que se van a operar, la i es para el contador del while y op(operacion) es para si es suma, resta, multiplicacion o division
        double a,b;
        int i = 0;
        int op;
        while(i<1){ //Creo un bucle que siempre se ejecute indicando que si i(contador) es menor que uno se siga ejecutando. Gracias a esto pordre salir del bucle si le indico en el caso 5 que sume 1++
        //indico el menu de la calculadora
            System.out.println("-----MENU-----");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");                
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Escoge entre 1 o 5");
            op =sc.nextInt(); //Con la op le indico que operacion escoger
             switch (op) {
            case 1: //Indico que ponga dos numeros para sumar
            System.out.println("Escoge dos numeros");
            a =sc.nextInt();
            b =sc.nextInt();
                System.out.println("Resultat = "+ (a+b));
                break;
            case 2: //Indico que ponga dos numeros para restar
            System.out.println("Escoge dos numeros");
            a =sc.nextInt();
            b =sc.nextInt();
                System.out.println("Resultat = "+(a-b));
                break;
            case 3: //Indico que ponga dos numeros para multiplicar
            System.out.println("Escoge dos numeros");
            a =sc.nextInt();
            b =sc.nextInt();
                System.out.println("Resultat = "+(a*b));
                break;
            case 4://Indico que ponga dos numeros para dividir
            System.out.println("Escoge dos numeros");
            a =sc.nextInt();
            b =sc.nextInt();
            if(a==0||b==0){
                while(a==0||b==0){ //En este caso como no se puede dividir entre 0, pongo un if y un while para que si uno de los numeros es 0 que vuelva a poner los numeros y cuando ninguno sea 0 q haga unda divison
                    System.out.println("Introduce dos numero que no sea igual a 0");
                    a =sc.nextInt();
                    b =sc.nextInt();
                }
                System.out.println("Resultat = "+(a/b));
                break;
            }
            else{
                System.out.println("Resultat = "+(a/b));
                break;
            }
            case 5: //En este caso le pongo el i++ para salir del bucle
                System.out.println("Gracias por usar esta calculadora");
                i++;
            break;
            default: //Si el numero indicado no es 1, 2, 3, 4, o 5 que pogna error y repita el bucle
            System.out.println("Error");
            }
            
        }
           
        }
        
    }