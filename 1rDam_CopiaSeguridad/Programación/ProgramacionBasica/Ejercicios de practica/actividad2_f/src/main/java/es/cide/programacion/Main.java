package es.cide.programacion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char operador = sc.next().charAt(0);
        int a = sc.nextInt();
        int b = sc.nextInt();
        switch (operador) {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            case '*':
                System.out.println(a*b);
                break;
        
            default:
                System.out.println("Fallo del sistema");
        }

        sc.close();
    }
}