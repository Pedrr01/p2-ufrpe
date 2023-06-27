public class Personagem{

    String nome = "";
    int ano = 0;
    String status = "";
    String poder = "";

    public Personagem(String nome, int ano, String status, String poder){
        this.nome = nome;
        this.ano = ano;
        this.status = status;
    }

    void morrer(String status, int ano){
        this.status = status;
        this.ano = ano;
        System.out.print("---> " + this.ano + " Ao final da jornada " + this.nome  
        + " acabou tento sua sentença de " + this.status);
    }
    void armamento(String poder){
        this.poder = poder;
        System.out.println(" por um golpe brutal de " + this.poder+".");
    }


}