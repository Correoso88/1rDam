package es.cide.programacion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public Main(){

    }
    public void crearBaseDeDatos(){
        String url = "jdbc:sqlite:BaseDatos.db";
        try(Connection con = DriverManager.getConnection(url)){
            Statement stmt = con.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS TIPUS_PLAÇA(NOM TEXT PRIMARY KEY,FUNCIO TEXT)";
            stmt.executeUpdate(sql);
            sql = "CREATE TABLE IF NOT EXISTS EMPLEADOS (NSS INTEGER, NOM TEXT, LLINATGES TEXT, EMAIL TEXT, IBAN TEXT)";
            stmt.executeUpdate(sql);
            sql = "CREATE TABLE IF NOT EXISTS PLACA (CODI INTEGER PRIMARY KEY AUTOINCREMENT, NOM TEXT NOT NULL, SALARI INTEGER NOT NULL, CODI_SUPERVISORA INTEGER REFERENCES PLAÇA (CODI), INFORME_SUPERVISIO TEXT, NOM_TIPUS TEXT REFERENCES TIPUS_PLAÇA(NOM))";
            stmt.executeUpdate(sql);
            sql = "CREATE TABLE IF NOT EXISTS NOMINA(ID INTEGER PRIMARY KEY AUTOINCREMENT , IBAN_PAGO INTEGER NOT NULL, IMPORTE TEXT NOT NULL, NSS_EMPLEAT INTEGER REFERENCES EMPLEAT (NSS), CODI_PLAÇA INTEGER REFERENCES PLAÇA (CODI) NOT NULL)";
            stmt.executeUpdate(sql);
            sql = "CREATE TABLE IF NOT EXISTS OCUPA(NSS_EMPLEAT INTEGER, CODI_PLACA INTEGER, DATA_INICI DATE NOT NULL, DATA_FI DATE, PRIMARY KEY (NSS_EMPLEAT, CODI_PLACA), FOREIGN KEY (NSS_EMPLEAT) REFERENCES EMPLEADOS (NSS), FOREIGN KEY (CODI_PLACA) REFERENCES PLACA (CODI)";
            stmt.executeUpdate(sql);
        }catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
        public static void main(String[] args) {
            new Plazas();
            Main app = new Main();
            app.crearBaseDeDatos();
    }
}
