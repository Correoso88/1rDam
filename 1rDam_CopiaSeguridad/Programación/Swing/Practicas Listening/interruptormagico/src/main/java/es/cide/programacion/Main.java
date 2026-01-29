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
        //CheckBox
        JCheckBox checkBox = new JCheckBox();//Creo el checkBox
        //Boton
        JButton boton = new JButton("Activar BOTON");//Creo el boton
        boton.setEnabled(false);//Defautl no activado
        //Listener
        checkBox.addItemListener(e -> {
            if(checkBox.isSelected()){//Si el checkbox esta activado
                boton.setEnabled(true);//Boton activado
            }else{//Si no
                boton.setEnabled(false);//Boton Desactivado
            }
        });
        checkBox.setHorizontalAlignment(SwingConstants.CENTER);//Hago el checkbox en el centro
        ventana.add(checkBox,BorderLayout.NORTH);//Meto el checkBox en la ventana y la pongo en el norte
        ventana.add(boton,BorderLayout.CENTER);//Meto el boton en el centro
        ventana.setVisible(true);//Hago la ventana visible
    }
}