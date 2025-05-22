package EstudosPessoais;

public class Passageiro {
    private String nome;
    private float dinheiro;
    private boolean temCarteirinha;

    public Passageiro(String nome, float dinheiro, boolean temCarteirinha) {
        this.nome = nome;
        this.dinheiro = dinheiro;
        this.temCarteirinha = temCarteirinha;
    }

    public String toString() {
        return "Nome: " + nome + ", Saldo: " + dinheiro + ", Tem carteirinha?: " + temCarteirinha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(float dinheiro) {
        this.dinheiro = dinheiro;
    }

    public boolean isTemCarteirinha() {
        return temCarteirinha;
    }

    public void setTemCarteirinha(boolean temCarteirinha) {
        this.temCarteirinha = temCarteirinha;
    }
}
