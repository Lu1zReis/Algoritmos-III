package animais.loja.Vendas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import animais.loja.Conexao;

public class VendaDAO {

    // Create
    public void adicionarVenda(Venda venda) throws SQLException {
        String sql = "INSERT INTO Venda (produtoId, clienteId, dataVenda, quantidade, valorTotal) VALUES (?, ?, ?, ?, ?)";
        try (Connection connection = Conexao.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, venda.getProdutoId());
            stmt.setInt(2, venda.getClienteId());
            stmt.setString(3, venda.getDataVenda());
            stmt.setInt(4, venda.getQuantidade());
            stmt.setFloat(5, venda.getValorTotal());
            stmt.executeUpdate();
        }
    }

    // Read
    public List<Venda> listarVendas() throws SQLException {
        List<Venda> vendas = new ArrayList<>();
        String sql = "SELECT * FROM Venda";
        try (Connection connection = Conexao.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Venda venda = new Venda();
                venda.setId(rs.getInt("id"));
                venda.setProdutoId(rs.getInt("produtoId"));
                venda.setClienteId(rs.getInt("clienteId"));
                venda.setDataVenda(rs.getString("dataVenda"));
                venda.setQuantidade(rs.getInt("quantidade"));
                venda.setValorTotal(rs.getFloat("valorTotal"));
                vendas.add(venda);
            }
        }
        return vendas;
    }

    // Update
    public void atualizarVenda(Venda venda) throws SQLException {
        String sql = "UPDATE Venda SET produtoId = ?, clienteId = ?, dataVenda = ?, quantidade = ?, valorTotal = ? WHERE id = ?";
        try (Connection connection = Conexao.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, venda.getProdutoId());
            stmt.setInt(2, venda.getClienteId());
            stmt.setString(3, venda.getDataVenda());
            stmt.setInt(4, venda.getQuantidade());
            stmt.setFloat(5, venda.getValorTotal());
            stmt.setInt(6, venda.getId());
            stmt.executeUpdate();
        }
    }

    // Delete
    public void deletarVenda(int id) throws SQLException {
        String sql = "DELETE FROM Venda WHERE id = ?";
        try (Connection connection = Conexao.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
}
