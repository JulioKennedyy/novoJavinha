package Lista9;

public class AtaqueSuporte implements Ataques{
    private String nomeAtaque;
    private String efeito;

    public AtaqueSuporte(String nomeAtaque, String efeito) {
        this.nomeAtaque = nomeAtaque;
        this.efeito = efeito;
    }

    @Override
    public void movimento() {
        System.out.println("Você usou " + nomeAtaque + " e causou o efeito de " + efeito);
    }
}
