package personagem;

public class Guerreiro {

    private int coragem; //Coragem
    private int habilicomb; //Habilidade em Combate
    private int esperteza; //Esperteza
    private int forca; //Força
    private String raca; //Raça
    private String inteligencia; //Inteligência
    private int vida; // Vida

    public void setVida(int Vida) {
        vida = 10;
        this.vida = vida;
    }
    public int getVida(){
        return vida = 10;
    }

    public void setCoragem (int coragem){
        coragem = 2; //setando o valor padrão da variável para 0
                this.coragem = coragem;
                //pode assumir valores de 0 a 3
    }
    public int getCoragem(){
        return coragem = 2;
    }

    public void setHabilicomb (int habilicomb){
        habilicomb = 3;
                this.habilicomb = habilicomb;
    }
    public int getHabilicomb(){
        return habilicomb = 3;
    }

    public void setEsperteza (int esperteza){
        esperteza = 0;
        this.esperteza = esperteza;
    }
    public int getEsperteza(){
        return esperteza = 0;
    }

    public void setForca (int forca){
        forca = 2;
        this.forca = forca;
    }
    public int getForca(){
        return forca = 2;
    }

    public void setraca (String raca){
        raca = "Guerreiro"; //Setando o valor da variável para "" - vazio
        this.raca = raca;
        // Pode assumir valores como: 1-Guerreiro, 2-Mago, 3-Ladina, 4-Bruxa, 5-Arqueira
    }
    public String getraca(){
        return raca = "Guerreiro";
    }

    public void setInteligencia (String inteligencia){
        inteligencia = "Pouco"; //Setando o valor da variável para "" - vazio
        this.inteligencia = inteligencia;
        // Pode assumir valores como: Pouco, Médio, Muito
    }
    public String getInteligencia(){
        return inteligencia = "Pouco";
    }


}

