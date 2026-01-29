package es.cide.programacion;



public class Main {
    public static void main(String[] args) {
        Vehiculo coche = new Vehiculo(1000, 5, "diessel", 200, 50, 3, 2);
        double rango = coche.rango();
        System.out.println(rango);
        int ocupantes=coche.getOcupantes();
        System.out.println(ocupantes);
        ocupantes = coche.anadirOcupante();
        System.out.println(ocupantes);
    }
}