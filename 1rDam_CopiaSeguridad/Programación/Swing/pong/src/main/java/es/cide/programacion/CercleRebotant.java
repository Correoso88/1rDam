package es.cide.programacion;

import javax.swing.*;

import es.cide.Rectangulo1;

import java.awt.*;
//Classe que representa el palo del jugador
import java.awt.event.*;

// Classe que representa un panell on es dibuixa un cercle que rebota
public class CercleRebotant extends JPanel implements ActionListener {
    private int x = 800, y = 450;// Coordenadas iniciales del circulo
    private int dx = 2, dy = 2;// Velocitat del moviment en X i Y
    private final int RADI = 20; // Radio del circulo
    private final int DELAY = 10;// Retardo del temporizador en milisegundos
    private Timer timer; // Temporitzador para controlar l'animacion

    // Cords Rectangulo1
    private int dx1 = 2, dy1 = 2;// Velocitat del moviment en X i Y

    // Cords Rectangulo2
    private int dx2 = 2, dy2 = 2;// Velocitat del moviment en X i Y

    // Constructor que inicia el panel i inicia el temporizador
    public CercleRebotant() {
        setBackground(Color.white); // Define el color del panel
        timer = new Timer(DELAY, this); // Crea el temporizador amb retard especificat
        timer.start();// Inicia el temporizador
    }

    // Metodo para dibujar el circulo dentro del panel
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;// Conversion a Graphics2D para mejorar el dibuix
        g2d.setColor(Color.black); // Define el color del cercle
        g2d.fillOval(x, y, RADI * 2, RADI * 2); // Dibuja el circulo con las coordenadas y el radio
        g2d.fillRect(x1, y1, 10, 80); //Dibujar el primer Rectangulo
        g2d.fillRect(x2, y2, 10, 80); //Dibujo el segundo rectangulo
    }

    // Metodos que s'executa a cada tic del temporizador per moure el cerce
    @Override
    public void actionPerformed(ActionEvent e) {
        Rectangle hitboxpelota = new Rectangle(x,y,4,4);
        // Comprueba si el circulo toca los bordes horizontales
        if (x + 2 * RADI >= getWidth() || x <= 0) {
            dx = -dx;// Invierte la dirección vertical
        }
        if (y + 2 * RADI >= getHeight() || y <= 0) {
            dy = -dy;// Invierte la dirección vertical
        }
        // Actualiza la posicion del circulo
        x += dx;
        y += dy;
        repaint(); // Redibuja el panel para actualizar la posicion del circulo

        // Rectangulo 1
        
        if(hitboxpelota){
            dx1 = -dx;
        }

    }
    //Creo las variables de el primer rectangulo
    public static int x1 = 50, y1 = 50; //Coordenadas iniciales del 
    public static int x2 = 1500, y2 = 50;// Coordenadas iniciales del rectangulo 2
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Pong"); // Creo la ventana
            JPanel panelPrincipal = new JPanel();
            CercleRebotant circulo = new CercleRebotant(); // Crea una instancia del panell
            frame.addKeyListener(new KeyListener() {
                @Override
                public void keyTyped(KeyEvent e) {
                }
                @Override
                public void keyPressed(KeyEvent e) {
                    
                }
                @Override
                public void keyReleased(KeyEvent e) {
                    if(e.getKeyCode() == KeyEvent.VK_W){
                        y1=y1-30;
                    }
                    if(e.getKeyCode() == KeyEvent.VK_S){
                        y1=y1+30;
                    }
                    if(e.getKeyCode() == KeyEvent.VK_UP){
                        y2=y2-30;
                    }
                    if(e.getKeyCode() == KeyEvent.VK_DOWN){
                        y2=y2+30;
                    }
                }
            });
            frame.add(circulo);
            frame.setSize(1600, 900);// Define lo que medira el frame
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);// Centra la ventana a la pantalla
            frame.setVisible(true);// Enseña la ventana

        });
    }
}