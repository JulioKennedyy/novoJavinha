package Lista10.quest1;

public class Criptografia extends MensagemDecorator{
    public Criptografia(Mensagem mensagemOriginal) {
        super(mensagemOriginal);
    }

    @Override
    public String getTexto() {
        return mensagemOriginal.getTexto().replace(" ", "*");
    }
}
