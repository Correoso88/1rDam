package es.cide.programacion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Taula de multiplicar
        Scanner sc=new Scanner(System.in);
        System.out.println("Quina taula de multiplicar vols?");
        int taula = sc.nextInt();
        //El comptador servira per fer calculs
        //En lloc de 'i++'tambe es podria escriure 'i=i+1'.
        for(int i=0;i<=10;i++){
            int resultat=taula+i;
            System.out.println(resultat);
        }
        int num1,num2;
        try{
            num1=0;
            num2=62/num1;
            System.out.println("Final try");
        }catch(ArithmeticException e){
            //Imprimeix per consola el missatge de error
            e.printStackTrace();
            System.out.println("Error: No se puede dividir entre 0");
        }finally{
            System.out.println("Bloc finally");
        }
    }
}