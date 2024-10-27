package personagem;

public class Kara {

    private String raca; //Raça
    private int coragem; //Coragem
    private int habil_combate; //Habilidade em Combate
    private int esperteza; //Esperteza
    private int forca; //Força
    private int inteligencia; //Inteligência

    public void setRaca (String raca){
,+
        raca = "Ladina";
        this.raca = raca;
    }

    public void setCoragem (int coragem){
        coragem = 8; //pode assumir valores de 0 a 10, limite será definido nas ações de batalha durante a história
                this.coragem = coragem; 
    }

    public void setHabil_combate (int habil_combate){
        habil_combate = 4;
                this.habil_combate = habil_combate;
    }              

    public void setEsperteza (int esperteza){
        esperteza = 9;
        this.esperteza = esperteza;
    }

    public void setForca (int forca){
        forca = 6;
        this.forca = forca;
    }

    public void setInteligencia (int inteligencia){
        inteligencia = 8;
        this.inteligencia = inteligencia;
    }
