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

import es.cide.programacion.Logica.Empleados;

public class VentanaEmpleados extends JFrame {
    public VentanaEmpleados() {
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
        bnEmpleados.setBackground(Color.gray);
        panelNavegacion.add(bnEmpleados, gbc);

        gbc.gridx = 3;
        gbc.gridy = 0;
        JButton bnNominas = new JButton("Nominas");
        panelNavegacion.add(bnNominas, gbc);

        // Action Listeners
        // Boton Plazas
        bnPlazas.addActionListener(e -> {
            new VentanaPlazas();
            dispose();
        });
        // Boton TiposDePlazas
        bnTPlazas.addActionListener(e -> {
            new VentanaTiposDePlazas();
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
        gbcP.weighty = 1.0;
        gbcP.fill = GridBagConstraints.BOTH;

        // Titulo
        gbcP.gridx = 0;
        gbcP.gridy = 0;
        gbcP.gridwidth = 9;
        gbcP.fill = GridBagConstraints.CENTER;
        panelMain.add(new JLabel("Empleados"), gbcP);

        // Jlabels
        gbcP.gridx = 0;
        gbcP.gridy = 1;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.CENTER;
        panelMain.add(new JLabel("NSS"), gbcP);

        gbcP.gridx = 1;
        gbcP.gridy = 1;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.CENTER;
        panelMain.add(new JLabel("Nombre"), gbcP);

        gbcP.gridx = 2;
        gbcP.gridy = 1;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.CENTER;
        panelMain.add(new JLabel("Apellidos"), gbcP);

        gbcP.gridx = 3;
        gbcP.gridy = 1;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.CENTER;
        panelMain.add(new JLabel("Email"), gbcP);

        gbcP.gridx = 4;
        gbcP.gridy = 1;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.CENTER;
        panelMain.add(new JLabel("IBAN"), gbcP);

        // Boton añadir
        gbcP.gridx = 5;
        gbcP.gridy = 1;
        gbcP.gridwidth = 2;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JButton bnAñadir = new JButton("Añadir");
        panelMain.add(bnAñadir, gbcP);

        // PRIMERA FILA
        // Textfield NSS 1
        gbcP.gridx = 0;
        gbcP.gridy = 2;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField ENSS1 = new JTextField();
        panelMain.add(ENSS1, gbcP);

        // Textfield Nombre 1
        gbcP.gridx = 1;
        gbcP.gridy = 2;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField Enom1 = new JTextField();
        panelMain.add(Enom1, gbcP);

        // Textfield Apellidos 1
        gbcP.gridx = 2;
        gbcP.gridy = 2;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField Eapellido1 = new JTextField();
        panelMain.add(Eapellido1, gbcP);

        // Textfield Email 1
        gbcP.gridx = 3;
        gbcP.gridy = 2;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField Eemail1 = new JTextField();
        panelMain.add(Eemail1, gbcP);

        // Textfield IBAN 1
        gbcP.gridx = 4;
        gbcP.gridy = 2;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField EIBAN1 = new JTextField();
        panelMain.add(EIBAN1, gbcP);

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
        // Textfield NSS 2
        gbcP.gridx = 0;
        gbcP.gridy = 3;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField ENSS2 = new JTextField();
        panelMain.add(ENSS2, gbcP);

        // Textfield nom 2
        gbcP.gridx = 1;
        gbcP.gridy = 3;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField Enom2 = new JTextField();
        panelMain.add(Enom2, gbcP);

        // Textfield Apellidos 2
        gbcP.gridx = 2;
        gbcP.gridy = 3;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField Eapellido2 = new JTextField();
        panelMain.add(Eapellido2, gbcP);

        // Textfield Email 2
        gbcP.gridx = 3;
        gbcP.gridy = 3;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField Eemail2 = new JTextField();
        panelMain.add(Eemail2, gbcP);

        // Textfield IBAN 2
        gbcP.gridx = 4;
        gbcP.gridy = 3;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField EIBAN2 = new JTextField();
        panelMain.add(EIBAN2, gbcP);

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
        // Textfield NSS 3
        gbcP.gridx = 0;
        gbcP.gridy = 4;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField ENSS3 = new JTextField();
        panelMain.add(ENSS3, gbcP);

        // Textfield Nombre 3
        gbcP.gridx = 1;
        gbcP.gridy = 4;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField Enom3 = new JTextField();
        panelMain.add(Enom3, gbcP);

        // Textfield Apellidos 3
        gbcP.gridx = 2;
        gbcP.gridy = 4;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField Eapellido3 = new JTextField();
        panelMain.add(Eapellido3, gbcP);

        // Textfield Email 3
        gbcP.gridx = 3;
        gbcP.gridy = 4;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField Eemail3 = new JTextField();
        panelMain.add(Eemail3, gbcP);

        // Textfield IBAN 3
        gbcP.gridx = 4;
        gbcP.gridy = 4;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField EIBAN3 = new JTextField();
        panelMain.add(EIBAN3, gbcP);

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
        // Textfield NSS 4
        gbcP.gridx = 0;
        gbcP.gridy = 5;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField ENSS4 = new JTextField();
        panelMain.add(ENSS4, gbcP);

        // Textfield Nombre 4
        gbcP.gridx = 1;
        gbcP.gridy = 5;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField Enom4 = new JTextField();
        panelMain.add(Enom4, gbcP);

        // Textfield Apellidos 4
        gbcP.gridx = 2;
        gbcP.gridy = 5;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField Eapellido4 = new JTextField();
        panelMain.add(Eapellido4, gbcP);

        // Textfield Email 4
        gbcP.gridx = 3;
        gbcP.gridy = 5;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField Eemail4 = new JTextField();
        panelMain.add(Eemail4, gbcP);

        // Textfield IBAN 4
        gbcP.gridx = 4;
        gbcP.gridy = 5;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField EIBAN4 = new JTextField();
        panelMain.add(EIBAN4, gbcP);

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
        // Textfield NSS 5
        gbcP.gridx = 0;
        gbcP.gridy = 6;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField ENSS5 = new JTextField();
        panelMain.add(ENSS5, gbcP);

        // Textfield Nombre 5
        gbcP.gridx = 1;
        gbcP.gridy = 6;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField Enom5 = new JTextField();
        panelMain.add(Enom5, gbcP);

        // Textfield Apellidos 5
        gbcP.gridx = 2;
        gbcP.gridy = 6;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField Eapellido5 = new JTextField();
        panelMain.add(Eapellido5, gbcP);

        // Textfield Email 5
        gbcP.gridx = 3;
        gbcP.gridy = 6;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField Eemail5 = new JTextField();
        panelMain.add(Eemail5, gbcP);

        // Textfield IBAN 5
        gbcP.gridx = 4;
        gbcP.gridy = 6;
        gbcP.gridwidth = 1;
        gbcP.fill = GridBagConstraints.HORIZONTAL;
        JTextField EIBAN5 = new JTextField();
        panelMain.add(EIBAN5, gbcP);

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
            int nss = Integer.parseInt(ENSS1.getText());
            String nombre = Enom1.getText();
            String apellido = Eapellido1.getText();
            String email = Eemail1.getText();
            String iban = EIBAN1.getText();
            List<Empleados> lista = Empleados.obtenerEmpleados();
            boolean existe = false;
            for (Empleados empleado : lista) {
                if (empleado.getNss() == (nss)) {
                    existe = true;
                }
            }
            if (existe) {
                Empleados.actualizarEmpleados(nss, nombre, apellido, email, iban);
            } else {
                Empleados.insertarEmpleado(nss, nombre, apellido, email, iban);
            }
            dispose();
            new VentanaEmpleados();
        });
        bnGuardar2.addActionListener(e -> {
            int nss = Integer.parseInt(ENSS2.getText());
            String nombre = Enom2.getText();
            String apellido = Eapellido2.getText();
            String email = Eemail2.getText();
            String iban = EIBAN2.getText();
            List<Empleados> lista = Empleados.obtenerEmpleados();
            boolean existe = false;
            for (Empleados empleado : lista) {
                if (empleado.getNss() == (nss)) {
                    existe = true;
                }
            }
            if (existe) {
                Empleados.actualizarEmpleados(nss, nombre, apellido, email, iban);
            } else {
                Empleados.insertarEmpleado(nss, nombre, apellido, email, iban);
            }
            dispose();
            new VentanaEmpleados();
        });
        bnGuardar3.addActionListener(e -> {
            int nss = Integer.parseInt(ENSS3.getText());
            String nombre = Enom3.getText();
            String apellido = Eapellido3.getText();
            String email = Eemail3.getText();
            String iban = EIBAN3.getText();
            List<Empleados> lista = Empleados.obtenerEmpleados();
            boolean existe = false;
            for (Empleados empleado : lista) {
                if (empleado.getNss() == (nss)) {
                    existe = true;
                }
            }
            if (existe) {
                Empleados.actualizarEmpleados(nss, nombre, apellido, email, iban);
            } else {
                Empleados.insertarEmpleado(nss, nombre, apellido, email, iban);
            }
            dispose();
            new VentanaEmpleados();
        });
        bnGuardar4.addActionListener(e -> {
            int nss = Integer.parseInt(ENSS4.getText());
            String nombre = Enom4.getText();
            String apellido = Eapellido4.getText();
            String email = Eemail4.getText();
            String iban = EIBAN4.getText();
            List<Empleados> lista = Empleados.obtenerEmpleados();
            boolean existe = false;
            for (Empleados empleado : lista) {
                if (empleado.getNss() == (nss)) {
                    existe = true;
                }
            }
            if (existe) {
                Empleados.actualizarEmpleados(nss, nombre, apellido, email, iban);
            } else {
                Empleados.insertarEmpleado(nss, nombre, apellido, email, iban);
            }
            dispose();
            new VentanaEmpleados();
        });
        bnGuardar5.addActionListener(e -> {
            int nss = Integer.parseInt(ENSS5.getText());
            String nombre = Enom5.getText();
            String apellido = Eapellido5.getText();
            String email = Eemail5.getText();
            String iban = EIBAN5.getText();
            List<Empleados> lista = Empleados.obtenerEmpleados();
            boolean existe = false;
            for (Empleados empleado : lista) {
                if (empleado.getNss() == (nss)) {
                    existe = true;
                }
            }
            if (existe) {
                Empleados.actualizarEmpleados(nss, nombre, apellido, email, iban);
            } else {
                Empleados.insertarEmpleado(nss, nombre, apellido, email, iban);
            }
            dispose();
            new VentanaEmpleados();
        });
        // Botones Borrar
        bnBorrar1.addActionListener(e -> {
            Empleados.borrarEmpleados(ENSS1.getText());
            ENSS1.setText("");
            Enom1.setText("");
            Eapellido1.setText("");
            Eemail1.setText("");
            EIBAN1.setText("");
        });
        bnBorrar2.addActionListener(e -> {
            Empleados.borrarEmpleados(ENSS2.getText());
            ENSS2.setText("");
            Enom2.setText("");
            Eapellido2.setText("");
            Eemail2.setText("");
            EIBAN2.setText("");
        });
        bnBorrar3.addActionListener(e -> {
            Empleados.borrarEmpleados(ENSS3.getText());
            ENSS3.setText("");
            Enom3.setText("");
            Eapellido3.setText("");
            Eemail3.setText("");
            EIBAN3.setText("");
        });
        bnBorrar4.addActionListener(e -> {
            Empleados.borrarEmpleados(ENSS4.getText());
            ENSS4.setText("");
            Enom4.setText("");
            Eapellido4.setText("");
            Eemail4.setText("");
            EIBAN4.setText("");
        });
        bnBorrar5.addActionListener(e -> {
            Empleados.borrarEmpleados(ENSS5.getText());
            ENSS5.setText("");
            Enom5.setText("");
            Eapellido5.setText("");
            Eemail5.setText("");
            EIBAN5.setText("");
        });

        add(panelFlechas, BorderLayout.SOUTH);
        add(panelMain);
        add(panelNavegacion, BorderLayout.NORTH);
        setVisible(true);

        List<Empleados> lista = Empleados.obtenerEmpleados();
        if (lista.size() > 0) {
            ENSS1.setText(String.valueOf(lista.get(0).getNss()));
            Enom1.setText(lista.get(0).getNombre());
            Eapellido1.setText(lista.get(0).getApellido());
            Eemail1.setText(lista.get(0).getEmail());
            EIBAN1.setText(lista.get(0).getIban());
        }
        if (lista.size() > 1) {
            ENSS2.setText(String.valueOf(lista.get(1).getNss()));
            Enom2.setText(lista.get(1).getNombre());
            Eapellido2.setText(lista.get(1).getApellido());
            Eemail2.setText(lista.get(1).getEmail());
            EIBAN2.setText(lista.get(1).getIban());
        }
        if (lista.size() > 2) {
            ENSS3.setText(String.valueOf(lista.get(2).getNss()));
            Enom3.setText(lista.get(2).getNombre());
            Eapellido3.setText(lista.get(2).getApellido());
            Eemail3.setText(lista.get(2).getEmail());
            EIBAN3.setText(lista.get(2).getIban());
        }
        if (lista.size() > 3) {
            ENSS4.setText(String.valueOf(lista.get(3).getNss()));
            Enom4.setText(lista.get(3).getNombre());
            Eapellido4.setText(lista.get(3).getApellido());
            Eemail4.setText(lista.get(3).getEmail());
            EIBAN4.setText(lista.get(3).getIban());
        }
        if (lista.size() > 4) {
            ENSS5.setText(String.valueOf(lista.get(4).getNss()));
            Enom5.setText(lista.get(4).getNombre());
            Eapellido5.setText(lista.get(4).getApellido());
            Eemail5.setText(lista.get(4).getEmail());
            EIBAN5.setText(lista.get(4).getIban());
        }
    }
}
