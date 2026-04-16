package es.cide.programacion;

import javax.swing.*;
import java.awt.*;
import java.io.*;

public class FiltroSeguridad {

    /**
     * Método que comprueba si una contraseña es segura.
     * Condiciones:
     * - Mínimo 8 caracteres
     * - Al menos un número
     * - Al menos una mayúscula
     */
    public static boolean esSegura(String password) {
        if (password.length() < 8) {
            return false;
        }

        boolean tieneNumero = false;
        boolean tieneMayuscula = false;

        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) tieneNumero = true;
            if (Character.isUpperCase(c)) tieneMayuscula = true;
        }

        return tieneNumero && tieneMayuscula;
    }

    /**
     * Método que escribe un texto en un archivo usando FileOutputStream.
     */
    public static void escribirArchivo(File file, String textoEscrito) {
        FileOutputStream fileO = null;
        char v;
        try {
            fileO = new FileOutputStream(file);
            for (int i = 0; i < textoEscrito.length(); i++) { // Recorre cada carácter
                v = textoEscrito.charAt(i);
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
            JFrame ventana = new JFrame("Filtro de Seguridad de Passwords");
            ventana.setSize(600, 600);
            ventana.setResizable(true);
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // COMPONENTES
            JTextField txtOrigen = new JTextField(20);
            JTextField txtDesti = new JTextField(20);

            JTextArea areaSegures = new JTextArea(10, 20);
            JTextArea areaNoSegures = new JTextArea(10, 20);

            JButton btnAnalitzar = new JButton("Analizar");
            JButton btnDesar = new JButton("Guardar");
            btnDesar.setEnabled(false); // Inicialmente desactivado


            // LAYOUT: GRIDBAGLAYOUT
            ventana.setLayout(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.insets = new Insets(5, 5, 5, 5); // espacio entre componentes

            // FILA 0 → ORIGEN
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.gridwidth = 1;
            gbc.fill = GridBagConstraints.HORIZONTAL;
            ventana.add(new JLabel("Fichero Origen:"), gbc);

            gbc.gridx = 1;
            ventana.add(txtOrigen, gbc);

            // FILA 1 → DESTINO
            gbc.gridx = 0;
            gbc.gridy = 1;
            ventana.add(new JLabel("Fichero Destino:"), gbc);

            gbc.gridx = 1;
            ventana.add(txtDesti, gbc);

            // FILA 2 → BOTÓN ANALIZAR
            gbc.gridx = 0;
            gbc.gridy = 2;
            gbc.gridwidth = 2;
            ventana.add(btnAnalitzar, gbc);

            // FILA 3 → ÁREA SEGURAS
            gbc.gridy = 3;
            gbc.gridwidth = 2;
            gbc.fill = GridBagConstraints.HORIZONTAL;
            ventana.add(new JLabel("Contraseñas Seguras:"), gbc);

            gbc.gridy = 4;
            gbc.fill = GridBagConstraints.BOTH;
            gbc.weightx = 1;
            gbc.weighty = 1;
            ventana.add(new JScrollPane(areaSegures), gbc);

            // FILA 5 → ÁREA NO SEGURAS
            gbc.gridy = 5;
            gbc.fill = GridBagConstraints.HORIZONTAL;
            gbc.weighty = 0;
            ventana.add(new JLabel("Contraseñas No Seguras:"), gbc);

            gbc.gridy = 6;
            gbc.fill = GridBagConstraints.BOTH;
            gbc.weighty = 1;
            ventana.add(new JScrollPane(areaNoSegures), gbc);

            // FILA 7 → BOTÓN GUARDAR
            gbc.gridy = 7;
            gbc.fill = GridBagConstraints.HORIZONTAL;
            gbc.weighty = 0;
            ventana.add(btnDesar, gbc);


            // BOTÓN ANALIZAR
            btnAnalitzar.addActionListener(e -> {
                String ruta = txtOrigen.getText();
                File fichero = new File(ruta);

                if (!fichero.exists()) {
                    JOptionPane.showMessageDialog(null, "Error: El fichero no existe");
                    return;
                }

                try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {

                    areaSegures.setText("");
                    areaNoSegures.setText("");

                    String linea;
                    while ((linea = br.readLine()) != null) {
                        boolean segura = esSegura(linea);

                        if (segura) {
                            areaSegures.append(linea + "\n");
                        } else {
                            areaNoSegures.append(linea + "\n");
                        }
                    }

                    // Activamos botón guardar cuando termina
                    btnDesar.setEnabled(true);

                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            });


            // BOTÓN GUARDAR
            btnDesar.addActionListener(e -> {
                String rutaDestino = txtDesti.getText();
                File fileDestino = new File(rutaDestino);

                // Usamos el método escribirArchivo
                escribirArchivo(fileDestino, areaSegures.getText());
                JOptionPane.showMessageDialog(null, "Fichero guardado correctamente");
            });

            ventana.setVisible(true);
        });
    }
}