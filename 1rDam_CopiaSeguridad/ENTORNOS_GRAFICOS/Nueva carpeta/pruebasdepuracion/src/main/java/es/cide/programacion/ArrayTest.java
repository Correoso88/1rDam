package es.cide.programacion;

public class ArrayTest {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3};
        for (int i = 0; i <= numeros.length; i++) { // Error: fora de rang
            System.out.println("Número: " + numeros[i]);
        }
    }
}