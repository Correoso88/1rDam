package es.cide.programacion.Ventana;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import es.cide.programacion.Logica.TiposDePlazas;

public class VentanaTiposDePlazas extends JFrame {
    public VentanaTiposDePlazas() {
        setSize(1250, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        JPanel panelNavegacion = new JPanel();
        panelNavegacion.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
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

        // Action Listeners
        // Boton Plazas
        bnPlazas.addActionListener(e -> {
            new VentanaPlazas();
            dispose();
        });
        // Boton Empleados
        bnEmpleados.addActionListener(e -> {
            new VentanaEmpleados();
            dispose();
        });
        // Boton Nomina
        bnNominas.addActionListener(e -> {
            new VentanaNominas();
            dispose();
        });

        JPanel panelMain = new JPanel();
        panelMain.setLayout(new GridBagLayout());
        GridBagConstraints gbcP = new GridBagConstraints();
        gbcP.insets = new Insets(10, 10, 10, 10); // espacio entre componentes
        gbcP.weightx = 1.0;
        gbcP.weighty = 0;
        gbcP.fill = GridBagConstraints.BOTH;

        // Titulo
        gbcP.gridx = 0;
        gbcP.gridy = 0;
        gbcP.gridwidth = 4;
        gbcP.fill = GridBagConstraints.CENTER;
        panelMain.add(new JLabel("Tipos de Plazas"), gbcP);

        // Jlabels
        gbcP.gridx = 0;
        gbcP.gridy = 1;
        gbcP.gridwidth = 1;
        panelMain.add(new JLabel("Nombre"), gbcP);

        gbcP.gridx = 1;
        panelMain.add(new JLabel("Funcion"), gbcP);

        // Boton añadir
        gbcP.gridx = 2;
        gbcP.gridwidth = 2;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JButton bnAñadir = new JButton("Añadir");
        panelMain.add(bnAñadir, gbcP);

        // Textfield nom 1
        gbcP.gridx = 0;
        gbcP.gridy = 2;
        gbcP.gridwidth = 1;
        JTextField TPnom1 = new JTextField();
        panelMain.add(TPnom1, gbcP);

        // Textfield Funcio 1
        gbcP.gridx = 1;
        JTextField TPfuncio1 = new JTextField();
        panelMain.add(TPfuncio1, gbcP);

        // Boton Guardar 1
        gbcP.gridx = 2;
        gbcP.weightx = 0;
        JButton bnGuardar1 = new JButton("Guardar");
        panelMain.add(bnGuardar1, gbcP);

        // Boton Borrar 1
        gbcP.gridx = 3;
        JButton bnBorrar1 = new JButton("Borrar");
        panelMain.add(bnBorrar1, gbcP);

        // Textfield nom 2
        gbcP.gridx = 0;
        gbcP.gridy = 3;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField TPnom2 = new JTextField();
        panelMain.add(TPnom2, gbcP);

        // Textfield Funcio 2
        gbcP.gridx = 1;
        JTextField TPfuncio2 = new JTextField();
        panelMain.add(TPfuncio2, gbcP);

        // Boton Guardar 2
        gbcP.gridx = 2;
        JButton bnGuardar2 = new JButton("Guardar");
        panelMain.add(bnGuardar2, gbcP);

        // Boton Borrar 2
        gbcP.gridx = 3;
        JButton bnBorrar2 = new JButton("Borrar");
        panelMain.add(bnBorrar2, gbcP);

        // Textfield nom 3
        gbcP.gridx = 0;
        gbcP.gridy = 4;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField TPnom3 = new JTextField();
        panelMain.add(TPnom3, gbcP);

        // Textfield Funcio 3
        gbcP.gridx = 1;
        JTextField TPfuncio3 = new JTextField();
        panelMain.add(TPfuncio3, gbcP);

        // Boton Guardar 3
        gbcP.gridx = 2;
        JButton bnGuardar3 = new JButton("Guardar");
        panelMain.add(bnGuardar3, gbcP);

        // Boton Borrar 3
        gbcP.gridx = 3;
        JButton bnBorrar3 = new JButton("Borrar");
        panelMain.add(bnBorrar3, gbcP);

        // Textfield nom 4
        gbcP.gridx = 0;
        gbcP.gridy = 5;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField TPnom4 = new JTextField();
        panelMain.add(TPnom4, gbcP);

        // Textfield Funcio 4
        gbcP.gridx = 1;
        JTextField TPfuncio4 = new JTextField();
        panelMain.add(TPfuncio4, gbcP);

        // Boton Guardar 4
        gbcP.gridx = 2;
        JButton bnGuardar4 = new JButton("Guardar");
        panelMain.add(bnGuardar4, gbcP);

        // Boton Borrar 4
        gbcP.gridx = 3;
        JButton bnBorrar4 = new JButton("Borrar");
        panelMain.add(bnBorrar4, gbcP);

        // Textfield nom 5
        gbcP.gridx = 0;
        gbcP.gridy = 6;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField TPnom5 = new JTextField();
        panelMain.add(TPnom5, gbcP);

        // Textfield Funcio 5
        gbcP.gridx = 1;
        gbcP.gridy = 6;
        JTextField TPfuncio5 = new JTextField();
        panelMain.add(TPfuncio5, gbcP);

        // Boton Guardar 5
        gbcP.gridx = 2;
        gbcP.gridy = 6;
        JButton bnGuardar5 = new JButton("Guardar");
        panelMain.add(bnGuardar5, gbcP);

        // Boton Borrar 5
        gbcP.gridx = 3;
        gbcP.gridy = 6;
        JButton bnBorrar5 = new JButton("Borrar");
        panelMain.add(bnBorrar5, gbcP);

        JPanel panelFlechas = new JPanel();
        panelFlechas.setLayout(new GridBagLayout());
        GridBagConstraints gbc2 = new GridBagConstraints();
        gbc2.insets = new Insets(10, 10, 10, 10); // espacio entre componentes
        gbc2.weightx = 0;
        gbc2.weighty = 0;
        gbc2.fill = GridBagConstraints.BOTH;

        // Botones << >>
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

        // Action Listeners
        // Botones Guardar
        bnGuardar1.addActionListener(e -> {
            String nombre = TPnom1.getText();
            String funcion = TPfuncio1.getText();
            List<TiposDePlazas> lista = TiposDePlazas.obtenerTiposDePlazas();
            boolean existe = false;
            for (TiposDePlazas tiposplazas : lista) {
                if(tiposplazas.getNombre().equals(nombre)){
                    existe = true;
                }
            }
            if(existe) {
                TiposDePlazas.actualizar(nombre, funcion);
            }else {
                TiposDePlazas.insertarTiposDePlazas(nombre, funcion);
            }
            dispose();
            new VentanaTiposDePlazas();
        });
        bnGuardar2.addActionListener(e -> {
            String nombre = TPnom2.getText();
            String funcion = TPfuncio2.getText();
            List<TiposDePlazas> lista = TiposDePlazas.obtenerTiposDePlazas();
            boolean existe = false;
            for (TiposDePlazas tiposplazas : lista) {
                if(tiposplazas.getNombre().equals(nombre)){
                    existe = true;
                }
            }
            if(existe) {
                TiposDePlazas.actualizar(nombre, funcion);
            }else {
                TiposDePlazas.insertarTiposDePlazas(nombre, funcion);
            }
            dispose();
            new VentanaTiposDePlazas();
        });
        bnGuardar3.addActionListener(e -> {
            String nombre = TPnom3.getText();
            String funcion = TPfuncio3.getText();
            List<TiposDePlazas> lista = TiposDePlazas.obtenerTiposDePlazas();
            boolean existe = false;
            for (TiposDePlazas tiposplazas : lista) {
                if(tiposplazas.getNombre().equals(nombre)){
                    existe = true;
                }
            }
            if(existe) {
                TiposDePlazas.actualizar(nombre, funcion);
            }else {
                TiposDePlazas.insertarTiposDePlazas(nombre, funcion);
            }
            dispose();
            new VentanaTiposDePlazas();
        });
        bnGuardar4.addActionListener(e -> {
            String nombre = TPnom4.getText();
            String funcion = TPfuncio4.getText();
            List<TiposDePlazas> lista = TiposDePlazas.obtenerTiposDePlazas();
            boolean existe = false;
            for (TiposDePlazas tiposplazas : lista) {
                if(tiposplazas.getNombre().equals(nombre)){
                    existe = true;
                }
            }
            if(existe) {
                TiposDePlazas.actualizar(nombre, funcion);
            }else {
                TiposDePlazas.insertarTiposDePlazas(nombre, funcion);
            }
            dispose();
            new VentanaTiposDePlazas();
        });
        bnGuardar5.addActionListener(e -> {
            String nombre = TPnom5.getText();
            String funcion = TPfuncio5.getText();
            List<TiposDePlazas> lista = TiposDePlazas.obtenerTiposDePlazas();
            boolean existe = false;
            for(TiposDePlazas tiposplazas : lista) {
                if(tiposplazas.getNombre().equals(nombre)){
                    existe = true;
                }
            }
            if(existe) {
                TiposDePlazas.actualizar(nombre, funcion);
            }else {
                TiposDePlazas.insertarTiposDePlazas(nombre, funcion);
            }
            dispose();
            new VentanaTiposDePlazas();
        });

        // Boton Borrar
        bnBorrar1.addActionListener(e -> {
            TiposDePlazas.borrar(TPnom1.getText());
            TPfuncio1.setText("");
            TPnom1.setText("");
        });
        bnBorrar2.addActionListener(e -> {
            TiposDePlazas.borrar(TPnom2.getText());
            TPfuncio2.setText("");
            TPnom2.setText("");
        });
        bnBorrar3.addActionListener(e -> {
            TiposDePlazas.borrar(TPnom3.getText());
            TPfuncio3.setText("");
            TPnom3.setText("");
        });
        bnBorrar4.addActionListener(e -> {
            TiposDePlazas.borrar(TPnom4.getText());
            TPfuncio4.setText("");
            TPnom4.setText("");
        });
        bnBorrar5.addActionListener(e -> {
            TPfuncio5.setText("");
            TPnom5.setText("");
            TiposDePlazas.borrar(TPnom5.getText());
        });

        add(panelFlechas, BorderLayout.SOUTH);
        add(panelMain, BorderLayout.CENTER);
        setVisible(true);

        List<TiposDePlazas> lista = TiposDePlazas.obtenerTiposDePlazas();
        if (lista.size() > 0) {
            TPnom1.setText(lista.get(0).getNombre());
            TPfuncio1.setText(lista.get(0).getFuncion());
        }

        if (lista.size() > 1) {
            TPnom2.setText(lista.get(1).getNombre());
            TPfuncio2.setText(lista.get(1).getFuncion());
        }

        if (lista.size() > 2) {
            TPnom3.setText(lista.get(2).getNombre());
            TPfuncio3.setText(lista.get(2).getFuncion());
        }

        if (lista.size() > 3) {
            TPnom4.setText(lista.get(3).getNombre());
            TPfuncio4.setText(lista.get(3).getFuncion());
        }

        if (lista.size() > 4) {
            TPnom5.setText(lista.get(4).getNombre());
            TPfuncio5.setText(lista.get(4).getFuncion());
        }

    }
}
