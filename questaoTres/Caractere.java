package questaoTres;
import java.util.Scanner;

public class Caractere {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int divertido = 0;
        int chateado = 0;
      for(int i =0; i<=4; i++) {
          System.out.println("Digite um texto:");
          String mensagem = scanner.nextLine();

               if(mensagem.contains(":-)")){
                    divertido =+ 1;
                    } else
                       if(mensagem.contains(":-(")){
                           chateado =+ 1;
                            }
      }
        if(divertido == chateado){
            System.out.println("O resultado foi neutro!");
            } else
                if (divertido < chateado){
                    System.out.println(" O resultado foi chateado!");
                    } else
                        if (divertido > chateado){
                            System.out.println(" O resultado foi divertido!");
                            }
    }
}
