package es.cide.programacion;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Imprime el primer numero");
        int valor1=sc.nextInt();
        System.out.println("Imprime el segundo numero");
        int valor2=sc.nextInt();
        Calculadora miCasio=new Calculadora(valor1,valor2);
        double resultado;
        System.out.println("Elige del 1 al 4");
        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Multiplicar");
        System.out.println("4.Dividir");
        int elige=sc.nextInt();
        switch (elige) {
            case 1:
                resultado=miCasio.sumar();
                System.out.println(resultado);
                break;
            case 2:
                resultado=miCasio.resta();
                System.out.println(resultado);
                break;
            case 3:
                resultado=miCasio.multiplicacion();
                System.out.println(resultado);
                break;
            case 4:
                resultado=miCasio.dividir();
                System.out.println(resultado);
                break;
        
            default:
                break;
        }
        
        miCasio.setOperando1(300);
        
        
        

        
    }
}