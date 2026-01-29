package es.cide.programacion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Demana a l’usuari que introdueixi 6 números enters i desa’ls en un array.
        //Després, utilitza un while per mostrar els números en ordre invers al que s’han introduït.
        System.out.println("Pon 6 digitos");
        int[]array1={11,11,11,11,11,11};
        int i = 0;
        while(i<6){
            array1[i] = sc.nextInt();
            i++;
        }
        i = 5;
        while(i>0){
            System.out.println(array1[i]);
            i=i-1;
        }



    }
}