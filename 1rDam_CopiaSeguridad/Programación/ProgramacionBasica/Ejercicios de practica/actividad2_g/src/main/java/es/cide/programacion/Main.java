package es.cide.programacion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String contraseña = sc.next();
        System.out.println("Pon la contraseña");
       switch (contraseña) {
        case"java123":
            System.out.println("acceso permitido");
            break;
       
        default:
            System.out.println("acceso denegado");
       }
        sc.close();
    }
}