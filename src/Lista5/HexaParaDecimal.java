package Lista5;

import java.util.Scanner;

public class HexaParaDecimal {
    public static void main(String[] args) {
        Scanner print = new Scanner(System.in);
        System.out.print("Digite o número a ser transformado: ");
        String hexadecimal = (print.nextLine());
        int decimal = Integer.parseInt(hexadecimal, 16);
        int binario = Integer.parseInt(Integer.toBinaryString(decimal));
        System.out.println("Número decimal: " + decimal);
        System.out.println("Número em binário: " + binario);
    }
}
