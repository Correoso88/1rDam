package es.cide.programacion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a,b;
        int i = 0;
        while(i<1){
                System.out.println("-----MENU----- 1. Sumar 2. Restar 3. Multiplicar 4. Dividir 5. Salir");
                System.out.println("Escoge entre 1 o 5");
            int op =sc.nextInt();
             switch (op) {
                
            case 1:
            System.out.println("Escoge dos numeros");
            a =sc.nextInt();
            b =sc.nextInt();
                System.out.println("Resultat = "+ (a+b));
                break;
            case 2:
            System.out.println("Escoge dos numeros");
            a =sc.nextInt();
            b =sc.nextInt();
                System.out.println("Resultat = "+(a-b));
                break;
            case 3:
            System.out.println("Escoge dos numeros");
            a =sc.nextInt();
            b =sc.nextInt();
                System.out.println("Resultat = "+(a*b));
                break;
            case 4:
            System.out.println("Escoge dos numeros");
            a =sc.nextInt();
            b =sc.nextInt();
            if(b==0){
                while(b==0){
                    System.out.println("Introduce un numero que no sea igual a 0");
                    b =sc.nextInt();
                }
                System.out.println("Resultat = "+(a/b));
                break;
            }
            else{
                System.out.println("Resultat = "+(a/b));
                break;
            }
            case 5:
                System.out.println("Gracias por usar esta calculadora");
                i++;
            break;
            default:
            System.out.println("Error");
            }
            
        }
           
        }
        
    }