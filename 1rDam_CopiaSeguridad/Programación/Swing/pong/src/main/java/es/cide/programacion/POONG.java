package es.cide.programacion;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

// Classe que representa un panell on es dibuixa un cercle que rebota
public class POONG extends JPanel implements ActionListener {
    private int x = 800, y = 400;// Coordenadas iniciales del circulo
    private int dx = 5, dy = 5;// Velocitat del moviment en X i Y
    private final int RADI = 20; // Radio del circulo
    private final int DELAY = 10;// Retardo del temporizador en milisegundos
    private Timer timer; // Temporitzador para controlar l'animacion
    private Image imagenFondo;

    // Cords Rectangulo1
    private int dx1 = 2, dy1 = 2;// Velocitat del moviment en X i Y

    // Cords Rectangulo2
    private int dx2 = 2, dy2 = 2;// Velocitat del moviment en X i Y

    // Constructor que inicia el panel i inicia el temporizador
    public POONG() {
        // Carga la imagen 
        imagenFondo = new ImageIcon(getClass().getResource("/es/cide/programacion/pista.png")).getImage();

        setBackground(Color.white); // Define el color del panel
        timer = new Timer(DELAY, this); // Crea el temporizador amb retard especificat
        timer.start();// Inicia el temporizador
    }

    // Pongo tamaño a el width y al height
    private int rec1w = 10;
    private int rec1y = 80;
    private int rec2w = 10;
    private int rec2y = 80;

    // Metodo para dibujar el circulo dentro del panel
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);


        if (imagenFondo != null) {
            g.drawImage(imagenFondo, 0, 0, getWidth(), getHeight(), this);
        }

        g.setFont(new Font("Arial", Font.BOLD, 30));
        g.setColor(Color.white);
        g.drawString(Nombre1 + ": " + contador1, 50, 40);
        g.drawString(Nombre2 + ": " + contador2, getWidth() - 150, 40);

        Graphics2D g2d = (Graphics2D) g;// Conversion a Graphics2D para mejorar el dibuix
        g2d.setColor(Color.black); // Define el color del cercle
        g2d.fillOval(x, y, RADI * 2, RADI * 2); // Dibuja el circulo con las coordenadas y el radio
        
        x2 = getWidth() - 50 - rec2w; // Ajuste dinámico de la pala derecha
        
        g2d.fillRect(x1, y1, rec1w, rec1y); // Dibujar el primer Rectangulo
        g2d.fillRect(x2, y2, rec1w, rec1y); // Dibujo el segundo rectangulo
        g.setColor(Color.white);
        g2d.fillRect(getWidth() / 2 - 1, 0, 3, getHeight()); // Dibujo la linea del medio ajustada y el menos uno es para que se no este ligeramente hacia un lado

    }

    // Metodos que s'executa a cada tic del temporizador para mover el circulo
    @Override
    public void actionPerformed(ActionEvent e) {
        if (y + 2 * RADI >= getHeight() || y <= 0) {
            dy = -dy;// Invierte la dirección vertical
        }
        // Actualiza la posicion del circulo
        x += dx;
        y += dy;
        repaint(); // Redibuja el panel para actualizar la posicion del circulo
        int DIA = RADI * 2;

        // Si la pelota toca un lado de el rectangulo 1
        if (x <= x1 + rec1w && x + DIA >= x1 && y + DIA >= y1 && y <= y1 + rec1y) {
            dx = -dx; // Se inviere la direccion horizontal
            x = x1 + rec1w + 1;// Cuando la pelota rebote, inmediatamente la emuje fuera del borde de la pala
                               // para que no se quede pillada dentro
        }

        // Si la pelota toca un lado de el rectangulo 2
        if (x <= x2 + rec2w && x + DIA >= x2 && y + DIA >= y2 && y <= y2 + rec2y) {
            dx = -dx; // Se inviere la direccion horizontal
            x = x2 - DIA - 1;// Cuando la pelota rebote, inmediatamente la emuje fuera del borde de la pala
                               // para que no se quede pillada dentro
        }

        // Hago que se reinicie la pelota y que sume al contador si llegan al borde sin
        // tocar la pala
        if (x >= getWidth() - RADI && getWidth() > 0) { //Tambien hago que si la pantalla no se a estirado del todo que no cuente puntos
            x = getWidth() / 2;
            y = getHeight() / 2;
            // Cambio el String del contador del dibuja para poder sumar
            int contador1i = Integer.parseInt(contador1);
            contador1i++;
            contador1 = String.valueOf(contador1i);
        }
        if (x <= 0) {
            x = getWidth() / 2;
            y = getHeight() / 2;
            // Cambio el String del contador del dibuja para poder sumar
            int contador2i = Integer.parseInt(contador2);
            contador2i++;
            contador2 = String.valueOf(contador2i);
        }

        // Si los rectangulos sobrepasasn lo bajo de la pantalla que ponga 0
        if (y1 <= 0) {
            y1 = 0;
        }
        if (y2 <= 0) {
            y2 = 0;
        }

        // Si los rectangulos sobrepasan el alto de la pantalla, el rectangulo se ponga
        // en el maximo alto
        if (y1 + 80 > getHeight()) {
            y1 = getHeight() - rec1y;
        }

        if (y2 + 80 > getHeight()) {
            y2 = getHeight() - rec2y;
        }

    }

    public static int x1 = 50, y1 = 50; // Coordenadas iniciales del rectangulo 1
    public static int x2 = 1530, y2 = 50;// Coordenadas iniciales del rectangulo 2
    public static String contador1 = "0"; // Contador del jugador 1
    public static String contador2 = "0"; // Contador del jugador 2
    public static String Nombre1 = "";
    public static String Nombre2 = "";

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Pong");

            POONG circulo = new POONG();
            frame.addKeyListener(new KeyListener() {
                @Override
                public void keyTyped(KeyEvent e) {
                }

                // Hago el movimiento de las palas asi
                @Override
                public void keyPressed(KeyEvent e) {
                    if (e.getKeyCode() == KeyEvent.VK_W) { // Si le das a la W
                        y1 = y1 - 30; // Que la altura de el rec1 baje...
                    }
                    if (e.getKeyCode() == KeyEvent.VK_S) {
                        y1 = y1 + 30;
                    }
                    if (e.getKeyCode() == KeyEvent.VK_UP) {// Si le das a la flecha de arriba
                        y2 = y2 - 30;// QUe la altura del rec2 bbaje...
                    }
                    if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                        y2 = y2 + 30;
                    }
                }

                @Override
                public void keyReleased(KeyEvent e) {
                }
            });
            frame.add(circulo);
            frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}