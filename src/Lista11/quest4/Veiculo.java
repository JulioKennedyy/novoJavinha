package Lista11.quest4;

public class Veiculo {
    private String placa;
    private float velocidadeAtual;
    private String nomeDoProprietario;

    public Veiculo(String placa, float velocidadeAtual, String nomeDoProprietario) {
        this.placa = placa;
        this.velocidadeAtual = velocidadeAtual;
        this.nomeDoProprietario = nomeDoProprietario;
    }

    public String getPlaca() {
        return placa;
    }

    public float getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public String getNomeDoProprietario() {
        return nomeDoProprietario;
    }
}

