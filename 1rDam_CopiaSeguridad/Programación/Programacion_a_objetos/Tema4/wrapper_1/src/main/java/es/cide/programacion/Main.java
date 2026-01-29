package es.cide.programacion;

public class Main {
    public static void main(String[] args) {
        //Declara quatre variables de tipus String que representin:
        
        //Un nombre enter positiu (exemple: "45")
        String a = "45";
        //Un nombre decimal (exemple: "3.5")
        String b ="3.5";
        //Un valor booleà ("true" o "false")
        String c = "true";
        //Un caràcter (exemple: "A")
        String d = "A";

        //Utilitza els Wrappers corresponents per convertir aquestes cadenes en els seus tipus adequats:
        int a1 = Integer.parseInt(a);
        double b1 = Double.parseDouble(b);
        boolean c1 = Boolean.parseBoolean(c);
        char d1 =d.charAt(0);
        
        double res = a1 + b1; 
        int d2 = (int) d1;
 
        System.out.println("Valor original entero: "+ a);
        System.out.println("Valor original double: "+ b);
        System.out.println("Valor original booleano: "+ c);
        System.out.println("Valor original char: "+ d);
        System.out.println("");
        System.out.println("Valor wrapper entero: "+ a1);
        System.out.println("Valor wrapper double: "+ b1);
        System.out.println("Valor wrapper booleano: "+ c1);
        System.out.println("Valor wrapper char: "+ d1);
        System.out.println("");
        System.out.println("Resultado suma de entero y double: "+ res);
        System.out.println("Valor character convertido a ASCII: "+ d2);

    }
}