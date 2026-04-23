package es.cide.programacion;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.*;

public class Empleados extends JFrame {
    public Empleados() {
                setSize(750, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        JPanel panelNavegacion = new JPanel();
        panelNavegacion.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // espacio entre componentes
        gbc.weightx = 1.0;
        gbc.weighty = 0;
        gbc.fill = GridBagConstraints.BOTH;

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridheight = 1;
        JButton bnTPlazas = new JButton("Tipos De Plazas");
        panelNavegacion.add(bnTPlazas, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridheight = 1;
        JButton bnPlazas = new JButton("Plazas");
        panelNavegacion.add(bnPlazas, gbc);

        gbc.gridx = 2;
        gbc.gridy = 0;
        JButton bnEmpleados = new JButton("Empleados");
        bnEmpleados.setBackground(Color.gray);
        panelNavegacion.add(bnEmpleados, gbc);

        gbc.gridx = 3;
        gbc.gridy = 0;
        JButton bnNominas = new JButton("Nominas");
        panelNavegacion.add(bnNominas, gbc);
        
        //Action Listeners
        //Boton Plazas
        bnPlazas.addActionListener(e -> {
            new Plazas();
            dispose();
        });
        //Boton TiposDePlazas
        bnTPlazas.addActionListener(e -> {
            new TiposDePlazas();
            dispose();
        });
        //Boton Nomina
        bnNominas.addActionListener(e -> {
            new Nominas();
            dispose();
        });

        add(panelNavegacion, BorderLayout.NORTH);
        setVisible(true);
    }


}
