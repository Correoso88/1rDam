public class App {
    public static String xpory(String x){
        if(x.length()==0){
            return x;
        }else{
            if(x.charAt(0)=='x'){
                return "y" + xpory(x.substring(1));
            }else{
                return x.charAt(0) + xpory(x.substring(1));
            }
        }
    }
    public static void main(String[] args) throws Exception {
        System.out.println(xpory("xxxxxx"));
    }
}
