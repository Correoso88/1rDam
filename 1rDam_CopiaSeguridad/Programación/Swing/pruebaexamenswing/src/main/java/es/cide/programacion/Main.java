package es.cide.programacion;

import java.awt.BorderLayout;
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
        // Caso base: si la cadena está vacía, no hay más caracteres que contar
        if (s.length() == 0) {
            return 0;
        } else {
            // Comparamos el primer carácter de la cadena con la vocal buscada
            if (s.charAt(0) == vocalBuscada) {
                // Si coincide, sumamos 1 y llamamos recursivamente con el resto de la cadena
                return 1 + contvoc(s.substring(1), vocalBuscada);
            } else {
                // Si no coincide, solo llamamos recursivamente con el resto de la cadena
                return contvoc(s.substring(1), vocalBuscada);
            }
        }
    }
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
            @Override
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
        JLabel TotalVocal= new JLabel();

        // Listener para las vocales
        JButton contarVocales = new JButton("Contar Vocales");
        panelPrincipal.add(contarVocales);
        contarVocales.addActionListener(new ActionListener() {// Creo el Listener
            @Override
            public void actionPerformed(ActionEvent ev) {
                // Obtenemos el título de la película y lo convertimos a minúsculas
                // para hacer la comparación sin importar mayúsculas/minúsculas
                String Titulo = NombrePeli.getText().toLowerCase();

                // Obtenemos la vocal seleccionada del ComboBox
                String vocalSeleccionada = ((String) vocalescomboBox.getSelectedItem()).toLowerCase();
                // Extraemos el primer carácter (la vocal) como tipo char
                char vocalChar = vocalSeleccionada.charAt(0);

                // Llamamos al método recursivo para contar cuántas veces aparece esa vocal
                int num = contvoc(Titulo, vocalChar);

                // Mostramos el resultado en la etiqueta
                TotalVocal.setText(String.valueOf("Numero de vocales: "+num));
            }
        });
        panelPrincipal.add(TotalVocal);
        ventanaPrincipal.add(panelPrincipal);
        ventanaPrincipal.setVisible(true);
    }
}