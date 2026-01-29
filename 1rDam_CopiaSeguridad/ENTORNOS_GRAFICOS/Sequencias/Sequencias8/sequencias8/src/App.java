import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        boolean par = false;
        boolean salir = false;
        while(sc.hasNextInt() && !salir){
            s= sc.nextInt();
            if(s%2==0){
                par=true;
            }else{
                par=false;
            }
            if(par && (s%2==0)  || !par && (s%2 !=0)){
                salir=true;
            }
            
        }
    if(salir){
        System.out.println("No");
    }else{
        System.out.println("Yes");
    }
    }
}
