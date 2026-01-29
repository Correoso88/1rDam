package es.cide.entornos;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int p=sc.nextInt();
        boolean encontrado=false;
        boolean insertado=false;
        int s;
        while(sc.hasNextInt()){
            s=sc.nextInt();
            if(p>=s){
                System.out.print(s +" ");
            }
            else if(s>=p && !encontrado){ 
                System.out.print(p);
                encontrado = true;
                insertado = true;
            }
            else{
                System.out.print(" "+s);
            }
        }
    }
}