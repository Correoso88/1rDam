package es.cide.programacion;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
       //Creamos el JFrame principal
       JFrame finestra = new JFrame("Ejemplo de JDialogo");
       finestra.setSize(400,200);
       finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       finestra.setLayout(new FlowLayout());

       //Botó pero obrir el JDialog
       JButton botoObrir = new JButton("obrir dialeg");
       finestra.add(botoObrir);

       //Afegim un listener per obrir el JDialog quan es premi
        botoObrir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarDialeg(finestra);
            }
        });
        //Fem visible la finestra principal
        finestra.setVisible(true);
    }

    

        //Metode per crear i mostrar un Jdialog
        private static void mostrarDialeg(JFrame parent) {
            //Creem el dialeg modal (bloquetja la finestra principal fins que es tranqui)
            JDialog dialeg = new JDialog(parent,"Missatge Important",true);
            dialeg.setSize(300,150);

            //Afegim un missatge
            JLabel etiqueta = new JLabel("Aixo es un dialeg", JLabel.CENTER);
            dialeg.add(etiqueta, BorderLayout.CENTER);
            
            //Boto per tancar el dialeg
            JButton botoTancar = new JButton("D'acord");
            botoTancar.addActionListener(e -> dialeg.dispose()); //Tanca el dialeg
            dialeg.add(botoTancar, BorderLayout.SOUTH);

            //Fem visible el dialeg
            dialeg.setLocationRelativeTo(parent);//Centra el dialeg respecte a la finestra principal
            dialeg.setVisible(true);
           }
}
