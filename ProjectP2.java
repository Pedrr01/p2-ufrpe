public class ProjectP2 {
    public static void main(String[] args) {
        String opc = "";
        Personagem anakin = new Personagem("Anakin",50,"Sem Arma");
        Personagem darthSidious = new Personagem("Darth Sidious",75,"Sabre de Luz");
        Personagem condeDookan = new Personagem("Conde Dookan",65,"Pistola de Íon" );
        // Sabre negro -> 35
        // Sabre de Luz -> 25
        do{
            Chapters.title("The Time Trek");
            Chapters.intro();
            String tempo = Controller.decisão("viajar para o PASSADO", "viajar para o FUTURO");
            if(tempo.toUpperCase().equals("B")){
                Chapters.title("FUTURO");
                Chapters.futuro();
                Personagem.nivelAtual("Anankin","Sabre Negro",85);
                Personagem.morte("Darth Sidius", "Sabre Negro");
            }else if(tempo.toUpperCase().equals("A")){
                Chapters.title("PASSADO");
                Chapters.passado();
                String escolha = Controller.decisão("deve INTERVIR", "deve OBSERVAR");
                if(escolha.toUpperCase().equals("A")){
                    Chapters.title("A INTERVENÇÃO");
                    Chapters.intervir();
                    Personagem.nivelAtual("Anankin","Sabre de Luz",85);
                    Personagem.morte("Conde Dookan", "Sabre de Luz");
                }else if(escolha.toUpperCase().equals("B")){
                    Chapters.title("A CAPTURA");
                    Chapters.naointervir();
                    Personagem.nivelAtual("Conde Dookan","Pistola de Íon",65);
                    Personagem.morte("Anakin", "Pistola de Íon");
                }
            }
            opc = Controller.decisão("Reiniciar", "Finalizar");
            if(opc.toUpperCase().equals("B")){
                Chapters.title("FIM");
            }

        }while(!opc.toUpperCase().equals("B"));
           
    }
}
        
