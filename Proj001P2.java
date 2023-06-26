import java.util.Scanner;

public class Proj001P2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String cond = "";

        do {
        
        introducao();
        System.out.print("Digite uma letra: ");
        String caminho = scan.nextLine();

        if(caminho.equals("a") || caminho.equals("A")){
            passado();
            System.out.print("Digite uma letra: ");
            String caminhopass = scan.nextLine();

            if(caminhopass.equals("a") || caminhopass.equals("A")){
                intervir();

            }else if(caminhopass.equals("b") || caminhopass.equals("B")){
                naointervir();
            }

        }else if(caminho.equals("b") || caminho.equals("B")){
            futuro();
        }else{
            System.out.println("Opção Inválida");
        }

        System.out.println("\n\n--------------------------------------------------------------------------------");
        System.out.print("Deseja voltar para o inicio da historia?"
        +"\na) SIM\nb) NÃO\nDigite sua escolha:");
        cond = scan.nextLine();
     
        System.out.println("\n--------------------------------------------------------------------------------");
        }
        while(cond.equals("a") || cond.equals("A"));
    }

    static void introducao() {
        System.out.println("------------------------------ Anakin Além do Tempo ------------------------------");
        System.out.println("\n   Era uma vez uma cidade chamada Naboo, que vivia sob um forte regime"
                +"\nimperial, nela se encontrava um jovem conhecido por Anakin, um rapaz curioso em busca incessante"
                +"\nde aventuras e enigmas a desvendar. Em um determinado dia, durante sua exploração no sótão da"
                +"\nantiga residência de seu avô, ele deparou-se com uma série de escritos e um objeto peculiar"
                +"\ne empoeirado. Tratava-se de um dispositivo, contendo botões e luzes intermitentes."
                +"\nDesconhecendo sua função, Anakin lançou-se em investigação."
                +"\nApós longas horas vasculhando o sótão, Anakin desvendou a verdade: aquele era um antiquíssimo"
                +"\ndispositivo que seu avô trabalhava a fim de conseguir realizar viagens no tempo. As narrativas"
                +"\nacerca dessas viagens sempre o fascinaram, todavia jamais imaginara que teria a oportunidade"
                +"\nde participar de uma. Com a empolgação pulsando em seu peito, Anakin percebeu que"
                +"\nera o momento perfeito para embarcar em uma aventura memorável. Entretanto, ele sabia que uma"
                +"\nescolha crucial deveria ser feita. O dispositivo de viagem temporal permitia-lhe decidir entre"
                +"\npercorrer o passado ou desvendar o futuro."
                +"\n\n--> Agora você decide o rumo da história, Anakin deve:"
                +"\na) Viajar para o passado.\nb) Viajar para o futuro");

    }
    static void futuro() {
        System.out.println("\n------------------------------>>>>>>>>> FUTURO <<<<<<<<<------------------------------");
        System.out.println("\n\n    Anakin, curioso e tendo esperança de mudar a sociedade, decidiu usar o dispositivo de"
            +"\nviagem temporal para explorar o futuro. Determinado a usar esse conhecimento para mudar seu próprio tempo, Anakin começou"
            +"\na buscar novas experiências, pesquisando os avanços científicos e tecnológicos. Ele fez amizade com os líderes da"
            +"\nresistência local, compartilhando sua história e seu desejo de derrotar o regime imperial em seu próprio tempo."
            +"\nCom a ajuda dos novos aliados, Anakin foi capaz de aprimorar o dispositivo de viagem temporal, incorporando as tecnologias"
            +"\nfuturísticas que descobriu. Ele aprendeu  sobre novas estratégias de combate, comunicação avançada e técnicas de resistência."
            +"\nQuando o momento certo chegou, Anakin, agora equipado com conhecimentos e tecnologias do futuro, ativou o dispositivo"
            +"\ne voltou para sua própria era. Ele sabia que tinha uma missão importante a cumprir. Com suas novas habilidades e o apoio dos" 
            +"\nrebeldes, Anakin liderou uma resistência contra o regime imperial em Naboo. Eles conseguiram enfraquecer o império e restaurar"
            +"\na democracia na cidade. Anakin se tornou um herói, trazendo esperança e coragem para o povo de Naboo. Sua aventura no futuro"
            +"\nmudou o destino da cidade, derrubando o império e estabelecendo um governo justo. Com as tecnologias e estratégias do futuro,"
            +"\nAnakin e seus aliados conseguiram neutralizar Darth Sidious e acabar com seu reinado de tirania. A derrota de Darth Sidious"
            +"\nteve repercussões em toda a galáxia. A resistência inspirada por Anakin se espalhou, levando à queda do império galáctico"
            +"\nem vários sistemas estelares. Os planetas oprimidos começaram a se unir e a lutar contra a opressão imperial, seguindo o"
            +"\nexemplo de Naboo."
                );
    }   
    static void passado() {
        System.out.println("\n------------------------------>>>>>>>>> PASSADO <<<<<<<<<------------------------------");
        System.out.println("\n\n   Anakin pensou cuidadosamente sobre sua escolha, consciente de que viajar para o passado e"
                +"\nintervir em eventos historicos poderia ter consequencias imprevisiveis. No entanto, a oportunidade de" 
                +"\npresenciar em primeira mão os eventos que levaram a criação do Imperio Galactico despertou" 
                +"\nnele um senso de missão e a esperançaa de fazer a diferençaa." 
                +"\nMovido pela curiosidade e pelo desejo de compreender as raizes do poderoso regime que ainda governava a galaxia,"
                +"\nAnakin decidiu utilizar o dispositivo de viagem temporal para voltar ao passado, especificamente para a epoca" 
                +"\ndas Guerras Clonicas."
                +"\nAo chegar no passado, Anakin ficou imediatamente imerso no caos e na brutalidade do conflito." 
                +"\nEle viu o sofrimento dos cidadõess, as batalhas violentas e a corrupções que permeava a Republica Galactica."
                +"\nPercebeu que estava testemunhando um momento critico que moldaria o destino de milhões de seres." 
                +"\nDiante dessa realidade, Anakin enfrentou a escolha mais desafiadora de sua vida. Ele sabia que sua"
                +"\nintervenção poderia alterar o curso da historia e, talvez, evitar a ascensão do Imperio Galactico." 
                +"\nNo entanto, tambem reconhecia que poderia inadvertidamente desencadear uma série de eventos ainda piores." 
                +"\nCom o coração acelerado, Anakin se dirige diretamente para a linha de frente da batalha."
                +"\nNo calor da guerra, ele se encontra diante de uma encruzilhada crucial." 
                +"\n\n--> Novamente você decide o rumo da história, Anakin deve:"
                +"\na) Intervir na ascensão do Imperio.\nb) Apenas observa. "
                );
    }
    static void intervir() {
        System.out.println("\n------------------------------ Anakin Tenta Imperdir a Ascenção do Imperio ------------------------------");
        System.out.println("\n\n  Impulsionado por seu senso de justiça e determinação, Anakin decidiu intervir e tentar impedir a criação do" 
                +"\nImpério Galáctico. Após se infiltrar em organizações e reunir informações, ele descobriu que o Conde Dookan era peça-chave nos" 
                +"\nplanos dos líderes autoritários. Determinado a interromper seus planos malignos, Anakin traçou um plano para confrontar o"
                +"\nConde Dookan e desativar sua influência sobre a República. Com astúcia e habilidade, Anakin formou alianças com outros indivíduos" 
                +"\nigualmente determinados a desafiar o domínio opressivo. Juntos, eles trabalharam incansavelmente para despertar a consciência"
                +"\ndas pessoas e promover mudanças significativas dentro da República. Com o apoio crescente da resistência, Anakin se preparou"
                +"\npara o confronto final com o Conde Dookan. No clímax da batalha, Anakin liderou um ataque naudacioso contra as forças do Conde Dookan."
                +"\nUtilizando sua destreza e habilidades únicas, nele enfrentou o Conde e seus seguidores com coragem e determinação."
                +"\nCom uma luta intensa, Anakin conseguiu superar os obstáculos ne finalmente derrotar o Conde Dookan. A derrota do Conde Dookan" 
                +"\nteve um impacto significativo na criação do Império Galáctico."
                +"\nSem o líder habilidoso e manipulador, os planos autoritários foram desestabilizados. A resistência cresceu ainda mais, inspirada" 
                +"\npela coragem de Anakin e pela vitória sobre o Conde Dookan. A intervenção de Anakin no passado alterou completamente o curso da"
                +"\nhistória, salvando inúmeras vidas e evitando a criação do Império Galáctico. Sua coragem e ousadia foram fundamentais para a" 
                +"\nrestauração da paz na galáxia."
                );
    }
    static void naointervir() {
        System.out.println("\n------------------------------ Anakin Decidi Apenas Observar ------------------------------");
        System.out.println("\n\n  Apesar de sentir uma forte vontade de intervir e tentar impedir a criação do Império Galáctico, Anakin decidiu"
                +"\nrespeitar a linha do tempo estabelecida e optou por observar de longe, sem interferir diretamente nos eventos que levariam à"
                +"\nascensão do Império. Anakin compreendeu que mesmo suas melhores intenções poderiam desencadear consequências imprevisíveis e" 
                +"\npotencialmente piores. Ele reconheceu que a história é um resultado complexo de diversos fatores e que tentar alterá-la poderia" 
                +"\nter ramificações negativas para a galáxia."
                +"\nNo entanto, enquanto Anakin se mantinha como um observador atento, ele acabou sendo capturado pelo Império Galáctico," 
                +"\nque também descobriu sua identidade como um jovem Jedi. O Conde Dookan, ciente disso, decidiu matá-lo, pondo fim à sua história e" 
                +"\ntendo inicio a ascensão do Império. Dessa forma, a jornada de Anakin chegou a um fim abrupto, antes mesmo de ter a oportunidade de" 
                +"\ncompartilhar seu conhecimento e experiência. futuras gerações construissem um futuro mais brilhante e livre de tirania." 
                );
    }
}
