import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer[] > map = new TreeMap<>();
        boolean acabar = false;
        String j1;
        String j2;
        String name;
        while(!acabar){
            String op = sc.next();
            if(op.equals("acabar")){
                acabar = true;
            }else{
                name = sc.next();
            if(!map.containsKey(name)){
                map.put(name, new Integer[]1, 1200);
            }else{
                map.get(name)[0] = 1;
            }
            
        }
        else if(op.equals("LOGOUT")){
            if(map.containsKey(name)){
                map.get(name)[0]=0;
            }
            
        }else if(op.equals("PLAY")){
            j1 = sc.next();
            j2 = sc.next();
            if(!map.containsKey(j1) || !map.containsKey(j2) || map.get(j1)[0]!=1 || map.get(j2)[0]!=1){
                System.out.println("Player(s) not connected");
            }
        }else{
            map.get(j1)[1] +=10;
            map.get(j2)[1] -=10;

        }
        
            }
        }

    sc.close();
}
