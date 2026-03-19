package es.cide.programacion;

import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        FileInputStream file = null;
        String TextoLeido = "";
        char v;
        try {
            System.out.println("Indica la ruta de dades.txt");
            File archivo = new File(sc.next(), "dades.txt");
            file = new FileInputStream(archivo);
            int size = file.available();//Mide el tamaño del texto dentro de una variable
            for(int i = 0;i<size;i++){
                v = (char)file.read(); 
                TextoLeido = TextoLeido + v;// Sumas a la variable vacia el texto que a la vez lee del archivo que le indicas
            }
            System.out.println(TextoLeido);
            System.out.println("Total bytes: "+archivo.length()); //Para saber cuantos bytes tiene el archivo se hace con el File 
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            file.close();
        }
    }
}
