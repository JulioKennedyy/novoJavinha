package EstudosPessoais;

public class Cobrador {
    private float valorDaPassagem;
    private float carteiraDeEstudante;
    private int rotacaoDaCatraca;

    public Cobrador(float valorDaPassagem, float descontoDaCarteiraEstudante) {
        descontoDaCarteiraEstudante = 2;
        this.valorDaPassagem = valorDaPassagem;
        this.carteiraDeEstudante = valorDaPassagem/descontoDaCarteiraEstudante;
    }

    public float getValorDaPassagem() {
        return valorDaPassagem;
    }

    public void setValorDaPassagem(float valorDaPassagem) {
        if(valorDaPassagem <= 0) {
            this.valorDaPassagem = 0;
        }
        else {
            this.valorDaPassagem = valorDaPassagem;
        }
    }

    public float getCarteiraDeEstudante() {
        return carteiraDeEstudante;
    }

    public void setCarteiraDeEstudante(float carteiraDeEstudante) {
        this.carteiraDeEstudante = carteiraDeEstudante;
    }

    public int getRotacaoDaCatraca() {
        return rotacaoDaCatraca;
    }

    public void setRotacaoDaCatraca(int rotacaoDaCatraca) {
        this.rotacaoDaCatraca = rotacaoDaCatraca;
    }

    public String toString(Cobrador c) {
        return "O valor da passagem é: " + c.getValorDaPassagem() + ", O desconto para estudantes é de: " + c.getCarteiraDeEstudante();
    }

    public String pagarPassagem(Passageiro p) {

    }
}
