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
    public boolean adicionarAnimal(Animal animal) throws SQLException {
        Connection connection = Conexao.getConnection();
        String sql = "INSERT INTO Animal (raca, dataAdocao, castrado, anos) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, animal.getRaca());
            stmt.setString(2, animal.getDataAdocao());
            stmt.setBoolean(3, animal.isCastrado());
            stmt.setInt(4, animal.getAnos());
            return stmt.executeUpdate() > 0;
        }
    }

    // Read
    public List<Animal> listarAnimais() throws SQLException {
        List<Animal> animais = new ArrayList<>();
        Connection connection = Conexao.getConnection();
        String sql = "SELECT * FROM Animal";
        try (PreparedStatement stmt = connection.prepareStatement(sql);
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
    public boolean atualizarAnimal(Animal animal) throws SQLException {
        String sql = "UPDATE Animal SET raca = ?, dataAdocao = ?, castrado = ?, anos = ? WHERE id = ?";
        Connection connection = Conexao.getConnection();
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, animal.getRaca());
            stmt.setString(2, animal.getDataAdocao());
            stmt.setBoolean(3, animal.isCastrado());
            stmt.setInt(4, animal.getAnos());
            stmt.setInt(5, animal.getId());
            return stmt.executeUpdate() > 0;
        }
    }
    
    public Animal buscarPorId(int id) throws SQLException {
        Connection connection = Conexao.getConnection();
        String query = "SELECT * FROM Animal WHERE id = ?";
        Animal animal = null;

        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                animal = new Animal();
                animal.setId(rs.getInt("id"));
                animal.setRaca(rs.getString("raca"));
                animal.setAnos(rs.getInt("anos"));
                animal.setCastrado(rs.getBoolean("castrado"));
                animal.setDataAdocao(rs.getString("dataadocao"));
            }
        }
        return animal;
    }
   
    // Delete
    public boolean deletarAnimal(int id) throws SQLException {
        String sql = "DELETE FROM Animal WHERE id = ?";
        Connection connection = Conexao.getConnection();
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            return stmt.executeUpdate() > 0;
        }
    }
}
