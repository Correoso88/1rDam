package es.cide.programacion;

public abstract class Vehicle {
    //Atributs
    protected String matricula; 
    protected String marca;
    //Metodo constructor
    public Vehicle(String matricula, String marca){
        this.matricula = matricula;
        this.marca = marca;
    }
    //Getters Setters
    public String getMatricula(){
        return matricula;
    }
    public String getMarca(){
        return marca;
    }
    //Metodos funcionales
    public abstract int calcularPreuLloguer(int dies);

    public void mostrarInfo() {
        System.out.println("--- FITXA VEHICLE ---");
        System.out.println("Marca: " + marca);
        System.out.println("Matrícula: " + matricula);
    }
}
