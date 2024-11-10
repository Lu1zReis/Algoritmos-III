package animais.loja.Vendas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import animais.loja.Conexao;
import animais.loja.Clientes.Cliente;
import animais.loja.Funcionarios.Funcionario;
import animais.loja.Estoque.Produto.Produto;

public class VendaDAO {

    // Create
    public boolean adicionarVenda(Venda venda) throws SQLException {
        String sql = "INSERT INTO Venda (produtoId, clienteId, funcionarioid, dataVenda, valortotal) VALUES (?, ?, ?, ?, ?)";
        Connection connection = Conexao.getConnection();
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, venda.getProdutoId());
            stmt.setInt(2, venda.getClienteId());
            stmt.setInt(3, venda.getFuncionarioId());
            stmt.setString(4, venda.getDataVenda());
            stmt.setDouble(5, venda.getValorTotal());
            return stmt.executeUpdate() > 0;
        }
        
    }
    
    public Cliente buscarClientePorCpf(String cpf) throws SQLException {
        Connection connection = Conexao.getConnection();
        String sql = "SELECT * FROM Cliente WHERE cpf = ?";
        Cliente cliente = null;

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, cpf);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                cliente = new Cliente();
                cliente.setId(rs.getInt("id"));
                cliente.setNome(rs.getString("nome"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setEndereco(rs.getString("endereco"));
            }
        }
        return cliente;
    }
    
    public Funcionario buscarFuncionarioPorCpf(String cpf) throws SQLException {
        Connection connection = Conexao.getConnection();
        String sql = "SELECT * FROM Funcionario WHERE cpf = ?";
        Funcionario funcionario = null;

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, cpf);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                funcionario = new Funcionario();
                funcionario.setId(rs.getInt("id"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setCpf(rs.getString("cpf"));
                funcionario.setCargo(rs.getString("cargo"));
            }
        }
        return funcionario;
    }
    
    public Produto buscarProdutoPorId(int id) throws SQLException {
        Connection connection = Conexao.getConnection();
        String sql = "SELECT * FROM produto WHERE id = ?";
        Produto produto = null;

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                produto = new Produto();
                produto.setId(rs.getInt("id"));
                produto.setValor((float) rs.getDouble("valor"));
            }
        }
        return produto;
    }
    
    // Read
public List<Venda> listarVendas() throws SQLException {
    List<Venda> vendas = new ArrayList<>();
    String sql = "SELECT v.id, v.produtoId, v.clienteId, v.funcionarioId, v.dataVenda, v.valortotal, " +
                 "f.nome AS nome_funcionario, c.nome AS nome_cliente, p.nome AS nome_produto " +
                 "FROM Venda v " +
                 "JOIN Funcionario f ON v.funcionarioId = f.id " +
                 "JOIN Cliente c ON v.clienteId = c.id " +
                 "JOIN Produto p ON v.produtoId = p.id";  // Ajuste para as suas tabelas
    Connection connection = Conexao.getConnection();
    try (PreparedStatement stmt = connection.prepareStatement(sql);
         ResultSet rs = stmt.executeQuery()) {
        while (rs.next()) {
            Venda venda = new Venda();
            venda.setId(rs.getInt("id"));
            venda.setProdutoId(rs.getInt("produtoId"));
            venda.setClienteId(rs.getInt("clienteId"));
            venda.setfuncionarioId(rs.getInt("funcionarioId"));
            venda.setDataVenda(rs.getString("dataVenda"));
            venda.setValorTotal(rs.getFloat("valortotal"));
            
            // Definindo os nomes do funcionario, cliente e produto
            venda.setNomeFuncionario(rs.getString("nome_funcionario"));
            venda.setNomeCliente(rs.getString("nome_cliente"));
            venda.setNomeProduto(rs.getString("nome_produto"));
            
            vendas.add(venda);
        }
    }
    return vendas;
}


    // Delete
    public boolean deletarVenda(int id) throws SQLException {
        String sql = "DELETE FROM Venda WHERE id = ?";
        Connection connection = Conexao.getConnection();
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            return stmt.executeUpdate() > 0;
        }
    }
}
