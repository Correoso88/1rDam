import java.util.*;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        TreeMap<Integer, Integer> m = new TreeMap<>();
        int totalSum = 0;
        int totalElemen = 0;
        boolean terminar = false;
        String op;
        int n;

        while(!terminar){
            op = sc.next();
            if(op.equals("number")){
                n = sc.nextInt();
                if(m.containsKey(n)){
                    m.put(n, m.get(n)+1);
                }else{
                    m.put(n, 1);
                }
                
            }else if(op.equals("delete")){
                int peq = m.firstKey();
                int ocurrpeq = m.get(peq);
                if(ocurrpeq==1){
                    m.remove(peq);
                }else{
                    m.put(peq, m.get(peq)-1);
                }
            }
        }
    }
}
