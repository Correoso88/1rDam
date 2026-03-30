import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String nom , operacion;
        boolean end = false;
        while(!end){
            nom=sc.next();
            if(nom.equals("end")){
                end=true;
            }else{
                operacion = sc.next();
                if(operacion.equals("enters")){

                }else if(operacion.equals("leaves")){

                }
            }
        }
        
    }
}
