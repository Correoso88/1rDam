package es.cide.programacion;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*; // Importante: paquete fundamental según tus apuntes

public class FiltroSeguridad extends JFrame {
    private JTextField txtOrigen, txtDesti;
    private JTextArea areaSegures, areaNoSegures;
    private JButton btnAnalitzar, btnDesar;

    public FiltroSeguridad() {
        // Configuración de la ventana (Requisito: no redimensionable)
        setTitle("Filtro de Seguridad de Passwords");
        setSize(550, 500);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Parte superior: Entrada de fichero
        add(new JLabel("Fichero Origen:"));
        txtOrigen = new JTextField(20);
        add(txtOrigen);
        btnAnalitzar = new JButton("Analizar");
        add(btnAnalitzar);

        // Parte media: Salida de fichero
        add(new JLabel("Fichero Destino:"));
        txtDesti = new JTextField(20);
        add(txtDesti);

        // Visualización: Áreas de texto con ScrollPane
        areaSegures = new JTextArea(10, 20);
        areaNoSegures = new JTextArea(10, 20);
        
        add(new JLabel("Contraseñas Seguras:"));
        add(new JScrollPane(areaSegures));
        
        add(new JLabel("Contraseñas No Segures:"));
        add(new JScrollPane(areaNoSegures));

        // Botón Guardar (inicialmente inactivo)
        btnDesar = new JButton("Guardar");
        btnDesar.setEnabled(false);
        add(btnDesar);

        // --- LÓGICA DE LECTURA (Botón Analizar) ---
        btnAnalitzar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ruta = txtOrigen.getText();
                File fichero = new File(ruta);

                // Comprobación de existencia (Método de la pág. 12 del PDF)
                if (!fichero.exists()) {
                    JOptionPane.showMessageDialog(null, "Error: El fichero no existe", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Lectura secuencial línea a línea
                try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
                    areaSegures.setText("");
                    areaNoSegures.setText("");
                    String linea;
                    
                    while ((linea = br.readLine()) != null) {
                        if (esSegura(linea)) {
                            areaSegures.append(linea + "\n");
                        } else {
                            areaNoSegures.append(linea + "\n");
                        }
                    }
                    btnDesar.setEnabled(true); // Activamos el botón al terminar
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });

        // --- LÓGICA DE ESCRITURA (Botón Guardar) ---
        btnDesar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String rutaDestino = txtDesti.getText();
                // Uso de PrintWriter para persistencia secuencial (Pág. 14)
                try (PrintWriter pw = new PrintWriter(new FileWriter(rutaDestino))) {
                    pw.print(areaSegures.getText());
                    JOptionPane.showMessageDialog(null, "¡Fichero guardado con éxito!");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Error al escribir: " + ex.getMessage());
                }
            }
        });
    }

    // Método de validación (Lógica del ejercicio)
    private boolean esSegura(String pass) {
        if (pass.length() < 8) return false;
        
        boolean tieneNumero = false;
        boolean tieneMayuscula = false;
        
        for (char c : pass.toCharArray()) {
            if (Character.isDigit(c)) tieneNumero = true;
            if (Character.isUpperCase(c)) tieneMayuscula = true;
        }
        return tieneNumero && tieneMayuscula;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new FiltroSeguridad().setVisible(true);
        });
    }
}