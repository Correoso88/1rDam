package es.cide.programacion;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.border.Border;

public class Main {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Seleccionar SO");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(350, 400);
        ventana.setLayout(new BorderLayout());

        //Area que pone el usuario
        JPanel AreaEntrada = new JPanel();

        //Area que ve el usuario
        JPanel AreaVisual = new JPanel();
        JTextField Mostrar = new JTextField(20);
        AreaVisual.add(Mostrar);

        //Panel de los Botones
        JPanel PanelDeControl = new JPanel();
        PanelDeControl.setLayout(new GridLayout(4,4));
        PanelDeControl.add(new JButton("9"));
        PanelDeControl.add(new JButton("8"));
        PanelDeControl.add(new JButton("7"));
        PanelDeControl.add(new JButton("/"));
        PanelDeControl.add(new JButton("6"));
        PanelDeControl.add(new JButton("5"));
        PanelDeControl.add(new JButton("4"));
        PanelDeControl.add(new JButton("*"));
        PanelDeControl.add(new JButton("3"));
        PanelDeControl.add(new JButton("2"));
        PanelDeControl.add(new JButton("1"));
        PanelDeControl.add(new JButton("-"));
        PanelDeControl.add(new JButton("C"));
        PanelDeControl.add(new JButton("0"));
        PanelDeControl.add(new JButton("+"));
        PanelDeControl.add(new JButton("="));

        ventana.add(AreaEntrada,BorderLayout.NORTH);
        ventana.add(AreaVisual,BorderLayout.CENTER);
        ventana.add(PanelDeControl,BorderLayout.SOUTH);
        ventana.setVisible(true);
    }
}