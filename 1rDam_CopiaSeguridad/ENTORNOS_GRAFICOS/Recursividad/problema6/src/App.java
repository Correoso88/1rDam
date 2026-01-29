public class App {
    public static int comptar7 (int n){
        if(n<10){
            if(n==7){
                return 1;
            }else{
                return 0;
            }
        }
        if(n%10==7){
            return 1+comptar7(n/10);
        }else{
            return comptar7(n/10);
        }
    }
    public static void main(String[] args) throws Exception {
        System.out.println(comptar7(77123));
    }
}
