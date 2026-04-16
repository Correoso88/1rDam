package es.cide.programacion;

import javax.swing.*;
import java.awt.*;
import java.io.*;

public class Main {


    public static boolean esPalindromo(String linea) {
        linea.toLowerCase();
        char[] arr = linea.toCharArray();
        int j = arr.length-1;
        boolean palindromo = true;
        int i = 0;

        while(i<j && palindromo){
            if(arr[i] != arr[j]){
                palindromo = false;
            }
            ++i;
            --j;
        }
        return palindromo;
    }

    public static void escribirArchivo(File file, String textoEscrito) {
        FileOutputStream fileO = null;
        char v;
        try {
            fileO = new FileOutputStream(file);
            for (int i = 0; i < textoEscrito.length(); i++) { // Recorre cada carácter
                v = textoEscrito.charAt(i); //Guarda el char que le toca
                fileO.write((byte) v); // Escribe el carácter
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

        SwingUtilities.invokeLater(() -> {

            // CREACIÓN DE LA VENTANA
            JFrame ventana = new JFrame("¿Es palindromo?");
            ventana.setSize(600, 600);
            ventana.setResizable(false);
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Componentes
            JTextField Origen = new JTextField(20);
            JTextField Desti = new JTextField(20);

            JTextArea areaPalindroma = new JTextArea(10, 20);
            JTextArea areanoPalindroma = new JTextArea(10, 20);

            JButton Analitzar = new JButton("Llegir");
            JButton Desar = new JButton("Desear");

            ventana.setLayout(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.insets = new Insets(5, 5, 5, 5); // espacio entre componentes

            // Origen
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.gridwidth = 1;
            gbc.fill = GridBagConstraints.HORIZONTAL;
            ventana.add(new JLabel("Fichero Origen:"), gbc);

            gbc.gridx = 1;
            ventana.add(Origen, gbc);

            // Boton analizar
            gbc.gridx = 0;
            gbc.gridy = 1;
            gbc.gridwidth = 2;
            ventana.add(Analitzar, gbc);

            // Area Palindroma
            gbc.gridy = 2;
            gbc.gridwidth = 2;
            gbc.fill = GridBagConstraints.HORIZONTAL;
            ventana.add(new JLabel("Palindromo:"), gbc);

            gbc.gridy = 3;
            gbc.fill = GridBagConstraints.BOTH;
            gbc.weightx = 1;
            gbc.weighty = 1;
            ventana.add(new JScrollPane(areaPalindroma), gbc);

            // Area no Palindroma
            gbc.gridy = 4;
            gbc.fill = GridBagConstraints.BOTH;
            gbc.weighty = 0;
            ventana.add(new JLabel("No Palindromo:"), gbc);

            gbc.gridy = 5;
            gbc.fill = GridBagConstraints.BOTH;
            gbc.weighty = 1;
            ventana.add(new JScrollPane(areanoPalindroma), gbc);
            
            // Destino
            gbc.gridx = 0;
            gbc.gridy = 6;
            ventana.add(new JLabel("Fichero Destino:"), gbc);

            gbc.gridx = 1;
            ventana.add(Desti, gbc);

            // Boton Guardar
            gbc.gridy = 7;
            gbc.gridx = 0;
            gbc.fill = GridBagConstraints.HORIZONTAL;
            gbc.gridwidth = 2;
            ventana.add(Desar, gbc);


            // Boton analizar
            Analitzar.addActionListener(e -> {
                String ruta = Origen.getText();
                File fichero = new File(ruta);

                if (!fichero.exists()) { //Si el fixero no existe que salga un mensaje de error
                    JOptionPane.showMessageDialog(null, "Error: El fichero no existe");
                    return;
                }

                try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {//lee linea por linea del fichero que le paasamos
                    areaPalindroma.setText("");
                    areanoPalindroma.setText("");

                    String linea;
                    while ((linea = br.readLine()) != null) { //Recorre la linie mientras no sea null
                        boolean palindroma = esPalindromo(linea);   //Creamos el booleano y comprobamos con el metodo

                        if (palindroma) {   //Si es true lo escribimos en el area palindroma
                            areaPalindroma.append(linea + "\n");
                        } else { //Si no en la que no es palindroma
                            areanoPalindroma.append(linea + "\n");
                        }
                    }




                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            });


            // Listener del boton guardar
            Desar.addActionListener(e -> {
                String rutaDestino = Desti.getText();
                File fileDestino = new File(rutaDestino);

                // Uso el método escribirArchivo
                escribirArchivo(fileDestino, areaPalindroma.getText());
                JOptionPane.showMessageDialog(null, "Fichero guardado correctamente");
            });

            ventana.setVisible(true);
        });
    }
}