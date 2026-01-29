package es.cide.programacion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int x,y,i;
        int res=0;
        i=0;
        System.out.println("Escribe dos numeros");
        x =sc.nextInt();
        y =sc.nextInt();
        while(i!=y){
            res=res+x;
            i++;
        }
        System.out.println(res);
    
    
    
    }

}