package es.cide.programacion;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.*;

public class Plazas extends JFrame {
    public Plazas() {
        setSize(900, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);


        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // espacio entre componentes


        
        gbc.gridx = 0;
        gbc.gridy = 0;
        JButton bnPlazas = new JButton("Plazas");
        add(bnPlazas,gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        JButton bnEmpleados = new JButton("Empleados");
        add(bnEmpleados,gbc);

        gbc.gridx = 2;
        gbc.gridy = 0;
        JButton bnNominas = new JButton("Nominas");
        add(bnNominas,gbc);
        


   
        setVisible(true);

    }
        public static void main(String[] args) {
            new Plazas();
        }
}
