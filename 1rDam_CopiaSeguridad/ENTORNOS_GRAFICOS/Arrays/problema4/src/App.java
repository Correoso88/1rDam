import java.util.Scanner;
import java.util.Arrays;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String palabras[] = new String[n];
        int cont = 0;
        for(int i = 0; i<n;i++){
            palabras[i]=sc.nextLine();
        }
        Arrays.sort(palabras);

        for(int j = 0;j<n;j++){
            System.out.println(palabras[j]);
        }
        

        sc.close();
    }
}
