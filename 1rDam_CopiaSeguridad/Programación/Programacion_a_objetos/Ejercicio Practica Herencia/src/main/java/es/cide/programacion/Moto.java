package es.cide.programacion;

public class Moto extends Vehicle implements Energia, Manteniment {
    // Atributs
    // Constructor
    public Moto(String propietari, String numBastidor) {
        super(propietari, numBastidor);
    }
    // Getters y Setters

    // Metodos funcionales
    public void carregarBateria() {
        System.out.println("Bateria carregada de la moto");
    }

    public boolean teCorrent() {
        r = aleatori.nextInt(1);
        if (r == 0) {
            return false;
        } else {
            return true;
        }
    }

    public void revisarVehicle() {
        System.out.println("Iniciant revisió de la moto...");
    }

    public void finalizarManteniment() {
        System.out.println("Manteniment finalitzat de la moto.");
    }

    public boolean estaLlest() {
        r = aleatori.nextInt(1, 10);
        if (r == 1 || r == 2 || r == 3 || r == 4) {
            return true;
        } else {
            return false;
        }
    }
}
