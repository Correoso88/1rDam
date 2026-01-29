package es.cide.entornos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String p1 = sc.next();
        String p2 = sc.next();
        int contador = 0;
        int max = 0;
        boolean seguida = false;
        while (!p2.equals(".")) {
            if (p1.equals(p2)) {
                seguida = true;
            }
            if (p2.equals(p2) && seguida) {
                contador++;
                if (contador > max) {
                    max = contador;
                }
            } else {
                contador = 0;
            }

            seguida = false;
            p2 = sc.next();
        }
        System.out.println(max);
    }
}