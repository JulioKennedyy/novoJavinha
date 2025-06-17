package Lista10.quest1;

public abstract class MensagemDecorator extends Mensagem {
    protected Mensagem mensagemOriginal;

    public MensagemDecorator(Mensagem mensagemOriginal) {
        super(mensagemOriginal.getTexto());
        this.mensagemOriginal = mensagemOriginal;
    }

    @Override
    public abstract String getTexto();
}