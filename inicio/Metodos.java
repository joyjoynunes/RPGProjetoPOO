package inicio;

public class Metodos {

    String sexo;
    String nomeusuario;
    String ajuda;
    String sugestao;


    // Método de validação do sexo
    public String validarsexo(String sexo, String nomeusuario) {
        if (sexo.equals("F")) {
            return "Legal! Seja bem-vinda " + nomeusuario + "!";

        } else if (sexo.equals("M")) {
            return "Legal! Seja bem-vindo " + nomeusuario + "!";

        } else {
            return "Okay! Seja bem-vindo " + nomeusuario + "!";
        }
    }

    // Método para pedir ajuda
    public String pedirajuda(String ajuda){
        if (ajuda.equals("Sim")){
           return "Legal.. vamos chamar o Dragão, então.\n" +
                   "Ei, ei! Estamos aqui, por favor nos ajude!";
        }
        else {
            Imagens imagens = new Imagens();
            return "Ah... DROGA!!! O Dragão foi EMBORA\n" +
                    "... e agora? Como vamos sair daqui?\n" +
                    imagens.ImprimirCaraTriste();
        }
    }

    // Método para pedir ajuda de novo, caso a opção inicial seja a de não pedir ajuda.
    public String salvaraposnao(String sugestao){
        if (sugestao.equals("Sim")){
            ajuda = "Sim";
            return pedirajuda(ajuda);
        }
        else {
            Imagens imagens = new Imagens();
            return "bem... então, vamos morrer aqui.\n" +
            imagens.ImprimirCaraTriste();
        }
    }
}
