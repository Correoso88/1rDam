import java.util.Scanner;
public class App{
    public static boolean isincreasing (int n){
        if(n<10){
            return true;
        }else{
            return((n%10)<=(n/10)%10) && isincreasing(n/10);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(isincreasing(n)){
            System.out.println("Si");
        }else{
            System.out.println("No");
        }
    }
}
//  33/10
//  3  3