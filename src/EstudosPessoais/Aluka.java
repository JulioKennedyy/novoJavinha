package EstudosPessoais;

public class Aluka {
    public String conversa(String pedido) {
        System.out.println("Oi! me chamo Aluka! Qual o seu nome?");
        String nome = Gui.falar();
        return nome;
    }

    public static void main(String[] args) {
        Aluka a = new Aluka();
        System.out.println(a.conversa("oi"));
    }
}
