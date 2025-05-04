package Lista5;

public class Livro {
    private String titulo;
    private int anoDePublicacao;
    private int quantidadeDisponivel;
    private float preco;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String novoTitulo) {
        titulo = novoTitulo;
    }

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public void setAnoDePublicacao(int novoAnoDePublicacao) {
        anoDePublicacao = novoAnoDePublicacao;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(int novaQuantidadeDisponivel) {
        quantidadeDisponivel = novaQuantidadeDisponivel;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float novoPreco) {
        preco = novoPreco;
    }

    public boolean eIgual(Livro livro) {
        Livro livro1 = new Livro();
        if(livro1.getTitulo().equals(livro.getTitulo())) {
            return true;
        }
        return false;
    }
}
