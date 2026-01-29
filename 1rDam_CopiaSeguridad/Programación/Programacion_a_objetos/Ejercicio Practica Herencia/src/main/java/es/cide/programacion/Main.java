package es.cide.programacion;

public class Main {
    public static void main(String[] args) {
        System.out.println("Benvinguts al taller de reparacions 2026");
        Cotxe c = new Cotxe("Alberto", "dAISDJOAIJSDoag123", true);
        Moto m = new Moto("Toni", "oqdjqowid132");
        System.out.println("Vehicle registrat: " + c.getPropietari());
        System.out.println("Vehicle registrat: " + m.getPropietari());
        c.carregarBateria();
        m.carregarBateria();
        while (c.estaLlest() == true && m.estaLlest() == true) {
            if (c.estaLlest() && m.estaLlest() == false) {
                System.out.println("El cotxe encara està al taller i la moto està llesta. Cal esperar.");
            } else if (c.estaLlest() == false && m.estaLlest()) {
                System.out.println("El cotxe encara està al taller i la moto està llesta. Cal esperar.");
            } else if (c.estaLlest() == false && m.estaLlest() == false) {
                System.out.println("El cotxe encara està al taller i la moto encara està en al taller. Cal esperar.");
            }
        }
        System.out.print("Vehicles entregats!");
        c.finalizarManteniment();
        if (c.getEsTesla()) {
            System.out.print("Es un tesla");
        }
        m.finalizarManteniment();
    }
}