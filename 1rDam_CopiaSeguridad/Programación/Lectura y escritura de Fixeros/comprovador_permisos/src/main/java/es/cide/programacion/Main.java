package es.cide.programacion;

import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Dime la ruta de un archivo o directorio y luego el nombre");
            File archivo = new File(sc.next(), sc.next());
            if(archivo.isDirectory()){
                System.out.println("Es un directorio");
            }else if(archivo.isFile()){
                System.out.println("Es un fitxero");
            }
            if(archivo.canRead() && archivo.canWrite()){
                System.out.println("Tiene permisos de escribir y de leer");
            }else if(!archivo.canRead() && archivo.canWrite()){
                System.out.println("El archivo solo tiene permisos de escribir");
            }else if(archivo.canRead() && !archivo.canWrite()){
                System.out.println("El archivo solo puede leer");
            }else{
                System.out.println("El archivo no tiene permisos");
            }
            System.out.println(archivo.getAbsolutePath());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
