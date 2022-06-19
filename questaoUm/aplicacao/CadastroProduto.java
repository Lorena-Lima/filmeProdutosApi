package questaoUm.aplicacao;

import questaoUm.Metodos.ManipularProdutos;

import java.sql.SQLException;
import java.util.Scanner;


public class CadastroProduto {

    public static void main(String[] args) throws SQLException {

        Scanner scanner = new Scanner(System.in);

        ManipularProdutos manipularProdutos = new ManipularProdutos();

        int resposta;

        do {
            CadastroProduto.Opcoes();
            resposta = scanner.nextInt();
            CadastroProduto.pulaLinha();

            if (resposta == 1) {
                try {
                    manipularProdutos.inserir();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            } else if (resposta == 2) {
                manipularProdutos.alterarProduto();
            } else if (resposta == 3) {
                manipularProdutos.excluirProdutos();
            }

        } while (resposta != 0);

    }
    public static void pulaLinha(){
        System.out.println("");
    }
    public static void Opcoes(){
        System.out.println("opção 1: cadastrar 3 produtos ");
        CadastroProduto.pulaLinha();
        System.out.println("opção 2: atualizar o primeiro produto cadastrado ");
        CadastroProduto.pulaLinha();
        System.out.println("opção 3: excluir o segundo produto cadastrado; ");
        CadastroProduto.pulaLinha();
    }

}
