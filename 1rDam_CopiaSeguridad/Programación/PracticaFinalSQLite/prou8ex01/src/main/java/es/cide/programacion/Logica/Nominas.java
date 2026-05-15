package es.cide.programacion.Logica;

import java.sql.*;
import java.util.*;

public class Nominas {
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

    // Getters
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

    // Setters
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

    public static List<Nominas> obtenerNominas() {
        List<Nominas> lista = new ArrayList<>();
        String url = "jdbc:sqlite:BaseDatos.db";
        String sql = "SELECT * FROM NOMINA";

        try (Connection con = DriverManager.getConnection(url);
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                int id = rs.getInt("ID");
                String iban_pag = rs.getString("IBAN_PAGO");
                int importe = rs.getInt("IMPORTE");
                int nss_empleado = rs.getInt("NSS_EMPLEAT");
                int codigo_plaza = rs.getInt("CODI_PLACA");
                lista.add(new Nominas(id, iban_pag, importe, nss_empleado, codigo_plaza));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return lista;
    }

    public static void insertarNomina(String iban_pag, int importe, int nss_empleado, int codigo_plaza) {
        String url = "jdbc:sqlite:BaseDatos.db";
        String sql = "INSERT INTO NOMINA (IBAN_PAGO, IMPORTE, NSS_EMPLEAT, CODI_PLACA) VALUES (?, ?, ?, ?)";

        try (Connection con = DriverManager.getConnection(url);
                PreparedStatement pstmt = con.prepareStatement(sql)) {

            pstmt.setString(1, iban_pag);
            pstmt.setInt(2, importe);
            pstmt.setInt(3, nss_empleado);
            pstmt.setInt(4, codigo_plaza);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void actualizarNomina(int id, String nuevoIban_pag, int nuevoImporte, int nuevoNss_empleado,
            int nuevoCodigo_plaza) {
        String url = "jdbc:sqlite:BaseDatos.db";
        String sql = "UPDATE NOMINA SET IBAN_PAGO = ?, IMPORTE = ?, NSS_EMPLEAT = ?, CODI_PLACA = ? WHERE ID = ?";

        try (Connection con = DriverManager.getConnection(url);
                PreparedStatement pstmt = con.prepareStatement(sql)) {

            pstmt.setString(1, nuevoIban_pag);
            pstmt.setInt(2, nuevoImporte);
            pstmt.setInt(3, nuevoNss_empleado);
            pstmt.setInt(4, nuevoCodigo_plaza);
            pstmt.setInt(5, id);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void borrarNomina(int id) {
        String url = "jdbc:sqlite:BaseDatos.db";
        String sql = "DELETE FROM NOMINA WHERE ID = ?";

        try (Connection con = DriverManager.getConnection(url);
                PreparedStatement pstmt = con.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
