public class Personagem {
    String nome = "";
    int força = 0;
    String arma = "";

    public Personagem(String nome, int força, String arma) {
        this.nome = nome;
        this.força = força;
        this.arma = arma;
    }

    static void nivelAtual(String nome, String arma, int força) {
        System.out.println("\n---> " + nome + " e o " + arma + " totalizam uma força de: " + força);
    }

    static void morte(String nome, String arma) {
        System.out.println("---> " + nome + " acabou sendo morto por um golpe com " + arma);
    }
}
