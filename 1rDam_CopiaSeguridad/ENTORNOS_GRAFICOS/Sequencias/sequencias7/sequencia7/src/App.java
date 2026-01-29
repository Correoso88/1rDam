import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int s;
        int res=0;

        while(sc.hasNextInt()){
            s=sc.nextInt();
            if(s%2==0){
                res=res+s;
            }else{
                res=res-s;
            }
        }
        System.out.println(res);
    }
}
