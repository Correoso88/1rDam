public class App {
    public static int min(int a, int b){
        if(a<=b){
            return a;
        }else{
            return b;
        }
    }
    public static int petit(int n) {
        if(n<10){
            return n;
        }else{
            return 10*petit(n/10) + min(n%10, petit(n/10)%10);
        }
    }
    public static void main(String[] args) throws Exception {
        System.out.println(petit(6354));
    }
}
