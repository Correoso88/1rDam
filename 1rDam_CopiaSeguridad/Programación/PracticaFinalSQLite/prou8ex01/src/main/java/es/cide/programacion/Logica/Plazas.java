package es.cide.programacion.Logica;
import java.sql.*;
import java.util.*;

public class Plazas {
    private int codigo;
    private String nombre;
    private int salari;
    private int codigo_sup;
    private String info_sup;
    private String nom_TipPlaza;

    public Plazas(int codigo, String nombre, int salari, int codigo_sup, String info_sup, String nom_TipPlaza) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.salari = salari;
        this.codigo_sup = codigo_sup;
        this.info_sup = info_sup;
        this.nom_TipPlaza = nom_TipPlaza;
    }

    // Getters
    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSalari() {
        return salari;
    }

    public int getCodigo_sup() {
        return codigo_sup;
    }

    public String getInfo_sup() {
        return info_sup;
    }

    public String getNom_TipPlaza() {
        return nom_TipPlaza;
    }

    // Setters
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalari(int salari) {
        this.salari = salari;
    }

    public void setCodigo_sup(int codigo_sup) {
        this.codigo_sup = codigo_sup;
    }

    public void setInfo_sup(String info_sup) {
        this.info_sup = info_sup;
    }

    public void setNom_TipPlaza(String nom_TipPlaza) {
        this.nom_TipPlaza = nom_TipPlaza;
    }

    // Obtener todas las plazas
    public static List<Plazas> obtenerPlazas() {
        List<Plazas> lista = new ArrayList<>();
        String url = "jdbc:sqlite:BaseDatos.db";
        String sql = "SELECT * FROM PLACA";

        try (Connection con = DriverManager.getConnection(url);
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                int codigo = rs.getInt("CODI");
                String nombre = rs.getString("NOM");
                int salari = rs.getInt("SALARI");
                int codigo_sup = rs.getInt("CODI_SUPERVISORA");
                String info_sup = rs.getString("INFORME_SUPERVISIO");
                String nom_TipPlaza = rs.getString("NOM_TIPUS");
                lista.add(new Plazas(codigo, nombre, salari, codigo_sup, info_sup, nom_TipPlaza));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return lista;
    }

    // Insertar una plaza
    public static void insertarPlaza(int codigo, String nombre, int salari, int codigo_sup, String info_sup,
            String nom_TipPlaza) {
        String url = "jdbc:sqlite:BaseDatos.db";
        String sql = "INSERT INTO PLACA (CODI, NOM, SALARI, CODI_SUPERVISORA, INFORME_SUPERVISIO, NOM_TIPUS) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection con = DriverManager.getConnection(url);
                PreparedStatement pstmt = con.prepareStatement(sql)) {

            pstmt.setInt(1, codigo);
            pstmt.setString(2, nombre);
            pstmt.setInt(3, salari);
            pstmt.setInt(4, codigo_sup);
            pstmt.setString(5, info_sup);
            pstmt.setString(6, nom_TipPlaza);
            pstmt.executeUpdate();
            System.out.println("Plaza insertada: " + codigo);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Actualizar una plaza
    public static void actualizarPlaza(int codigo, String nuevoNombre, int nuevoSalari, int nuevoCodigo_sup, String nuevoInfo_sup, String nuevoNom_TipPlaza) {
        String url = "jdbc:sqlite:BaseDatos.db";
        String sql = "UPDATE PLACA SET NOM = ?, SALARI = ?, CODI_SUPERVISORA = ?, INFORME_SUPERVISIO = ?, NOM_TIPUS = ? WHERE CODI = ?";

        try (Connection con = DriverManager.getConnection(url);
                PreparedStatement pstmt = con.prepareStatement(sql)) {

            pstmt.setString(1, nuevoNombre);
            pstmt.setInt(2, nuevoSalari);
            pstmt.setInt(3, nuevoCodigo_sup);
            pstmt.setString(4, nuevoInfo_sup);
            pstmt.setString(5, nuevoNom_TipPlaza);
            pstmt.setInt(6, codigo);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Borrar una plaza
    public static void borrarPlaza(int codigo) {
        String url = "jdbc:sqlite:BaseDatos.db";
        String sql = "DELETE FROM PLACA WHERE CODI = ?";

        try (Connection con = DriverManager.getConnection(url);
                PreparedStatement pstmt = con.prepareStatement(sql)) {

            pstmt.setInt(1, codigo);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
