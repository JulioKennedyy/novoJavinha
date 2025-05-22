package EstudosPessoais;

import java.util.Scanner;

public class Gui {
    public static String falar() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = (scan.nextLine());
        return nome;
    }

    public static int falar(int numero) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        numero = (scan.nextInt());
        return numero;
    }
}
