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
        //Listener
        ImageIcon icono = new ImageIcon("src/WindowsLogo.png");
        JLabel texto = new JLabel();
        
        JRadioButton Windows = new JRadioButton();
        JRadioButton Linux = new JRadioButton();
        JRadioButton macOS = new JRadioButton();

        ButtonGroup sistemasOperativos = new ButtonGroup();
        sistemasOperativos.add(Windows);
        sistemasOperativos.add(Linux);
        sistemasOperativos.add(macOS);

        ventana.setVisible(true);
    }
}