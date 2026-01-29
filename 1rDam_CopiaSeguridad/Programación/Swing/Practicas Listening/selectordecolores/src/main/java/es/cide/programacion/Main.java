package es.cide.programacion;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.border.Border;
public class Main {
    public static void main(String[] args) {
        JFrame ventana = new JFrame();//Creo el frame
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Le digo que si le das a la cruz de cerrar, que cierre el frame
        ventana.setSize(400,300);//Le añado el tamaño
        JPanel panel = new JPanel(); //Creo un panel
        //Boton Rojo
        JButton botonvermell = new JButton("Vermell");//Creo el boton Rojo
        
        botonvermell.addActionListener(new ActionListener() { //Añado el Actionlistener
            @Override
            public void actionPerformed(ActionEvent e) { //Creo el metodo que hara si pulso el boton 
                panel.setBackground(Color.RED); //Hago que la pantalla se cambie a color rojo
            }
        });
        //Boton Verde
        JButton botonverd = new JButton("Verd");//Creo el boton verde
        
        botonverd.addActionListener(new ActionListener() {//Añado el Actionlistener
            @Override
            public void actionPerformed(ActionEvent e) {//Creo el metodo que hara si pulso el boton
                panel.setBackground(Color.GREEN);//Hago que la pantalla se cambie a color Verde
            }
        });
        //Boton azul
        JButton botonblau = new JButton("Blau");  //Creo el boton azul
        
        botonblau.addActionListener(new ActionListener() {//Añado el Actionlistener
            @Override
            public void actionPerformed(ActionEvent e) {//Creo el metodo que hara si pulso el boton
                panel.setBackground(Color.BLUE);//Hago que la pantalla se cambie a color azul
            }
        });
        ventana.setLayout(new BorderLayout()); //Hago que la ventana acomode los botones
        panel.add(botonvermell);//Añado el boton en la ventana
        panel.add(botonverd);//Añado el boton verde
        panel.add(botonblau);//Añado el boton azul
        ventana.add(panel,BorderLayout.CENTER);//Meto el panel en la ventana
        ventana.setVisible(true); //Hago que sea visible
    }
}