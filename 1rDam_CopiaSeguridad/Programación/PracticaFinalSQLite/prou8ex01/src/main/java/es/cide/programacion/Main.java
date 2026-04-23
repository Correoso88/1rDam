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
            String sql = "CREATE TABLE IF NOT EXISTS EMPLEADOS (NSS INTEGER, NOM TEXT, LLINATGES TEXT, EMAIL TEXT, IBAN TEXT)";
            stmt.execute(sql);
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
