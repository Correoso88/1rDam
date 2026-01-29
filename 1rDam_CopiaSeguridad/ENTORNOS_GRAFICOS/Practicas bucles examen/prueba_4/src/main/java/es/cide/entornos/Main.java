package es.cide.entornos;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int a,b,j;
       System.out.println("Escribe dos numeros separados por esapcios");
       a=sc.nextInt();
       int i=0;
       b=sc.nextInt();
       if(b>i){
       for(i=a;i<b;i++){
            System.out.print(i+",");
        }
        }
        else if(b==a){
            System.out.println(a);
        }
        
       
    }
}