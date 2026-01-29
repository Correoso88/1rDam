public class App {
    int sumaArray(int[] arr, int n) {
        if (n <= 0) {
            return 0;
        }
        return sumaArray(arr, n - 1) + arr[n - 1];
    }

public static void main(String[] args) {
    int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    App a = new App();
    int resultado = a.sumaArray(numeros, numeros.length);
    System.out.println(resultado);
}
}
