package Lista8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Digite a operação que deseja fazer: ");
            String resposta = scan.nextLine();
            switch (resposta) {
                case "somar":
                    System.out.println("Digite o primeiro valor: ");
                    Somar soma = new Somar();
                    int valor1 = scan.nextInt();
                    System.out.println("Digite o segundo valor: ");
                    int valor2 = scan.nextInt();
                    soma.setOperando1(valor1);
                    soma.setOperando2(valor2);
                    soma.imprimirResultado();
                    break;
                case "subtrair":
                    System.out.println("Digite o primeiro valor: ");
                    Subtrair sub = new Subtrair();
                    int valor3 = scan.nextInt();
                    System.out.println("Digite o segundo valor: ");
                    int valor4 = scan.nextInt();
                    sub.setOperando1(valor3);
                    sub.setOperando2(valor4);
                    sub.imprimirResultado();
                    break;
                case "multiplicar":
                    System.out.println("Digite o primeiro valor: ");
                    Multiplicar mul = new Multiplicar();
                    int valor5 = scan.nextInt();
                    System.out.println("Digite o segundo valor: ");
                    int valor6 = scan.nextInt();
                    mul.setOperando1(valor5);
                    mul.setOperando2(valor6);
                    mul.imprimirResultado();
                    break;
                case "dividir":
                    System.out.println("Digite o primeiro valor: ");
                    Dividir div = new Dividir();
                    int valor7 = scan.nextInt();
                    System.out.println("Digite o segundo valor: ");
                    int valor8 = scan.nextInt();
                    div.setOperando1(valor7);
                    div.setOperando2(valor8);
                    div.imprimirResultado();
                    break;
                default:
                    System.out.println("Não pode");
                    break;
            }
        }
    }
}
