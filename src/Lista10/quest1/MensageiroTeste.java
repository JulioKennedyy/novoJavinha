package Lista10.quest1;

import java.util.Scanner;

public class MensageiroTeste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Mensageiro m = new Mensageiro();
        System.out.println("Digite a mensagem: ");
        String texto = scan.nextLine();
        System.out.println("Digite se a mensagem é externo ou interno:");
        String tipo = scan.nextLine();
        if(tipo.equals("externo")) {
            Mensagem externo = m.prepararMensagem(texto, "externo");
            System.out.println("Externa: " + externo.getTexto());
        }
        else {
            Mensagem interna = m.prepararMensagem(texto, "interno");
            System.out.println("Externa: " + interna.getTexto());
        }
    }

}
