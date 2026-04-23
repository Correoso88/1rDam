package es.cide.programacion;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.Border;

import java.awt.*;

public class TiposDePlazas extends JFrame {
    
    public TiposDePlazas() {
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
        bnTPlazas.setBackground(Color.gray);
        panelNavegacion.add(bnTPlazas, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridheight = 1;
        JButton bnPlazas = new JButton("Plazas");
        panelNavegacion.add(bnPlazas, gbc);

        gbc.gridx = 2;
        gbc.gridy = 0;
        JButton bnEmpleados = new JButton("Empleados");
        panelNavegacion.add(bnEmpleados, gbc);

        gbc.gridx = 3;
        gbc.gridy = 0;
        JButton bnNominas = new JButton("Nominas");
        panelNavegacion.add(bnNominas, gbc);
        add(panelNavegacion, BorderLayout.NORTH);

        //Action Listeners
        //Boton Plazas
        bnPlazas.addActionListener(e -> {
            new Plazas();
            dispose();
        });
        //Boton Empleados
        bnEmpleados.addActionListener(e -> {
            new Empleados();
            dispose();
        });
        //Boton Nomina
        bnNominas.addActionListener(e -> {
            new Nominas();
            dispose();
        });


        JPanel panelMain = new JPanel();
        panelMain.setLayout(new GridBagLayout());
        GridBagConstraints gbcP = new GridBagConstraints();
        gbcP.insets = new Insets(10, 10, 10, 10); // espacio entre componentes
        gbcP.weightx = 1.0;
        gbcP.weighty = 0;
        gbcP.fill = GridBagConstraints.BOTH;
        
        //Titulo
        gbcP.gridx = 0;
        gbcP.gridy = 0;
        gbcP.gridwidth = 4;
        gbcP.fill = GridBagConstraints.CENTER;
        panelMain.add(new JLabel("Tipos de Plazas"),gbcP);

        //Jlabels
        gbcP.gridx = 0;
        gbcP.gridy = 1;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.CENTER;
        panelMain.add(new JLabel("Nombre"),gbcP);

        gbcP.gridx = 1;
        gbcP.gridy = 1;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.CENTER;
        panelMain.add(new JLabel("Funcion"),gbcP);

        //Boton añadir
        gbcP.gridx = 2;
        gbcP.gridy = 1;
        gbcP.gridwidth = 2;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JButton bnAñadir = new JButton("Añadir");
        panelMain.add(bnAñadir,gbcP);

        // Textfield nom 1
        gbcP.gridx = 0;
        gbcP.gridy = 2;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField TPnom1 = new JTextField();
        panelMain.add(TPnom1, gbcP);

        // Textfield Funcio 1
        gbcP.gridx = 1;
        gbcP.gridy = 2;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField TPfuncio1 = new JTextField();
        panelMain.add(TPfuncio1, gbcP);

        // Boton Guardar 1
        gbcP.gridx = 2;
        gbcP.gridy = 2;
        gbcP.gridwidth = 1;
        gbcP.weightx = 0;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JButton bnGuardar1 = new JButton("Guardar");
        panelMain.add(bnGuardar1, gbcP);

        // Boton Borrar 1
        gbcP.gridx = 3;
        gbcP.gridy = 2;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JButton bnBorrar1 = new JButton("Borrar");
        panelMain.add(bnBorrar1, gbcP);

        // Textfield nom 2
        gbcP.gridx = 0;
        gbcP.gridy = 3;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField TPnom2 = new JTextField();
        panelMain.add(TPnom2, gbcP);

        // Textfield Funcio 2
        gbcP.gridx = 1;
        gbcP.gridy = 3;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField TPfuncio2 = new JTextField();
        panelMain.add(TPfuncio2, gbcP);

        // Boton Guardar 2
        gbcP.gridx = 2;
        gbcP.gridy = 3;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JButton bnGuardar2 = new JButton("Guardar");
        panelMain.add(bnGuardar2, gbcP);

        // Boton Borrar 2
        gbcP.gridx = 3;
        gbcP.gridy = 3;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JButton bnBorrar2 = new JButton("Borrar");
        panelMain.add(bnBorrar2, gbcP);

        // Textfield nom 3
        gbcP.gridx = 0;
        gbcP.gridy = 4;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField TPnom3 = new JTextField();
        panelMain.add(TPnom3, gbcP);

        // Textfield Funcio 3
        gbcP.gridx = 1;
        gbcP.gridy = 4;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField TPfuncio3 = new JTextField();
        panelMain.add(TPfuncio3, gbcP);

        // Boton Guardar 3
        gbcP.gridx = 2;
        gbcP.gridy = 4;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JButton bnGuardar3 = new JButton("Guardar");
        panelMain.add(bnGuardar3, gbcP);

        // Boton Borrar 3
        gbcP.gridx = 3;
        gbcP.gridy = 4;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JButton bnBorrar3 = new JButton("Borrar");
        panelMain.add(bnBorrar3, gbcP);

        // Textfield nom 4
        gbcP.gridx = 0;
        gbcP.gridy = 5;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField TPnom4 = new JTextField();
        panelMain.add(TPnom4, gbcP);

        // Textfield Funcio 4
        gbcP.gridx = 1;
        gbcP.gridy = 5;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField TPfuncio4 = new JTextField();
        panelMain.add(TPfuncio4, gbcP);

        // Boton Guardar 4
        gbcP.gridx = 2;
        gbcP.gridy = 5;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JButton bnGuardar4 = new JButton("Guardar");
        panelMain.add(bnGuardar4, gbcP);

        // Boton Borrar 4
        gbcP.gridx = 3;
        gbcP.gridy = 5;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JButton bnBorrar4 = new JButton("Borrar");
        panelMain.add(bnBorrar4, gbcP);

        // Textfield nom 5
        gbcP.gridx = 0;
        gbcP.gridy = 6;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField TPnom5 = new JTextField();
        panelMain.add(TPnom5, gbcP);

        // Textfield Funcio 5
        gbcP.gridx = 1;
        gbcP.gridy = 6;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField TPfuncio5 = new JTextField();
        panelMain.add(TPfuncio5, gbcP);

        // Boton Guardar 5
        gbcP.gridx = 2;
        gbcP.gridy = 6;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JButton bnGuardar5 = new JButton("Guardar");
        panelMain.add(bnGuardar5, gbcP);

        // Boton Borrar 5
        gbcP.gridx = 3;
        gbcP.gridy = 6;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JButton bnBorrar5 = new JButton("Borrar");
        panelMain.add(bnBorrar5, gbcP);
        
        

        JPanel panelFlechas = new JPanel();
        panelFlechas.setLayout(new GridBagLayout());
        GridBagConstraints gbc2 = new GridBagConstraints();
        gbc2.insets = new Insets(10, 10, 10, 10); // espacio entre componentes
        gbc2.weightx = 0;
        gbc2.weighty = 0;
        gbc2.fill = GridBagConstraints.BOTH;

        //Botones << >>
        gbc2.gridx = 0;
        gbc2.gridy = 0;
        gbc2.gridwidth = 1;
        gbc2.fill = GridBagConstraints.HORIZONTAL;
        JButton bnizq = new JButton("<<");
        panelFlechas.add(bnizq, gbc2);       

        gbc2.gridx = 1;
        gbc2.gridy = 0;
        gbc2.gridwidth = 1;
        gbc2.fill = GridBagConstraints.HORIZONTAL;
        JButton bnder = new JButton(">>");
        panelFlechas.add(bnder, gbc2);       
        
        //Action Listeners
        //Boton 


        add(panelFlechas, BorderLayout.SOUTH);
        add(panelMain,BorderLayout.CENTER);
        setVisible(true);

    }
    


}
