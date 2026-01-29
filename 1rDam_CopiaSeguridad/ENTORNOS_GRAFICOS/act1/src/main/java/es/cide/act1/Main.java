package es.cide.act1;

import java.util.Scanner;
//Ejercicio 1
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String nom1 = sc.next();
        String nom2 = sc.next();
       
        if(nom1.compareTo(nom2) < 0){
            System.out.println(nom1 + " < " + nom2);
       }
        else if(nom1.compareTo(nom2) > 0){
            System.out.println(nom1 + " > " + nom2);
       }
        else System.out.println(nom1 + " = " +nom2);
       


    }
}