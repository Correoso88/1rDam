package es.cide.programacion;

public class Cotxe extends Vehicle implements Energia, Manteniment {

    // Atributs
    private boolean esTesla;

    // Constructor
    public Cotxe(String propietari, String numBastidor, boolean esTesla) {
        super(propietari, numBastidor);
        this.esTesla = esTesla;
    }

    // Getters y Setters
    public boolean getEsTesla() {
        return esTesla;
    }
    public void setEsTesla(boolean esTesla) {
        this.esTesla = esTesla;
    }
    // Metodos funcionales
    public void carregarBateria() {
        System.out.println("Bateria carregada del cotxe");
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
            System.out.println("Iniciant revisió del cotxe...");
            
    }

    public void finalizarManteniment() {
        System.out.println("Manteniment finalitzat del cotxe.");
    }

    public boolean estaLlest() {
        r = aleatori.nextInt(9);
        if (r == 1 || r == 2) {
            return true;
        } else {
            return false;
        }
    }
}
