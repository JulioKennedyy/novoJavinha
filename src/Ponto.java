import java.util.Scanner;

public class Ponto {
    public static void main(String[] args) {
        Scanner print = new Scanner(System.in);
        int numero1 = print.nextInt();
        int numero2 = print.nextInt();
        if (numero1 > numero2) {
            System.out.println("Maior que");
        }
    }
}
