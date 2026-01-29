package es.cide.programacion;

import java.util.Random;

public class Vehicle {
    Random aleatori =new Random();
    // Atributs
    protected int r;
    protected String propietari;
    protected String numBastidor;

    // Constructor
    public Vehicle(String propietari, String numBastidor) {
        this.propietari = propietari;
        this.numBastidor = numBastidor;
    }

    // Getters y Setters
    public String getNumBastidor() {
        return numBastidor;
    }

    public String getPropietari() {
        return propietari;
    }

    public void setNumBastidor(String numBastidor) {
        this.numBastidor = numBastidor;
    }

    public void setPropietari(String propietari) {
        this.propietari = propietari;
    }
    // Metodos funcionales
}
