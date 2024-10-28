package personagem;

public class Kara {

    private String raca; //Raça
    private int coragem; //Coragem
    private int habil_combate; //Habilidade em Combate
    private int esperteza; //Esperteza
    private int forca; //Força
    private int inteligencia; //Inteligência
    private int vida; // Vida

    public void setVida(int Vida) {
        vida = 10;
        this.vida = vida;
    }
    public int getVida(){
        return vida = 10;
    }

    public void setRaca (String raca){
        raca = "Ladina";
        this.raca = raca;
    }
    public String getraca(){
        return raca = "Ladina";
    }

    public void setCoragem (int coragem){
        coragem = 8; //pode assumir valores de 0 a 10, limite será definido nas ações de batalha durante a história
                this.coragem = coragem; 
    }
    public int getCoragem(){
        return coragem = 8;
    }

    public void setHabil_combate (int habil_combate){
        habil_combate = 4;
                this.habil_combate = habil_combate;
    }
    public int getHabil_combate(){
        return habil_combate = 4;
    }

    public void setEsperteza (int esperteza){
        esperteza = 9;
        this.esperteza = esperteza;
    }
    public int getEsperteza(){
        return esperteza = 9;
    }

    public void setForca (int forca){
        forca = 6;
        this.forca = forca;
    }
    public int getForca(){
        return forca = 6;
    }
    public void setInteligencia (int inteligencia){
        inteligencia = 8;
        this.inteligencia = inteligencia;
    }

    public int getInteligencia(){
        return inteligencia = 8;
    }
}
