package Lista11.quest2;

public class FaltouPapelException extends Exception {
    private int paginasNaoImpressas;

    public FaltouPapelException(String mensagem, int paginasNaoImpressas) {
        super(mensagem);
        this.paginasNaoImpressas = paginasNaoImpressas;
    }

    public int getPaginasNaoImpressas() {
        return paginasNaoImpressas;
    }
}