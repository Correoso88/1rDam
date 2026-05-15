package es.cide.programacion.Ventana;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import es.cide.programacion.*;
import es.cide.programacion.Logica.Nominas;

public class VentanaNominas extends JFrame {
    public VentanaNominas() {
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
        panelNavegacion.add(bnPlazas, gbc);

        gbc.gridx = 2;
        gbc.gridy = 0;
        JButton bnEmpleados = new JButton("Empleados");
        panelNavegacion.add(bnEmpleados, gbc);

        gbc.gridx = 3;
        gbc.gridy = 0;
        JButton bnNominas = new JButton("Nominas");
        bnNominas.setBackground(Color.gray);
        panelNavegacion.add(bnNominas, gbc);
        add(panelNavegacion, BorderLayout.NORTH);

        // Action Listeners
        // Boton Tipos de Plazas
        bnTPlazas.addActionListener(e -> {
            new VentanaTiposDePlazas();
            dispose();
        });
        // Boton Empleados
        bnEmpleados.addActionListener(e -> {
            new VentanaEmpleados();
            dispose();
        });
        // Boton Plazas
        bnPlazas.addActionListener(e -> {
            new VentanaPlazas();
            dispose();
        });
        JPanel panelMain = new JPanel();
        panelMain.setLayout(new GridBagLayout());
        GridBagConstraints gbcP = new GridBagConstraints();
        gbcP.insets = new Insets(10, 10, 10, 10); // espacio entre componentes
        gbcP.weightx = 1.0;
        gbcP.weighty = 1.0;
        gbcP.fill = GridBagConstraints.BOTH;

        // Titulo
        gbcP.gridx = 0;
        gbcP.gridy = 0;
        gbcP.gridwidth = 9;
        gbcP.fill = GridBagConstraints.CENTER;
        panelMain.add(new JLabel("Nominas"), gbcP);

        // Jlabels
        gbcP.gridx = 0;
        gbcP.gridy = 1;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.CENTER;
        panelMain.add(new JLabel("ID Empleados"), gbcP);

        gbcP.gridx = 1;
        gbcP.gridy = 1;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.CENTER;
        panelMain.add(new JLabel("IBAN_Pago"), gbcP);

        gbcP.gridx = 2;
        gbcP.gridy = 1;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.CENTER;
        panelMain.add(new JLabel("Importe"), gbcP);

        gbcP.gridx = 3;
        gbcP.gridy = 1;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.CENTER;
        panelMain.add(new JLabel("NSS"), gbcP);

        gbcP.gridx = 4;
        gbcP.gridy = 1;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.CENTER;
        panelMain.add(new JLabel("Codigo Plaza"), gbcP);

        // Boton añadir
        gbcP.gridx = 5;
        gbcP.gridy = 1;
        gbcP.gridwidth = 2;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JButton bnAñadir = new JButton("Añadir");
        panelMain.add(bnAñadir, gbcP);

        // PRIMERA FILA
        // Textfield ID 1
        gbcP.gridx = 0;
        gbcP.gridy = 2;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField NID1 = new JTextField();
        panelMain.add(NID1, gbcP);

        // Textfield IBAN_Pago 1
        gbcP.gridx = 1;
        gbcP.gridy = 2;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField NIBAN_Pago1 = new JTextField();
        panelMain.add(NIBAN_Pago1, gbcP);

        // Textfield Importe 1
        gbcP.gridx = 2;
        gbcP.gridy = 2;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField NImport1 = new JTextField();
        panelMain.add(NImport1, gbcP);

        // Textfield NSS 1
        gbcP.gridx = 3;
        gbcP.gridy = 2;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField NNSS1 = new JTextField();
        panelMain.add(NNSS1, gbcP);

        // Textfield ID Plaza 1
        gbcP.gridx = 4;
        gbcP.gridy = 2;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField NIDPla1 = new JTextField();
        panelMain.add(NIDPla1, gbcP);

        // Boton Guardar 1
        gbcP.gridx = 5;
        gbcP.gridy = 2;
        gbcP.gridwidth = 1;
        gbcP.weightx = 0;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JButton bnGuardar1 = new JButton("Guardar");
        panelMain.add(bnGuardar1, gbcP);

        // Boton Borrar 1
        gbcP.gridx = 6;
        gbcP.gridy = 2;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JButton bnBorrar1 = new JButton("Borrar");
        panelMain.add(bnBorrar1, gbcP);

        // SEGUNDA FILA
        // Textfield ID Nomina 2
        gbcP.gridx = 0;
        gbcP.gridy = 3;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField NID2 = new JTextField();
        panelMain.add(NID2, gbcP);

        // Textfield nom 2
        gbcP.gridx = 1;
        gbcP.gridy = 3;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField NIBAN_Pago2 = new JTextField();
        panelMain.add(NIBAN_Pago2, gbcP);

        // Textfield Importe 2
        gbcP.gridx = 2;
        gbcP.gridy = 3;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField NImport2 = new JTextField();
        panelMain.add(NImport2, gbcP);

        // Textfield NSS 2
        gbcP.gridx = 3;
        gbcP.gridy = 3;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField NNSS2 = new JTextField();
        panelMain.add(NNSS2, gbcP);

        // Textfield ID Plaza 2
        gbcP.gridx = 4;
        gbcP.gridy = 3;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField NIDPla2 = new JTextField();
        panelMain.add(NIDPla2, gbcP);

        // Boton Guardar 2
        gbcP.gridx = 5;
        gbcP.gridy = 3;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JButton bnGuardar2 = new JButton("Guardar");
        panelMain.add(bnGuardar2, gbcP);

        // Boton Borrar 2
        gbcP.gridx = 6;
        gbcP.gridy = 3;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JButton bnBorrar2 = new JButton("Borrar");
        panelMain.add(bnBorrar2, gbcP);

        // Tercera Fila
        // Textfield ID 3
        gbcP.gridx = 0;
        gbcP.gridy = 4;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField NID3 = new JTextField();
        panelMain.add(NID3, gbcP);

        // Textfield ID Plaza 3
        gbcP.gridx = 1;
        gbcP.gridy = 4;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField NIBAN_Pago3 = new JTextField();
        panelMain.add(NIBAN_Pago3, gbcP);

        // Textfield Importe 3
        gbcP.gridx = 2;
        gbcP.gridy = 4;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField NImport3 = new JTextField();
        panelMain.add(NImport3, gbcP);

        // Textfield NSS 3
        gbcP.gridx = 3;
        gbcP.gridy = 4;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField NNSS3 = new JTextField();
        panelMain.add(NNSS3, gbcP);

        // Textfield ID Plaza 3
        gbcP.gridx = 4;
        gbcP.gridy = 4;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField NIDPla3 = new JTextField();
        panelMain.add(NIDPla3, gbcP);

        // Boton Guardar 3
        gbcP.gridx = 5;
        gbcP.gridy = 4;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JButton bnGuardar3 = new JButton("Guardar");
        panelMain.add(bnGuardar3, gbcP);

        // Boton Borrar 3
        gbcP.gridx = 6;
        gbcP.gridy = 4;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JButton bnBorrar3 = new JButton("Borrar");
        panelMain.add(bnBorrar3, gbcP);

        // QUARTA FILA
        // Textfield ID 4
        gbcP.gridx = 0;
        gbcP.gridy = 5;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField NID4 = new JTextField();
        panelMain.add(NID4, gbcP);

        // Textfield ID Plaza 4
        gbcP.gridx = 1;
        gbcP.gridy = 5;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField NIBAN_Pago4 = new JTextField();
        panelMain.add(NIBAN_Pago4, gbcP);

        // Textfield Importe 4
        gbcP.gridx = 2;
        gbcP.gridy = 5;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField NImport4 = new JTextField();
        panelMain.add(NImport4, gbcP);

        // Textfield NSS 4
        gbcP.gridx = 3;
        gbcP.gridy = 5;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField NNSS4 = new JTextField();
        panelMain.add(NNSS4, gbcP);

        // Textfield ID Plaza 4
        gbcP.gridx = 4;
        gbcP.gridy = 5;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField NIDPla4 = new JTextField();
        panelMain.add(NIDPla4, gbcP);

        // Boton Guardar 4
        gbcP.gridx = 5;
        gbcP.gridy = 5;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JButton bnGuardar4 = new JButton("Guardar");
        panelMain.add(bnGuardar4, gbcP);

        // Boton Borrar 4
        gbcP.gridx = 6;
        gbcP.gridy = 5;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JButton bnBorrar4 = new JButton("Borrar");
        panelMain.add(bnBorrar4, gbcP);

        // QUINTA FILA
        // Textfield ID 5
        gbcP.gridx = 0;
        gbcP.gridy = 6;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField NID5 = new JTextField();
        panelMain.add(NID5, gbcP);

        // Textfield ID Plaza 5
        gbcP.gridx = 1;
        gbcP.gridy = 6;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField NIBAN_Pago5 = new JTextField();
        panelMain.add(NIBAN_Pago5, gbcP);

        // Textfield Importe 5
        gbcP.gridx = 2;
        gbcP.gridy = 6;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField NImport5 = new JTextField();
        panelMain.add(NImport5, gbcP);

        // Textfield NSS 5
        gbcP.gridx = 3;
        gbcP.gridy = 6;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField NNSS5 = new JTextField();
        panelMain.add(NNSS5, gbcP);

        // Textfield IBAN 5
        gbcP.gridx = 4;
        gbcP.gridy = 6;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField NIDPla5 = new JTextField();
        panelMain.add(NIDPla5, gbcP);

        // Boton Guardar 5
        gbcP.gridx = 5;
        gbcP.gridy = 6;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JButton bnGuardar5 = new JButton("Guardar");
        panelMain.add(bnGuardar5, gbcP);

        // Boton Borrar 5
        gbcP.gridx = 6;
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
        // Boton Guardar
        bnGuardar1.addActionListener(e -> {
            int id = Integer.parseInt(NID1.getText());
            String iban_pag = NIBAN_Pago1.getText();
            int importe = Integer.parseInt(NImport1.getText());
            int nss = Integer.parseInt(NNSS1.getText());
            int codigo_plaza = Integer.parseInt(NIDPla1.getText());
            List<Nominas> lista = Nominas.obtenerNominas();
            boolean existe = false;
            for (Nominas nomina : lista) {
                if (nomina.getId() == id) {
                    existe = true;
                }
            }
            if (existe) {
                Nominas.actualizarNomina(id, iban_pag, importe, nss, codigo_plaza);
            } else {
                Nominas.insertarNomina(iban_pag, importe, nss, codigo_plaza);
            }
            dispose();
            new VentanaNominas();
        });
        bnGuardar2.addActionListener(e -> {
            int id = Integer.parseInt(NID2.getText());
            String iban_pag = NIBAN_Pago2.getText();
            int importe = Integer.parseInt(NImport2.getText());
            int nss = Integer.parseInt(NNSS2.getText());
            int codigo_plaza = Integer.parseInt(NIDPla2.getText());
            List<Nominas> lista = Nominas.obtenerNominas();
            boolean existe = false;
            for (Nominas nomina : lista) {
                if (nomina.getId() == id) {
                    existe = true;
                }
            }
            if (existe) {
                Nominas.actualizarNomina(id, iban_pag, importe, nss, codigo_plaza);
            } else {
                Nominas.insertarNomina(iban_pag, importe, nss, codigo_plaza);
            }
            dispose();
            new VentanaNominas();
        });
        bnGuardar3.addActionListener(e -> {
            int id = Integer.parseInt(NID3.getText());
            String iban_pag = NIBAN_Pago3.getText();
            int importe = Integer.parseInt(NImport3.getText());
            int nss = Integer.parseInt(NNSS3.getText());
            int codigo_plaza = Integer.parseInt(NIDPla3.getText());
            List<Nominas> lista = Nominas.obtenerNominas();
            boolean existe = false;
            for (Nominas nomina : lista) {
                if (nomina.getId() == id) {
                    existe = true;
                }
            }
            if (existe) {
                Nominas.actualizarNomina(id, iban_pag, importe, nss, codigo_plaza);
            } else {
                Nominas.insertarNomina(iban_pag, importe, nss, codigo_plaza);
            }
            dispose();
            new VentanaNominas();
        });
        bnGuardar4.addActionListener(e -> {
            int id = Integer.parseInt(NID4.getText());
            String iban_pag = NIBAN_Pago4.getText();
            int importe = Integer.parseInt(NImport4.getText());
            int nss = Integer.parseInt(NNSS4.getText());
            int codigo_plaza = Integer.parseInt(NIDPla4.getText());
            List<Nominas> lista = Nominas.obtenerNominas();
            boolean existe = false;
            for (Nominas nomina : lista) {
                if (nomina.getId() == id) {
                    existe = true;
                }
            }
            if (existe) {
                Nominas.actualizarNomina(id, iban_pag, importe, nss, codigo_plaza);
            } else {
                Nominas.insertarNomina(iban_pag, importe, nss, codigo_plaza);
            }
            dispose();
            new VentanaNominas();
        });
        bnGuardar5.addActionListener(e -> {
            int id = Integer.parseInt(NID5.getText());
            String iban_pag = NIBAN_Pago5.getText();
            int importe = Integer.parseInt(NImport5.getText());
            int nss = Integer.parseInt(NNSS5.getText());
            int codigo_plaza = Integer.parseInt(NIDPla5.getText());
            List<Nominas> lista = Nominas.obtenerNominas();
            boolean existe = false;
            for (Nominas nomina : lista) {
                if (nomina.getId() == id) {
                    existe = true;
                }
            }
            if (existe) {
                Nominas.actualizarNomina(id, iban_pag, importe, nss, codigo_plaza);
            } else {
                Nominas.insertarNomina(iban_pag, importe, nss, codigo_plaza);
            }
            dispose();
            new VentanaNominas();
        });
        // Boton Borrar
        bnBorrar1.addActionListener(e -> {
            Nominas.borrarNomina(Integer.parseInt(NID1.getText()));
            NID1.setText("");
            NIBAN_Pago1.setText("");
            NImport1.setText("");
            NNSS1.setText("");
            NIDPla1.setText("");
        });
        bnBorrar2.addActionListener(e -> {
            Nominas.borrarNomina(Integer.parseInt(NID2.getText()));
            NID2.setText("");
            NIBAN_Pago2.setText("");
            NImport2.setText("");
            NNSS2.setText("");
            NIDPla2.setText("");
        });
        bnBorrar3.addActionListener(e -> {
            Nominas.borrarNomina(Integer.parseInt(NID3.getText()));
            NID3.setText("");
            NIBAN_Pago3.setText("");
            NImport3.setText("");
            NNSS3.setText("");
            NIDPla3.setText("");
        });
        bnBorrar4.addActionListener(e -> {
            Nominas.borrarNomina(Integer.parseInt(NID4.getText()));
            NID4.setText("");
            NIBAN_Pago4.setText("");
            NImport4.setText("");
            NNSS4.setText("");
            NIDPla4.setText("");
        });
        bnBorrar5.addActionListener(e -> {
            Nominas.borrarNomina(Integer.parseInt(NID5.getText()));
            NID5.setText("");
            NIBAN_Pago5.setText("");
            NImport5.setText("");
            NNSS5.setText("");
            NIDPla5.setText("");
        });

        add(panelFlechas, BorderLayout.SOUTH);
        add(panelMain);

        add(panelNavegacion, BorderLayout.NORTH);
        setVisible(true);

        List<Nominas> lista = Nominas.obtenerNominas();
        if (lista.size() > 0) {
            NID1.setText(String.valueOf(lista.get(0).getId()));
            NIBAN_Pago1.setText(lista.get(0).getIban_pag());
            NImport1.setText(String.valueOf(lista.get(0).getImporte()));
            NNSS1.setText(String.valueOf(lista.get(0).getNss_empleado()));
            NIDPla1.setText(String.valueOf(lista.get(0).getCodigo_plaza()));
        }
        if (lista.size() > 1) {
            NID2.setText(String.valueOf(lista.get(1).getId()));
            NIBAN_Pago2.setText(lista.get(1).getIban_pag());
            NImport2.setText(String.valueOf(lista.get(1).getImporte()));
            NNSS2.setText(String.valueOf(lista.get(1).getNss_empleado()));
            NIDPla2.setText(String.valueOf(lista.get(1).getCodigo_plaza()));
        }
        if (lista.size() > 2) {
            NID3.setText(String.valueOf(lista.get(2).getId()));
            NIBAN_Pago3.setText(lista.get(2).getIban_pag());
            NImport3.setText(String.valueOf(lista.get(2).getImporte()));
            NNSS3.setText(String.valueOf(lista.get(2).getNss_empleado()));
            NIDPla3.setText(String.valueOf(lista.get(2).getCodigo_plaza()));
        }
        if (lista.size() > 3) {
            NID4.setText(String.valueOf(lista.get(3).getId()));
            NIBAN_Pago4.setText(lista.get(3).getIban_pag());
            NImport4.setText(String.valueOf(lista.get(3).getImporte()));
            NNSS4.setText(String.valueOf(lista.get(3).getNss_empleado()));
            NIDPla4.setText(String.valueOf(lista.get(3).getCodigo_plaza()));
        }
        if (lista.size() > 4) {
            NID5.setText(String.valueOf(lista.get(4).getId()));
            NIBAN_Pago5.setText(lista.get(4).getIban_pag());
            NImport5.setText(String.valueOf(lista.get(4).getImporte()));
            NNSS5.setText(String.valueOf(lista.get(4).getNss_empleado()));
            NIDPla5.setText(String.valueOf(lista.get(4).getCodigo_plaza()));
        }

    }
}
