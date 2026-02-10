/*🖱️ ActionListener

👉 Para botones, menús, text fields (Enter)

boton.addActionListener(e -> {
    System.out.println("Botón presionado");
});

🖱️ MouseListener

👉 Detecta clicks y movimientos básicos del mouse

panel.addMouseListener(new MouseListener() {
    public void mouseClicked(MouseEvent e) {
        System.out.println("Click");
    }
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
});


💡 Normalmente se usa MouseAdapter para no escribir todo.

🖱️ MouseAdapter (MUY usado)
panel.addMouseListener(new MouseAdapter() {
    public void mouseClicked(MouseEvent e) {
        System.out.println("Click");
    }
});

⌨️ KeyListener

👉 Detecta teclas presionadas

campo.addKeyListener(new KeyListener() {
    public void keyPressed(KeyEvent e) {
        System.out.println(e.getKeyChar());
    }
    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}
});

🪟 WindowListener

👉 Eventos de la ventana (cerrar, abrir, minimizar)

frame.addWindowListener(new WindowAdapter() {
    public void windowClosing(WindowEvent e) {
        System.out.println("Cerrando ventana");
    }
});

🧾 ItemListener

👉 Para JCheckBox, JRadioButton, JComboBox

check.addItemListener(e -> {
    System.out.println("Estado cambiado");
});

🧠 FocusListener

👉 Cuando un componente gana o pierde foco

campo.addFocusListener(new FocusListener() {
    public void focusGained(FocusEvent e) {
        System.out.println("Foco ganado");
    }
    public void focusLost(FocusEvent e) {}
});

📜 ChangeListener

👉 Sliders, spinners, tabs

slider.addChangeListener(e -> {
    System.out.println(slider.getValue());
});

🧩 DocumentListener

👉 Detecta cambios en JTextField o JTextArea

campo.getDocument().addDocumentListener(new DocumentListener() {
    public void insertUpdate(DocumentEvent e) {
        System.out.println("Texto agregado");
    }
    public void removeUpdate(DocumentEvent e) {
        System.out.println("Texto eliminado");
    }
    public void changedUpdate(DocumentEvent e) {}
});

📋 ListSelectionListener

👉 Para JList o JTable

lista.addListSelectionListener(e -> {
    System.out.println("Elemento seleccionado");
});

🧱 ComponentListener

👉 Cambios en tamaño o visibilidad

panel.addComponentListener(new ComponentAdapter() {
    public void componentResized(ComponentEvent e) {
        System.out.println("Redimensionado");
    }
});

🧵 Runnable (no es listener, pero se usa MUCHO)

👉 Para hilos en Swing

SwingUtilities.invokeLater(() -> {
    System.out.println("Ejecutando en el hilo gráfico");
});

📌 Resumen rápido (chuleta)
Listener	Uso principal
ActionListener	Botones
MouseListener	Clicks
KeyListener	Teclado
ItemListener	Check / Combo
ChangeListener	Slider
DocumentListener	Texto
WindowListener	Ventana
FocusListener	Foco
ListSelectionListener	Listas / tablas
*/