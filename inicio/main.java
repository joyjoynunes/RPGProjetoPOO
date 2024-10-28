package inicio;
import java.util.Scanner;
import personagem.*;
import combate.Jogo;
import combate.*;

public class main {

    public static <Personagem, Combate> void main (String[] args) {

            //pegando as informações iniciais do usuário - Nome e Sexo
            System.out.println("Bem vindo, ao Fantástico reino de Istória!\n" +
                    "Antes de começarmos o Setup inicial, por favor me informe como deseja ser chamado:");

            String nomeusuario;
            Scanner reader = new Scanner(System.in);
            nomeusuario = reader.nextLine();

            System.out.println("Legal, " + nomeusuario + "!\n" +
                    "Seu nome é mágico!");

            System.out.println("Agora me informe o seu sexo:");

            String sexo;
            sexo = reader.nextLine();

            if (!sexo.equals("F") && !sexo.equals("M")){
                System.out.println("Você só pode inserir os valores de F ou M.. mas caso prefira, não precisa me dar essa informação sobre você.");
                System.out.println("Agora, escolha uma das opções abaixo:\n" +
                        "1-F\n" +
                        "2-M\n" +
                        "3-Não quero dizer.");
                sexo = reader.nextLine();

                 if (sexo.equals("F")){
                    System.out.println("Legal! Seja bem-vinda " + nomeusuario + "!");
                     System.out.println("Droga... nós caímos num calabouço.");
                }

                else if (sexo.equals("M")) {
                    System.out.println("Legal! Seja bem-vindo " + nomeusuario + "!");
                     System.out.println("Droga... nós caímos num calabouço.");
                }

                 else {
                     System.out.println("Okay! Seja bem-vindo " + nomeusuario + "!");
                     System.out.println("Droga... nós caímos num calabouço.");
                 }
            }

            else {
                Metodos metodos = new Metodos();
                System.out.println(metodos.validarsexo(sexo, nomeusuario));

                System.out.println("Droga... nós caímos num calabouço " + nomeusuario + "!");
            }

        Imagens imagens = new Imagens();
        System.out.println(imagens.imprimirCaraEntediado());

        System.out.println("Mas... "+ nomeusuario.toUpperCase() + "...\n" +
                "OLHE!... VAMOS, OLHE PARA O ALTO! Há um DRAGÃO nos rondando!\n" +
                "Eu... eu acho que é o dragão da feiticeira Kara!\n" +
                "Vamos!... Grite, chame a atenção dele... ele pode nos ajudar a sair daqui.");

        String ajuda;
        System.out.println("Pedir ajuda:\n" +
                "1-Sim\n" +
                "2-Não");
        ajuda = reader.nextLine();
        //chamando método para pedir a ajuda do dragão
        Metodos metodos = new Metodos();
        System.out.println(metodos.pedirajuda(ajuda));

        //chamando método para o caso da opção escolhida no bloco anterior for: 2-Não
        String sugestao;
        System.out.println("Você quer pedir ajuda, de novo?\n" +
                "1-Sim\n" +
                "2-Não");
        sugestao = reader.nextLine();
        System.out.println(metodos.salvaraposnao(sugestao));

        System.out.println("- O Dragão retorna em direção ao calabouço - \n" +
                "-  Ele entra dentro do calabouço e salva " + nomeusuario + " e o narrador da nossa história -");
        System.out.println("- Já em cima do dorso do Dragão...- \n" +
                "Uffa, hahaha. Ainda bem que você tomou a decisão a certa... confesso que eu não queria virar comida de troll ^^\n" +
                "Olhe... ele está nos levando em direção ao Castelo do Rei Haku! O dragão de Kara deve ter percebido que o seu cheiro é estranho.\n" +
                "Bem, como eu sou desatento... Não te expliquei no que isso implica, né? Mas bem, tudo aconteceu tão rápido depois que pedi pra você se apresentar que também não tive tempo de te explicar algo.\n" +
                "Enfim... como você é novo nesse mundo, isso significa que você não nasceu com uma raça daqui... Você só é um mero e fraco humano.\n" +
                "Te levando até o Rei, ele te dará a opção de escolher entre 4 raças para que você possa herdar suas habilidades. Dessa forma, voce continua sendo um humano, mas com habilidade necessárias para sobrevivência nesse mundo.");
        System.out.println("-O dragão de Kara chega ao castelo e deixa " +nomeusuario+ "e o narrador em frente ao portão que dá acesso ao hall de entrada que leva ao rei.");
        System.out.println("Chegamos! Vamos, vou te levar ao Rei.");
        System.out.println("-" + nomeusuario + "e o narrador seguem em frente até a próxima porta. Batem e em seguida ouve-se um barulho muito alto de engrenagens se movendo.");
        System.out.println("-A porta se abriu.");
        System.out.println("- O rei está sentado em seu trono ao final do que era equivalente a um corredor de pelo menos uns 20m.");
        System.out.println("Rei: Olá. O que os trazem até mim?");
        System.out.println("Narrador: Olá, Majestade...\n" +
                "- o Narrador e " +nomeusuario+ " se curvam diante do rei.\n" +
                "Eu e " +nomeusuario + " caímos num calabouço próximo a floresta dos Pinheiros, mas conseguimos ser resgatados pelo dragão de Kara.\n" +
                "Rei: Sim.. tudo bem, mas PORQUE ele trouxe vocês até mim?\n" +
                "Narrador: Bem, o dragão percebeu que o cheiro de "+nomeusuario+ " era de um Humano e nos trouxe aqui para que vossa majestade pudesse ceder habilidades.");
        System.out.println("Rei: Certo.\n" +
                "Rei:" + nomeusuario + " No reino de Istória, existem 4 raças as quais as criaturas podem ser classificadas. São elas:\n" +
                "1 - Guerreiros.\n" +
                "2 - Feiticeiros.\n" +
                "3 - Ladinos\n" +
                "4 - Magos\n");
        System.out.println("Estas são as habilidades de cada um deles.");

        //Instanciando classe das raças
        //Guerreiro
        Guerreiro guerreiro = new Guerreiro();
        System.out.println("1 - Guerreiro");
        System.out.println("Coragem: "+ guerreiro.getCoragem());
        System.out.println("Habilidade de Combate: "+ guerreiro.getHabilicomb());
        System.out.println("Esperteza: "+ guerreiro.getEsperteza());
        System.out.println("Força: "+ guerreiro.getForca());
        System.out.println("Inteligência: "+ guerreiro.getInteligencia()+ "\n");

        //Ladina
        Kara ladina = new Kara();
        System.out.println("2 - Ladina");
        System.out.println("Coragem: "+ ladina.getCoragem());
        System.out.println("Habilidade de Combate: "+ ladina.getHabil_combate());
        System.out.println("Esperteza: "+ ladina.getEsperteza());
        System.out.println("Força: "+ ladina.getForca());
        System.out.println("Inteligência: "+ ladina.getInteligencia() + "\n");

        //Arqueira
        Lyra arqueira = new Lyra();
        System.out.println("3 - Arqueira");
        System.out.println("Coragem: "+ arqueira.getCoragem());
        System.out.println("Habilidade de Combate: "+ arqueira.getHabil_combate());
        System.out.println("Esperteza: "+ arqueira.getEsperteza());
        System.out.println("Força: "+ arqueira.getForca());
        System.out.println("Inteligência: "+ arqueira.getInteligencia() + "\n");

        //Mago
        Maeron mago = new Maeron();
        System.out.println("4 - Mago");
        System.out.println("Coragem: "+ mago.getCoragem());
        System.out.println("Habilidade de Combate: "+ mago.getHabil_combate());
        System.out.println("Esperteza: "+ mago.getEsperteza());
        System.out.println("Força: "+ mago.getForca());
        System.out.println("Inteligência: "+ mago.getInteligencia() + "\n");

        System.out.println("Rei: Escolha sua raça digitando o número correspondente:");

        int escolha = reader.nextInt();
        Personagem jogador = null;
        Personagem oponente = null;

        switch (escolha) {
            case 1 -> {
                jogador = (Personagem) new Guerreiro();
                oponente = (Personagem) new Maeron(); // Oponente fixo para o Guerreiro
            }
            case 2 -> {
                jogador = (Personagem) new Kara();
                oponente = (Personagem) new Lyra(); // Oponente fixo para Ladina
            }
            case 3 -> {
                jogador = (Personagem) new Lyra();
                oponente = (Personagem) new Guerreiro(); // Oponente fixo para Arqueira
            }
            case 4 -> {
                jogador = (Personagem) new Maeron();
                oponente = (Personagem) new Kara(); // Oponente fixo para Mago
            }
            default -> System.out.println("Escolha inválida.");
        }

        if (jogador != null && oponente != null) {
            //Combate combate = new CombatePersonagens(jogador, oponente);
            //combate.notify();
        }

        reader.close();
    }
}


