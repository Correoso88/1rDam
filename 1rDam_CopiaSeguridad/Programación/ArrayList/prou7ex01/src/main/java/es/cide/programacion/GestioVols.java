package es.cide.programacion;

import java.util.ArrayList;

public class GestioVols implements IGestioPassatgers {
    private ArrayList<String> llistaPassatgers = new ArrayList<>();

    public GestioVols() {
        this.llistaPassatgers = new ArrayList<>();
    }

    public void registrarPassatger(String nom) { // Registras un pasajero a la lista
        llistaPassatgers.add(nom);
    }

    public void modificarReserva(int index, String nouNom) {//Modificas un pasajero
        llistaPassatgers.set(index, nouNom);
    }

    public void cancellarReserva(String nom){//Eliminas el nombre del pasajero
        llistaPassatgers.remove(nom);
    }

    public String obtenirPassatger(int index) {// Obtienes dependiendo de el indice el nombre del pasajero
        return llistaPassatgers.get(index);
    }

    public void llistarPassatgers() {
        for (String nom : llistaPassatgers) {// Imprimo todos los pasajeros
            System.out.println(nom);
        }

    }
}
