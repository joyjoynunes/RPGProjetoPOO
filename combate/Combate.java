package combate;
import java.util.Scanner;

// Definição das classes de personagem com base nas informações fornecidas

    abstract class Personagem {
        protected String raca;
        protected int coragem;
        protected int habil_combate;
        protected int esperteza;
        protected int forca;
        protected int inteligencia;
        protected int vida = 10;

        public String getRaca() {
            return raca;
        }

        public int getVida() {
            return vida;
        }

        public void receberDano(int dano) {
            vida -= dano;
            if (vida < 0) vida = 0;
        }

        public abstract int atacar(); // cada personagem implementa de forma única
    }

    class Guerreiro extends Personagem {
        public Guerreiro() {
            this.raca = "Guerreiro";
            this.coragem = 2;
            this.habil_combate = 3;
            this.esperteza = 0;
            this.forca = 2;
            this.inteligencia = 1;
        }

        public int atacar() {
            return (forca + habil_combate) * 2;
        }
    }

    // Definindo outras classes como Ladina, Arqueira, e Mago similarmente
    class Ladina extends Personagem {
        public Ladina() {
            this.raca = "Ladina";
            this.coragem = 8;
            this.habil_combate = 4;
            this.esperteza = 9;
            this.forca = 6;
            this.inteligencia = 8;
        }

        public int atacar() {
            return (forca + esperteza) * 2;
        }
    }

    class Arqueira extends Personagem {
        public Arqueira() {
            this.raca = "Arqueira";
            this.coragem = 7;
            this.habil_combate = 8;
            this.esperteza = 8;
            this.forca = 5;
            this.inteligencia = 7;
        }

        public int atacar() {
            return (habil_combate + forca) * 2;
        }
    }

    class Mago extends Personagem {
        public Mago() {
            this.raca = "Mago";
            this.coragem = 7;
            this.habil_combate = 7;
            this.esperteza = 8;
            this.forca = 4;
            this.inteligencia = 9;
        }

        public int atacar() {
            return (inteligencia + habil_combate) * 2;
        }
    }

    // Classe de Combate
    class Combate {
        private Personagem jogador;
        private Personagem oponente;

        public Combate(Personagem jogador, Personagem oponente) {
            this.jogador = jogador;
            this.oponente = oponente;
        }

        public void iniciar() {
            Scanner scanner = new Scanner(System.in);

            while (jogador.getVida() > 0 && oponente.getVida() > 0) {
                System.out.println(jogador.getRaca() + " Vida: " + jogador.getVida());
                System.out.println(oponente.getRaca() + " Vida: " + oponente.getVida());

                System.out.println("Escolha sua ação: 1 - Atacar | 2 - Defender");
                int acao = scanner.nextInt();

                int danoJogador = 0;
                int danoOponente = oponente.atacar();

                if (acao == 1) {
                    danoJogador = jogador.atacar();
                    System.out.println(jogador.getRaca() + " ataca causando " + danoJogador + " de dano!");
                } else {
                    danoOponente /= 2; // Reduz dano se o jogador escolher defender
                    System.out.println(jogador.getRaca() + " defendeu, dano reduzido!");
                }

                jogador.receberDano(danoOponente);
                oponente.receberDano(danoJogador);
            }

            if (jogador.getVida() <= 0) {
                System.out.println("Você perdeu a batalha...");
            } else {
                System.out.println("Você venceu a batalha!");
            }

            scanner.close();

            }
        class CombatePersonagens extends Combate {

            public CombatePersonagens(Personagem jogador, Personagem oponente) {
                super(jogador, oponente);
            }

            @Override
            public void iniciar() {
                System.out.println("Combate iniciado entre " + jogador.getClass().getSimpleName() + " e " + oponente.getClass().getSimpleName());
                // Lógica de combate aqui
            }

        }

    }



