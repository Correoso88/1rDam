package es.cide.programacion.Logica;



import es.cide.programacion.*;

import java.awt.*;

public class Empleados {
    private int nss;
    private String nombre;
    private String apellido;
    private String email;
    private String iban;
    public Empleados(int nss, String nombre, String apellido, String email, String iban){
        this.nss = nss;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.iban = iban;
    }
    
    //Getters
    public int getNss() {
        return nss;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public String getIban() {
        return iban;
    }

    //Setters
    public void setNss(int nss) {
        this.nss = nss;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

}
