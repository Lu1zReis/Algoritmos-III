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
        Connection connection = Conexao.getConnection();
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
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
        Connection connection = Conexao.getConnection();
        try (PreparedStatement stmt = connection.prepareStatement(sql);
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
    public boolean atualizarProduto(Produto produto) throws SQLException {
        String sql = "UPDATE Produto SET nome = ?, validade = ?, tipo = ?, valor = ? WHERE id = ?";
        Connection connection = Conexao.getConnection();
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, produto.getNome());
            stmt.setString(2, produto.getValidade());
            stmt.setString(3, produto.getTipo());
            stmt.setFloat(4, produto.getValor());
            stmt.setInt(5, produto.getId());
            return stmt.executeUpdate() > 0;
        }
    }
    
    public Produto buscarPorId(int id) throws SQLException {
        Connection connection = Conexao.getConnection();
        String query = "SELECT * FROM Produto WHERE id = ?";
        Produto produto = null;

        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                produto = new Produto();
                produto.setId(rs.getInt("id"));
                produto.setNome(rs.getString("nome"));
                produto.setValidade(rs.getString("validade"));
                produto.setValor(rs.getFloat("valor"));
                produto.setTipo(rs.getString("tipo"));
            }
        }
        return produto;
    }
    // Delete
    public boolean deletarProduto(int id) throws SQLException {
        String sql = "DELETE FROM Produto WHERE id = ?";
        Connection connection = Conexao.getConnection();
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            return stmt.executeUpdate() > 0;
        }
    }
}
