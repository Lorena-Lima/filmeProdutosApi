package questaoUm.ConexaoFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoFactory {
    public static Connection getConexao(){
        Connection conn;

        String url = "jdbc:mysql://localhost:3306/produto?useTimezone=true&serverTimezone=UTC";
        String usuario = "root";
        String senha = "Lore2510@";
        try {
            conn = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Abrindo a conexão");
            return conn;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void fechaConexao(Connection conn){

        try {
            if(conn != null) {
                conn.close();
                System.out.println("Fechando a conexao");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static void fechaStatement(Statement stm){
        try {
            if(stm != null) {
                stm.close();
                System.out.println("Fechando a conexao");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
