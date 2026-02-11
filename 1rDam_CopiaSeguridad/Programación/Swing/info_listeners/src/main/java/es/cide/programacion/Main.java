import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
            // 1. Crear la instancia del JFrame directamente
            JFrame frame = new JFrame("Registro de Películas");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400,400);
            // 2. Configurar el Layout Manager en el frame
            frame.setLayout(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            
            // Configuración general de márgenes
            gbc.insets = new Insets(8, 10, 8, 10); //Margenes
            gbc.anchor = GridBagConstraints.WEST; // Alinear etiquetas a la izquierda

            // --- FILA 0: Título ---
            gbc.gridx = 0; gbc.gridy = 0; //Columna 0 y linea 0
            gbc.weightx = 0; // La etiqueta no se estira
            gbc.fill = GridBagConstraints.NONE;
            frame.add(new JLabel("Título de la película:"), gbc);

            gbc.gridx = 1; gbc.weightx = 1;//Columna 1 y linea 0
            gbc.fill = GridBagConstraints.HORIZONTAL;
            frame.add(new JTextField("Star Wars: A new hope", 20), gbc);

            // --- FILA 1: Género ---
            gbc.gridx = 0; gbc.gridy = 1; //Columna 0 y linea 1
            gbc.weightx = 0;
            gbc.fill = GridBagConstraints.NONE;
            frame.add(new JLabel("Género:"), gbc);

            gbc.gridx = 1; //Columna 1 y linea 1
            gbc.weightx = 1.0;
            gbc.fill = GridBagConstraints.HORIZONTAL;
            String[] generos = {"Acción", "Sci-Fi", "Terror", "Drama"};
            frame.add(new JComboBox<>(generos), gbc);

            // --- FILA 2: Slider ---
            gbc.gridx = 0; gbc.gridy = 2; //Columna 0 y linea 2
            gbc.weightx = 0;
            gbc.fill = GridBagConstraints.NONE;
            frame.add(new JLabel("Año de estreno:"), gbc);

            gbc.gridx = 1; //Columna 1 y linea 2
            gbc.weightx = 1.0;
            gbc.fill = GridBagConstraints.HORIZONTAL;
            JSlider slider = new JSlider(1900, 2025, 2000);
            slider.setMajorTickSpacing(25);
            slider.setPaintTicks(true);
            slider.setPaintLabels(true);
            frame.add(slider, gbc);

            // --- FILA 3: Año seleccionado ---
            gbc.gridx = 0; gbc.gridy = 3; //Columna 0 y linea 3
            gbc.weightx = 0;
            frame.add(new JLabel("Año seleccionado:"), gbc);

            gbc.gridx = 1; //Columna 1 y linea 3
            frame.add(new JLabel("2000"), gbc);

            // Boton
            gbc.gridx = 0; gbc.gridy = 4;//Columna 0 y linea 4
            gbc.gridwidth = 2; // Ocupa 2 columnas
            gbc.fill = GridBagConstraints.HORIZONTAL; //Ocupa todo 
            frame.add(new JButton("Guardar Película"), gbc);

            gbc.gridy = 5; //Columna 0 y linea 5
            gbc.weighty = 1; // Esto empuja todo lo de arriba hacia el tope
            frame.add(new JPanel(), gbc);

            frame.setVisible(true);
    };
}