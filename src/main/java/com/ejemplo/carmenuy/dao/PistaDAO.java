package com.ejemplo.carmenuy.dao;

import com.ejemplo.carmenuy.model.Pista2;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PistaDAO {
    private final Connection connection;

    public PistaDAO(Connection connection) {
        this.connection = connection;
    }

    public void crearTabla() throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS pistas (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "localidad TEXT NOT NULL, " +
                "numero TEXT NOT NULL, " +
                "descripcion TEXT NOT NULL, " +
                "esCorrecta INTEGER NOT NULL)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.execute();
        }
    }

    public void insertarPista(Pista2 pista) throws SQLException {
        String sql = "INSERT INTO pistas (localidad, numero, descripcion, esCorrecta) VALUES (?, ?, ?, ?)";
//        try (PreparedStatement statement = connection.prepareStatement(sql)) {
//            statement.setString(1, pista.getLocalidad());
//            statement.setString(2, pista.getNumero());
//            statement.setString(3, pista.getDescripcion());
//            statement.setBoolean(4, pista.esCorrecta());
//            statement.executeUpdate();
//        }
    }

    public void insertarPistasIniciales() throws SQLException {
        List<Pista2> pistasIniciales = new ArrayList<>();
        String[] localidades = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "AA", "AB", "AC", "AD", "AE", "AF", "AG", "AH", "AI", "AJ", "AK", "AL", "AM", "AN"};

        for (int i = 0; i < localidades.length; i++) {
            for (int j = 1; j <= 5; j++) {
                boolean esCorrecta = (j == 5);
                pistasIniciales.add(new Pista2(1, 2, "33", "Una descripción", true));
            }
        }
        for (Pista2 pista : pistasIniciales) {
            insertarPista(pista);
        }
    }

    public Pista2 obtenerPistaPorId(int id) throws SQLException {
        String sql = "SELECT id, localidad, numero, descripcion, esCorrecta FROM pistas WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
//                return new Pista2(
//                        resultSet.getInt("id"),
//                        resultSet.getString("localidad"),
//                        resultSet.getString("numero"),
//                        resultSet.getString("descripcion"),
//                        resultSet.getBoolean("esCorrecta")
//                );
                
                return new Pista2(1, 2, "33", "Una descripción", true);
            }
        }
        return null;
    }

    public List<Pista2> obtenerPistasPorLocalidad(String localidad) throws SQLException {
        List<Pista2> pistas = new ArrayList<>();
        String sql = "SELECT id, localidad, numero, descripcion, esCorrecta FROM pistas WHERE localidad = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, localidad);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
//                pistas.add(new Pista2(
//                        resultSet.getInt("id"),
//                        resultSet.getString("localidad"),
//                        resultSet.getString("numero"),
//                        resultSet.getString("descripcion"),
//                        resultSet.getBoolean("esCorrecta")
//                ));
                
                pistas.add(new Pista2(1, 2, "33", "Una descripción", true));
            }
        }
        return pistas;
    }

    public List<Pista2> obtenerTodasLasPistas() throws SQLException {
        List<Pista2> pistas = new ArrayList<>();
        String sql = "SELECT id, localidad, numero, descripcion, esCorrecta FROM pistas";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
//                pistas.add(new Pista2(
//                        resultSet.getInt("id"),
//                        resultSet.getString("localidad"),
//                        resultSet.getString("numero"),
//                        resultSet.getString("descripcion"),
//                        resultSet.getBoolean("esCorrecta")
//                ));
                pistas.add(new Pista2(1, 2, "33", "Una descripción", true));
            }
        }
        return pistas;
    }

    public void actualizarPista(Pista2 pista) throws SQLException {
        String sql = "UPDATE pistas SET localidad = ?, numero = ?, descripcion = ?, esCorrecta = ? WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, String.valueOf(pista.getLocalidad()));
            statement.setString(2, pista.getNumero());
            statement.setString(3, pista.getDescripcion());
            statement.setBoolean(4, pista.esCorrecta());
            statement.setInt(5, pista.getId());
            statement.executeUpdate();
        }
    }

    public void eliminarPista(int id) throws SQLException {
        String sql = "DELETE FROM pistas WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        }
    }
}
