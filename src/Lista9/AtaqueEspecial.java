package Lista9;

public class AtaqueEspecial implements Ataques{
    private String nomeAtaque;
    private int dano;
    private String efeito;

    public AtaqueEspecial(String nomeAtaque, int dano, String efeito) {
        this.nomeAtaque = nomeAtaque;
        this.dano = dano;
        this.efeito = efeito;
    }

    @Override
    public void movimento() {
        System.out.println("Você usou " + nomeAtaque + " e causou " + dano + " pontos de dano e causou o efeito de" + efeito);
    }
}
