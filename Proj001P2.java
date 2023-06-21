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
        System.out.println("\n\n   Anakin, curioso e tendo esperança de mudar a sociedade, decidiu usar o dispositivo"
                +"\nde viagem temporal para explorar o futuro." 
                +"\nDeterminado a usar esse conhecimento para mudar seu proprio tempo, Anakin começou a"
                +"\nbuscar novas experiências, pesquisando os avanços cientificos e tecnologicos. Ele fez amizade com"
                +"\nos lideres da resistencia local, compartilhando sua historia e seu desejo de derrotar o regime"
                +"\nimperial em seu proprio tempo. Com a ajuda dos novos aliados, Anakin foi capaz de aprimorar o"
                +"\ndispositivo de viagem temporal, incorporando as tecnologias futuristicas que descobriu." 
                +"\nEle aprendeu sobre novas estrategias de combate, comunicação avançada e tecnicas de resistencia." 
                +"\nQuando o momento certo chegou, Anakin, agora equipado com conhecimentos e tecnologias do futuro,"
                +"\nativou o dispositivo e voltou para sua propria era. Ele sabia que tinha uma missão importante a cumprir."
                +"\nCom suas novas habilidades e o apoio de rebeldes, Anakin liderou uma resistencia contra"
                +"\no regime imperial em Naboo. Eles conseguiram enfraquecer o imperio e restaurar a democracia" 
                +"\nna cidade. Anakin se tornou um heroi, trazendo esperança e coragem para o povo de Naboo." 
                +"\nSua aventura no futuro mudou o destino da cidade, derrubando o imperio e estabelecendo um governo justo."
                +"\nA historia de Anakin é uma prova de que um indiviu determinado pode fazer a diferença"
                +"\ne lutar por um mundo melhor." 
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
        System.out.println("Impulsionado por seu senso de justiça e determinação, Anakin decidiu intervir e tentar impedir a" 
                +"\ncriação do Império Galáctico. Ele sabia que essa era uma missão desafiadora e cheia de incertezas, mas estava" 
                +"\ndisposto a arriscar tudo para lutar pela liberdade e pela paz. Anakin começou sua jornada trabalhando nos bastidores,"
                +"\ninfiltrando-se em organizações e reunindo informações para desmascarar a corrupção que permeava a República."
                +"\nEle utilizou seu conhecimento do futuro para se antecipar aos eventos e evitar a ascensão dos líderes autoritários" 
                +"\nque seriam responsáveis pela criação do Império. Com astúcia e habilidade, Anakin formou alianças com outros indivíduos"
                +"\ndeterminados a desafiar o domínio opressivo que se aproximava. Juntos, eles trabalharam incansavelmente para despertar a" 
                +"\nconsciência das pessoas e promover mudanças significativas dentro da República. As ações de Anakin começaram a gerar resultados."
                +"\nSeu esforço incansável inspirou outros a se levantarem contra a tirania, e uma resistência cresceu em toda a galáxia." 
                +"\nAs forças do Império começaram a se enfraquecer, enquanto a esperança de um futuro livre se espalhava entre os oprimidos."
                +"\nNo clímax da batalha, Anakin liderou um ataque final contra as forças imperiais, utilizando sua destreza e habilidades" 
                +"\núnicas para enfrentar os líderes mais temidos. Com bravura e determinação, ele conseguiu desativar a arma final do Império,"
                +"\ndesmantelando seu poderoso domínio e restaurando a paz na galáxia."
                +"\nA derrota do Império Galáctico foi um marco histórico, graças à coragem e à ousadia de Anakin. Sua intervenção no passado" 
                +"\nmudou o curso da história e salvou inúmeras vidas. O futuro da galáxia foi moldado de uma maneira nova e promissora,"
                +"\nem que a liberdade e a justiça prevaleceram."
                +"\nAnakin se tornou um símbolo de esperança e inspiração para muitos, e seu legado perdurou por gerações." 
                +"\nSua coragem e determinação em desafiar o destino demonstraram que, com ações corretas e a vontade de lutar pelo que é certo," 
                +"\nqualquer um pode fazer a diferença, mesmo nos momentos mais sombrios."
                +"\nE assim, a história de Anakin, o jovem curioso de Naboo, que embarcou em uma aventura através do tempo, culminou em um" 
                +"\nfinal memorável, marcado pela vitória sobre a opressão e pela restauração da liberdade na galáxia."
                );
    }
    static void naointervir() {
        System.out.println("\n------------------------------ Anakin Decidi Apenas Observar ------------------------------");
        System.out.println("\n\n   Apesar de sentir uma forte vontade de intervir e tentar impedir a criação do Imperio Galactico," 
                +"\nAnakin decidiu respeitar a linha do tempo estabelecida e optou por observar de longe, sem interferir diretamente nos eventos que" 
                +"\nlevariam à ascensão do Imperio. Anakin compreendeu que mesmo suas melhores intenções poderiam desencadear" 
                +"\nconsequencias imprevisiveis e potencialmente piores. Ele reconheceu que a historia é um resultado complexo de" 
                +"\ndiversos fatores e que tentar altera-la poderia ter ramificações negativas para a galaxia." 
                +"\nAssim, Anakin permaneceu como um observador atento, estudando os acontecimentos que levaram a criação do Imperio Galactico." 
                +"\nEle documentou as injustiças, as corrupções e os erros cometidos, mantendo-se vigilante para aprender com os erros do" 
                +"\npassado e garantir que não se repetissem no futuro." 
                +"\nPor meio de sua observação, Anakin reuniu um vasto conhecimento sobre a historia e as lições que ela ensinava." 
                +"\nEle compartilhou esse conhecimento com outras pessoas, na esperança de que, ao compreender os erros do passado, a galaxia pudesse" 
                +"\nevitar repeti-los no futuro." 
                +"\nEmbora Anakin não tenha interferido diretamente nos eventos, sua sabedoria e perspicacia influenciaram muitos que lutavam" 
                +"\npela liberdade e justiça. Suas historias e ensinamentos se tornaram lendas, inspirando gerações futuras a resistir"
                +"\ná opressão e a lutar pela paz."
                +"\nNo final, Anakin encontrou satisfação em sua escolha de observar e aprender com o passado. Ele acreditava que," 
                +"\nao compreender plenamente a historia, a galaxia teria uma chance maior de forjar um futuro melhor e mais justo, evitando os" 
                +"\nerros que levaram à criação do Imperio Galactico." 
                +"\nE assim, a historia de Anakin, o jovem curioso de Naboo, que descobriu o poder do tempo, culminou em uma jornada de" 
                +"\naprendizado e sabedoria. Sua escolha de observar, em vez de intervir, teve um impacto indireto na galaxia, permitindo que as" 
                +"\nfuturas gerações construissem um futuro mais brilhante e livre de tirania." 
                );
    }
}
