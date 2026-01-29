package es.cide.programacion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //Fes un programa en Java que demani a l’usuari introduir les notes
        //(valors enters de 0 a 10) de 6 alumnes i les guardi en un array.
        //Un cop introduïdes totes les notes, utilitza un bucle while per recórrer l’array i:
        System.out.println("Introduce las notas de los alumnos(0-10)");
        int[] notas = {11,11,11,11,11,11};
        int i =0;
        int aprovados = 0;
        int suspendidos = 0;
        while (i<6) {
            System.out.println("Notas:");
            notas[i]=sc.nextInt();
            i++;
        }
        i=0;
        while (i<6){
            if(notas[i] >=5){
                aprovados++;
            }
            else{
                suspendidos++;
            }
            i=i+1;
        }
        System.out.println("aprovados = "+aprovados);
        System.out.println("suspendidos = "+suspendidos);
        sc.close();
    }
}