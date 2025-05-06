package Lista5;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Livraria {
    private final Livro[] livros = new Livro[100];
    private int quantidadeDeLivrosCadastrados = 0;
    private float saldoEmCaixa = 0;

    public Livro[] getLivros() {
        return livros;
    }

    public int getQuantidadeDeLivrosCadastrados() {
        return quantidadeDeLivrosCadastrados;
    }

    public float getSaldoEmCaixa() {
        return saldoEmCaixa;
    }

    public boolean cadastrarLivro(Livro livro) {
        int contador = -1;
        for (Livro l : livros) {
            contador++;
            if (l == null) {
                livros[contador] = livro;
                quantidadeDeLivrosCadastrados++;
                break;
            }
            if (l.eIgual(livro)) {
                return false;
            }
        }
        return true;
    }

    public String comprarLivro(String nomeLivro) {
        for(Livro titulo: livros) {
            if (titulo == null) continue;

            if (titulo.getTitulo().equals(nomeLivro)) {
                if (titulo.getQuantidadeDisponivel() <= 0) {
                    return "ESGOTADO";
                } else {
                    titulo.setQuantidadeDisponivel(titulo.getQuantidadeDisponivel() - 1);
                    saldoEmCaixa += titulo.getPreco();
                    return "SUCESSO";
                }
            }
        }
        return "NÃO ENCONTRADO";
    }

    public static void main(String[] args) throws IOException {
        FileWriter escritor = new FileWriter("livros.txt", true);
        Scanner print = new Scanner(System.in);
        Livraria li = new Livraria();
        while (true) {
            System.out.println(" (1) Cadastrar um novo livro \n (2) Listar o estoque \n (3) Vender um livro \n (4) Consultar o caixa da livraria \n (5) Encerrar o programa");
            int resposta = print.nextInt();
            if (resposta == 1) {
                Livro livro = new Livro();
                System.out.println("Digite o título do livro: ");
                print.nextLine(); // limpar o \n pendente
                livro.setTitulo(print.nextLine());
                System.out.println("Digite o ano de publicação: ");
                livro.setAnoDePublicacao(print.nextInt());
                System.out.print("Digite a quantidade disponível: ");
                livro.setQuantidadeDisponivel(print.nextInt());
                System.out.print("Digite o preço do livro: ");
                livro.setPreco(print.nextFloat());
                System.out.println(li.cadastrarLivro(livro));

            }
            else if (resposta == 2) {
                for (Livro l : li.getLivros()) {
                    if (l != null) {
                        System.out.println("Nome do Livro: " + l.getTitulo());
                        System.out.println("Quantidade: " + l.getQuantidadeDisponivel());
                    } else {
                        break;
                    }
                }
            }
            else if (resposta == 3) {
                print.nextLine();
                System.out.println("Digite o titulo do livro que deseja comprar: ");
                System.out.println(li.comprarLivro(print.nextLine()));
            }
            else if (resposta == 4) {
                System.out.println(li.getSaldoEmCaixa());
            }
            else if (resposta == 5) {
                for(Livro l: li.getLivros()) {
                    if(l != null) {
                        escritor.write("\n"+l.getTitulo() + ", " + l.getAnoDePublicacao() + ", " + l.getQuantidadeDisponivel() + ", " + l.getPreco());
                    }
                }
                escritor.close();
                break;
            }
            else {
                System.out.println("O número digitado não é valido.");
            }
        }
    }
}
