import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int[] digit = new int[p];
        if(digit.length !=0){
            for(int i=0;i < digit.length;i++){
                digit[i] = sc.nextInt();
            }
            for(int i=digit.length-1;i<digit.length;i--){
                System.out.print(digit[i]+"");
            }
        }
    }
}
