package combate;
import java.util.Scanner;

// Classe principal para execução do combate
public class Jogo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha seu personagem: 1 - Guerreiro | 2 - Ladina | 3 - Arqueira | 4 - Mago");
        int escolha = scanner.nextInt();

        Personagem jogador = null;
        Personagem oponente = null;

        switch (escolha) {
            case 1 -> {
                jogador = new Guerreiro();
                oponente = new Mago(); // Exemplo de oponente fixo para Guerreiro
            }
            case 2 -> {
                jogador = new Ladina();
                oponente = new Arqueira(); // Exemplo de oponente fixo para Ladina
            }
            case 3 -> {
                jogador = new Arqueira();
                oponente = new Guerreiro(); // Exemplo de oponente fixo para Arqueira
            }
            case 4 -> {
                jogador = new Mago();
                oponente = new Ladina(); // Exemplo de oponente fixo para Mago
            }
            default -> System.out.println("Escolha inválida.");
        }
        if (jogador != null && oponente != null) {
            Combate combate = new Combate(jogador, oponente);
            combate.iniciar();
        }
         scanner.close();
        }
    }
