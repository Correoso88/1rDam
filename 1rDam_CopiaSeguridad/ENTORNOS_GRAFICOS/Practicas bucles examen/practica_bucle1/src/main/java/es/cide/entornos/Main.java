package es.cide.entornos;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Escribe un texto");
        boolean activo=true;
        int a=0,A=0;
        while(activo){
        String texto=sc.nextLine().toLowerCase().toUpperCase();
        
        for(int i=0;i<texto.length();i++){
            char v=texto.charAt(i);
            switch (v) {
                case 'a':
                    a=a+1;
                    break;
                case 'A':
                    A=A+1;
                    break;
                case '.':
                    activo=false;
                    sc.close();
                    break;
            }

        }
        }
        System.out.println("Hay "+(a+A)+" a en total");
        sc.close();
    }
}