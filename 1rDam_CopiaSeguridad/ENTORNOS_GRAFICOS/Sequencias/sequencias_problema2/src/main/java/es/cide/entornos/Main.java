package es.cide.entornos;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d =sc.nextInt();
        int n =sc.nextInt();
        boolean encontrado = false;
        while(encontrado==false && n>0){
            
            if(d==n%10){
                encontrado=true;
                n=n/10;
            }
            
        }
        if(!encontrado){
            System.out.println("No");
        }
        else{
            System.out.println("Si");
        }
    }
}