public class App {
    public static int countsi (String n){
        if(n.length()==0){
            return 0;
        }else{
            if(n.charAt(0)=='s' && n.charAt(1)=='i'){
                return 1+countsi(n.substring(1));
            }else{
                return countsi(n.substring(2));
            }
        }
    }
    public static void main(String[] args) throws Exception {
        System.out.println(countsi("asisdasdasidas"));
    }
}
