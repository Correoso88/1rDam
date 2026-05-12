package es.cide.programacion.Logica;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.Border;

import es.cide.programacion.Main;

import java.awt.*;

public class Plazas{
    private int codigo;
    private String nombre;
    private int salari;
    private int codigo_sup;
    private String info_sup;
    private String nom_TipPlaza;

    public Plazas(int codigo, String nombre, int salari, int codigo_sup, String info_sup, String nom_TipPlaza) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.salari = salari;
        this.codigo_sup = codigo_sup;
        this.info_sup = info_sup;
        this.nom_TipPlaza = nom_TipPlaza;
    }
//Getters
public int getCodigo() {
        return codigo;
}

public String getNombre() {
        return nombre;
}

public int getSalari() {
        return salari;
}

public int getCodigo_sup() {
        return codigo_sup;
}

public String getInfo_sup() {
    return info_sup;
}

public String getNom_TipPlaza() {
    return nom_TipPlaza;
}


//Setters
public void setCodigo(int codigo) {
    this.codigo = codigo;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public void setSalari(int salari) {
    this.salari = salari;
}

public void setCodigo_sup(int codigo_sup) {
    this.codigo_sup = codigo_sup;
}

public void setInfo_sup(String info_sup) {
    this.info_sup = info_sup;
}

public void setNom_TipPlaza(String nom_TipPlaza) {
    this.nom_TipPlaza = nom_TipPlaza;
}

}
