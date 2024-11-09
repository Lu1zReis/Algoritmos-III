package animais.loja.Funcionarios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import animais.loja.Conexao;

public class FuncionarioDAO {

    // Create
    public void adicionarFuncionario(Funcionario funcionario) throws SQLException {
        Connection connection = Conexao.getConnection();
        String sql = "INSERT INTO Funcionario (nome, cpf, cargo, idade, salario) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getCpf());
            stmt.setString(3, funcionario.getCargo());
            stmt.setInt(4, funcionario.getIdade());
            stmt.setFloat(5, funcionario.getSalario());
            stmt.executeUpdate();
        }
    }

    // Read
    public List<Funcionario> listarFuncionarios() throws SQLException {
        Connection connection = Conexao.getConnection();
        List<Funcionario> funcionarios = new ArrayList<>();
        String sql = "SELECT * FROM Funcionario";
        try (PreparedStatement stmt = connection.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Funcionario funcionario = new Funcionario();
                funcionario.setId(rs.getInt("id"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setCpf(rs.getString("cpf"));
                funcionario.setCargo(rs.getString("cargo"));
                funcionario.setIdade(rs.getInt("idade"));
                funcionario.setSalario(rs.getFloat("salario"));
                funcionarios.add(funcionario);
            }
        }
        return funcionarios;
    }

    // Update
    public boolean atualizarFuncionario(Funcionario funcionario) throws SQLException {
        Connection connection = Conexao.getConnection();
        String sql = "UPDATE funcionario SET nome = ?, cpf = ?, cargo = ?, idade = ?, salario = ? WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getCpf());
            stmt.setString(3, funcionario.getCargo());
            stmt.setInt(4, funcionario.getIdade());
            stmt.setFloat(5, funcionario.getSalario());
            stmt.setInt(6, funcionario.getId());
            funcionario = null;
            return stmt.executeUpdate() > 0;
        }
    }
    
    // Search
    public Funcionario buscarPorId(int id) throws SQLException {
        Connection connection = Conexao.getConnection();
        String query = "SELECT * FROM funcionario WHERE id = ?";
        Funcionario funcionario = null;

        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                funcionario = new Funcionario();
                funcionario.setId(rs.getInt("id"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setCpf(rs.getString("cpf"));
                funcionario.setIdade(rs.getInt("idade"));
                funcionario.setCargo(rs.getString("cargo"));
                funcionario.setSalario(rs.getFloat("salario"));
            }
        }
        return funcionario;
    }

    
    // Delete
    public boolean deletarFuncionario(int id) throws SQLException {
        Connection connection = Conexao.getConnection();
        String sql = "DELETE FROM Funcionario WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            return stmt.executeUpdate() > 0;
        }
    }
}
