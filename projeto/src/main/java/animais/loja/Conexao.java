package animais.loja;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static final String URL = "jdbc:postgresql://isabelle.db.elephantsql.com/jnlvcqmf";
    private static final String USER = "jnlvcqmf";
    private static final String PASSWORD = "skfISufiy_Uhr2EhdJlpt1RWlM0Cwk94";

    // Conexão estática
    private static Connection connection = null;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("Conexão estabelecida com sucesso.");
            } catch (SQLException e) {
                System.out.println("Falha ao conectar ao banco de dados: " + e.getMessage());
                // e.printStackTrace();
            }
        }
        return connection;
    }
}
