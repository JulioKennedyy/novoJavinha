package Lista10.quest1;

public class Mensageiro {
    public Mensagem prepararMensagem(String texto, String destino) {
        Mensagem mensagem = new Mensagem(texto);
        if (destino.equalsIgnoreCase("externo")) {
            mensagem = new Criptografia(mensagem);
            mensagem = new DireitosAutorais(mensagem);
        }
        return mensagem;
    }

}
