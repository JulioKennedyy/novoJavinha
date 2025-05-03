package Lista5;

import java.util.Scanner;

public class VogaisEConsoantes {
    public static void main(String[] args) {
        Scanner print = new Scanner(System.in);
        System.out.print("Digite a palavra: ");
        String palavra = (print.nextLine());
        int vogais = 0;
        int consoantes = 0;
        for(int contador = 0; contador < palavra.length(); contador++){
            char letra = palavra.charAt(contador);
            if(Character.toString(letra).matches("[aeiouAEIOU]")) {
                vogais++;
            }
            else if(Character.toString(letra).matches("[bcdfghjklmnpqrtstvwxzBCDFGHJKLMNPQRTSTVWXZ]")) {
                consoantes++;
            }
        }
        System.out.println("Vogais: " + vogais);
        System.out.println("Consoantes: " + consoantes);
    }

}
