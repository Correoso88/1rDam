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

        gbc.gridx = 0;
        gbc.gridy = 0;
        JTextField entradaFile = new JTextField(20);
        ventana.add(entradaFile, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        JButton analizar = new JButton("Analizar");
        ventana.add(analizar, gbc);

        gbc.gridy = 1;
        gbc.gridx = 0;
        gbc.fill = GridBagConstraints.BOTH; // Esto es para que se pueda expndir a cualquier lado
        JTextArea pwdsegura = new JTextArea();
        JScrollPane barraScroll = new JScrollPane(pwdsegura);
        barraScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        ventana.add(barraScroll, gbc);

        gbc.gridy = 1;
        gbc.gridx = 1;
        ventana.add(new JLabel("Segura"), gbc);

        gbc.gridy = 2;
        gbc.gridx = 0;
        gbc.fill = GridBagConstraints.BOTH; // Esto es para que se pueda expndir a cualquier lado
        JTextArea pwd = new JTextArea();
        JScrollPane barraScroll1 = new JScrollPane(pwd);
        barraScroll1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        ventana.add(barraScroll1, gbc);

        gbc.gridy = 2;
        gbc.gridx = 1;
        ventana.add(new JLabel("No segura"), gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        JTextField destinofile = new JTextField(20);
        ventana.add(destinofile, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        JButton desar = new JButton("Desar");
        desar.setEnabled(false);
        ventana.add(desar, gbc);



        // Listeners
        analizar.addActionListener(e -> {
            file = new File(analizar.getText());
            if(file == null){
                JOptionPane.showMessageDialog(ventana, e, "Error, pon una ruta correcta", 0);
            }else{
                leerArchivo(file);
            }
            
            
        });

        ventana.setVisible(true);
    }
}