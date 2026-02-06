package es.cide.programacion;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        JFrame ventanaPrincipal = new JFrame();
        ventanaPrincipal.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventanaPrincipal.setSize(400, 400);
        // Panel pricnipal
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BorderLayout());
        panelPrincipal.setBorder(BorderFactory.createTitledBorder("Fitcha de la pelicula"));
        panelPrincipal.setLayout(new GridLayout(9, 0));
        panelPrincipal.add(new JLabel("Titulo de la pelicula:"));
        JTextField NombrePeli = new JTextField(10);
        panelPrincipal.add(NombrePeli);

        // Combo box de los generos
        panelPrincipal.add(new JLabel("Genero:"));
        String[] genero = { "Acción", "Comedia", "Drama", "Terror", "Ciencia Ficción" };// Creo un array con los generos
        JComboBox<String> generocombo = new JComboBox<>(genero); // meto los generos en el combo box
        panelPrincipal.add(generocombo);

        generocombo.addActionListener(e -> {//Si presionas el boton
            String titulo1 = (String) generocombo.getSelectedItem();
            if(titulo1.equals("Terror")){
                JOptionPane.showMessageDialog(panelPrincipal,"CUIDADO QUE DA MIEDITO :D");
            }
            
        });

        // Slider de años
        panelPrincipal.add(new JLabel("Año de estreno"));
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 1900, 2025, 2000);// Creo el slider
        slider.setMajorTickSpacing(100);
        slider.setMinorTickSpacing(25);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        panelPrincipal.add(slider);

        panelPrincipal.add(new JLabel("Año seleccionado"));
        JLabel MostrarAño = new JLabel("2000");
        panelPrincipal.add(MostrarAño);
        // Listener del slider
        slider.addChangeListener(new ChangeListener() {// Hago el changeListener
            public void stateChanged(ChangeEvent e) {// Creo el metodo
                int año = slider.getValue();// Guardo el valor del slider
                MostrarAño.setText("" + año);
            }
        });

        // Boton de fitxa
        JButton MostrarFitxaboton = new JButton("Mostrar Fitxa");
        JLabel MostrarFitxa = new JLabel("");
        panelPrincipal.add(MostrarFitxaboton, BorderLayout.CENTER);
        panelPrincipal.add(MostrarFitxa);
        // Listener para el boton de Mostrar Fitxa
        MostrarFitxaboton.addActionListener(new ActionListener() {// Creo el Listener
            public void actionPerformed(ActionEvent ev) {
                String Titulo = NombrePeli.getText();
                String AñoElegido = MostrarAño.getText();
                MostrarFitxa.setText("Pelicula: " + Titulo + " |  Genero: " + generocombo.getSelectedItem()
                        + " |  Año: " + AñoElegido);
            }
        });

        // Seleccionar Vocal
        panelPrincipal.add(new JLabel("Selecciona una vocal"));
        String[] vocales = { "A", "E", "I", "O", "U" };// Creo un array con las vocales
        JComboBox<String> vocalescomboBox = new JComboBox<>(vocales); // meto las vocales en el combo box
        panelPrincipal.add(vocalescomboBox);

        // Listener para las vocales
        JButton contarVocales = new JButton("Contar Vocales");
        panelPrincipal.add(contarVocales);
        contarVocales.addActionListener(new ActionListener() {// Creo el Listener
            public void actionPerformed(ActionEvent ev) {
                String peli = NombrePeli.getText();
                String vocales;
            }
        });
        panelPrincipal.add(new JLabel("Numero de vocales:"));

        ventanaPrincipal.add(panelPrincipal);
        ventanaPrincipal.setVisible(true);
    }
}