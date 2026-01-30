package es.cide.programacion;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;
import java.awt.event.ItemListener;
public class Main {
    public static void main(String[] args) {
        JFrame ventana = new JFrame();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Hago que cuando le des click al boton de cerrar, se cierre la pestaña
        ventana.setSize(400,300);//Le meto el tamaño de la ventana
        ventana.setLayout(new BorderLayout());//Le ponemos border
        JLabel texto1 = new JLabel("Bocata Gratis");//Creo el label
        JSlider slider = new JSlider(10,50);//Creo el slider con sus valores respectivos
        //Listener
        slider.addChangeListener(new ChangeListener() {//Hago el changeListener
            public void stateChanged(ChangeEvent e){//Creo el metodo 
                int tamSlider = slider.getValue();//Guardo el valor del slider
                texto1.setFont(new Font("Arial",Font.PLAIN,tamSlider));//le dices el set font, el tipo de letra, la fuente y el slider
            }
        });
        ventana.add(slider,BorderLayout.SOUTH);//Añado el slider al sud
        ventana.add(texto1,BorderLayout.CENTER);//Añado el label en el centro
        ventana.setVisible(true);
    }
}