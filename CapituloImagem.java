import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CapituloImagem extends Capitulo {
    private String imagem;

    public CapituloImagem(String titulo, String imagemArquivo) {
        super(titulo);
        this.imagem = carregarImagem(imagemArquivo);
    }

    private String carregarImagem(String arquivo) {
        try {
            return new String(Files.readAllBytes(Paths.get("imagens/" + arquivo + ".txt")));
        } catch (IOException e) {
            System.out.println("Erro ao carregar a imagem do capítulo: " + e.getMessage());
            return "";
        }
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println(imagem);
    }
}
