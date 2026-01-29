package es.cide.entornos;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        boolean encontrado=false;
        while(a!=0){
           if(a%2==0 && a!=0){
            encontrado=true;
           }
           a =sc.nextInt();
        }
        if(encontrado){
            System.out.println("Si");
        }
        else{
            System.out.println("No");
        }
    }
}