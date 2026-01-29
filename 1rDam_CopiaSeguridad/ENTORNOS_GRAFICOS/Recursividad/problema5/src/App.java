public class App{
    public static int orellesConills (int n){
        if(n==0){
            return 0;
        }
        if(n%2==0){
            return 3 + orellesConills(n-1);
        }else{
            return 2 + orellesConills(n-1);
        }
    }
    public static void main(String[] args) throws Exception {
        System.out.println(orellesConills(1));
    }
}
