package es.cide.programacion;

public class Main2 {
    /*Piensa en una tabla invisible (filas y columnas), pero flexible:

Cada componente se coloca en una celda

Puede ocupar varias filas o columnas

Puede crecer más que otros

Todo se controla con un objeto llamado GridBagConstraints

👉 GridBagLayout = Grid + reglas por componente

🔑 Clases importantes
GridBagLayout layout = new GridBagLayout();
GridBagConstraints gbc = new GridBagConstraints();


GridBagLayout → el tipo de layout

GridBagConstraints → las reglas del componente que vas a añadir

⚠️ Normalmente usas el mismo gbc y lo vas modificando antes de cada add().

🧱 Propiedades MÁS IMPORTANTES (memoriza estas)
Propiedad	Qué hace
gridx	Columna
gridy	Fila
gridwidth	Cuántas columnas ocupa
gridheight	Cuántas filas ocupa
weightx	Cuánto crece horizontal
weighty	Cuánto crece vertical
fill	Cómo se estira
insets	Márgenes
🧪 EJEMPLO COMPLETO (muy típico de examen)

Ventana con:

Label

Campo de texto

Botón

🪟 Resultado visual aproximado
Nombre: [__________]
        [  Aceptar  ]

💻 CÓDIGO COMPLETO Y COMENTADO
import javax.swing.*;
import java.awt.*;

public class EjemploGridBag {
    public static void main(String[] args) {

        // Crear la ventana
        JFrame frame = new JFrame("Ejemplo GridBagLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Asignar GridBagLayout
        frame.setLayout(new GridBagLayout());

        // Objeto que define las reglas de cada componente
        GridBagConstraints gbc = new GridBagConstraints();

        // Margen entre componentes
        gbc.insets = new Insets(5, 5, 5, 5);

        // ---------- LABEL ----------
        gbc.gridx = 0;      // columna 0
        gbc.gridy = 0;      // fila 0
        gbc.anchor = GridBagConstraints.EAST; // alineado a la derecha
        frame.add(new JLabel("Nombre:"), gbc);

        // ---------- TEXTFIELD ----------
        gbc.gridx = 1;      // columna 1
        gbc.gridy = 0;      // fila 0
        gbc.fill = GridBagConstraints.HORIZONTAL; // se estira horizontal
        gbc.weightx = 1.0;  // ocupa espacio extra
        frame.add(new JTextField(15), gbc);

        // ---------- BOTÓN ----------
        gbc.gridx = 1;      // columna 1
        gbc.gridy = 1;      // fila 1
        gbc.fill = GridBagConstraints.NONE; // no se estira
        gbc.weightx = 0;    // no crece
        gbc.anchor = GridBagConstraints.CENTER;
        frame.add(new JButton("Aceptar"), gbc);

        // Mostrar ventana
        frame.setVisible(true);
    }
}

🧩 EXPLICACIÓN CLAVE (lo que tienes que entender)
📍 gridx y gridy

Son las coordenadas:

(0,0) (1,0)
(0,1) (1,1)

📏 weightx y weighty

Deciden quién crece cuando la ventana se agranda.

weightx = 1.0 → crece

weightx = 0 → no crece

👉 Por eso el JTextField se estira y el botón no.

🧲 fill

Qué hace el componente cuando tiene espacio:

NONE → no se estira

HORIZONTAL → solo ancho

VERTICAL → solo alto

BOTH → todo

📦 insets

Margen alrededor del componente:

new Insets(arriba, izquierda, abajo, derecha)
 */
}
