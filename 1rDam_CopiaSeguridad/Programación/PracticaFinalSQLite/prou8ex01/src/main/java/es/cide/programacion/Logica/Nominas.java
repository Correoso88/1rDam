package es.cide.programacion.Logica;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.*;
public class Nominas{
    private int id;
    private String iban_pag;
    private int importe;
    private int nss_empleado;
    private int codigo_plaza;

    public Nominas(int id, String iban_pag, int importe, int nss_empleado, int codigo_plaza) {
        this.id = id;
        this.iban_pag = iban_pag;
        this.importe = importe;
        this.nss_empleado = nss_empleado;
        this.codigo_plaza = codigo_plaza;
    }

    //Getters
    public int getId() {
        return id;
    }
    
    public String getIban_pag() {
        return iban_pag;
    }

    public int getImporte() {
        return importe;
    }

    public int getNss_empleado() {
        return nss_empleado;
    }

    public int getCodigo_plaza() {
        return codigo_plaza;
    }

    //Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setIban_pag(String iban_pag) {
        this.iban_pag = iban_pag;
    }

    public void setImporte(int importe) {
        this.importe = importe;
    }

    public void setNss_empleado(int nss_empleado) {
        this.nss_empleado = nss_empleado;
    }
    
    public void setCodigo_plaza(int codigo_plaza) {
        this.codigo_plaza = codigo_plaza;
    }
    

    
}
