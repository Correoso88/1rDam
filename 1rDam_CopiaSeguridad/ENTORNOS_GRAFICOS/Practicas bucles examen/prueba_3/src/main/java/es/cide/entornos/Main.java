package es.cide.entornos;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double pi=3.14;
            System.out.println("¿Cuantas figuras quieres tener?");
            int descripciones=sc.nextInt();
        for(int i=0;descripciones>i;i++){
            String figura=sc.next();
            if(figura.equals("rectangulo")){
                double a=sc.nextDouble();
                double b=sc.nextInt();
                System.out.println(+(b*a));
            }
            else if(figura.equals("circulo")){
                double r=sc.nextDouble();
                System.out.println(+pi*(Math.pow(r,2)));
            }
        }  
    }
}