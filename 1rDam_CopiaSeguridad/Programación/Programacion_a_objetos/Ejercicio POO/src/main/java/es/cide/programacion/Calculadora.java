package es.cide.programacion;

public class Calculadora {
    // Atributos
    double op1;
    double op2;

    // Constructor //conjunto de instruccioens
    public Calculadora(double op1, double op2) {
        this.op1 = op1;
        this.op2 = op2;
    }

    // Getters y setters //conjunto de operaciones para canviar los operando
    public void setOperando1(double pepe){
        this.op1=pepe;
    }
    public double getOperando1(){
        return this.op1;
    }
    // Metodos //todo lo que quieres que haga el programa
    public double sumar(){
        double resultadoSuma=op1+op2;
        return resultadoSuma;
    }
    public double resta(){
        double resultadoResta=op1-op2;
        return resultadoResta;
    }
    public double multiplicacion(){
        double resultadoMult=op1*op2;
        return resultadoMult;
    }
    public double dividir(){
        double resultadoDivision=op1/op2;
        return resultadoDivision;
    }
}