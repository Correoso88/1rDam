package es.cide.programacion;

import java.sql.*;
import java.util.List;

import javax.swing.UIManager;

import es.cide.programacion.Logica.TiposDePlazas;
import es.cide.programacion.Ventana.VentanaTiposDePlazas;

public class Main {
    // Obtener Tipos de plazsa
    public static List<TiposDePlazas> obtenerTiposPlaza() {
        String url = "jdbc:sqlite:BaseDatos.db";
        String sql = "SELECT * FROM TIPUS_PLACA";
        List<TiposDePlazas> lista = new java.util.ArrayList<>();

        try (Connection con = DriverManager.getConnection(url);
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                String nom = rs.getString("NOM");
                String funcio = rs.getString("FUNCIO");
                lista.add(new TiposDePlazas( nom, funcio ));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return lista;
    }

    // Obtener Plazas
    public static List<String[]> obtenerPlazas() {
        String url = "jdbc:sqlite:BaseDatos.db";
        String sql = "SELECT * FROM EMLPEADOS";
        java.util.List<String[]> lista = new java.util.ArrayList<>();

        try (Connection con = DriverManager.getConnection(url);
                java.sql.Statement stmt = con.createStatement();
                java.sql.ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                String codi = rs.getString("CODI");
                String nom = rs.getString("NOM");
                String salari = rs.getString("SALARI");
                String codi_sup = rs.getString("CODI_SUPERVISORA");
                String inf_sup = rs.getString("INFORME_SUPERVISIO");
                String nom_tipus_plaza = rs.getString("NOM_TIPUS");
                lista.add(new String[] { codi, nom, salari, codi_sup, inf_sup, nom_tipus_plaza });
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return lista;
    }

    // Metodo obtener Empleados
    public static List<String[]> obtenerEmpleados() {
        String url = "jdbc:sqlite:BaseDatos.db";
        String sql = "SELECT * FROM EMPLEADOS";
        java.util.List<String[]> lista = new java.util.ArrayList<>();

        try (Connection con = DriverManager.getConnection(url);
                java.sql.Statement stmt = con.createStatement();
                java.sql.ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                String nss = rs.getString("NSS");
                String nom = rs.getString("NOM");
                String apellido = rs.getString("LLINATGES");
                String email = rs.getString("EMAIL");
                String iban = rs.getString("IBAN");
                lista.add(new String[] { nss, nom, apellido, email, iban });
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return lista;
    }

    // Metodo obtener Nominas
    public static List<String[]> obtenerNominas() {
        String url = "jdbc:sqlite:BaseDatos.db";
        String sql = "SELECT * FROM NOMINA";
        java.util.List<String[]> lista = new java.util.ArrayList<>();

        try (Connection con = DriverManager.getConnection(url);
                java.sql.Statement stmt = con.createStatement();
                java.sql.ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                String id = rs.getString("ID");
                String Iban_Pago = rs.getString("IBAN_PAGO");
                String importe = rs.getString("IMPORTE");
                String NSS_Empleado = rs.getString("NSS_EMPLEAT");
                String id_Plaza = rs.getString("CODI_PLACA");
                lista.add(new String[] { id, Iban_Pago, importe, NSS_Empleado, id_Plaza });
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return lista;
    }

    // Instertar TipoDePlaza
    public static void insertarTipoPlaza(String nombre, String funcion) {
        String url = "jdbc:sqlite:BaseDatos.db";
        String sql = "INSERT INTO TIPUS_PLACA (NOM, FUNCIO) VALUES (?, ?)";

        try (Connection con = DriverManager.getConnection(url);
                java.sql.PreparedStatement pstmt = con.prepareStatement(sql)) {

            pstmt.setString(1, nombre);
            pstmt.setString(2, funcion);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Instertar Empleados
    public static void insertarEmpleados(String nss, String nom, String apellido, String email, String IBAN) {
        String url = "jdbc:sqlite:BaseDatos.db";
        String sql = "INSERT INTO EMPLEADOS (NSS, NOM, LLINATGES, EMAIL, IBAN) VALUES (?, ?, ?, ?, ?)";

        try (Connection con = DriverManager.getConnection(url);
                java.sql.PreparedStatement pstmt = con.prepareStatement(sql)) {

            pstmt.setString(1, nss);
            pstmt.setString(2, nom);
            pstmt.setString(3, apellido);
            pstmt.setString(4, email);
            pstmt.setString(5, IBAN);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Instertar Plazas
    public static void insertarPlazas(String codi, String nom, String salari, String id_sup, String info_sup,
            String tipoPlazas) {
        String url = "jdbc:sqlite:BaseDatos.db";
        String sql = "INSERT INTO PLACA (CODI, NOM, SALARI, CODI_SUPERVISORA, INFORME_SUPERVISIO, NOM_TIPUS) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection con = DriverManager.getConnection(url);
                java.sql.PreparedStatement pstmt = con.prepareStatement(sql)) {

            pstmt.setString(1, codi);
            pstmt.setString(2, nom);
            pstmt.setString(3, salari);
            pstmt.setString(4, id_sup);
            pstmt.setString(5, info_sup);
            pstmt.setString(6, tipoPlazas);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public Main() {

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
        Main app = new Main();
        app.crearBaseDeDatos();
        new VentanaTiposDePlazas();
    }
}
