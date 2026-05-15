package es.cide.programacion.Logica;
import java.sql.*;
import java.util.*;


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
        java.util.List<Empleados> lista = new ArrayList<>();

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

    // Borrar Empleados
    public static void borrarEmpleados(String nss) {
        String url = "jdbc:sqlite:BaseDatos.db";
        String sql = "DELETE FROM EMPLEADOS WHERE NSS = ?";

        try (Connection con = DriverManager.getConnection(url);
                PreparedStatement pstmt = con.prepareStatement(sql)) {

            pstmt.setString(1, nss);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Actualizar Empleados
    public static void actualizarEmpleados(int nss, String nuevoNombre, String nuevoApellido, String nuevoEmail, String nuevoiban) {
        String url = "jdbc:sqlite:BaseDatos.db";
        String sql = "UPDATE EMPLEADOS SET NOM = ?, LLINATGES = ?, EMAIL = ?, IBAN = ? WHERE NSS = ?";

        try (Connection con = DriverManager.getConnection(url);
                PreparedStatement pstmt = con.prepareStatement(sql);) {

            // Cambiar el nombre
            pstmt.setString(1, nuevoNombre);
            pstmt.setString(2, nuevoApellido);
            pstmt.setString(3, nuevoEmail);
            pstmt.setString(4, nuevoiban);
            pstmt.setInt(5, nss);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
