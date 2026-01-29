package es.cide.programacion;

public class CotxeCombustio extends Cotxe {
    // Atributs
    protected double capacitatDiposit;

    // Metodo constructor
    public CotxeCombustio(String matricula, String marca, int plaçes, double velocitat_maxima) {
        super(matricula, marca, plaçes, velocitat_maxima);
        this.capacitatDiposit = capacitatDiposit;
    }
    // Getters Setters
    public double getCapacitatDiposit() {
        return capacitatDiposit;
    }
    // Metodos funcionales
    public int calcularPreuLloguer(int dies){
        return dies*22;
    }
}
