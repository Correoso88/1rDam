package es.cide.programacion;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Main {
    public static void main(String[] args) {
        JFrame ventana = new JFrame();//Creo el frame
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Hago que 
        ventana.setSize(400,200);//Pongo el tamaño de la ventana
        JPanel panel = new JPanel();//Creo el panel
        JTextField num1 = new JTextField(10);//Creo el textField
        JTextField num2 = new JTextField(10);//Creo el segundo textField
        JTextField resultado = new JTextField(10);//Creo donde irá el resultado
        //Boton
        JButton boton = new JButton("Sumar");
        boton.addActionListener(new ActionListener() {//Creo el Listener
            public void actionPerformed(ActionEvent ev) {//Creo el metodo
                int a = Integer.parseInt(num1.getText());//Paso el num1 a numero y lo guardo en a
                int b = Integer.parseInt(num2.getText());//Paso el num2 a numero y lo guardo en b
                resultado.setText(String.valueOf(a+b)); //Luego los sumo y los pongo en el textfield resultado
            }
        });
        panel.setLayout(new BorderLayout());//Creo border
        ventana.add(panel);//añado el panel en la ventana
        panel.add(boton,BorderLayout.NORTH);//El boton lo pongo arriba
        panel.add(num1,BorderLayout.WEST);//El textfield1 lo pongo en el oeste
        panel.add(num2,BorderLayout.CENTER);//El numero 2 lo pongo en el centro
        panel.add(resultado,BorderLayout.EAST);//El textfieldresultado lo pongo en el este
        
        ventana.setVisible(true);//Hago el frame visible
    }
}