package EstudosPessoais;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner print = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = print.nextInt();
        if (num > 0) {
            System.out.printf("Seu número é positivo");
        }
        else {
            System.out.println("Número negativo");
        }
    }
}