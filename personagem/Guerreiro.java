package personagem;

public class Guerreiro {

    private int coragem; //Coragem
    private int habilicomb; //Habilidade em Combate
    private int esperteza; //Esperteza
    private int forca; //Força
    private String raca; //Raça
    private String inteligencia; //Inteligência

    public void setCoragem (int coragem){
        coragem = 2; //setando o valor padrão da variável para 0
                this.coragem = coragem;
                //pode assumir valores de 0 a 3
    }

    public void setHabilicomb (int habilicomb){
        habilicomb = 3;
                this.habilicomb = habilicomb;
    }

    public void setEsperteza (int esperteza){
        esperteza = 0;
        this.esperteza = esperteza;
    }

    public void setForca (int forca){
        forca = 2;
        this.forca = forca;
    }

    public void setraca (String raca){
        raca = "Guerreiro"; //Setando o valor da variável para "" - vazio
        this.raca = raca;
        // Pode assumir valores como: 1-Guerreiro, 2-Mago, 3-Ladina, 4-Bruxa, 5-Arqueira
    }

    public void setInteligencia (String inteligencia){
        inteligencia = "Pouco"; //Setando o valor da variável para "" - vazio
        this.inteligencia = inteligencia;
        // Pode assumir valores como: Pouco, Médio, Muito

    }


}

