import java.util.Scanner;

public class Capitulo {
    private String titulo;
    private String conteudo;
    private Escolha[] escolhas;
    private Capitulo introducao;

    public Capitulo(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;

    }

    public void setEscolhas(Escolha[] escolhas) {
        this.escolhas = escolhas;
    }

    public void setIntroducao(Capitulo introducao) {
        this.introducao = introducao;
    }

    public void mostrar() {
        System.out.println("\n\n----------------------------->>>> " + titulo + " <<<<-----------------------------\n");
        System.out.println(conteudo);
    }

    public void escolher() {
        if (escolhas != null && escolhas.length > 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("");
            for (int i = 0; i < escolhas.length; i++) {
                System.out.println((char) ('a' + i) + ") " + escolhas[i].getTexto());
            }
            System.out.print("Digite sua escolha: ");
            String escolha = scanner.nextLine().toLowerCase();
            int opcaoEscolhida = escolha.charAt(0) - 'a';

            if (opcaoEscolhida >= 0 && opcaoEscolhida < escolhas.length) {
                Capitulo proximoCapitulo = escolhas[opcaoEscolhida].getProximoCapitulo();
                if (proximoCapitulo != null) {
                    proximoCapitulo.executar();
                }
            } else {
                System.out.println("Escolha inválida. Tente novamente.");
                escolher();
            }
        }
    }

    public void reiniciar() {
        introducao.executar();
    }

    public void executar() {
        Personagem Luke = new Personagem("Luke", 65, "Sem Arma");
        Personagem Kenobi = new Personagem("Jedi Kenobi", 80, "Sabre Negro");
        Personagem DarthSidious = new Personagem("Darth Sidious", 80, "Sabre de Luz");
        Personagem DarthMaul = new Personagem("Darth Maul", 60, "Force Pike");

        mostrar();
         if (this.titulo == "FUTURO") {
            System.out.println("");
            Luke.setArma("o Sabre Negro");
            Luke.setForça(85);
            Kenobi.setArma("Sem Arma");
            Kenobi.setForça(60);
            Luke.getStatusAtual(); 
        }else if(this.titulo == "A INTERVENÇÃO"){
            System.out.println("");
            Luke.setArma("o Sabre de Luz");
            Luke.setForça(75);
            Luke.getStatusAtual(); 
        }else if(this.titulo == "A CAPTURA"){
            System.out.println("");
            Luke.setArma("Sem Arma");
            Luke.setForça(55);
            Luke.getStatusAtual(); 
        }
        escolher();
    }
}
