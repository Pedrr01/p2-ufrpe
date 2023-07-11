public class ProjectP2 {
    public static void main(String[] args) {
        String opc = "";
        Personagem anakin = new Personagem("Anakin",50,"Sem Arma");
        Personagem darthSidious = new Personagem("Darth Sidious",75,"Sabre de Luz");
        Personagem condeDookan = new Personagem("Conde Dookan",65,"Pistola de Íon" );

        String[] escolhas = { "viajar para o PASSADO", "viajar para o FUTURO" };
        Chapters chapter = new Chapters(escolhas);

        do {
            chapter.title("The Time Trek");
            chapter.intro();
            String tempo = Controller.decisão("viajar para o PASSADO", "viajar para o FUTURO");
            if(tempo.toUpperCase().equals("B")){
                chapter.title("FUTURO");
                chapter.futuro();
                Personagem.nivelAtual("Anakin","Sabre Negro",85);
                Personagem.morte("Darth Sidius", "Sabre Negro");
            }else if(tempo.toUpperCase().equals("A")){
                chapter.title("PASSADO");
                chapter.passado();
                String escolha = Controller.decisão("deve INTERVIR", "deve OBSERVAR");
                if(escolha.toUpperCase().equals("A")){
                    chapter.title("A INTERVENÇÃO");
                    chapter.intervir();
                    Personagem.nivelAtual("Anakin","Sabre de Luz",85);
                    Personagem.morte("Conde Dookan", "Sabre de Luz");
                }else if(escolha.toUpperCase().equals("B")){
                    chapter.title("A CAPTURA");
                    chapter.naointervir();
                    Personagem.nivelAtual("Conde Dookan","Pistola de Íon",65);
                    Personagem.morte("Anakin", "Pistola de Íon");
                }
            }
            opc = Controller.decisão("Reiniciar", "Finalizar");
            if(opc.toUpperCase().equals("B")){
                chapter.title("FIM");
            }

        } while (!opc.toUpperCase().equals("B"));
    }
}
