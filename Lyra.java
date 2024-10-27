package personagem;

public class Lyra {

    private String raca; //Raça
    private int coragem; //Coragem
    private int habil_combate; //Habilidade em Combate
    private int esperteza; //Esperteza
    private int forca; //Força
    private int inteligencia; //Inteligência

    public void setRaca (String raca){
,+
        raca = "Arqueira";
        this.raca = raca;
    }

    public void setCoragem (int coragem){
        coragem = 7; //pode assumir valores de 0 a 10, limite será definido nas ações de batalha durante a história
                this.coragem = coragem; 
    }

    public void setHabil_combate (int habil_combate){
        habil_combate = 8;
                this.habil_combate = habil_combate;
    }              

    public void setEsperteza (int esperteza){
        esperteza = 8;
        this.esperteza = esperteza;
    }

    public void setForca (int forca){
        forca = 5;
        this.forca = forca;
    }

    public void setInteligencia (int inteligencia){
        inteligencia = 7;
        this.inteligencia = inteligencia;
    }


}
