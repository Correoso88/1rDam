package es.cide.programacion;

import java.sql.*;
import java.util.List;

import javax.swing.UIManager;

import es.cide.programacion.Logica.TiposDePlazas;
import es.cide.programacion.Ventana.VentanaTiposDePlazas;

public class Main {
    public Main() {
        crearBaseDeDatos();
    }

    public void crearBaseDeDatos() {
        String url = "jdbc:sqlite:BaseDatos.db";
        try (Connection con = DriverManager.getConnection(url)) {
            Statement stmt = con.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS TIPUS_PLACA(NOM TEXT PRIMARY KEY,FUNCIO TEXT)";
            stmt.executeUpdate(sql);
            sql = "CREATE TABLE IF NOT EXISTS EMPLEADOS (NSS INTEGER, NOM TEXT, LLINATGES TEXT, EMAIL TEXT, IBAN TEXT)";
            stmt.executeUpdate(sql);
            sql = "CREATE TABLE IF NOT EXISTS PLACA (CODI INTEGER PRIMARY KEY AUTOINCREMENT, NOM TEXT NOT NULL, SALARI INTEGER NOT NULL, CODI_SUPERVISORA INTEGER REFERENCES PLACA (CODI), INFORME_SUPERVISIO TEXT, NOM_TIPUS TEXT REFERENCES TIPUS_PLACA(NOM))";
            stmt.executeUpdate(sql);
            sql = "CREATE TABLE IF NOT EXISTS NOMINA(ID INTEGER PRIMARY KEY AUTOINCREMENT , IBAN_PAGO INTEGER NOT NULL, IMPORTE TEXT NOT NULL, NSS_EMPLEAT INTEGER REFERENCES EMPLEAT (NSS), CODI_PLACA INTEGER REFERENCES PLACA (CODI) NOT NULL)";
            stmt.executeUpdate(sql);
            sql = "CREATE TABLE IF NOT EXISTS OCUPA(NSS_EMPLEAT INTEGER NOT NULL, CODI_PLACA INTEGER NOT NULL, DATA_INICI TEXT NOT NULL, DATA_FI TEXT, PRIMARY KEY (NSS_EMPLEAT, CODI_PLACA), FOREIGN KEY (NSS_EMPLEAT) REFERENCES EMPLEADOS (NSS), FOREIGN KEY (CODI_PLACA) REFERENCES PLACA (CODI))";
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        // LOOK & FEEL Nimbus
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        new VentanaTiposDePlazas();
    }
}
