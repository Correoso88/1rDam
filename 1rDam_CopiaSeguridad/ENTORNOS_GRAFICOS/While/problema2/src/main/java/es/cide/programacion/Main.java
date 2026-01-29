package es.cide.programacion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce si es suma, resta, inversion o aturar");
        String operacion = sc.nextLine();
        double a,b;
        while(sc.hasNext()){ //Siempre se va a ejecutar cuando haya Scanners
            if(operacion.equals("suma")){
                System.out.println("Introduce dos numeros");
                a = sc.nextDouble();
                b = sc.nextDouble();
                System.out.println(a+b);   
                break;
            }
            else if(operacion.equals("resta")){
                System.out.println("Introduce dos numeros");
                a = sc.nextDouble();
                b = sc.nextDouble();
                System.out.println(a -b);
                break;
            }
            else if(operacion.equals("inversion")){
                System.out.println("Introduce dos numeros");
                a = sc.nextDouble();
                b = sc.nextDouble();
                System.out.println(a*(-1));
                break;
            }
            else if(operacion.equals("aturar"))
                break;

            }
            sc.close();
        }
    }