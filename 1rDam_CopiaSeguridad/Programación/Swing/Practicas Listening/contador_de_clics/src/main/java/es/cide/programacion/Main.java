package es.cide.programacion;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Main {
    private static int c=0;//Genero un contador global
    public static void main(String[] args) {
        JFrame ventana = new JFrame();//Creo el frame llamado ventana
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Cuando le des a cerrar pestaña, se te cierra la pestaña
        ventana.setSize(200,200);//Pongo las medidas de la ventana principal
        JButton boton = new JButton("Boton1");//Creo el boton
        JLabel texto1 = new JLabel("Contador: 0");//Creo el texto
        boton.addActionListener(new ActionListener() {//Creo el Listener
            public void actionPerformed(ActionEvent ev) {
                c++;
                texto1.setText("Contador: "+c);
            }
        });
        boton.setSize(100,50);
        ventana.add(boton);
        ventana.add(texto1);
        ventana.setVisible(true);
    }
}