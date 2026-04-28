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

public class Plazas extends JFrame {
    public Plazas() {
        setSize(1250, 500);
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
        bnPlazas.setBackground(Color.gray);
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
        //Boton Tipos de Plazas
        bnTPlazas.addActionListener(e -> {
            new TiposDePlazas();
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
        gbcP.weighty = 1.0;
        gbcP.fill = GridBagConstraints.BOTH;
        
        //Titulo
        gbcP.gridx = 0;
        gbcP.gridy = 0;
        gbcP.gridwidth = 9;
        gbcP.fill = GridBagConstraints.CENTER;
        panelMain.add(new JLabel("Plazas"),gbcP);

        //Jlabels
        gbcP.gridx = 0;
        gbcP.gridy = 1;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.CENTER;
        panelMain.add(new JLabel("Codigo"),gbcP);

        gbcP.gridx = 1;
        gbcP.gridy = 1;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.CENTER;
        panelMain.add(new JLabel("Nombre"),gbcP);

        gbcP.gridx = 2;
        gbcP.gridy = 1;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.CENTER;
        panelMain.add(new JLabel("Salari"),gbcP);

        gbcP.gridx = 3;
        gbcP.gridy = 1;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.CENTER;
        panelMain.add(new JLabel("Plaça Supervisora"),gbcP);

        gbcP.gridx = 4;
        gbcP.gridy = 1;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.CENTER;
        panelMain.add(new JLabel("Informe Supervision "),gbcP);

        gbcP.gridx = 5;
        gbcP.gridy = 1;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.CENTER;
        panelMain.add(new JLabel("Tipo de Plaza"),gbcP);

        //Boton añadir
        gbcP.gridx = 6;
        gbcP.gridy = 1;
        gbcP.gridwidth = 3;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JButton bnAñadir = new JButton("Añadir");
        panelMain.add(bnAñadir,gbcP);


        //PRIMERA FILA
        // Textfield Codigo 1
        gbcP.gridx = 0;
        gbcP.gridy = 2;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField Pid1 = new JTextField();
        panelMain.add(Pid1, gbcP);

        // Textfield Nombre 1
        gbcP.gridx = 1;
        gbcP.gridy = 2;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField Pnom1 = new JTextField();
        panelMain.add(Pnom1, gbcP);

        // Textfield Salario 1
        gbcP.gridx = 2;
        gbcP.gridy = 2;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField Psalari1 = new JTextField();
        panelMain.add(Psalari1, gbcP);

        // Textfield Codigo supervisora 1
        gbcP.gridx = 3;
        gbcP.gridy = 2;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField PCodiSUP1 = new JTextField();
        panelMain.add(PCodiSUP1, gbcP);

        // Textfield Informe Supervision 1
        gbcP.gridx = 4;
        gbcP.gridy = 2;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField PInfSUP1 = new JTextField();
        panelMain.add(PInfSUP1, gbcP);

        // Textfield TipoPlaza 1
        gbcP.gridx = 5;
        gbcP.gridy = 2;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField PTipoPlaza1 = new JTextField();
        panelMain.add(PTipoPlaza1, gbcP);

        // Boton Guardar 1
        gbcP.gridx = 7;
        gbcP.gridy = 2;
        gbcP.gridwidth = 1;
        gbcP.weightx = 0;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JButton bnGuardar1 = new JButton("Guardar");
        panelMain.add(bnGuardar1, gbcP);

        // Boton Borrar 1
        gbcP.gridx = 8;
        gbcP.gridy = 2;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JButton bnBorrar1 = new JButton("Borrar");
        panelMain.add(bnBorrar1, gbcP);

        //SEGUNDA FILA
        // Textfield Codigo 2
        gbcP.gridx = 0;
        gbcP.gridy = 3;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField Pid2 = new JTextField();
        panelMain.add(Pid2, gbcP);

        // Textfield nom 2
        gbcP.gridx = 1;
        gbcP.gridy = 3;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField nom2 = new JTextField();
        panelMain.add(nom2, gbcP);

        // Textfield Salario 2
        gbcP.gridx = 2;
        gbcP.gridy = 3;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField Psalari2 = new JTextField();
        panelMain.add(Psalari2, gbcP);

        // Textfield Codigo supervisora 2
        gbcP.gridx = 3;
        gbcP.gridy = 3;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField PCodiSUP2 = new JTextField();
        panelMain.add(PCodiSUP2, gbcP);

        // Textfield Informe Supervision 2
        gbcP.gridx = 4;
        gbcP.gridy = 3;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField PInfSUP2 = new JTextField();
        panelMain.add(PInfSUP2, gbcP);

        // Textfield TipoPlaza 2
        gbcP.gridx = 5;
        gbcP.gridy = 3;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField PTipoPlaza2 = new JTextField();
        panelMain.add(PTipoPlaza2, gbcP);

        // Boton Guardar 2
        gbcP.gridx = 7;
        gbcP.gridy = 3;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JButton bnGuardar2 = new JButton("Guardar");
        panelMain.add(bnGuardar2, gbcP);

        // Boton Borrar 2
        gbcP.gridx = 8;
        gbcP.gridy = 3;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JButton bnBorrar2 = new JButton("Borrar");
        panelMain.add(bnBorrar2, gbcP);

        //Tercera Fila
        // Textfield Codigo 3
        gbcP.gridx = 0;
        gbcP.gridy = 4;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField Pid3 = new JTextField();
        panelMain.add(Pid3, gbcP);

        // Textfield Nombre 3
        gbcP.gridx = 1;
        gbcP.gridy = 4;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField Pnom3 = new JTextField();
        panelMain.add(Pnom3, gbcP);

        // Textfield Salario 3
        gbcP.gridx = 2;
        gbcP.gridy = 4;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField Psalari3 = new JTextField();
        panelMain.add(Psalari3, gbcP);

        // Textfield Codigo supervisora 3
        gbcP.gridx = 3;
        gbcP.gridy = 4;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField PCodiSUP3 = new JTextField();
        panelMain.add(PCodiSUP3, gbcP);

        // Textfield Informe Supervision 3
        gbcP.gridx = 4;
        gbcP.gridy = 4;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField PInfSUP3 = new JTextField();
        panelMain.add(PInfSUP3, gbcP);

        // Textfield TipoPlaza 3
        gbcP.gridx = 5;
        gbcP.gridy = 4;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField PTipoPlaza3 = new JTextField();
        panelMain.add(PTipoPlaza3, gbcP);

        // Boton Guardar 3
        gbcP.gridx = 7;
        gbcP.gridy = 4;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JButton bnGuardar3 = new JButton("Guardar");
        panelMain.add(bnGuardar3, gbcP);

        // Boton Borrar 3
        gbcP.gridx = 8;
        gbcP.gridy = 4;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JButton bnBorrar3 = new JButton("Borrar");
        panelMain.add(bnBorrar3, gbcP);

        //QUARTA FILA
        // Textfield Codigo 4
        gbcP.gridx = 0;
        gbcP.gridy = 5;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField Pid4 = new JTextField();
        panelMain.add(Pid4, gbcP);

        // Textfield Nombre 4
        gbcP.gridx = 1;
        gbcP.gridy = 5;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField Pnom4 = new JTextField();
        panelMain.add(Pnom4, gbcP);

        // Textfield Salario 4
        gbcP.gridx = 2;
        gbcP.gridy = 5;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField Psalari4 = new JTextField();
        panelMain.add(Psalari4, gbcP);

        // Textfield Codigo supervisora 4
        gbcP.gridx = 3;
        gbcP.gridy = 5;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField PCodiSUP4 = new JTextField();
        panelMain.add(PCodiSUP4, gbcP);

        // Textfield Informe Supervision 4
        gbcP.gridx = 4;
        gbcP.gridy = 5;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField PInfSUP4 = new JTextField();
        panelMain.add(PInfSUP4, gbcP);

        // Textfield TipoPlaza 4
        gbcP.gridx = 5;
        gbcP.gridy = 5;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField PTipoPlaza4 = new JTextField();
        panelMain.add(PTipoPlaza4, gbcP);

        // Boton Guardar 4
        gbcP.gridx = 7;
        gbcP.gridy = 5;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JButton bnGuardar4 = new JButton("Guardar");
        panelMain.add(bnGuardar4, gbcP);

        // Boton Borrar 4
        gbcP.gridx = 8;
        gbcP.gridy = 5;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JButton bnBorrar4 = new JButton("Borrar");
        panelMain.add(bnBorrar4, gbcP);

        //QUINTA FILA
        // Textfield Codigo 5
        gbcP.gridx = 0;
        gbcP.gridy = 6;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField Pid5 = new JTextField();
        panelMain.add(Pid5, gbcP);

        // Textfield Nombre 5
        gbcP.gridx = 1;
        gbcP.gridy = 6;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField Pnom5 = new JTextField();
        panelMain.add(Pnom5, gbcP);

        // Textfield Salario 5
        gbcP.gridx = 2;
        gbcP.gridy = 6;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField Psalari5 = new JTextField();
        panelMain.add(Psalari5, gbcP);

        // Textfield Codigo supervisora 5
        gbcP.gridx = 3;
        gbcP.gridy = 6;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField PCodiSUP5 = new JTextField();
        panelMain.add(PCodiSUP5, gbcP);

        // Textfield Informe Supervision 5
        gbcP.gridx = 4;
        gbcP.gridy = 6;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField PInfSUP5 = new JTextField();
        panelMain.add(PInfSUP5, gbcP);

        // Textfield TipoPlaza 5
        gbcP.gridx = 5;
        gbcP.gridy = 6;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField PTipoPlaza5 = new JTextField();
        panelMain.add(PTipoPlaza5, gbcP);

        // Boton Guardar 5
        gbcP.gridx = 7;
        gbcP.gridy = 6;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JButton bnGuardar5 = new JButton("Guardar");
        panelMain.add(bnGuardar5, gbcP);

        // Boton Borrar 5
        gbcP.gridx = 8;
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
        add(panelNavegacion, BorderLayout.NORTH);
        add(panelMain);
        setVisible(true);

    }
}
