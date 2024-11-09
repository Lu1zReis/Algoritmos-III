import java.sql.SQLException;
import java.util.List;

import animais.loja.Clientes.Cliente;
import animais.loja.Clientes.ClienteDAO;
import animais.loja.Conexao;
import java.sql.Connection;

public class App {
    public static void main(String[] args) {
        Connection connection = Conexao.getConnection();
        if (connection != null) {
            System.out.println("Entrou");
            executar();  
        } else {
            System.out.println("Erro");
        }
    }

    public static void executar() {
        try {
            Cliente cliente = new Cliente();
            cliente.setNome("João Silva");
            cliente.setCpf("123.456.789-00");
            cliente.setEndereco("Rua A, 123");
            ClienteDAO clienteDao = new ClienteDAO();
            clienteDao.adicionarCliente(cliente);
            System.out.println("Cliente adicionado com sucesso!");

            // Listando clientes
            List<Cliente> clientes = clienteDao.listarClientes();
            for (Cliente c : clientes) {
                System.out.println(c.getNome());
            }
        } catch (SQLException e) {
            System.out.println("Erro ao acessar o banco de dados: " + e.getMessage());
            // e.printStackTrace(); // Opcional: para detalhes do erro
        }
    }
}
