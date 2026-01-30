package es.cide.programacion;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Main {
    public static void main(String[] args) {
        JFrame ventana = new JFrame();//Creo el frame
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Habilito la cruz de cerrar pestaña
        ventana.setSize(400,350);//Pongo tamaño a la ventana
        JButton boton = new JButton("Guarda en la lista");//Creo el boton
        JTextField texto1 = new JTextField(10);//Creo el Text field
        DefaultListModel<String> modelo = new DefaultListModel<>();//Creo el modelo de la lista
        JList<String> lista1 = new JList<>(modelo);//Creo la lista con el modelo anterior
        //Listener
        boton.addActionListener(new ActionListener() {//Creo el Listener
            public void actionPerformed(ActionEvent ev) {//Creo el metodo
                String texto = texto1.getText();//Creo una variable para guardar el contenido del textfield
                if(!texto.isEmpty()){//Si el txto no esta vacio
                modelo.addElement(texto);//le añado el modelo y lo meto en la lista
                texto1.setText("");//Lo meto en la lista
                }
            }
        });
        ventana.setLayout(new BorderLayout());//Hago un borderLayout para separar los elementos
        ventana.add(lista1,BorderLayout.EAST);//Añado la lista y la pongo en el este
        ventana.add(texto1,BorderLayout.WEST);//Añado el textField y lo coloco en el oeste
        ventana.add(boton,BorderLayout.NORTH);//Añado el boton y lo pongo en el norte
        ventana.setVisible(true);
    }
}