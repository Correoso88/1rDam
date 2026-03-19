package es.cide.programacion;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        JFrame ventana = new JFrame();
        ventana.setSize(500, 500);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel barraBotones = new JPanel();
        barraBotones.setLayout(new GridBagLayout());// Añado el grid bag
        GridBagConstraints gbc = new GridBagConstraints(); // Creo el grid bag
        gbc.insets = new Insets(8, 10, 8, 10);// Margen entre los componentes

        // Creamos la barra de botones uno al lado del otro
        // Boton nou
        gbc.gridx = 0;
        JButton bnou = new JButton("Nou");
        barraBotones.add(bnou, gbc);

        // Boton Obrir
        gbc.gridx = 1;
        JButton bobrir = new JButton("Obrir");
        barraBotones.add(bobrir, gbc);

        // Boton Desear
        gbc.gridx = 2;
        JButton bdesear = new JButton("Desear");
        barraBotones.add(bdesear, gbc);

        // Boton Desear Com
        gbc.gridx = 3;
        JButton bdesearCom = new JButton("Desear Com..");
        barraBotones.add(bdesearCom, gbc);
        ventana.add(barraBotones, BorderLayout.NORTH);

        JPanel areaescritura = new JPanel();
        JScrollPane barraScroll = new JScrollPane(areaescritura);
        barraScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        ventana.add(barraScroll, BorderLayout.CENTER);

        ventana.setVisible(true);
    }
}