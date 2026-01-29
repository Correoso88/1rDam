package es.cide.programacion;

public class Vehiculo {
    // Atributos
    double peso;
    int plazas;
    String tipo_combustible;
    double autonomia_total;
    double cantidad_gasolina;
    double consumo;
    int ocupantes;

    // Constructor //conjunto de instruccioens
    public Vehiculo(double peso, int plazas, String tipo_combustible, double autonomia_total, double cantiad_gasolina,
            double consumo, int ocupantes) {
        this.peso = peso;
        this.plazas = plazas;
        this.tipo_combustible = tipo_combustible;
        this.autonomia_total = autonomia_total;
        this.cantidad_gasolina = cantiad_gasolina;
        this.consumo = consumo;
        this.ocupantes = ocupantes;
    }

    // Getters y setters //conjunto de operaciones para canviar los operando
    public int getOcupantes() {
        return this.ocupantes;
    }

    public void setCantidad_gasolina() {
        this.cantidad_gasolina = cantidad_gasolina;
    }

    public double getCantidad_gasolina() {
        return this.cantidad_gasolina;
    }

    // Metodos //todo lo que quieres que haga el programa
    public double rango() {
        double rangoactual = (cantidad_gasolina / consumo) * 100;
        return rangoactual;
    }

    public int anadirOcupante() {
        if (ocupantes >= plazas) {
            System.out.println("No hay mas espacio");
        }
            
        else {
            ocupantes++;
        }
            return ocupantes;
            

    }
     public int quitarOcupante() {
        if (ocupantes < 0) {
            ocupantes--;
            return ocupantes;
        } else {
            System.out.println("El coche esta vacio");
            return ocupantes;
        }

    }

}
