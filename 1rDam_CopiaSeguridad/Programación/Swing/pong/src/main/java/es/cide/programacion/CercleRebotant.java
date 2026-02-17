package es.cide.programacion;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
    //Classe que representa el palo del jugador
    //public class Rectangulo1 extends JPanel implements ActionListener {
    //    private int x= 50, y = 50;
   // }

    // Classe que representa un panell on es dibuixa un cercle que rebota
    public class CercleRebotant extends JPanel implements ActionListener {
        private int x = , y = ;// Coordenadas iniciales del circulo
        private int dx = 2, dy = 2;// Velocitat del moviment en X i Y
        private final int RADI = 20; // Radio del circulo
        private final int DELAY = 10;// Retardo del temporizador en milisegundos
        private Timer timer; // Temporitzador para controlar l'animacion
    

    // Constructor que inicia el panel i inicia el temporizador
    public CercleRebotant() {
        setBackground(Color.white); //Define el color del panel
        timer = new Timer(DELAY, this); // Crea el temporizador amb retard especificat
        timer.start();//Inicia el temporizador
    }

    //Metodo para dibujar el circulo dentro del panel
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;//Conversió a Graphics2D per millorar el dibuix
        g2d.setColor(Color.RED); //Definex el color del cercle
        g2d.fillOval(x, y, RADI * 2, RADI * 2); //Fibuja el circulo con las coordenadas y el radio
    }

    //Metodos que s'executa a cada tic del temporizador per moure el cerce
    @Override
    public void actionPerformed(ActionEvent e) {
        //Comprova si el cercle toca les vores horitzontals
        if(x + 2 * RADI >= getWidth() || x <=0){
            dx= -dx;//Invierte la dirección vertical
        }
        if(y + 2 * RADI >= getHeight() || y <=0 ){
            dy = -dy;//Invierte la dirección vertical
        }
        //Actualiza la posicion del circulo
        x +=dx;
        y +=dy;
        repaint(); //Redibuja el panel para actualizar la posicion del circulo
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Cercle Rebotant"); //Creo la ventana
            CercleRebotant panel = new CercleRebotant(); //Crea una instancia del panell
            frame.add(panel);
            frame.setSize(1600,900);//Define lo que medira el frame
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);//Centra la ventana a la pantalla
            frame.setVisible(true);//Enseña la ventana

        });
    }
}