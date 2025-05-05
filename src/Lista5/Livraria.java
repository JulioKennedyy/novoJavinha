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

    public static void main(String[] args) {
        Livro l1 = new Livro();
        l1.setTitulo("oi");
        Livro l2 = new Livro();
        l2.setTitulo("oii");
        Livraria li = new Livraria();
        System.out.println(li.cadastrarLivro(l1));
        System.out.println(li.cadastrarLivro(l2));
        for(Livro l: li.getLivros()) {
            System.out.println(l);
        }
        System.out.println(li.getQuantidadeDeLivrosCadastrados());
    }
}
