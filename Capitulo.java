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
            System.out.println("\nEscolha o que fazer a seguir:");
            for (int i = 0; i < escolhas.length; i++) {
                System.out.println((char) ('a' + i) + ") " + escolhas[i].getTexto());
            }

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
        mostrar();
        escolher();
    }
}
