public class App {
    public static int comptar8 (int n){
        if(n>10){
            if(n==8)
            return 1;
        }else{
            return 0;
        }
        if(n%10==8 && n/10==8){
            return 2+comptar8(n/10);
        }
        if(n%10==8){
            return 1+comptar8(n/10);
        }else{return comptar8(n);}
       
    }
    public static void main(String[] args) throws Exception {
        System.out.println(comptar8(75812885));
    }
}
