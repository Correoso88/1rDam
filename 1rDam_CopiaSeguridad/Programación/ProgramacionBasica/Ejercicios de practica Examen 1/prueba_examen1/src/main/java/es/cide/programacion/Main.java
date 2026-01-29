package es.cide.programacion;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();
        int num =aleatorio.nextInt(51);//Creo un numero random del 0 al 51
        while(num==0){//Si da cero el numero random que se repita hasta que no sea 0
            num =aleatorio.nextInt(51);
        }
        System.out.println("JUEGO DE LAS ADIVINANZAS");
        System.out.println("Adivina un numero del 1 al 50");
        System.out.println("Solo tendras 6 intentos, mucha suerte");
        for(int i=0;i<6;i++){ //Creo el for para indicarle que hara 6 veces el bucle
            int intento=sc.nextInt();
            if(num==intento){ //Si el numero es igual que el del randomizador, saldra del bucle
                System.out.println("¡Lo has adivinado!");
                i=i+50;
            }
            else if(num<intento){//Si el nuemro randomizado es mas pequeño que el del intento que te lo diga
                System.out.println("El numero es mas pequeño");
            }
            else if(num>intento){//Si el nuemro randomizado es mas grande que el del intento que te lo diga
                System.out.println("El numero es mas grande");
            }
        }
    }
}