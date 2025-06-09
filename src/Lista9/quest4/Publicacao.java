package Lista9.quest4;

import java.util.Scanner;

public abstract class Publicacao {
    private String nome;

    public abstract void mostrar();

    public abstract void introduzDados(Scanner scan);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
