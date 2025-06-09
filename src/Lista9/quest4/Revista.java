package Lista9.quest4;

import java.util.Scanner;

public class Revista extends Publicacao{
    private int numero;

    @Override
    public void mostrar() {
        System.out.println("Nome da revista: " + this.getNome() + ", número: " + numero);
    }

    @Override
    public void introduzDados(Scanner scan) {
        System.out.println("Nome: ");
        setNome(scan.nextLine());
        System.out.println("Numero: ");
        setNumero(Integer.parseInt(scan.nextLine()));
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
