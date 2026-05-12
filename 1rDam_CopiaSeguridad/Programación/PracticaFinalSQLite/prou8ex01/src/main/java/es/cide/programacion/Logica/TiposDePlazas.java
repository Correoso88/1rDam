package es.cide.programacion.Logica;

import java.awt.Insets;
import java.sql.*;
import java.sql.SQLException;
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
}
