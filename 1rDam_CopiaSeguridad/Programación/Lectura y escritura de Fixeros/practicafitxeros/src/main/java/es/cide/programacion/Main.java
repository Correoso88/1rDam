package es.cide.programacion;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static File file = null;
    public static JFileChooser fileChooser = new JFileChooser();

    public static String leerArchivo(File file) {
        FileInputStream fileI = null;
        String TextoLeido = "";
        char v;
        try {
            fileI = new FileInputStream(file);
            int size = fileI.available();// Mide el tamaño del texto dentro de una variable
            for (int i = 0; i < size; i++) {
                v = (char) fileI.read();
                TextoLeido = TextoLeido + v;// Sumas a la variable vacia el texto que a la vez lee del archivo que le
                                            // indicas
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileI != null) {
                try {
                    fileI.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return TextoLeido;
    }

    public static void escribirArchivo(File file, String textoEscrito) {
        FileOutputStream fileO = null;
        char v;
        try {
            fileO = new FileOutputStream(file);
            for (int i = 0; i < textoEscrito.length(); i++) { // Bucle para que recorra todo el texto de char a char
                v = textoEscrito.charAt(i); // Separa las palabras en char
                fileO.write((byte) v); // Imprime cada char del texto
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileO != null) {
                try {
                    fileO.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {

        // LOOK & FEEL Nimbus
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        JFrame ventana = new JFrame();
        ventana.setSize(500, 500);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ventana.setLayout(new GridBagLayout());// Añado el grid bag
        GridBagConstraints gbc = new GridBagConstraints(); // Creo el grid bag
        gbc.insets = new Insets(5, 5, 5, 5);// Margen entre los componentes


        // Creamos la barra de botones uno al lado del otro
        // Boton nou
        gbc.gridx = 0;
        JButton bnou = new JButton("Nou");
        ventana.add(bnou, gbc);

        // Boton Obrir
        gbc.gridx = 1;
        JButton bobrir = new JButton("Obrir");
        ventana.add(bobrir, gbc);

        // Boton Desear
        gbc.gridx = 2;
        JButton bdesear = new JButton("Desear");
        ventana.add(bdesear, gbc);

        // Boton Desear Com
        gbc.gridx = 3;
        JButton bdesearCom = new JButton("Desear Com..");
        ventana.add(bdesearCom, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 4; //Que ocupe las cuatro columnas
        gbc.fill = GridBagConstraints.BOTH; //Esto es para que se pueda expndir a cualquier lado
        gbc.weightx = 1.0; //Que se peuda expandir en horizontal
        gbc.weighty = 1.0;// QUe se pueda expandir en vertical

        JTextArea escribir = new JTextArea();
        JScrollPane barraScroll = new JScrollPane(escribir);
        barraScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        ventana.add(barraScroll, gbc); // solo añadimos el JScrollPane

        // Action listeners
        // Action listener de nou
        bnou.addActionListener(e -> {
            escribir.setText(""); // Borra todo el texto
            file = null;

        });

        // Action listener de obrir
        bobrir.addActionListener(e -> {
            fileChooser.showOpenDialog(ventana); // abro el fileChhooser
            file = fileChooser.getSelectedFile(); // Guardo en la variable global el file que he elegido
            escribir.setText(leerArchivo(file)); // Escribimos en el text area lo que nos de el metodo de leerArchivo
        });

        bdesear.addActionListener(e -> {
            if (file != null) { // Primero comrpuebo si el file es nullo
                escribirArchivo(file, escribir.getText()); // Uso el metodo con el archivo que he guardado en el de leer
            } else {// Si es nullo hago exactamente lo mismo que el desar Com
                int resultado = fileChooser.showSaveDialog(ventana);
                if (resultado == fileChooser.APPROVE_OPTION) {
                    file = fileChooser.getSelectedFile();
                    escribirArchivo(file, escribir.getText());
                }
            }
        });

        bdesearCom.addActionListener(e -> {
            int resultado = fileChooser.showSaveDialog(ventana); // Guardo en un int un valor, 0 o 1 0 o 2
            if (resultado == fileChooser.APPROVE_OPTION) {// si es el 0 es el boton de aceptar
                file = fileChooser.getSelectedFile(); // Guardo el fichero en la variable local
                escribirArchivo(file, escribir.getText()); // Usamos el metodo para escribir el archivo
            }

        });

        ventana.setVisible(true);
    }
}