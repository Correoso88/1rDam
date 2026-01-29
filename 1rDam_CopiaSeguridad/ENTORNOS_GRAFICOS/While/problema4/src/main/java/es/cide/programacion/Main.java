package es.cide.programacion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        long i=0;
        System.out.println("Escribe un numero");
        a = sc.nextInt();
        while(a!=0){
            a=a/10;
            i++;


        }
        System.out.println(i);

    }
}