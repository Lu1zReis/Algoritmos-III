package animais.loja.Clientes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import animais.loja.Conexao;

public class ClienteDAO {

    // Create
    public void adicionarCliente(Cliente cliente) throws SQLException {
        String sql = "INSERT INTO Cliente (nome, cpf, endereco, qntCompras) VALUES (?, ?, ?, ?)";
        try (Connection connection = Conexao.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf());
            stmt.setString(3, cliente.getEndereco());
            stmt.setInt(4, cliente.getQntCompras());
            stmt.executeUpdate();
        }
    }

    // Read
    public List<Cliente> listarClientes() throws SQLException {
        List<Cliente> clientes = new ArrayList<>();
        String sql = "SELECT * FROM Cliente";
        try (Connection connection = Conexao.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setId(rs.getInt("id"));
                cliente.setNome(rs.getString("nome"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setEndereco(rs.getString("endereco"));
                cliente.setQntCompras(rs.getInt("qntCompras"));
                clientes.add(cliente);
            }
        }
        return clientes;
    }

    // Update
    public void atualizarCliente(Cliente cliente) throws SQLException {
        String sql = "UPDATE Cliente SET nome = ?, cpf = ?, endereco = ?, qntCompras = ? WHERE id = ?";
        try (Connection connection = Conexao.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf());
            stmt.setString(3, cliente.getEndereco());
            stmt.setInt(4, cliente.getQntCompras());
            stmt.setInt(5, cliente.getId());
            stmt.executeUpdate();
        }
    }

    // Delete
    public void deletarCliente(int id) throws SQLException {
        String sql = "DELETE FROM Cliente WHERE id = ?";
        try (Connection connection = Conexao.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
}
