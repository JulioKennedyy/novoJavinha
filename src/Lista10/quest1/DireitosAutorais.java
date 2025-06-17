package Lista10.quest1;

public class DireitosAutorais extends MensagemDecorator{

    public DireitosAutorais(Mensagem mensagemOriginal) {
        super(mensagemOriginal);
    }

    @Override
    public String getTexto() {
        return mensagemOriginal.getTexto().concat(" [Direitos Reservados]");
    }
}
