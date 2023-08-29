import java.util.Scanner;

public class ProjetoP2 {
    public static void main(String[] args) {
        
        Capitulo introducao = new CapituloImagem("introducao", "imgintro");
        Capitulo passado = new Capitulo("passado");
        Capitulo futuro = new CapituloImagem("futuro", "imgfuturo");
        Capitulo intervir = new CapituloImagem("intervir", "imgintervir");
        Capitulo nãointervir = new CapituloImagem("naointervir", "imgnaointevir");

        Escolha escolhaIrPassado = new Escolha("ir para o passado", passado, introducao);
        Escolha escolhaIrFuturo = new Escolha("ir para o futuro", futuro, introducao);
        Escolha escolhaIntervir = new Escolha("intervir", intervir, passado);
        Escolha escolhaObservar = new Escolha("apenas observar", nãointervir, passado);
        Escolha escolhaReiniciar = new Escolha("reiniciar história", introducao, null);
        Escolha escolhaFinalizar = new Escolha("finalizar história", null, null);

        introducao.setEscolhas(new Escolha[] { escolhaIrPassado, escolhaIrFuturo });
        passado.setEscolhas(new Escolha[] { escolhaIntervir, escolhaObservar });
        intervir.setEscolhas(new Escolha[] { escolhaReiniciar, escolhaFinalizar });
        nãointervir.setEscolhas(new Escolha[] { escolhaReiniciar, escolhaFinalizar });
        futuro.setEscolhas(new Escolha[] { escolhaReiniciar, escolhaFinalizar });

        Capitulo raiz = introducao;
        raiz.executar();
    }
}