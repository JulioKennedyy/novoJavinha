package Lista7;

import java.util.Scanner;

public class Estaticos {
    public static int maior(int a, int b) {
        return Math.max(a, b);
    }

    public static int maior(int a, int b, int c) {
        return maior(maior(a,b), c);
    }

    public static int maior(int a, int b, int c, int d) {
        return maior(maior(a,b), maior(c,d));
    }

    public static int maior(int a, int b, int c, int d, int e) {
        return maior(maior(a,b,c,d),e);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe cinco valores inteiros:");
        System.out.print("Valor 1: ");
        int v1 = scanner.nextInt();
        System.out.print("Valor 2: ");
        int v2 = scanner.nextInt();
        System.out.print("Valor 3: ");
        int v3 = scanner.nextInt();
        System.out.print("Valor 4: ");
        int v4 = scanner.nextInt();
        System.out.print("Valor 5: ");
        int v5 = scanner.nextInt();

        int maiorValor = maior(v1, v2, v3, v4, v5);

        System.out.println("O maior valor informado é: " + maiorValor);
    }
}
