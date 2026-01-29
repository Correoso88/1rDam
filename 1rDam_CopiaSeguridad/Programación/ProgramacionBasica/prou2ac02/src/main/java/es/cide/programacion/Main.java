package es.cide.programacion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Escriu un programa en Java que demani a l’usuari un número enter positiu.
        // El programa ha de calcular la suma de tots els números parells des de 1 fins
        // al número introduït utilitzant un bucle while.
        System.out.println("Introduce un entero positivo");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i = 0;
        int acumulador = 0;
        while (i <= a) {
            System.out.println(i);
            if (i % 2 == 0) {
                acumulador = i + acumulador;
            }
            i = i + 1;
        }
        System.out.println(acumulador);
    }
}