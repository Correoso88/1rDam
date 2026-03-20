import java.util.Scanner;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int v[] = new int[sc.nextInt()];
        int sum = 0 ;
        boolean buscar = true;
        for(int j = 0;j < v.length;j++){
            v[j] = sc.nextInt();
        }
        for(int i = 0;i < v.length;i++){
            sum = sum + v[i];
        }
        for(int k = 0;k < v.length;k++){
            if(sum - v[k] == v[k]){
                buscar=true;
            }else{
                buscar=false;
            }
        }
        if(buscar){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

        sc.close();
    }
}
