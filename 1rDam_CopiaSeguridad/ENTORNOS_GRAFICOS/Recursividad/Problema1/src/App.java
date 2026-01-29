public class App{
    public static int rec (int n){
        if(n/10==0){
            return 1;
        }
        return rec (n/10)+1;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(rec(55552352));
    }
}
