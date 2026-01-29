package es.cide.programacion;

public class Patinet extends Vehicle implements Recargable  {
    //Atributs
    int bateria;
    //Metodo constructor
    public Patinet(int bateria, String matricula, String marca){
        super(matricula, marca);
        this.bateria = bateria;
    }
    //Getters Setters
    public int getBateria(){
        return bateria;
    }
    //Metodos funcionales
    public void carregarBateria(){
        this.bateria=100;
    }
    public int getNivellBateria(){
        return bateria;
    }
    public int calcularPreuLloguer(int dies){
        return dies*5;
    }
    @Override
    public void mostrarInfo() {
        System.out.println("--- FITXA VEHICLE ---");
        System.out.println("Marca: " + marca);
        System.out.println("Matrícula: " + matricula);

    }
    
}
