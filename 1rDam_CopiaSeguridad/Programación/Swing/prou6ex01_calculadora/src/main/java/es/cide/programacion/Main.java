package es.cide.programacion;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class Main {

    public static String operador = "";
    public static int num1 = 0;

    public static void main(String[] args) {

        try {
            // Look and feel
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        JFrame ventana = new JFrame("Calculadora"); //Creo la evntana principal
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(350, 400);
        ventana.setLayout(new BorderLayout());

        JPanel AreaEntrada = new JPanel(); //Creo el panel de el historial
        JLabel textoEntrada = new JLabel(""); //Creo el label del historial
        AreaEntrada.add(textoEntrada);

        JPanel AreaVisual = new JPanel(new BorderLayout()); //Creo el panel de donde se ve lo que ponees
        JTextField Mostrar = new JTextField();//Creo el textfield de lo que pones
        Mostrar.setEditable(false); //Hago que no sea editabñe
        AreaVisual.add(Mostrar, BorderLayout.CENTER);

        JPanel PanelDeControl = new JPanel();
        PanelDeControl.setLayout(new GridLayout(4, 4));

        ventana.setFocusable(true);

        // Pongo los botones y los listeners
        JButton nueve = new JButton("9");
        nueve.addActionListener(e -> Mostrar.setText(Mostrar.getText() + "9"));

        JButton ocho = new JButton("8");
        ocho.addActionListener(e -> Mostrar.setText(Mostrar.getText() + "8"));

        JButton siete = new JButton("7");
        siete.addActionListener(e -> Mostrar.setText(Mostrar.getText() + "7"));

        JButton seis = new JButton("6");
        seis.addActionListener(e -> Mostrar.setText(Mostrar.getText() + "6"));

        JButton cinco = new JButton("5");
        cinco.addActionListener(e -> Mostrar.setText(Mostrar.getText() + "5"));

        JButton cuatro = new JButton("4");
        cuatro.addActionListener(e -> Mostrar.setText(Mostrar.getText() + "4"));

        JButton tres = new JButton("3");
        tres.addActionListener(e -> Mostrar.setText(Mostrar.getText() + "3"));

        JButton dos = new JButton("2");
        dos.addActionListener(e -> Mostrar.setText(Mostrar.getText() + "2"));

        JButton uno = new JButton("1");
        uno.addActionListener(e -> Mostrar.setText(Mostrar.getText() + "1"));

        JButton cero = new JButton("0");
        cero.addActionListener(e -> Mostrar.setText(Mostrar.getText() + "0"));

        // Operadores
        JButton mas = new JButton("+");
        mas.addActionListener(e -> {
            num1 = Integer.parseInt(Mostrar.getText());//Guardo el numero que esta en el textfield de mostrar
            operador = "+"; 
            textoEntrada.setText(num1 + operador);
            Mostrar.setText("");
        });

        //Restar
        JButton menos = new JButton("-");
        menos.addActionListener(e -> {
            num1 = Integer.parseInt(Mostrar.getText());//Guardo el numero que esta en el textfield de mostrar
            operador = "-";
            textoEntrada.setText(num1 + operador);
            Mostrar.setText("");
        });

        //Multiplicar
        JButton multiplicar = new JButton("*");
        multiplicar.addActionListener(e -> {
            num1 = Integer.parseInt(Mostrar.getText());//Guardo el numero que esta en el textfield de mostrar
            operador = "*";
            textoEntrada.setText(num1 + operador);
            Mostrar.setText("");
        });

        //Dividir
        JButton dividir = new JButton("/");
        dividir.addActionListener(e -> {
            num1 = Integer.parseInt(Mostrar.getText());//Guardo el numero que esta en el textfield de mostrar
            operador = "/";
            textoEntrada.setText(num1 + operador);
            Mostrar.setText("");
        });

        // Borrar
        JButton borrar = new JButton("C");
        borrar.addActionListener(e -> {
            Mostrar.setText("");
            textoEntrada.setText("");
        });

        // Igual
        JButton igual = new JButton("=");
        igual.addActionListener(e -> {
            int num2 = Integer.parseInt(Mostrar.getText()); //Guardo el segundo numero
            int resultado = 0;

            switch (operador) { //Dependiendo del operador que se haya elegido antes para operar, se hara un o otro resultado
                case "+":
                    resultado = num1 + num2;
                    break;
                case "-":
                    resultado = num1 - num2;
                    break;
                case "*":
                    resultado = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) { //Si divides entre 0 error
                        resultado = num1 / num2;
                    } else {
                        JOptionPane.showMessageDialog(ventana, "No se puede dividir entre 0");
                        Mostrar.setText("");
                        textoEntrada.setText("");
                        return;
                    }
                    break;
                default:
                    Mostrar.setText("Error");
                    textoEntrada.setText("");
                    return;
            }

            // Mostrar la opereacion en el lavel 
            textoEntrada.setText(num1 + operador + num2 + " = " + resultado);
            Mostrar.setText("" + resultado);
        });

        // Detectar teclas sin tener que clicar el textfield
        ventana.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                char tecla = e.getKeyChar();

                // Si es numero se añade al textfield
                if (Character.isDigit(tecla)) {
                    Mostrar.setText(Mostrar.getText() + tecla);
                }

                // Si es operador
                if (tecla == '+' || tecla == '-' || tecla == '*' || tecla == '/') {
                    num1 = Integer.parseInt(Mostrar.getText());//Guardo el numero que esta en el textfield de mostrar
                    operador = "" + tecla;
                    textoEntrada.setText(num1 + operador);
                    Mostrar.setText("");
                }

                // Si se pulsa enter hace el igual
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    igual.doClick();
                }
                //Si se pulsa retroceso hace el de borrar
                if(e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    borrar.doClick();
                }
            }
        });

        // Añadir todo al panel
        PanelDeControl.add(nueve);
        PanelDeControl.add(ocho);
        PanelDeControl.add(siete);
        PanelDeControl.add(dividir);
        PanelDeControl.add(seis);
        PanelDeControl.add(cinco);
        PanelDeControl.add(cuatro);
        PanelDeControl.add(multiplicar);
        PanelDeControl.add(tres);
        PanelDeControl.add(dos);
        PanelDeControl.add(uno);
        PanelDeControl.add(menos);
        PanelDeControl.add(borrar);
        PanelDeControl.add(cero);
        PanelDeControl.add(mas);
        PanelDeControl.add(igual);

        //Le pongo a todos los botones margen
        for (Component c : PanelDeControl.getComponents()) {
            if (c instanceof JButton) {
                c.setFont(new Font("Arial", Font.BOLD, 18));
                ((JButton) c).setBorder(BorderFactory.createLineBorder(java.awt.Color.gray, 2));
                c.setFocusable(false);
            }
        }
        
        ventana.add(AreaEntrada, BorderLayout.NORTH);
        ventana.add(AreaVisual, BorderLayout.CENTER);
        ventana.add(PanelDeControl, BorderLayout.SOUTH);
        ventana.setVisible(true);
    }
}