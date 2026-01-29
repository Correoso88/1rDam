package es.cide.programacion;

public abstract class Cotxe extends Vehicle {
    //Atributs
    int plaçes;
    double velocitat_maxima;
    //Metodo constructor

    public Cotxe(String matricula, String marca, int plaçes, double velocitat_maxima){
        super(matricula, marca);
    }
    //Getters Setters
    public double getVelocitat_maxima(){
        return velocitat_maxima;
    }
    //Metodos funcionales
    
}
