package es.cide.programacion;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Main {
    /**
     * Mètode per validar un número de DNI espanyol.
     *
     * @param dni El número de DNI a validar, en format de cadena (8 dígits seguits
     *            d'una lletra).
     * @return true si el DNI és vàlid, false en cas contrari.
     */
    public static boolean validarDNI(String dni) {
        // Comprova si el format del DNI és correcte:
        // - Ha de tenir exactament 8 dígits seguits d'una lletra (majúscula o
        // minúscula).
        if (!dni.matches("\\d{8}[A-HJ-NP-TV-Za-hj-np-tv-z]"))
            return false;

        // Conjunt de lletres possibles per a la validació del DNI.
        String lletres = "TRWAGMYFPDXBNJZSQVHLCKE";

        // Converteix els primers 8 caràcters (els dígits) a un número enter.
        int numero = Integer.parseInt(dni.substring(0, 8));

        // Converteix la lletra proporcionada a majúscula per evitar errors de
        // comparació.
        char lletraDNI = Character.toUpperCase(dni.charAt(8));

        // Comprova si la lletra calculada a partir del número coincideix amb la lletra
        // proporcionada.
        return lletres.charAt(numero % 23) == lletraDNI;
    }

    /**
     * Comprova si una data donada en format "dd/MM/aaaa" és anterior a la data
     * actual.
     *
     * @param dataString La data en format "dd/MM/aaaa" com a String.
     * @return Cert si la data és anterior a avui, fals en cas contrari.
     */
    public static boolean esDataAnterior(String dataString) {
        try {
            // Defineix el format de la data esperada
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            // Converteix el String a un objecte LocalDate
            LocalDate dataEntrada = LocalDate.parse(dataString, formatter);

            // Obté la data actual
            LocalDate dataActual = LocalDate.now();

            // Compara si la data entrada és anterior a la data actual
            return dataEntrada.isBefore(dataActual);
        } catch (DateTimeParseException e) {
            // Retorna fals en cas d'error en el format de la data
            System.out.println("Error: Format de data invàlid. Utilitza dd/MM/aaaa.");
            return false;
        }
    }

    public static void main(String[] args) {
        JFrame ventanaPrincipal = new JFrame();
        ventanaPrincipal.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventanaPrincipal.setSize(400, 400);

        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setBorder(BorderFactory.createTitledBorder("Reserves d'Hotel"));
        panelPrincipal.setLayout(new GridBagLayout());// Añado el grid bag
        GridBagConstraints gbc = new GridBagConstraints(); // Creo el grid bag
        gbc.insets = new Insets(8, 10, 8, 10);// Margen entre los componentes

        // JLabel nombre
        gbc.gridx = 0;
        gbc.gridy = 0; // fila 0, columna 0
        panelPrincipal.add(new JLabel("Nom:"), gbc); // Lo añado al panel y le digo que siga las reglas con el gbc

        // Textyfield Nombre
        gbc.gridx = 1;
        gbc.gridy = 0; // fila , columna 1
        gbc.fill = GridBagConstraints.HORIZONTAL;
        JTextField Nom = new JTextField(10);// Lo añado al panel
        panelPrincipal.add(Nom, gbc);

        // JLabel DNI
        gbc.gridx = 0;
        gbc.gridy = 1; // fila 1, columna 0
        panelPrincipal.add(new JLabel("DNI:"), gbc);// Lo añado al panel

        // Textyfield DNI
        gbc.gridx = 1;
        gbc.gridy = 1; // Columna 1, fila 1
        gbc.fill = GridBagConstraints.HORIZONTAL;
        JTextField DNI = new JTextField(10);// Creo un text field
        panelPrincipal.add(DNI, gbc);// Lo añado al panel

        // JLabel si es correcto o no
        gbc.gridx = 2;
        gbc.gridy = 1;
        JLabel booleano = new JLabel();
        panelPrincipal.add(booleano, gbc);

        // Listener de el DNI para ver si es correcto
        DNI.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {// Creo el metodo
            }

            public void keyReleased(KeyEvent e) { // Cuando se a acabado de poner comprueba si esta bien o mal
                if (!validarDNI(DNI.getText())) {// Hace el metodo
                    booleano.setText("Error");// Si es negativo error
                } else {
                    booleano.setText("OK");// Si no OK
                }
            }

            public void keyTyped(KeyEvent e) {
            }
        });

        // JLabel Data
        gbc.gridx = 0;
        gbc.gridy = 2; // Columna 0, fila 2
        panelPrincipal.add(new JLabel("Data Check-in:(dd/mm/yyyy)"), gbc);

        // Textyfield Data
        gbc.gridx = 1;
        gbc.gridy = 2; // Columna 1, fila 2
        JTextField datapuesta = new JTextField(10);
        panelPrincipal.add(datapuesta, gbc);

        // Listener de DATA
        datapuesta.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
            }

            public void focusLost(FocusEvent e) {//Cuando el foco se va
                if(!esDataAnterior(datapuesta.getText())){//Si es incorrecto
                    JOptionPane.showMessageDialog(panelPrincipal, "Error");//Mensaje de error
                }
            }
        });

        // Jlabel para el hotel
        gbc.gridx = 0;
        gbc.gridy = 3; // Columna 0, fila 2
        panelPrincipal.add(new JLabel("Hotel:"), gbc);

        // Check box hotel
        gbc.gridx = 1;
        gbc.gridy = 3; // Columna 1, fila 3
        String[] hoteles = { "Hotel blau", "Hotel Illa", "Hotel Vall" };
        JComboBox<String> hotelescombo = new JComboBox<>(hoteles);
        panelPrincipal.add(hotelescombo, gbc);

        // Slider
        gbc.gridx = 0;
        gbc.gridy = 4; // Columna 0, fila 4
        gbc.gridwidth = 2; // Le digo que ocupe dos lineas
        gbc.fill = GridBagConstraints.HORIZONTAL; // Ocupa todo
        JSlider slider = new JSlider(1, 15, 5); // Creo un slider con minimo de uno
        slider.setMajorTickSpacing(1);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        panelPrincipal.add(slider, gbc);

        // Listener de los hoteles
        hotelescombo.addActionListener(e -> {

            if ("Hotel blau".equals(hotelescombo.getSelectedItem())) { // Si el objeto selecionado es el hotel blau

            } else if ("Hotel Illa".equals(hotelescombo.getSelectedItem())) {// Si el objeto seleccionado es el hotel
                                                                             // Illa

            } else if ("Hotel Vall".equals(hotelescombo.getSelectedItem())) {// Si el objeto seleccionado es el hotel
                                                                             // Vall

            }
        });
        // Boton Guardar reserva
        gbc.gridx = 0;
        gbc.gridy = 5; // Columna 0, fila 5
        gbc.gridwidth = 2; // Le digo que ocupe dos lineas
        gbc.fill = GridBagConstraints.HORIZONTAL; // Ocupa todo
        JButton Guardar = new JButton("Guardar reserva");// Creo el boton
        panelPrincipal.add(Guardar, gbc); // Pongo el boton en el panel

        gbc.gridx = 0;
        gbc.gridy = 6; // Columna 0, fila 6
        gbc.gridwidth = 2; // Que ocupe dos filas
        JLabel reserva = new JLabel("");
        panelPrincipal.add(reserva, gbc);

        // Listener de
        Guardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {// Creo el metodo abstracto
                String Nombre = Nom.getText(); // Guardo el nombre
                String data = datapuesta.getText();// Guardo la data
                String dni = DNI.getText();// Guardo el DNI
                int noches = slider.getValue();// Guardo el slider
                reserva.setText("Reserva: " + Nombre + ", " + dni + ", " + data + ", " + hotelescombo.getSelectedItem()
                        + ", " + noches + " noches."); // Lo pongo todo en un Jlabel
            }
        });
        gbc.anchor = GridBagConstraints.EAST; // alineado a la derecha
        ventanaPrincipal.add(panelPrincipal); // añado el panel al frame
        ventanaPrincipal.setVisible(true);//Ventana visible
    }
}