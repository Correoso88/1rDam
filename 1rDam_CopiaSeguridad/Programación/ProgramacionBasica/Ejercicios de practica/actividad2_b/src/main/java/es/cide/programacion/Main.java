package es.cide.programacion;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
       //si el numero es divisible entre 2 es par
        if (a%2 == 0){
        System.out.println("El numero es par");
        }
        //Si no es divisible entre 2 es impar
        else {
        System.out.println("El numero es impar");
        }

        sc.close();
    }
}