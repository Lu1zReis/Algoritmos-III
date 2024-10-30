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
        String sql = "INSERT INTO Funcionario (nome, cpf, cargo, idade, salario) VALUES (?, ?, ?, ?, ?)";
        try (Connection connection = Conexao.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {
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
        List<Funcionario> funcionarios = new ArrayList<>();
        String sql = "SELECT * FROM Funcionario";
        try (Connection connection = Conexao.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql);
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
        String sql = "UPDATE Funcionario SET nome = ?, cpf = ?, cargo = ?, idade = ?, salario = ? WHERE id = ?";
        try (Connection connection = Conexao.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getCpf());
            stmt.setString(3, funcionario.getCargo());
            stmt.setInt(4, funcionario.getIdade());
            stmt.setFloat(5, funcionario.getSalario());
            stmt.setInt(6, funcionario.getId());
            return stmt.executeUpdate() > 0;
        }
    }

    // Delete
    public boolean deletarFuncionario(int id) throws SQLException {
        String sql = "DELETE FROM Funcionario WHERE id = ?";
        try (Connection connection = Conexao.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            return stmt.executeUpdate() > 0;
        }
    }
}
