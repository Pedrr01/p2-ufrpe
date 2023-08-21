public class Personagem {
    
    private String nome = "";
    private int força = 0;
    private String arma = "";

    public Personagem(String nome, int força, String arma) {
        this.nome = nome;
        this.força = força;
        this.arma = arma;
    }
    public void setForça(int força){
        this.força = força;
    }

    public void setArma(String arma){
        this.arma = arma;
    }

    public void getStatusAtual(){
        System.out.println("----> " + this.nome + " junto com sua arma " + this.arma + 
        " totalizam uma força de " + this.força + ".");
    }

}