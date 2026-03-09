package es.cide.programacion;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class Menu extends JFrame {
    public Menu() {
        setSize(500, 550); // Más grande para que títulos y botones grandes quepan
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        //USo el UI manager para generalizar la fuente que yo quiera
        Font fuenteLetra = new Font("Comic Sans MS", Font.PLAIN, 16);
        UIManager.put("Label.font", fuenteLetra);
        UIManager.put("Button.font", fuenteLetra);
        UIManager.put("TextField.font", fuenteLetra);

        JPanel panelmenu = new JPanel();
        panelmenu.setLayout(new GridBagLayout());
        panelmenu.setBackground(new Color(34, 139, 34));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // espacio entre componentes
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1;

        // Titulo
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weighty = 0.1; // espacio extra vertical
        JLabel titulo = new JLabel("Bienvenido a POONG", SwingConstants.CENTER);
        titulo.setFont(new Font("Comic Sans MS", Font.BOLD, 28));
        titulo.setForeground(Color.WHITE);
        panelmenu.add(titulo, gbc);

        // Instrucciones
        gbc.gridy = 1;
        gbc.weighty = 0; // sin espacio extra
        JLabel titInstr = new JLabel("INSTRUCCIONES:");
        titInstr.setHorizontalAlignment(SwingConstants.CENTER);
        titInstr.setForeground(Color.WHITE);
        panelmenu.add(titInstr, gbc);

        gbc.gridy = 2;
        JLabel jugador1Instr = new JLabel("Jugador 1: W (Arriba) - S (Abajo)");
        jugador1Instr.setHorizontalAlignment(SwingConstants.CENTER);
        jugador1Instr.setForeground(Color.WHITE);
        panelmenu.add(jugador1Instr, gbc);

        gbc.gridy = 3;
        JLabel jugador2Instr = new JLabel("Jugador 2: ↑ (Arriba) - ↓ (Abajo)");
        jugador2Instr.setHorizontalAlignment(SwingConstants.CENTER);
        jugador2Instr.setForeground(Color.WHITE);
        panelmenu.add(jugador2Instr, gbc);

        // Jugador 1 label
        gbc.gridy = 4;
        JLabel labeljugador1 =new JLabel("Nombre del jugador 1:");
        labeljugador1.setForeground(Color.WHITE);
        panelmenu.add(labeljugador1,gbc);

        // Jugador 1 textfield
        gbc.gridy = 5;
        JTextField jugadornombre2 = new JTextField(20);
        panelmenu.add(jugadornombre2, gbc);

        // Jugador 2 label
        gbc.gridy = 6;
        JLabel labeljugador2 = new JLabel("Nombre del jugador 2:");
        labeljugador2.setForeground(Color.WHITE);
        panelmenu.add(labeljugador2,gbc);

        // Jugador 2 textfield
        gbc.gridy = 7;
        JTextField jugador2 = new JTextField(20);
        panelmenu.add(jugador2, gbc);

        // Boton jugar
        gbc.gridy = 8;
        gbc.weighty = 0.1;
        JButton bjugar = new JButton("Jugar");
        bjugar.setFont(new Font("Comic Sans MS", Font.BOLD, 28));
        bjugar.addActionListener(e -> {
            //Guardo los nombres para el POONG
            POONG.Nombre1 = jugadornombre2.getText(); 
            POONG.Nombre2 = jugador2.getText();
            dispose(); 
            POONG.main(new String[0]);
        });
        panelmenu.add(bjugar, gbc);

        add(panelmenu);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Menu();
    }
}