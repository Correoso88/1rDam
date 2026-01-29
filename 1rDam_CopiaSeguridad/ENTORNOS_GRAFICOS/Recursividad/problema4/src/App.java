public class App{
    public static int s (int n){
        if(n < 10){
            return n;
        }
        return s(n/10) + (n%10);
    }
    public static boolean esPrimoidivisor (int n,int divisor){
        if(divisor==n-1){
            return true;
        }
        if(n%divisor==0){
            return false;
        }
        return esPrimoidivisor(n,divisor+1);
    }
    public static boolean esPrimo(int n){
        if(n==1){
            return false;
        }else{
            return esPrimoidivisor(n, 2);    
        }
        
    }
    public static boolean esPirmoPerfect (int n){
        if(!esPrimo(s(n))){
            return false;
        }else{
            return esPrimo(s(n));
        }
    }



    public static void main(String[] args) throws Exception {
        if (esPrimoidivisor(1,2)) {
            System.out.println("SI");
        }else{System.out.println("NO");}
    }
}
