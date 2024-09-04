import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Cria uma instância de Random para gerar o número aleatório da IA
        Random random = new Random();

        // Cria uma instância de Scanner para capturar o prompt do usuário
        Scanner scanner = new Scanner(System.in);

        // A IA escolhe um número aleatório entre 1 e 10
        int numeroIA = random.nextInt(10) + 1;

        // Variável para armazenar o chute atual do jogador
        int chute = 0;

        // Contador de tentativas (começa zerado)
        int tentativas = 0;

        // Exibe uma mensagem inicial na tela
        System.out.println("A IA escolheu um número entre 1 e 10. Tente adivinhar!");

        // Loop do jogo que funciona até o jogador acertar o número
        while (chute != numeroIA) {
            // Solicita que o jogador digite um número
            System.out.print("Digite seu chute: ");

            // Número digitado pelo jogador
            chute = scanner.nextInt();

            // Aumenta o número de tentativas
            tentativas++;

            // Verifica se o chute é menor, maior ou igual ao número escolhido pela IA
            if (chute < 10 && chute > 1) {
                if (chute < numeroIA) {
                    System.out.println("O número é maior.\n");
                } else if (chute > numeroIA) {
                    System.out.println("O número é menor.\n");
                } else {
                    System.out.println("\n\nParabéns! Você acertou!\n");
                    System.out.println("\nVocê precisou de " + (tentativas) + " tentativas. ");                           System.out.println("Você teve " + (tentativas - 1) + " erros. ");
    
                }
            }
            else {
                System.out.println("Este não é um valor válido. Tente novamente.\n");
            }
        }
        // Fecha o Scanner
        scanner.close();
    }
}
