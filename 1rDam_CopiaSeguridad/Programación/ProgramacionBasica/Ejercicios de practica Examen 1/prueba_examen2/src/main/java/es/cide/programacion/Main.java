package es.cide.programacion;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num[]={99,99,99,99,99,99,99,99,99,99};
        int i=0;
        int media=0;
        int acu_par=0;
        int acu_imp=0;
        int maximo=0;
        System.out.println("Escoja 10 numeros");
        while(i<=9){
            num[i]=sc.nextInt();
            i++;
        }
        i=0;
        while(i<=9){
            media=media+num[i];
            i++;
        }
        System.out.println("La media total es= "+media/10);
        i=0;
        while(i<=9){
            if(num[i]%2==0){
                acu_par++;
            }else{
                acu_imp++;
            }
            i++;
        }
        i=0;
        System.out.println("Hay en total "+acu_par+" pares y "+acu_imp+" impares");
        while(i<=9){
           if(num[i]>maximo){
            maximo=num[i];
           }
           i++; 
        }
        i=0;
        int minimo=num[i];
        while(i<=9){d
            if(num[i]<=minimo){
            minimo=num[i];
           }
           i++;
        }
        System.out.println("Este es el numero maximo "+maximo);
        System.out.println("Este es el numero minimo "+minimo);
    }
}