import java.util.Scanner;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        char[] arr = n.toCharArray();
        int j = arr.length-1;
        boolean palindromo = true;
        int i = 0;
        while(i<j && palindromo){
            if(arr[i] != arr[j]){
                palindromo = false;
            }

            ++i;
            --j;
        }
        System.out.println(palindromo);


    }
}
