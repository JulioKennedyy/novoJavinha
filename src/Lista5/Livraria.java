package Lista5;

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
            if(titulo == null) {
                System.out.println("Não Encontrado");
                break;
            }
            if(titulo.getTitulo() == nomeLivro && titulo.getQuantidadeDisponivel() <= 0) {
                return "ESGOTADO";
            }
            if(titulo.getTitulo() == nomeLivro && titulo.getQuantidadeDisponivel() > 0) {
                titulo.setQuantidadeDisponivel(titulo.getQuantidadeDisponivel() - 1);
                saldoEmCaixa += titulo.getPreco();
            }
        }
        return "SUCESSO";
    }

    public static void main(String[] args) {

    }
}
