package Lista5;

import java.util.Scanner;

public class CompararNomes {
    public static void main(String[] args) {
        Scanner print = new Scanner(System.in);
        System.out.print("Digite a primeira palavra: ");
        String palavra1 = (print.nextLine());
        while (true) {
            System.out.print("Digite a segunda palavra: ");
            String palavra2 = (print.nextLine());
            if(palavra2.equals(palavra1)) {
                System.out.println("As palavras não podem ser iguais!");
                continue;
            }
            else {
                int resultado = palavra1.compareTo(palavra2);
                if(resultado < 0) {
                    System.out.printf(palavra1 +" "+ palavra2);
                }
                else if(resultado > 0) {
                    System.out.printf(palavra2 + " " + palavra1);
                }
                break;
            }
        }
    }
}
