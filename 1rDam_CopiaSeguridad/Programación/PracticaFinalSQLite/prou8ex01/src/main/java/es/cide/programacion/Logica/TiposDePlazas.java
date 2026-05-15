package es.cide.programacion.Logica;

import java.sql.*;
import java.util.*;

public class TiposDePlazas{
    private String nombre;
    private String funcion;
    //Creo el constructor de tipos de plaza
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

    //Obtener Tipos de plazas
    public static List<TiposDePlazas> obtenerTiposDePlazas() {
        List<TiposDePlazas> lista = new ArrayList<>();
        String url = "jdbc:sqlite:BaseDatos.db";
        String sql = "SELECT * FROM TIPUS_PLACA"; //Hago un select * para que me muestre toda la informacion de la tabla

        try (Connection con = DriverManager.getConnection(url); //Me conecto a la base de datos
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                //Obtengo el nombre y la funcion de la tabla
                String nombre = rs.getString("NOM");
                String funcion = rs.getString("FUNCIO");
                
                lista.add(new TiposDePlazas(nombre, funcion));//Lo añado a la lista de objetos
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return lista; //Devuelvo la lista de objetos de tipos plaza
    }

    // Insertar Tipo de plaza
    public static void insertarTiposDePlazas(String nombre, String funcion) {
        String url = "jdbc:sqlite:BaseDatos.db";
        String sql = "INSERT INTO TIPUS_PLACA (NOM, FUNCIO) VALUES (?, ?)"; //Inserto valores, a el nombre y la funcion de la tabla
 
        try (Connection con = DriverManager.getConnection(url);
             PreparedStatement pstmt = con.prepareStatement(sql)) {
                
            pstmt.setString(1, nombre);//En el parametro 1 "?" pongo la informacion que saco del String nombre
            pstmt.setString(2, funcion);//En el parametro 2 "?" pongo la informacion que saco del String funcion
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Actualizar tipos deplazas
    public static void actualizarTiposDePlaza(String nombre, String nuevaFuncion) {
    String url = "jdbc:sqlite:BaseDatos.db";
    String sqlnom = "UPDATE TIPUS_PLACA SET FUNCIO = ? WHERE NOM = ?"; //Hace un update en tiposdeplazas de funcion cuando el nombre es igual al parametro que pongas en nombre

    try (Connection con = DriverManager.getConnection(url);
        PreparedStatement pstmt = con.prepareStatement(sqlnom);) {

        //Cambiar el nombre
        pstmt.setString(1, nuevaFuncion); //Pones la nueva funcion en el set funcio
        pstmt.setString(2, nombre); //Mientras el nombre sea = a el nombre que recoge
        pstmt.executeUpdate();

    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
}

    // Borrar Tipos de Plazas
    public static void borrarTiposDePlaza(String nombre) {
        String url = "jdbc:sqlite:BaseDatos.db";
        String sql = "DELETE FROM TIPUS_PLACA WHERE NOM = ?"; //Elimina los registros de el nombre que recibe la funcion de la tabla de tiposdeplaza
 
        try (Connection con = DriverManager.getConnection(url);
             PreparedStatement pstmt = con.prepareStatement(sql);) {
            //Elimino el nombre
            pstmt.setString(1, nombre); 
            pstmt.executeUpdate();
 
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
