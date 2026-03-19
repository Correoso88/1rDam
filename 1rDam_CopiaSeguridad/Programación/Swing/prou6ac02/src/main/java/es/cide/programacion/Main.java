package es.cide.programacion;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class Main {
    public static void main(String[] args) {
        //Frame
        JFrame ServerAdminPanel = new JFrame("Tauler d'administració - Pep Java");
        ServerAdminPanel.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//Si clicas en la cruz en la ventana principal
        ServerAdminPanel.setSize(800, 600);//Pongo las medidas del frame
        ServerAdminPanel.setLayout(new GridLayout(2,2,15,15));//Le pongo al frame que tendra una "Tabla" de 2x2
        //Panel 1
        JPanel NordOest = new JPanel();//Creo el panel de arriba a la izquierda
        NordOest.setBorder(BorderFactory.createTitledBorder("Estat del sistema"));//Le pongo el titulo al panel
        JPanel panelcpu = new JPanel(new BorderLayout());//Creo el panel
        NordOest.setLayout(new GridLayout(2, 1));
        NordOest.add(new JLabel("CPU: 15% Ús", JLabel.CENTER),BorderLayout.AFTER_LAST_LINE);//Creo un textfield 
        JPanel panelram = new JPanel( new BorderLayout());//Creo el panel de la ram
        NordOest.add(new JLabel("RAM: 4GB / 16GB",JLabel.CENTER), BorderLayout.BEFORE_FIRST_LINE);//Creo un textfield
        
        //Panel 2
        JPanel NordEst = new JPanel();//Creo el panel de arriba a la derecha
        NordEst.setBorder(new CompoundBorder(BorderFactory.createTitledBorder("Accións Rapides"),new EmptyBorder(70,80,70,80)));//Le pongo titulo a el panel
        NordEst.setLayout(new GridLayout(3, 1, 0, 10));//Le pongo un grid de 3 lineas y una columna y un margen de 10 vertical
        NordEst.add(new JButton("▶Iniciar Servei"));//Añado un boton
        NordEst.add(new JButton("↻Reiniciar"));//Añado un boton
        NordEst.add(new JButton("■Aturar Servei"));//Añado un boton

        //Panel 3
        JPanel SudOest = new JPanel();//Creo el panel de abajo a la izquierda
        SudOest.setBorder(BorderFactory.createTitledBorder("Parametres de Carrega"));
        SudOest.setLayout(new GridLayout(3, 1,0,10));//Le pongo que tenga cuatro lieneas y una columna
        SudOest.add(new JLabel("Límit de Connexions (0-500):"));//Cero un label
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 500, 250);//Creo el slider
        slider.setMajorTickSpacing(100);
        slider.setMinorTickSpacing(25);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        SudOest.add(Box.createVerticalStrut(10));
        SudOest.add(slider);//Meto el slider al panel
        SudOest.add(new JLabel("Timeout (segons):"));//Creo un label
        SudOest.add(new TextField("60"));//Creo un textField

        //Panel 4
        JPanel SudEst = new JPanel();//Creo el panel de abajo a la derecho
        SudEst.setLayout(new BorderLayout());
        TextArea textoarea1 = new TextArea("[Info] Servei iniciat... \n [Warning] Connexió lenta IP 192... \n ...");//Creo el text area
        textoarea1.setEditable(false);//Pongo que el textarea no sea editable
        JScrollPane barraScroll = new JScrollPane(textoarea1);//Creo la barra de scroll
        barraScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        SudEst.setBorder(BorderFactory.createTitledBorder("Logs del Servidor en Viu"));//Pongo titulo
        SudEst.setLayout(new BorderLayout());//Creo un BorderLayout
        
        SudEst.add(barraScroll, BorderLayout.CENTER);
        ServerAdminPanel.add(NordOest);
        ServerAdminPanel.add(NordEst);
        ServerAdminPanel.add(SudOest);
        ServerAdminPanel.add(SudEst);

        ServerAdminPanel.setVisible(true);

    }
}