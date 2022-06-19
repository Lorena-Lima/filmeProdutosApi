package questaoDois.Aplicacao;

import questaoUm.ConexaoFactory.ConexaoFactory;

import java.sql.*;
import java.util.Scanner;

public class EscolherFilmes {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);

        Connection conn = ConexaoFactory.getConexao();

        Statement stm = conn.createStatement();


        System.out.println("Qual página deseja ver?");
        int resposta = scanner.nextInt();

        if (resposta == 1) {

            stm.execute("SELECT id, nome, descricao, ano FROM filme.pagina1");

            ResultSet rst = stm.getResultSet();

            while (rst.next()) {
                int id = rst.getInt("id");
                System.out.println("ID: " + id);
                String nome = rst.getString("nome");
                System.out.println("NOME: " + nome);
                String descricao = rst.getString("descricao");
                System.out.println("DESCRIÇÃO: " + descricao);
                int ano = rst.getInt("ano");
                System.out.println("ANO: " + ano);
                System.out.println("");
                System.out.println("**************");
                System.out.println("");

            }
        } else if (resposta == 2) {
            stm.execute("SELECT id, nome, descricao, ano FROM filme.pagina2");

            ResultSet rst = stm.getResultSet();

            while (rst.next()) {
                int id = rst.getInt("id");
                System.out.println("ID: " + id);
                String nome = rst.getString("nome");
                System.out.println("NOME: " + nome);
                String descricao = rst.getString("descricao");
                System.out.println("DESCRIÇÃO: " + descricao);
                int ano = rst.getInt("ano");
                System.out.println("ANO: " + ano);
                System.out.println("");
                System.out.println("**************");
                System.out.println("");

            }
        }


        ConexaoFactory.fechaConexao(conn);
        ConexaoFactory.fechaStatement(stm);
        }
}


