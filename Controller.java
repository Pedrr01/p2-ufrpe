import java.util.Scanner;

public class Controller {
    public static String decisão(String... escolhas) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" ");
        for (int i = 0; i < escolhas.length; i++) {
            System.out.println((char) ('A' + i) + ") " + escolhas[i]);
        }
        System.out.print("Digite a letra correspondente à sua escolha:");
        String escolha = scan.nextLine().toUpperCase();

        return escolha;
    }
}
