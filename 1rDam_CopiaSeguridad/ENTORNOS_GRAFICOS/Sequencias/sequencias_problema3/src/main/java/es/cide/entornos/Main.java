package es.cide.entornos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String input2 ="";
        boolean encontrado = true;
        while (encontrado) {
            input2 = sc.next();
            if (input2.equals(".")) {
                encontrado = false;
            } else if (input.compareTo(input2) <= 0) {
                encontrado = false;
            }

        }
        if (input2.equals(input)) {
            System.out.println("Si");
        } else {
            System.out.println("No");
        }
    }
}