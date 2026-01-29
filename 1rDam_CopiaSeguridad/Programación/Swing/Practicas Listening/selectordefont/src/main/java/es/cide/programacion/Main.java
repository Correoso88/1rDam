package es.cide.programacion;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemListener;
public class Main {
    public static void main(String[] args) {
        JFrame ventana = new JFrame();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Hago que cuando le des click al boton de cerrar, se cierre la pestaña
        ventana.setSize(400,300);//Le meto el tamaño de la ventana
        ventana.setLayout(new BorderLayout());//Le ponemos border
        JLabel texto1 = new JLabel();
        JSlider slider = new JSlider();
        //Listener

        
        ventana.add(,BorderLayout.NORTH);
        ventana.add(,BorderLayout.CENTER);
        ventana.setVisible(true);
    }
}