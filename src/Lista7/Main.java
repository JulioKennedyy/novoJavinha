package Lista7;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cont1 = 0;
        int cont2 = 0;
        ContaCorrente[] contasCorrentes = new ContaCorrente[50];
        ContaPoupanca[] contasPoupancas = new ContaPoupanca[50];
        while (true) {
            System.out.println("Digite o tipo de conta que deseja criar (c) Corrente ou (p) Poupança: ");
            String tipo = (scan.nextLine()).toLowerCase(Locale.ROOT);
            switch (tipo){
                case "c":
                    System.out.println("Digite o nome do titular: ");
                    String titular = (scan.nextLine());
                    System.out.println("Digite o numero da conta: ");
                    String numero = (scan.nextLine());
                    System.out.println("Digite o saldo da conta: ");
                    float saldo = (scan.nextFloat());
                    System.out.println("Digite o cheque especial da conta: ");
                    float cheque = (scan.nextFloat());
                    ContaCorrente c = new ContaCorrente(saldo,titular,numero,cheque);
                    contasCorrentes[cont1] = c;
                    cont1 ++;
                    break;
                case "p":
                    System.out.println("Digite o nome do titular: ");
                    String titular2 = (scan.nextLine());
                    System.out.println("Digite o numero da conta: ");
                    String numero2 = (scan.nextLine());
                    System.out.println("Digite o saldo da conta: ");
                    float saldo2 = (scan.nextFloat());
                    System.out.println("Digite a taxa de rendimento da conta: ");
                    float taxa = (scan.nextFloat());
                    ContaPoupanca p = new ContaPoupanca(saldo2,titular2,numero2,taxa);
                    contasPoupancas[cont2] = p;
                    cont2 ++;
                    break;
            }
            System.out.println("Deseja sair? (x para sair): ");
            scan.nextLine();
            String sair = (scan.nextLine());
            if(sair.equals("x")) {
                break;
            }
        }
        int quantidadeContasCorrente = 0;
        int quantidadeContasPoupanca = 0;
        for(ContaCorrente c: contasCorrentes) {
            if(c != null) {
                quantidadeContasCorrente++;
                System.out.println(c.toString());
            }
            else {
                break;
            }
        }
        for(ContaPoupanca p: contasPoupancas) {
            if(p != null) {
                quantidadeContasPoupanca++;
                System.out.println(p.toString());
            }
            else {
                break;
            }
        }
        System.out.println("A quantidade de contas corretente é: " + quantidadeContasCorrente);
        System.out.println("A quantidade de contas poupança é: " + quantidadeContasPoupanca);
    }
}
