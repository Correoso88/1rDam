package es.cide.entornos;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        int cont=0;
        boolean salir=false;
        while(!salir){
            s = sc.next();
            if(s.equals("(")){
              cont++;
            }
            else if(s.equals(")")){
              cont--;  
            }
            if(cont<0){
                salir=true;
            }
        }
        if(cont==0){
            System.out.println("Si");
        }else{
            System.out.println("No");
        }
       
    }
}