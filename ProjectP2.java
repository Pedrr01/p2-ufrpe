import java.util.Scanner;

public class ProjectP2 {
    public static void main(String[] args) {
        Capitulo introducao = new Capitulo("The Time Trek", "Era uma vez uma cidade chamada Naboo, que vivia sob um forte regime"
                + "\nimperial, nela se encontrava um jovem conhecido por Anakin, um rapaz curioso que buscava"
                + "\naventuras e enigmas a desvendar. Em um determinado dia, durante sua exploração no sótão da"
                + "\nantiga residência de seu avô, ele deparou-se com uma série de escritos e um objeto peculiar"
                + "\ne empoeirado. Tratava-se de um dispositivo, contendo vários botões e luzes."
                + "\nDesconhecendo sua função, Anakin lançou-se em investigação."
                + "\nApós longas horas vasculhando o sótão e lendo os escritos, Anakin descobriu que aquele era um"
                + "\ndispositivo que seu avô trabalhava a fim de conseguir realizar viagens no tempo. As narrativas"
                + "\nacerca dessas viagens sempre o fascinaram, todavia jamais imaginara que teria a oportunidade"
                + "\nde participar de uma. Com a empolgação pulsando em seu peito, Anakin percebeu que"
                + "\nera o momento perfeito para embarcar em uma aventura. Entretanto, ele sabia que uma"
                + "\nescolha crucial deveria ser feita. O dispositivo de viagem temporal permitia-lhe decidir entre"
                + "\npercorrer o passado ou desvendar o futuro.");

        Capitulo passado = new Capitulo("PASSADO", "Anakin pensou cuidadosamente sobre sua escolha, consciente de que viajar para o passado"
                + "\ne intervir em eventos históricos poderia ter consequências imprevisíveis. No entanto, a oportunidade"
                + "\nde presenciar em primeira mão os eventos que levaram à criação do Império Galáctico despertou"
                + "\nnele um senso de missão e a esperança de fazer a diferença."
                + "\nMovido pela curiosidade e pelo desejo de compreender as raízes do poderoso regime que ainda governava"
                + "\na galáxia, Anakin decidiu utilizar o dispositivo de viagem temporal para voltar ao passado,"
                + "\nespecificamente para a época das Guerras Clônicas."
                + "\nAo chegar no passado, Anakin ficou imediatamente imerso no caos e na brutalidade do conflito."
                + "\nEle viu o sofrimento dos cidadãos, as batalhas violentas e a corrupção que permeava a República"
                + "\nGaláctica. Percebeu que estava testemunhando um momento crítico que moldaria o destino de"
                + "\nmilhões de seres."
                + "\nDiante dessa realidade, Anakin enfrentou a escolha mais desafiadora de sua vida. Ele sabia que sua"
                + "\nintervenção poderia alterar o curso da história e, talvez, evitar a ascensão do Império."
                + "\nNo entanto, ele também reconhecia que poderia desencadear uma série de eventos ainda piores.");

        Capitulo intervir = new Capitulo("A INTERVENÇÃO", "Impulsionado por seu senso de justiça e determinação, Anakin decidiu intervir e tentar"
                + "\nimpedir a criação do Império. Ele conseguiu se infiltrar nas organizações que estavam prestes a"
                + "\ntomar o poder, pois já sabia que Conde Dookan era peça-chave nos planos dos líderes autoritários."
                + "\nDeterminado a interromper seus planos malignos, Anakin traçou um plano para confrontar o Conde Dookan e"
                + "\nacabar com sua influência sobre a República. Com astúcia e habilidade, Anakin formou alianças com outros"
                + "\nindivíduos igualmente determinados a desafiar o domínio opressivo. Juntos, eles trabalharam"
                + "\nincansavelmente para despertar a consciência das pessoas e promover mudanças significativas"
                + "\ndentro da República."
                + "\nCom o apoio crescente da resistência, Anakin se preparou para o confronto final com o Conde Dookan."
                + "\nNo auge da batalha, Anakin liderou um ataque audacioso contra as forças da nova ordem."
                + "\nUtilizando suas habilidades únicas, ele enfrentou o Conde e seus seguidores com coragem e determinação."
                + "\nCom uma luta intensa, Anakin conseguiu superar os obstáculos e finalmente derrotar o Conde Dookan."
                + "\nA queda desse poder teve um impacto significativo na criação do Império."
                + "\nSem o líder habilidoso e manipulador, os planos autoritários foram desestabilizados. A resistência"
                + "\ncresceu ainda mais, inspirada pela coragem de Anakin. Sua intervenção no passado alterou completamente"
                + "\no curso da história, salvando inúmeras vidas e evitando a criação do Império."
                + "\nSua coragem e ousadia foram fundamentais para a restauração da paz em Naboo.");

        Capitulo nãointervir = new Capitulo("A CAPTURA", "Apesar de sentir uma forte vontade de intervir e tentar impedir a criação do Império,"
                + "\nAnakin decidiu respeitar a linha do tempo e optou por observar de longe, sem interferir"
                + "\ndiretamente nos eventos que levariam à ascensão do Império. Anakin compreendeu que mesmo suas melhores"
                + "\nintenções poderiam desencadear consequências imprevisíveis e potencialmente piores."
                + "\nEle reconheceu que a história é um resultado complexo de diversos fatores e que tentar alterá-la"
                + "\npoderia ter ramificações negativas."
                + "\nNo entanto, enquanto Anakin se mantinha como um observador atento, ele acabou sendo capturado"
                + "\npor guardas da nova ordem, que também descobriram sua identidade como um jovem Jedi. O Conde Dookan,"
                + "\nciente disso, decidiu matá-lo, pondo fim à sua história e dando início à ascensão do Império e à"
                + "\nperseguição aos Jedis."
                + "\nDessa forma, a jornada de Anakin chegou a um fim, antes mesmo de ter a oportunidade de compartilhar"
                + "\nseu conhecimento e experiência com as futuras gerações.");

        Capitulo futuro = new Capitulo("FUTURO", "Anakin, curioso e tendo esperança de mudar a sociedade, decidiu usar o dispositivo"
                + "\nde viagem temporal para explorar o futuro. Determinado a usar esse conhecimento para mudar a"
                + "\na situação em Naboo, Anakin começou na buscar de novas experiências, pesquisando os avanços"
                + "\ncientíficos e tecnológicos. Ele fez amizade com os líderes da resistência local, compartilhando sua"
                + "\nhistória e seu desejo de derrotar o regime imperial em seu próprio tempo."
                + "\nCom a ajuda dos novos aliados, Anakin foi capaz de aprimorar suas habilidades,"
                + "\ne conhecimentos. Ele aprendeu  sobre novas estratégias de combate, comunicação avançada e"
                + "\ntécnicas de resistência. Na hora de partir em missão Anakin foi presenteado por um jedi com um sabre"
                + "\nde lâmina escura, que era capaz de cortar qualquer material e deveria ser usado para libertar seu povo."
                + "\nAnakin ativou o dispositivo e voltou para sua própria era pronto para cumprir sua missão."
                + "\nCom o apoio dos rebeldes, Anakin liderou uma rebelião contra o regime imperial em Naboo, resultando"
                + "\nno enfraquecimento das forças do regime e conseguindo impedir a fulga de Darth Sidious e acabar com"
                + "\nseu reinado de tirania. A vitória teve repercussões em toda a galáxia, a resistência"
                + "\ninspirada por Anakin se espalhou, levando à queda do império galáctico em vários sistemas estelares."
                + "\nOs planetas oprimidos começaram a se unir e a lutar contra a opressão imperial, seguindo o exemplo de Naboo.");

        Escolha escolhaIrPassado = new Escolha("ir para o passado", passado, introducao);
        Escolha escolhaIrFuturo = new Escolha("ir para o futuro", futuro, introducao);
        Escolha escolhaIntervir = new Escolha("intervir", intervir, passado);
        Escolha escolhaObservar = new Escolha("apenas observar", nãointervir, passado);
        Escolha escolhaReiniciar = new Escolha("reiniciar história", introducao, null);
        Escolha escolhaFinalizar = new Escolha("finalizar história", null, null);

        introducao.setEscolhas(new Escolha[]{escolhaIrPassado, escolhaIrFuturo});
        passado.setEscolhas(new Escolha[]{escolhaIntervir, escolhaObservar});
        intervir.setEscolhas(new Escolha[]{escolhaReiniciar, escolhaFinalizar});
        nãointervir.setEscolhas(new Escolha[]{escolhaReiniciar, escolhaFinalizar});
        futuro.setEscolhas(new Escolha[]{escolhaReiniciar, escolhaFinalizar});

        Capitulo raiz = introducao;
        raiz.executar();
    }
}
