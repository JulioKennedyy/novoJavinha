package Lista11.quest1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MinhaData data = null;

        while (data == null) {
            System.out.print("Digite a data no formato dia/mes/ano: ");
            String entrada = scanner.nextLine();
            String[] partes = entrada.split("/");

            if (partes.length != 3) {
                System.out.println("Formato incorreto! Tente novamente.");
                continue;
            }

            try {
                int dia = Integer.parseInt(partes[0]);
                int mes = Integer.parseInt(partes[1]);
                int ano = Integer.parseInt(partes[2]);

                data = new MinhaData(dia, mes, ano);
                System.out.println("Data válida: " + data);
            } catch (Exception e) {
                System.out.println("Data inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}

