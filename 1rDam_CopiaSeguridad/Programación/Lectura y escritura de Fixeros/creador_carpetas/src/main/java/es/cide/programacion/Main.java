package es.cide.programacion;

import java.util.Scanner;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Pon el nombre de la carpeta");
            String nombre = sc.next();
            System.out.println("Pon la ruta de la carpeta");
            String ruta = sc.next();

            File carpeta = new File(ruta, nombre);
            carpeta.mkdir();

            File guardar = new File(carpeta, "hola.txt");
            FileOutputStream fichero = new FileOutputStream(guardar);//Meter en una contendio
            fichero.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
