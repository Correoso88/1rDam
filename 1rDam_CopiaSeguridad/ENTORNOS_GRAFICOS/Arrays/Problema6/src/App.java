import java.util.Scanner;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int v[] = new int[sc.nextInt()];
        int sum = 0 ;
        boolean buscar = true;
        int J=0;
        for(int i = 0;i < v.length;i++){
            v[i] = sc.nextInt();
            sum = sum + v[i];
        }

        while(buscar==false && J <v.length){
            if(sum - v[J] == v[J]){
                buscar=true;
            }else{
                buscar=false;
            }
            J++;
        }

        if(buscar){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

        sc.close();
    }
}
