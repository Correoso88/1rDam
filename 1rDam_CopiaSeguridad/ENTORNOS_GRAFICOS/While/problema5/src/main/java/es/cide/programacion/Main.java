package es.cide.programacion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int b=2;
        System.out.println("Escribe un numero");
        n=sc.nextInt();
        boolean es_primer=(n!=1);
        while (n>b && es_primer){
            int res=n%b;
            b++;
            if(res==0){
                es_primer=false;   
            } 
            }
            if(es_primer){
                System.out.println("es un numero primo");
            }
            else{
                
                System.out.println("No es un numero primo");
        }
    }
}