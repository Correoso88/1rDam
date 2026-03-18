package es.cide.programacion;

import java.util.Scanner;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String frase = "Hola, estic aprenent Java!";
        FileOutputStream file = null;
        char v;
        try {
            System.out.println("Indica la ruta del archivo: "); 
            File archivo = new File(sc.next(), "dades.txt"); //Pregunto la ruta donde lo quiere crear y le digo que se llame asi
            file = new FileOutputStream(archivo); //Uso la clase para escribir datos
            for (int i = 0; i < frase.length(); i++) { //Como tiene que ser caracter a caracter hago un bucle que lee el string caracter a caracter y los imprime
                v = frase.charAt(i);
                file.write((byte) v);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            file.close();
        }
    }
}
