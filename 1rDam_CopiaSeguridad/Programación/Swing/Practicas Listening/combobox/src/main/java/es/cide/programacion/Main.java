package es.cide.programacion;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Main {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Salutador");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(300, 150);//Le pongo tamaño a la ventana
        ventana.setLayout(new FlowLayout());//Hago un flow layout para que me lo organize automaticamene

        String[] titulo = {"Sr.", "Sra.", "Dr."};//Creo un array con los tres titulos
        JComboBox<String> titulocombo = new JComboBox<>(titulo); //meto los tres titulos en el combo box
        JTextField nombre = new JTextField(10);
        JButton saluda = new JButton("Saluda");//Creo el botono
        //Listener
        saluda.addActionListener(e -> {//Si presionas el boton
            String titulo1 = (String) titulocombo.getSelectedItem(); //Guarda en titulo1 el combo, el que has elegido
            String nom = nombre.getText();//Guarda el text field
            JOptionPane.showMessageDialog(ventana, "Hola, " + titulo1 + " " + nom); //Simplemente, enseña un mensaje en la ventana con el titulo que has escogido y el nombre del text field
        });
        //Añado todo en el frame
        ventana.add(titulocombo);
        ventana.add(nombre);
        ventana.add(saluda);

        

        ventana.setVisible(true);
    }
}