package personagem;

public class Lyra {

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

        raca = "Arqueira";
        this.raca = raca;
    }
    public String getraca(){
        return raca = "Arqueira";
    }

    public void setCoragem (int coragem){
        coragem = 7; //pode assumir valores de 0 a 10, limite será definido nas ações de batalha durante a história
                this.coragem = coragem; 
    }
    public int getCoragem(){
        return coragem = 7;
    }

    public void setHabil_combate (int habil_combate){
        habil_combate = 8;
                this.habil_combate = habil_combate;
    }
    public int getHabil_combate(){
        return habil_combate = 8;
    }

    public void setEsperteza (int esperteza){
        esperteza = 8;
        this.esperteza = esperteza;
    }
    public int getEsperteza(){
        return esperteza = 8;
    }

    public void setForca (int forca){
        forca = 5;
        this.forca = forca;
    }
    public int getForca(){
        return forca = 5;
    }

    public void setInteligencia (int inteligencia){
        inteligencia = 7;
        this.inteligencia = inteligencia;
    }
    public int getInteligencia(){
        return inteligencia = 7;
    }

}
