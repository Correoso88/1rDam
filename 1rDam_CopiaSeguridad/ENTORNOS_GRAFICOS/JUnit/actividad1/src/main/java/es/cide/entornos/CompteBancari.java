package es.cide.entornos;

public class CompteBancari {
    private double saldo;

    public CompteBancari(double saldo) {
        this.saldo = saldo;
    }

    public void ingressar(double quantitat) {
        if (quantitat <= 0) {
            throw new IllegalArgumentException("La quantitat ha de ser positiva");
        }
        saldo += quantitat;
    }

    public void retirar(double quantitat) {
        if (quantitat <= 0) {
            throw new IllegalArgumentException("La quantitat ha de ser positiva");
        }

        if (quantitat > saldo) {
            throw new IllegalArgumentException("Fons insuficients");
        }

        saldo -= quantitat;
    }

    public double consultarSaldo() {
        return saldo;
    }
}