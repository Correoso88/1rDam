public class App{
    public static int sumnum (int n){
        if(n/10==0){
            return n;
        }
        return sumnum((n%10) + sumnum(n/10));
    }

    public static void main(String[] args) throws Exception {
        System.out.println(sumnum(2));
    }
}
