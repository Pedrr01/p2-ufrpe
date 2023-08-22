import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Personagem {
    private String nome = "";
    private int forca = 0;
    private String arma = "";

    public Personagem(String nome) {
        carregarDados(nome);
    }

    private void carregarDados(String nome) {
        try {
            String dadosPersonagem = new String(
                    Files.readAllBytes(Paths.get("resources/personagem_" + nome.toLowerCase() + ".txt")));
            String[] linhas = dadosPersonagem.split("\n");
            this.nome = linhas[0];
            this.forca = Integer.parseInt(linhas[1]);
            this.arma = linhas[2];
        } catch (IOException e) {
            System.out.println("Erro ao carregar os dados do personagem: " + e.getMessage());
        }
    }

    public void getStatusAtual() {
        System.out.println("----> " + this.nome + " junto com sua arma " + this.arma +
                " totalizam uma força de " + this.forca + ".");
    }
}