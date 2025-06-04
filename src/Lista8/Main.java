package Lista8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Digite a operação que deseja fazer: ");
            OperacaoMatematica ope = null;
            String resposta = scan.nextLine();
            switch (resposta) {
                case "somar":
                    ope = new Somar();
                    break;
                case "subtrair":
                    ope = new Subtrair();
                    break;
                case "multiplicar":
                    ope = new Multiplicar();
                    break;
                case "dividir":
                    ope = new Dividir();
                    break;
                default:
                    System.out.println("Não pode");
                    break;
            }
            if(ope != null) {
                System.out.println("Digite o primeiro valor: ");
                int valor3 = Integer.parseInt(scan.nextLine());
                System.out.println("Digite o segundo valor: ");
                int valor4 = Integer.parseInt(scan.nextLine());
                ope.setOperando1(valor3);
                ope.setOperando2(valor4);
                ope.imprimirResultado();
            }
        }
    }
}
