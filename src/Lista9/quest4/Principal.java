package Lista9.quest4;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Publicacao p = null;
        ArrayList<Publicacao> publicacoes = new ArrayList<>();


        while (true) {
            System.out.println(" 1\n" +
                    "cadastrar novo livro, 2\n" +
                    "cadastrar nova revista, 3\n" +
                    "lista todas as publicações, 4\n" +
                    "listar apenas os livros, 5\n" +
                    "listar apenas as revistas e S\n" +
                    "Sair:\n ");
            String escolha = scan.nextLine();
            switch (escolha) {
                case "1":
                    p = new Livro();
                    p.introduzDados(scan);
                    p.mostrar();
                    publicacoes.add(p);
                    break;
                case "2":
                    p = new Revista();
                    p.introduzDados(scan);
                    p.mostrar();
                    publicacoes.add(p);
                    break;
                case "3":
                    for (Publicacao a : publicacoes) {
                        if (a == null) {
                            System.out.println("Lista vazia");
                            break;
                        } else {
                            a.getClass();
                            a.mostrar();
                        }
                    }
                    break;
                case "4":
                    for (Publicacao a : publicacoes) {
                        if (a instanceof Livro) {
                            a.getClass();
                            a.mostrar();
                        }
                    }
                    break;
                case "5":
                    for (Publicacao a : publicacoes) {
                        if (a instanceof Revista) {
                            a.getClass();
                            a.mostrar();
                        }
                    }
                    break;
            }
        }
    }
}
