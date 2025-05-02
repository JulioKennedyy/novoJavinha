package Lista5;

import java.util.Scanner;

public class MaiorEMenor {
    public static void main(String[] args) {
        Scanner print = new Scanner(System.in);
        System.out.print("Digite uma sequência de números separados por vírgula: ");
        String valores = (print.nextLine());
        String[] separacao = valores.split(",");

        int maximo = Integer.parseInt(separacao[0]);
        int minimo = Integer.parseInt(separacao[0]);

        for(String separa: separacao){
            int num = Integer.parseInt(separa.trim());
            maximo = Math.max(maximo, num);
            minimo = Math.min(minimo, num);
        }
        System.out.println(maximo);
        System.out.println(minimo);
    }
}