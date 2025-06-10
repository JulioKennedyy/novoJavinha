package Lista9.quest4;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Publicacao p = null;

        System.out.println("Deseja colocar um livro ou revista?: ");
        String escolha = scan.nextLine();
        switch (escolha) {
            case "livro":
                p = new Livro();
                p.introduzDados(scan);
                p.mostrar();
                break;
            case "revista":
                p = new Revista();
                p.introduzDados(scan);
                p.mostrar();
                break;
        }
    }

}
