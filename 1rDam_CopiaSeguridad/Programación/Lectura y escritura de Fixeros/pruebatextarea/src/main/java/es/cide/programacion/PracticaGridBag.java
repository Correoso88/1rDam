package es.cide.programacion;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PracticaGridBag extends JFrame {

    public PracticaGridBag() {
        setTitle("Mastering GridBagLayout - CIDE");
        setSize(600, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // 1. Establecer el layout
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Configuración por defecto: margen de 5 píxeles en cada lado
        gbc.insets = new Insets(5, 5, 5, 5);

        // --- FILA 0: ETIQUETA Y TXT ORIGEN ---
        gbc.gridx = 0; gbc.gridy = 0;
        gbc.weightx = 0; // No queremos que la etiqueta se estire
        gbc.fill = GridBagConstraints.NONE;
        add(new JLabel("Origen:"), gbc);

        gbc.gridx = 1; 
        gbc.weightx = 1.0; // El campo de texto SÍ se estira horizontalmente
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(new JTextField(20), gbc);

        gbc.gridx = 2;
        gbc.weightx = 0;
        add(new JButton("Analizar"), gbc);

        // --- FILA 1: ETIQUETA Y TXT DESTINO ---
        gbc.gridx = 0; gbc.gridy = 1;
        gbc.weightx = 0;
        add(new JLabel("Destino:"), gbc);

        gbc.gridx = 1;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(new JTextField(20), gbc);

        // --- FILA 2: ETIQUETAS DE LAS ÁREAS ---
        gbc.gridy = 2;
        gbc.gridx = 0;
        add(new JLabel("Seguras"), gbc);
        gbc.gridx = 1;
        add(new JLabel("No Seguras"), gbc);

        // --- FILA 3: LAS JTEXTAREA (¡EL TRUCO!) ---
        // Aquí queremos que ocupen todo el espacio vertical sobrante
        gbc.gridy = 3;
        gbc.weighty = 1.0; // ESTO hace que las áreas crezcan hacia abajo
        gbc.fill = GridBagConstraints.BOTH; // Crece en X e Y

        // Área Seguras (columna 0 y 1, vamos a usar 1)
        gbc.gridx = 0;
        gbc.gridwidth = 1; // Ocupa 1 columna
        add(new JScrollPane(new JTextArea()), gbc);

        // Área No Seguras (columna 2)
        gbc.gridx = 1;
        gbc.gridwidth = 2; // Ocupa el resto de columnas
        add(new JScrollPane(new JTextArea()), gbc);

        // --- FILA 4: BOTÓN FINAL ---
        gbc.gridy = 4;
        gbc.gridx = 0;
        gbc.gridwidth = 3; // El botón ocupa las 3 columnas de ancho
        gbc.weighty = 0;   // No queremos que el botón sea gigante verticalmente
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.CENTER; // Centrado
        add(new JButton("GUARDAR RESULTADOS"), gbc);
    }

    public static void main(String[] args) {
        new PracticaGridBag().setVisible(true);
    }
}