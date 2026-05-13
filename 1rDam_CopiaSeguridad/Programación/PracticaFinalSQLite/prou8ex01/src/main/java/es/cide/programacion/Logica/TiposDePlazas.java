package es.cide.programacion.Logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TiposDePlazas{
    private String nombre;
    private String funcion;

    public TiposDePlazas(String nombre, String funcion) {
        this.nombre = nombre;
        this.funcion = funcion;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getFuncion() {
        return funcion;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public static List<TiposDePlazas> obtenerTiposDePlazas() {

        List<TiposDePlazas> lista = new ArrayList<>();
        String url = "jdbc:sqlite:BaseDatos.db";
        String sql = "SELECT * FROM TIPUS_PLACA";

        try (Connection con = DriverManager.getConnection(url);
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                String nombre = rs.getString("NOM");
                String funcion = rs.getString("FUNCIO");

                lista.add(new TiposDePlazas(nombre, funcion));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return lista;
    }

    // Insertar un nuevo tipo de plaza
    public static void insertarTiposDePlazas(String nombre, String funcion) {
        String url = "jdbc:sqlite:BaseDatos.db";
        String sql = "INSERT INTO TIPUS_PLACA (NOM, FUNCIO) VALUES (?, ?)";
 
        try (Connection con = DriverManager.getConnection(url);
             PreparedStatement pstmt = con.prepareStatement(sql)) {
 
            pstmt.setString(1, nombre);
            pstmt.setString(2, funcion);
            pstmt.executeUpdate();
 
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Actualizar tipos deplazas
    public static void actualizar(String nuevaNombre, String nuevaFuncion) {
    String url = "jdbc:sqlite:BaseDatos.db";
    String sql = "UPDATE TIPUS_PLACA SET NOM = ?, FUNCIO = ? WHERE NOM = ?";

    try (Connection con = DriverManager.getConnection(url);
        PreparedStatement pstmtnom = con.prepareStatement(sql);) {

        //Cambiar el nombre
        pstmtnom.setString(0, nuevaFuncion);
        pstmtnom.executeUpdate();
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
}

    // Borrar Tipos de Plazas
    public static void borrar(String nombre) {
        String url = "jdbc:sqlite:BaseDatos.db";
        String sqlnom = "DELETE FROM TIPUS_PLACA WHERE NOM = ? AND WHERE ";
        String sqlfunction = "DELETE FROM TIPUS_PLACA WHERE FUNCIO = ? AND WHERE ";
 
        try (Connection con = DriverManager.getConnection(url);
             PreparedStatement pstmtnom = con.prepareStatement(sqlnom);
            PreparedStatement pstmtfuncion = con.prepareStatement(sqlfunction)) {
            //Elimino el nombre
            pstmtnom.setString(1, nombre);
            pstmtnom.executeUpdate();

            //Elimino la funcion
            pstmtfuncion.setString(0, sqlfunction);
 
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
