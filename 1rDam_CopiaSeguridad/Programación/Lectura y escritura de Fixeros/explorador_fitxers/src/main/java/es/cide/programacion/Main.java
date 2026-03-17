package es.cide.programacion;
import java.util.Scanner;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon una ruta absoluta que exista");
        String ruta = sc.nextLine();
        try{
            File directori = new File(ruta);
            if(!directori.exists()){ //Si no existe el directorio
                System.out.println("El directorio no existe");
            }else{
                String[] archivos = directori.list();
                if(archivos != null){//Si la lista no esta vacia
                    for(String archivo : archivos){
                        System.out.println(archivo);
                    }
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}