package es.cide.programacion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char vocal = sc.next().charAt(0);
        //iniciamos la variable y indicamos que cada vocal es un caso 
        switch (vocal) {
            case 'a':
                System.out.println("es una vocal");
                break;
            case 'e':
                System.out.println("es una vocal");
                break;
            case 'i':
                System.out.println("es una vocal");
                break;
            case 'o':
                System.out.println("es una vocal");
                break;
            case 'u':
                System.out.println("es una vocal");
                break;
        
            default:
                System.out.println("Es una consonante");
        }

        sc.close();
    }
}