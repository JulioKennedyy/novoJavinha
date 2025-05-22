package EstudosPessoais;


import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Cobrador c = new Cobrador(5,2.50f);
        String nome = Gui.falar();
        float dinheiro = Gui.falar(0);
        System.out.println("Tem carteira de estudante? (true, false): ");
        boolean temCarteira = (scan.nextBoolean());
        Passageiro p = new Passageiro(nome, dinheiro, temCarteira);
        System.out.println(c.pagarPassagem(p));
        System.out.println(p);
    }
}
