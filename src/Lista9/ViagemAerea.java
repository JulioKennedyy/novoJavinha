package Lista9;

import java.util.ArrayList;
import java.util.Scanner;

public class ViagemAerea {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>(50);
        Cliente c = null;
        Scanner scan = new Scanner(System.in);
        System.out.println("Que tipo de cliente voce é?(normal ou vip): ");
        String escolha = scan.nextLine();
        switch (escolha) {
            case "normal":
                System.out.println("Digite seu nome: ");
                String nome = scan.nextLine();
                System.out.println("Digite seu cpf: ");
                String cpf = scan.nextLine();
                c = new Cliente(nome, cpf);
                c.descontoPassagem(1000);
                break;
            case "vip":
                System.out.println("Digite seu nome: ");
                String nome2 = scan.nextLine();
                System.out.println("Digite seu cpf: ");
                String cpf2 = scan.nextLine();
                c = new ClienteVip(nome2, cpf2);
                c.descontoPassagem(1000);
        }
    }
}
