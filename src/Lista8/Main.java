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
            }
        }
    }
}
