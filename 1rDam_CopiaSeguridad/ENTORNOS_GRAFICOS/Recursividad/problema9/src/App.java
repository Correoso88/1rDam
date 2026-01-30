public class App {
    public static int countd (String n){
        if(n.length()==0){
            return 0;
        }else{
            if(n.charAt(0)=='d'){
                return 1+countd(n.substring(1));
            }else{
                return countd(n.substring(1));
            }
        }
        
    }
    public static void main(String[] args) throws Exception {
        System.out.println(countd("dsdawdsadwad"));
    }
}
