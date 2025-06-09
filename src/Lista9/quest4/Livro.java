package Lista9.quest4;

import java.util.Scanner;

public class Livro extends Publicacao{
    private String autor;
    private int ano;

    @Override
    public void mostrar() {
        System.out.println("Nome do livro: " + this.getNome() + ", autor: " + autor + ", publicado em: ");
    }

    @Override
    public void introduzDados(Scanner scan) {
        System.out.println("Nome: ");
        setNome(scan.nextLine());
        System.out.println("Autor: ");
        setAutor(scan.nextLine());
        System.out.println("Ano: ");
        setAno(Integer.parseInt(scan.nextLine()));
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
