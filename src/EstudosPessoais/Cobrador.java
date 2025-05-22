package EstudosPessoais;

public class Cobrador {
    private float valorDaPassagem;
    private float carteiraDeEstudante;

    public Cobrador(float valorDaPassagem, float descontoDaCarteiraEstudante) {
        descontoDaCarteiraEstudante = 2;
        this.valorDaPassagem = valorDaPassagem;
        this.carteiraDeEstudante = valorDaPassagem/descontoDaCarteiraEstudante;
    }

    public float getValorDaPassagem() {
        return valorDaPassagem;
    }

    public void setValorDaPassagem(float valorDaPassagem) {
        this.valorDaPassagem = valorDaPassagem;
    }

    public float getCarteiraDeEstudante() {
        return carteiraDeEstudante;
    }

    public void setCarteiraDeEstudante(float carteiraDeEstudante) {
        this.carteiraDeEstudante = carteiraDeEstudante;
    }

    public String toString(Cobrador c) {
        return "O valor da passagem é: " + c.getValorDaPassagem() + ", O desconto para estudantes é de: " + c.getCarteiraDeEstudante();
    }
}
