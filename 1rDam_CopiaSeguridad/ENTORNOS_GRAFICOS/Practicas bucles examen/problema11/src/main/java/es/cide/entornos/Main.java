package es.cide.entornos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean trobat=false;
        while(sc.hasNext() && !trobat){
            if(sc.hasNextInt()){
                int n =sc.nextInt();
                int miinStamps =n;
                int bestP=0, bestQ=0;

                for(int p=0;p<=n/7;p++){
                    int remaining = n-7*p;
                    if(remaining%4==0){
                        int q=remaining/4;
                        if(p+q<miinStamps){
                            miinStamps=p+q;
                            bestP=p+q;
                            bestP=p;
                            bestQ=q;
                        }
                    }
                }
            }
        }
        
     //   System.out.println(p);
       // System.out.println(q);

    }
}