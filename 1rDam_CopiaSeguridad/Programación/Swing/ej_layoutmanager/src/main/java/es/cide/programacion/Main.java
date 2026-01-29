package es.cide.programacion;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
public class Main {
    public static void main(String[] args) {
        //Creem la finestra principal (JFrame)
        JFrame finestra = new JFrame("Ejemplo de LayoutManager");
        finestra.setSize(500, 300);
        finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        finestra.setLayout(new BorderLayout());

        //Creem un panell superior amb FlowLayout
        JPanel panellSuperior = new JPanel();
        panellSuperior.setLayout(new FlowLayout());
        panellSuperior.add(new JButton("Boton 1"));
        panellSuperior.add(new JButton("Boton 2"));
        panellSuperior.add(new JButton("Boton 3"));
        
        //Creem un panell central amb GridLayout
        JPanel panellCentral = new JPanel();
        panellCentral.setLayout(new GridLayout(2, 2));//2 files, 2 columnas
        panellCentral.add(new JLabel("Etiqueta 1"));
        panellCentral.add(new JTextField("Etiqueta 1"));
        panellCentral.add(new JLabel("Etiqueta 1"));
        panellCentral.add(new JTextField("Etiqueta 1"));

        //Afegim els panells a la finestra
        finestra.add(panellSuperior, BorderLayout.NORTH);
        finestra.add(panellCentral, BorderLayout.CENTER);

        try {
            UIManager.setLookAndFeel("LookAndFeelDemo.java,"); 
        }catch(Exception e){
            e.printStackTrace();
        }
        //Fem visible la finestra
        finestra.setVisible(true);

    }
}