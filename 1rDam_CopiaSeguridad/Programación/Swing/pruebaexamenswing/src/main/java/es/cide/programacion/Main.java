package es.cide.programacion;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Main {

    private static int contvoc(String s, char vocalBuscada) {
        if (s.length() == 0) {
            return 0;
        } else {
            if (s.charAt(0) == vocalBuscada) {
                return 1 + contvoc(s.substring(1), vocalBuscada);
            } else {
                return contvoc(s.substring(1), vocalBuscada);
            }
        }
    }

    public static void main(String[] args) {

        JFrame ventanaPrincipal = new JFrame();
        ventanaPrincipal.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventanaPrincipal.setSize(400, 400);

        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setBorder(BorderFactory.createTitledBorder("Ficha de la pelicula"));
        panelPrincipal.setLayout(new GridLayout(9, 2, 10, 10));

        // ===== TÍTULO =====
        panelPrincipal.add(new JLabel("Titulo de la pelicula:"));

        JTextField NombrePeli = new JTextField(10);
        JPanel panelCampoTitulo = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelCampoTitulo.add(NombrePeli);
        panelPrincipal.add(panelCampoTitulo);

        // ===== GÉNERO =====
        panelPrincipal.add(new JLabel("Genero:"));
        String[] genero = { "Acción", "Comedia", "Drama", "Terror", "Ciencia Ficción" };
        JComboBox<String> generocombo = new JComboBox<>(genero);
        panelPrincipal.add(generocombo);

        generocombo.addActionListener(e -> {
            if ("Terror".equals(generocombo.getSelectedItem())) {
                JOptionPane.showMessageDialog(panelPrincipal, "CUIDADO QUE DA MIEDITO :D");
            }
        });

        // ===== SLIDER AÑO =====
        panelPrincipal.add(new JLabel("Año de estreno"));
        JSlider slider = new JSlider(1900, 2025, 2000);
        slider.setMajorTickSpacing(100);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        panelPrincipal.add(slider);

        panelPrincipal.add(new JLabel("Año seleccionado"));
        JLabel MostrarAño = new JLabel("2000");
        panelPrincipal.add(MostrarAño);

        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                MostrarAño.setText(String.valueOf(slider.getValue()));
            }
        });

        // ===== BOTÓN FICHA =====
        JButton MostrarFitxaboton = new JButton("Mostrar Fitxa");
        JLabel MostrarFitxa = new JLabel("");

        panelPrincipal.add(MostrarFitxaboton);
        panelPrincipal.add(MostrarFitxa);

        MostrarFitxaboton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                String Titulo = NombrePeli.getText();
                String AñoElegido = MostrarAño.getText();
                MostrarFitxa.setText("Pelicula: " + Titulo +
                        " | Genero: " + generocombo.getSelectedItem() +
                        " | Año: " + AñoElegido);
            }
        });

        // ===== VOCALES =====
        panelPrincipal.add(new JLabel("Selecciona una vocal"));
        String[] vocales = { "A", "E", "I", "O", "U" };
        JComboBox<String> vocalescomboBox = new JComboBox<>(vocales);
        panelPrincipal.add(vocalescomboBox);

        JButton contarVocales = new JButton("Contar Vocales");
        JLabel TotalVocal = new JLabel();

        panelPrincipal.add(contarVocales);
        panelPrincipal.add(TotalVocal);

        contarVocales.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                String titulo = NombrePeli.getText().toLowerCase();
                char vocal = ((String) vocalescomboBox.getSelectedItem()).toLowerCase().charAt(0);
                int num = contvoc(titulo, vocal);
                TotalVocal.setText("Numero de vocales: " + num);
            }
        });

        ventanaPrincipal.add(panelPrincipal);
        ventanaPrincipal.setLocationRelativeTo(null);
        ventanaPrincipal.setVisible(true);
    }
}