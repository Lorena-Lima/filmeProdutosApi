package questaoUm.Metodos;

import questaoUm.ConexaoFactory.ConexaoFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ManipularProdutos {
    public void inserir() throws SQLException {

        String calca = "INSERT INTO `produto`.`produto` (`nome`, `descricao`, `quantidade`, `preco`) VALUES ('calça', 'calça jeans', '1', '119.99')";
        String saia = "INSERT INTO `produto`.`produto` (`nome`, `descricao`, `quantidade`, `preco`) VALUES ('saia', 'saia branca', '1', '79.99')";
        String vestido = "INSERT INTO `produto`.`produto` (`nome`, `descricao`, `quantidade`, `preco`) VALUES ('vestido', 'vestido longo', '1', '139.99')";

        Connection conn = ConexaoFactory.getConexao();

        try {
            Statement stm = conn.createStatement();

            stm.executeUpdate(calca);
            stm.executeUpdate(saia);
            stm.executeUpdate(vestido);

            stm.execute("SELECT id, nome, descricao, quantidade, preco FROM produto");

            ResultSet rst = stm.getResultSet();

            while (rst.next()) {
                Integer id = rst.getInt("id");
                System.out.println(id);
                String nome = rst.getString("nome");
                System.out.println(nome);
                String descricao = rst.getString("descricao");
                System.out.println(descricao);
                Integer quantidade = rst.getInt("quantidade");
                System.out.println(quantidade);
                double preco = rst.getDouble("preco");
                System.out.println(preco);
            }

            ConexaoFactory.fechaConexao(conn);
            ConexaoFactory.fechaStatement(stm);

        } catch (SQLException e) {
            e.printStackTrace();
             }

    }

    public void excluirProdutos () {
        Connection conn = ConexaoFactory.getConexao();

        Statement stm = null;
        try {
            stm = conn.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        try {
            stm.execute("DELETE FROM produto WHERE nome = 'saia' ");

            Integer linhasAlteradas = stm.getUpdateCount();
            System.out.println("Produto excluido com sucesso!");
            System.out.println("Linhas excluídas: " + linhasAlteradas);

            ConexaoFactory.fechaConexao(conn);
            ConexaoFactory.fechaStatement(stm);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void alterarProduto() throws SQLException {
        Connection conn = ConexaoFactory.getConexao();
        Statement stm = null;
        try {
            stm = conn.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        try {
            stm.executeUpdate("UPDATE produto SET descricao = 'calça rosa' WHERE nome = 'calça'");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Produto alterado com sucesso!");

        System.out.println("***Lista atualizada!***");

        stm.execute("SELECT id, nome, descricao, quantidade, preco FROM produto");
        ResultSet rst = stm.getResultSet();
        while (rst.next()) {
            Integer id = rst.getInt("id");
            System.out.println(id);
            String nome = rst.getString("nome");
            System.out.println(nome);
            String descricao = rst.getString("descricao");
            System.out.println(descricao);
            Integer quantidade = rst.getInt("quantidade");
            System.out.println(quantidade);
            double preco = rst.getDouble("preco");
            System.out.println(preco);
        }
    }
}
