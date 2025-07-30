package Lista11.quest2;

public class FaltouTintaException extends Exception {
  private int paginasNaoImpressas;

  public FaltouTintaException(String mensagem, int paginasNaoImpressas) {
    super(mensagem);
    this.paginasNaoImpressas = paginasNaoImpressas;
  }

  public int getPaginasNaoImpressas() {
    return paginasNaoImpressas;
  }
}
