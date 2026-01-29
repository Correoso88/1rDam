package es.cide.entornos;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Escribe una cordenada con 'n','s' o 'e' 'w' ");
        boolean activo=true;
        int x = 0 , y = 0;

        while(activo){
            String cordenada =sc.nextLine();
            for(int i=0;i<cordenada.length();i++){
            if(cordenada.charAt(i)=='n'){
                y=y-1;
            }
            else if(cordenada.charAt(i)=='x'){
                y=y+1;
            }
            else if(cordenada.charAt(i)=='e'){
                x=x+1;
            }
            else if(cordenada.charAt(i)=='w'){
                x=x-1;
            }
            else if(cordenada.charAt(i)=='.'){
                activo=false;
                sc.close();
            }
            }
        }
        System.out.println("(" + x + "," + y + ")");
    }
}