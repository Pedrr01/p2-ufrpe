import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Escolha {
    private String texto;
    private Capitulo proximoCapitulo;
    private Capitulo introducao;

    public Escolha(String texto, Capitulo proximoCapitulo, Capitulo introducao) {
        this.texto = texto;
        this.proximoCapitulo = proximoCapitulo;
        this.introducao = introducao;
    }

    public String getTexto() {
        return texto;
    }

    public Capitulo getProximoCapitulo() {
        return proximoCapitulo;
    }

    public void reiniciar() {
        introducao.reiniciar();
    }
}