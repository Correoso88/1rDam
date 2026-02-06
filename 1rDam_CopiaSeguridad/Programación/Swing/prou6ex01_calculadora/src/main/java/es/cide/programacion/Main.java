package es.cide.programacion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

public class Main {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Seleccionar SO");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(350, 400);
        ventana.setLayout(new BorderLayout());

        //Area que pone el usuario
        JPanel AreaEntrada = new JPanel();
        AreaEntrada.setBackground(Color.MAGENTA);
        JLabel textoEntrada = new JLabel("Entrada");
        AreaEntrada.add(textoEntrada);
        //Area que ve el usuario
        JPanel AreaVisual = new JPanel();
        AreaVisual.setBackground(Color.blue);
        JTextField Mostrar = new JTextField(20);
        AreaVisual.add(Mostrar);

        //Panel de los Botones
        JPanel PanelDeControl = new JPanel();
        String numeroAnterior = "";
        String actual="";
        PanelDeControl.setLayout(new GridLayout(4,4));
        
        JButton nueve = new JButton("9");
        //Listener para el nueve
        nueve.addActionListener(new ActionListener() {//Creo el Listener
            public void actionPerformed(ActionEvent ev) {//Creo el metodo
                actual="9";
                numeroAnterior=actual+numeroAnterior;
                Mostrar.setText(""+numeroAnterior);

            }
        });
        
        JButton ocho = new JButton("8");
        //Listener para el ocho
        ocho.addActionListener(new ActionListener() {//Creo el Listener
            public void actionPerformed(ActionEvent ev) {//Creo el metodo
            Mostrar.setText("8");
            }
        });
        
        JButton siete = new JButton("7");
        //Listener para el siete
        siete.addActionListener(new ActionListener() {//Creo el Listener
            public void actionPerformed(ActionEvent ev) {//Creo el metodo
            Mostrar.setText(""+7);
            }
        });
        
        JButton dividir = new JButton("/");
        JButton seis = new JButton("6");
        //Listener para el seis
        seis.addActionListener(new ActionListener() {//Creo el Listener
            public void actionPerformed(ActionEvent ev) {//Creo el metodo
            Mostrar.setText(""+6);
            }
        });
        
        JButton cinco = new JButton("5");
        //Listener para el cinco
        cinco.addActionListener(new ActionListener() {//Creo el Listener
            public void actionPerformed(ActionEvent ev) {//Creo el metodo
            Mostrar.setText(""+5);
            }
        });
        
        JButton cuatro = new JButton("4");
        //Listener para el cuatro
        cuatro.addActionListener(new ActionListener() {//Creo el Listener
            public void actionPerformed(ActionEvent ev) {//Creo el metodo
            Mostrar.setText(""+4);
            }
        });
        JButton multiplicar = new JButton("*");
        
        JButton tres = new JButton("3");
        //Listener para el tres
        tres.addActionListener(new ActionListener() {//Creo el Listener
            public void actionPerformed(ActionEvent ev) {//Creo el metodo
            Mostrar.setText(""+3);
            }
        });
        
        JButton dos = new JButton("2");
        //Listener para el dos
        dos.addActionListener(new ActionListener() {//Creo el Listener
            public void actionPerformed(ActionEvent ev) {//Creo el metodo
            Mostrar.setText(""+2);
            }
        });
        
        JButton uno = new JButton("1");
            //Listener para el uno
        uno.addActionListener(new ActionListener() {//Creo el Listener
            public void actionPerformed(ActionEvent ev) {//Creo el metodo
            Mostrar.setText(""+1);
            }
        });
        JButton menos = new JButton("-");
        JButton borrar = new JButton("C");
        
        JButton cero = new JButton("0");
        //Listener para el cero
        cero.addActionListener(new ActionListener() {//Creo el Listener
            public void actionPerformed(ActionEvent ev) {//Creo el metodo
            Mostrar.setText(""+0);
            }
        });
        JButton mas = new JButton("+");
        JButton igual = new JButton("=");
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
        ventana.add(AreaEntrada,BorderLayout.NORTH);
        ventana.add(AreaVisual,BorderLayout.CENTER);
        ventana.add(PanelDeControl,BorderLayout.SOUTH);
        ventana.setVisible(true);
    }
}