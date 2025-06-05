package Lista9;

public class AtaqueFisico implements Ataques{
    private String nomeAtaque;
    private int dano;

    public AtaqueFisico(String nomeAtaque, int dano) {
        this.nomeAtaque = nomeAtaque;
        this.dano = dano;
    }

    @Override
    public void movimento() {
        System.out.println("Você usou " + nomeAtaque + " e causou " + dano + " pontos de dano.");
    }
}
