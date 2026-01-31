package es.cide.programacion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Main {
    public static void main(String[] args) {
        JFrame ventana = new JFrame();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400, 300);
        ventana.setLayout(new BorderLayout());

        // JPanel grande y vacío
        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE); // Fondo blanco
        ventana.add(panel, BorderLayout.CENTER);

        // JLabel para mostrar las coordenadas
        JLabel etiquetaCoordenadas = new JLabel("X: 0, Y: 0");
        etiquetaCoordenadas.setHorizontalAlignment(SwingConstants.CENTER);
        ventana.add(etiquetaCoordenadas, BorderLayout.SOUTH);

        // Listener para mover el ratón
        panel.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseMoved(MouseEvent e) {
                etiquetaCoordenadas.setText("X: " + e.getX() + ", Y: " + e.getY());
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                etiquetaCoordenadas.setText("X: " + e.getX() + ", Y: " + e.getY());
            }
        });

        ventana.setVisible(true);
    }
}