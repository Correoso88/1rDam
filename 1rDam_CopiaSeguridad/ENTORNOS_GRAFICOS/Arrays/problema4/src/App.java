import java.util.Scanner;
import java.util.Arrays;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int v[] = new int[n];
        int cont = 0;
        for(int i = 0; i<n;i++){
            v[i]=sc.nextInt();
        }
        Arrays.sort(v);

        int buscado = v[0];
        int count = 0;
        for(int j=0; j<n;j++){
            if(v[j] == cont){
                count++;
            }
        }
        

        sc.close();
    }
}
