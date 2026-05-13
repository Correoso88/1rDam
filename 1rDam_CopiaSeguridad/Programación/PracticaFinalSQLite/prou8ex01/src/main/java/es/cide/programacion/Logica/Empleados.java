package es.cide.programacion.Logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Empleados {
    private int nss;
    private String nombre;
    private String apellido;
    private String email;
    private String iban;

    public Empleados(int nss, String nombre, String apellido, String email, String iban) {
        this.nss = nss;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.iban = iban;
    }

    // Getters
    public int getNss() {
        return nss;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public String getIban() {
        return iban;
    }

    // Setters
    public void setNss(int nss) {
        this.nss = nss;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    // Metodo obtener Empleados
    public static List<Empleados> obtenerEmpleados() {
        String url = "jdbc:sqlite:BaseDatos.db";
        String sql = "SELECT * FROM EMPLEADOS";
        java.util.List<Empleados> lista = new java.util.ArrayList<>();

        try (Connection con = DriverManager.getConnection(url);
                java.sql.Statement stmt = con.createStatement();
                java.sql.ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                String nss = rs.getString("NSS");
                String nom = rs.getString("NOM");
                String apellido = rs.getString("LLINATGES");
                String email = rs.getString("EMAIL");
                String iban = rs.getString("IBAN");
                int nssInt = Integer.parseInt(nss);
                lista.add(new Empleados(nssInt, nom, apellido, email, iban));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return lista;
    }

    // Metodo para insertar Empleado
    public static void insertarEmpleado(int nss, String nom, String apellido, String email, String iban) {
        String url = "jdbc:sqlite:BaseDatos.db";
        String sql = "INSERT INTO EMPLEADOS (NSS, NOM, LLINATGES, EMAIL, IBAN) VALUES (?, ?, ?, ?, ?)";

        try (Connection con = DriverManager.getConnection(url);
                PreparedStatement pstmt = con.prepareStatement(sql)) {

            pstmt.setInt(1, nss);
            pstmt.setString(2, nom);
            pstmt.setString(3, apellido);
            pstmt.setString(4, email);
            pstmt.setString(5, iban);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Borrar Tipos de Plazas
    public static void borrar(String nombre) {
        String url = "jdbc:sqlite:BaseDatos.db";
        String sql = "DELETE FROM TIPUS_PLACA WHERE NOM = ? AND WHERE ";

        try (Connection con = DriverManager.getConnection(url);
                PreparedStatement pstmt = con.prepareStatement(sql)) {

            pstmt.setString(1, nombre);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
