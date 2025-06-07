package Lista9.quest3;

import java.util.Scanner;

public class FormatarTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        FormatacaoTexto f = null;
        System.out.println("Digite a palavra que será formatada");
        String palavra = scan.nextLine();
        System.out.println("Deseja formatar o texto em maiusculo, minusculo ou invertido?: ");
        String escolha = scan.nextLine();
        switch (escolha) {
            case "maiusculo":
                f = new Maiuscula();
                System.out.println(f.formatarTexto(palavra));
                break;
            case "minusculo":
                f = new Minuscula();
                System.out.println(f.formatarTexto(palavra));
                break;
            case "invertido":
                f = new Invertida();
                System.out.println(f.formatarTexto(palavra));
                break;
        }
    }
}
