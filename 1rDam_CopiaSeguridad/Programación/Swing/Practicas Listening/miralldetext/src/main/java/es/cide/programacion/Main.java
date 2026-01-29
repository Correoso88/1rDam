package es.cide.programacion;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame ventana = new JFrame("Mirall");//Creo el frame
        ventana.setSize(400, 300);//Le pongo el tamaño
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //

        ventana.setLayout(new FlowLayout());

        JLabel texto1 = new JLabel("Escribe:");
        JTextField textogrande1 = new JTextField(15); 

        textogrande1.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                textoCambiado();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                textoCambiado();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                
            }

            private void textoCambiado() {
                texto1.setText(textogrande1.getText());
            }
        });

        ventana.add(texto1);
        ventana.add(textogrande1);

        ventana.setVisible(true);
    }
}