package es.cide.programacion;

import java.awt.BorderLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Main {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Seleccionar SO");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400, 300);
        ventana.setLayout(new BorderLayout());
        //Creo los iconos asi,(Importante poner las imagenes en la ultima carpeta,junto al main)
        ImageIcon iconoWindows = new ImageIcon(Main.class.getResource("WindowsLogo.png")); 
        ImageIcon iconoLinux = new ImageIcon(Main.class.getResource("LinuxLogo.png"));
        ImageIcon iconoMacOS = new ImageIcon(Main.class.getResource("macOSLogo.png"));

        //Creo el label, donde estaran los ImageIcon
        JLabel imagen = new JLabel();
        imagen.setHorizontalAlignment(JLabel.CENTER);

        //Creo los JRadionButtons
        JRadioButton Windows = new JRadioButton("Windows");
        JRadioButton Linux = new JRadioButton("Linux");
        JRadioButton MacOS = new JRadioButton("macOS");

        //Creo el BotonGrpup
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(Windows);
        grupo.add(Linux);
        grupo.add(MacOS);

        //Panel para los botones
        JPanel panelBotones = new JPanel();

        //Añado los JRadioButtons a el panel
        panelBotones.add(Windows);
        panelBotones.add(Linux);
        panelBotones.add(MacOS);

        //Listener
        Windows.addActionListener(e -> imagen.setIcon(iconoWindows));
        Linux.addActionListener(e -> imagen.setIcon(iconoLinux));
        MacOS.addActionListener(e -> imagen.setIcon(iconoMacOS));
        
        //Añado el panel y el JLabel
        ventana.add(panelBotones, BorderLayout.NORTH);
        ventana.add(imagen, BorderLayout.CENTER);
        ventana.setVisible(true);
    }
}