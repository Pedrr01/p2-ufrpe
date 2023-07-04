import java.util.Scanner;
public class Controller{

    public static String decisão(String a, String b){
        Scanner scan = new Scanner(System.in);
        System.out.print("\nEscolha uma opção\na) " +a+ "\nb) "+ b
        +"\nDigite aqui: ");
        String escolha = scan.nextLine();
        

        return escolha;
    }
}
