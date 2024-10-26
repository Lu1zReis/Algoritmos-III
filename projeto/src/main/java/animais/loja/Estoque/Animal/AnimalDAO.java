package animais.loja.Estoque.Animal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import animais.loja.Conexao;

public class AnimalDAO {

    // Create
    public void adicionarAnimal(Animal animal) throws SQLException {
        String sql = "INSERT INTO Animal (raca, dataAdocao, castrado, anos) VALUES (?, ?, ?, ?)";
        try (Connection connection = Conexao.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, animal.getRaca());
            stmt.setString(2, animal.getDataAdocao());
            stmt.setBoolean(3, animal.isCastrado());
            stmt.setInt(4, animal.getAnos());
            stmt.executeUpdate();
        }
    }

    // Read
    public List<Animal> listarAnimais() throws SQLException {
        List<Animal> animais = new ArrayList<>();
        String sql = "SELECT * FROM Animal";
        try (Connection connection = Conexao.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Animal animal = new Animal();
                animal.setId(rs.getInt("id"));
                animal.setRaca(rs.getString("raca"));
                animal.setDataAdocao(rs.getString("dataAdocao"));
                animal.setCastrado(rs.getBoolean("castrado"));
                animal.setAnos(rs.getInt("anos"));
                animais.add(animal);
            }
        }
        return animais;
    }

    // Update
    public void atualizarAnimal(Animal animal) throws SQLException {
        String sql = "UPDATE Animal SET raca = ?, dataAdocao = ?, castrado = ?, anos = ? WHERE id = ?";
        try (Connection connection = Conexao.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, animal.getRaca());
            stmt.setString(2, animal.getDataAdocao());
            stmt.setBoolean(3, animal.isCastrado());
            stmt.setInt(4, animal.getAnos());
            stmt.setInt(5, animal.getId());
            stmt.executeUpdate();
        }
    }

    // Delete
    public void deletarAnimal(int id) throws SQLException {
        String sql = "DELETE FROM Animal WHERE id = ?";
        try (Connection connection = Conexao.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
}
