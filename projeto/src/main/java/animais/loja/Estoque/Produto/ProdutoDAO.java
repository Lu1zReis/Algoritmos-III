package animais.loja.Estoque.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import animais.loja.Conexao;

public class ProdutoDAO {

    // Create
    public void adicionarProduto(Produto produto) throws SQLException {
        String sql = "INSERT INTO Produto (nome, validade, tipo, valor) VALUES (?, ?, ?, ?)";
        try (Connection connection = Conexao.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, produto.getNome());
            stmt.setString(2, produto.getValidade());
            stmt.setString(3, produto.getTipo());
            stmt.setFloat(4, produto.getValor());
            stmt.executeUpdate();
        }
    }

    // Read
    public List<Produto> listarProdutos() throws SQLException {
        List<Produto> produtos = new ArrayList<>();
        String sql = "SELECT * FROM Produto";
        try (Connection connection = Conexao.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Produto produto = new Produto();
                produto.setId(rs.getInt("id"));
                produto.setNome(rs.getString("nome"));
                produto.setValidade(rs.getString("validade"));
                produto.setTipo(rs.getString("tipo"));
                produto.setValor(rs.getFloat("valor"));
                produtos.add(produto);
            }
        }
        return produtos;
    }

    // Update
    public void atualizarProduto(Produto produto) throws SQLException {
        String sql = "UPDATE Produto SET nome = ?, validade = ?, tipo = ?, valor = ? WHERE id = ?";
        try (Connection connection = Conexao.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, produto.getNome());
            stmt.setString(2, produto.getValidade());
            stmt.setString(3, produto.getTipo());
            stmt.setFloat(4, produto.getValor());
            stmt.setInt(5, produto.getId());
            stmt.executeUpdate();
        }
    }

    // Delete
    public void deletarProduto(int id) throws SQLException {
        String sql = "DELETE FROM Produto WHERE id = ?";
        try (Connection connection = Conexao.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
}
