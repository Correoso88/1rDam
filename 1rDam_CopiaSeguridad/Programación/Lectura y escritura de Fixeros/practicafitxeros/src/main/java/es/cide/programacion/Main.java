package es.cide.programacion;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static String rutaFile = null;

    public static String leerArchivo(String ruta) {
        Scanner sc = new Scanner(System.in);
        FileInputStream file = null;
        String TextoLeido = "";
        char v;
        try {

            File archivo = new File(ruta);
            file = new FileInputStream(archivo);
            int size = file.available();// Mide el tamaño del texto dentro de una variable
            for (int i = 0; i < size; i++) {
                v = (char) file.read();
                TextoLeido = TextoLeido + v;// Sumas a la variable vacia el texto que a la vez lee del archivo que le
                                            // indicas
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (file != null) {
                try {
                    file.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
        return TextoLeido;
    }

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
        JTextArea escribir = new JTextArea("hola que hace");
        areaescritura.add(escribir);
        JScrollPane barraScroll = new JScrollPane(areaescritura);
        barraScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        ventana.add(barraScroll, BorderLayout.CENTER);

        // Action listeners

        bnou.addActionListener(e -> {
            escribir.setText("");
        });

        bobrir.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.showOpenDialog(ventana);
            //int respuesta = fileChooser.showOpenDialog(null);

            //if (respuesta == JFileChooser.APPROVE_OPTION) {
             //   File fichero = fileChooser.getSelectedFile();
            //}
            String ruta = fileChooser.getSelectedFile().getAbsolutePath();
            String leerContenido = leerArchivo(ruta);
            escribir.setText(leerContenido);
        });

        ventana.setVisible(true);
    }
}