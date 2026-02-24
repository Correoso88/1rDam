package es.cide.programacion;

import javax.swing.*;
import java.awt.*;

public class Menu extends JFrame {
    public Menu() {
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panelmenu = new JPanel();
        panelmenu.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // espacio entre componentes
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1;

        // Titulo
        gbc.gridx = 0;
        gbc.gridy = 0;
        JLabel jugadornombre1 = new JLabel("Bienvenido a POONG", SwingConstants.CENTER);
        panelmenu.add(jugadornombre1, gbc);

        // Jugador 1 label
        gbc.gridx = 0;
        gbc.gridy = 1;
        panelmenu.add(new JLabel("Nombre del jugador 1:"), gbc);

        // Jugador 1 textfield
        gbc.gridx = 0;
        gbc.gridy = 2;
        JTextField jugadornombre2 = new JTextField(20);
        panelmenu.add(jugadornombre2, gbc);

        // Jugador 2 label
        gbc.gridx = 0;
        gbc.gridy = 3;
        panelmenu.add(new JLabel("Nombre del jugador 2:"), gbc);

        // Jugador 2 textfield
        gbc.gridx = 0;
        gbc.gridy = 4;
        JTextField jugador2 = new JTextField(20);
        panelmenu.add(jugador2, gbc);

        // Boton jugar
        gbc.gridx = 0;
        gbc.gridy = 5;
        JButton bjugar = new JButton("Jugar");
        bjugar.addActionListener(e -> {
            POONG.Nombre1 = jugadornombre2.getText();
            POONG.Nombre2 = jugador2.getText();
            dispose();
            POONG.main(new String[0]);
        });

        panelmenu.add(bjugar, gbc);

        // Boton insutrucciones
        gbc.gridx = 0;
        gbc.gridy = 6;
        JButton binstr = new JButton("Instrucciones");
        panelmenu.add(binstr, gbc);

        add(panelmenu);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Menu();
        POONG.getNombre1();

    }
}