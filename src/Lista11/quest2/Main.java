package Lista11.quest2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Impressora impressora = new Impressora();
        int totalImpresso = 0;

        while (true) {
            System.out.println("1 - Imprimir");
            System.out.println("2 - Carregar papel");
            System.out.println("3 - Trocar o toner");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Quantas páginas deseja imprimir? ");
                    int qtd = scan.nextInt();
                    try {
                        int impresso = impressora.imprimir(qtd);
                        System.out.println("Impressão concluída: " + impresso + " página(s).");
                        totalImpresso += impresso;
                    } catch (FaltouPapelException e) {
                        System.out.println("Erro: " + e.getMessage());
                        System.out.println("Páginas não impressas: " + e.getPaginasNaoImpressas());
                        totalImpresso += (qtd - e.getPaginasNaoImpressas());
                    } catch (FaltouTintaException e) {
                        System.out.println("Erro: " + e.getMessage());
                        System.out.println("Páginas não impressas: " + e.getPaginasNaoImpressas());
                        totalImpresso += (qtd - e.getPaginasNaoImpressas());
                    }
                    break;
                case 2:
                    System.out.print("Quantas folhas deseja adicionar? ");
                    int folhas = scan.nextInt();
                    impressora.setQuantidadeDePaginas(folhas);
                    System.out.println("Papel carregado com sucesso.");
                    break;
                case 3:
                    System.out.print("Quantas folhas deseja adicionar? ");
                    int tinta = scan.nextInt();
                    impressora.setCargaToner(tinta);
                    System.out.println("Toner recarregado.");
                    break;
                case 4:
                    System.out.println("Total de páginas impressas: " + totalImpresso);
                    System.out.println("Encerrando...");
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
